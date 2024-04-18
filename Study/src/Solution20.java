package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution20 {
  public static void main(String[] args) {
    Solution20 solution = new Solution20();//экземпляр класса
    System.out.println(solution.isValid("()[]{}"));
  }
  public boolean isValid(String s) {
    Map<Character, Character> brackets = new HashMap<>();
    brackets.put('}', '{');
    brackets.put(')', '(');
    brackets.put(']', '['); // () (
//
    Deque<Character> stack = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (!brackets.containsKey(c)) {
        stack.push(c);
      } else {
        Character top = stack.pollFirst();
        if (top != brackets.get(c)) {
          return false;
        }
      }
    }
      return stack.isEmpty();
  }
}