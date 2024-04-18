import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tree2List {
    public static void main(String[] args) {
        final TreeNode root = createTestData();
        final List<TreeElement> treeElements = toTreeElements(root);
        System.out.println(treeElements);
    }
    private static TreeNode createTestData() {
        return IntStream.range(1, 2)
                .boxed()
                .map(i -> {
                    TreeNode treeNode1 = new TreeNode();
                    treeNode1.id = i.longValue();
                    treeNode1.name = "name" + i;
                    treeNode1.children =
                            IntStream.range(1, 3)
                                    .boxed()
                                    .map(j -> {
                                        TreeNode treeNode2 = new TreeNode();
                                        Long index2 = i * 10L + j;
                                        treeNode2.id = index2;
                                        treeNode2.name = "name" + index2;
                                        List<TreeNode> treeNodes2 = IntStream.range(1, 3)
                                                .boxed()
                                                .map(k -> {
                                                    TreeNode treeNode3 = new TreeNode();
                                                    Long index3 = i * 100L + j * 10L + k;
                                                    treeNode3.id = index3;
                                                    treeNode3.name = "name" + index3;
                                                    return treeNode3;
                                                }).toList();
                                        treeNode2.children = treeNodes2;
                                        return treeNode2;
                                    }).collect(Collectors.toList());
                    return treeNode1;
                }).findAny().orElseThrow();
    }
    private static TreeElement createRootElement (TreeNode root){
        TreeElement rootElement = new TreeElement();
        rootElement.id = root.id;
        rootElement.parentUuid = null;
        rootElement.name = root.name;
        rootElement.uuid = UUID.randomUUID();
        rootElement.orderNum = 1;
        return rootElement;
    }
    private static TreeElement createChildElement(TreeNode child, TreeElement elementToAdd, int count) {
        TreeElement childElement = new TreeElement();
        childElement.id = child.id;
        childElement.name = child.name;
        childElement.parentUuid = elementToAdd.uuid;
        childElement.orderNum = count;
        childElement.uuid = UUID.randomUUID();
        return childElement;
    }
    private static List<TreeElement> toTreeElements(TreeNode root) {
        List<TreeElement> treeElements = new ArrayList<>();
        Deque<TreeNode> treeNodes = new LinkedList<>();
        Map<TreeNode, TreeElement> map = new HashMap<>();
        TreeElement rootElement = createRootElement(root);
        map.put(root, rootElement);
        treeNodes.add(root);
        treeElements.add(rootElement);
        while (treeNodes != null && !treeNodes.isEmpty()) {
            TreeNode current = treeNodes.pollLast();
            TreeElement elementToAdd = map.get(current);
            List<TreeNode> children = current.children;
            if (children != null && !children.isEmpty()) {
                int count = 1;
                for (TreeNode child : children) {
                    TreeElement childElement = createChildElement(child, elementToAdd, count);
                    count++;
                    treeElements.add(childElement);
                    map.put(child, childElement);
                }
                treeNodes.addAll(children);
            }
        }
        return treeElements;
    }
}


class TreeNode {
    Long id;
    List<TreeNode> children;
    String name;

    @Override
    public String toString() {
        return "TreeNode{" +
                "id=" + id +
                ", children=" + children +
                ", name='" + name + '\'' +
                '}';
    }
}

class TreeElement {
    Long id;
    UUID uuid;
    String name;
    UUID parentUuid;
    Integer orderNum;

    @Override
    public String toString() {
        return "TreeElement{" +
                "id=" + id +
                ", uuid=" + uuid +
                ", name='" + name + '\'' +
                ", parentUuid=" + parentUuid +
                ", orderNum=" + orderNum +
                '}';
    }
}
