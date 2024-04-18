//package interfaces;
//
//import java.util.*;
//import java.util.concurrent.atomic.AtomicLong;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//class Employee {
//    static AtomicLong counter = new AtomicLong(1L);
//    private Long id;
//    private String fio;
//    private Position position;
//    private List<Employee> employeeList;
//
//    public Employee() {
//        this.id = id;
//        this.fio = fio;
//    }
//
//    public Employee(String fio, List<Employee> list) {
//        generateId();
//
//        this.fio = fio;
//        this.employeeList = list;
//    }
//
//    public static AtomicLong getCounter() {
//        return counter;
//    }
//
//    public static void setCounter(AtomicLong counter) {
//        Employee.counter = counter;
//    }
//
//    static List<Employee> generatorListEmployee() {
//        List<Employee> empList = new ArrayList<>();
//        empList = Stream.generate(() -> new Employee()).limit(count).collect(Collectors.toList());
//        if (depth <= 1) {
//            empList.forEach(employee -> employee.setPosition(Position.EMPLOYEE));
//            return empList;
//        } else {
//            return empList.stream().peek(employee -> {
//                employee.setEmployeeList(generatorListEmployee());
//                employee.setPosition(Position.MANAGER);
//            }).collect(Collectors.toList());
//        }
////         Stream.generate(() -> new Employee(generateId(), generateName()))
////                .limit(count)
////                .collect(Collectors.toList());
//    }
//
//    static Long generateId() {
//        return counter.getAndIncrement();
//    }
//
//    static String generateName() {
//        String s = " ";
//        int wordLength = (int) (Math.random() * 4 + 3);
//        s = IntStream.rangeClosed(1, wordLength).mapToObj(e -> generateChar()).map(q -> q.toString()).collect(Collectors.joining());
//        return s;
//
//    }
//
//    static char generateChar() {
//        int a = (int) (Math.random() * 26 + 97);
//        return (char) a;
//    }
//
//    public static void main(String[] args) {
////        Stream<Employee> employeeStream= Stream.of(new Employee());
////        Employee employee = new Employee();
////        Supplier<Employee> supplier=()->new Employee();
////        Stream.iterate(2L, x -> x + 1L)
////                .filter(Objects::nonNull)
////                .filter(x -> x % 2 != 0)
////                .map(Employee::new)
////                .limit(5)
////                .collect(Collectors.toList());
//
////        Stream<Employee> empStream = Stream.generate(supplier).limit(5).skip(2).peek(System.out::print);
////        List<Employee> listEmp = empStream.collect(Collectors.toList());
////        Set<Employee> setEmp = listEmp.stream().collect(Collectors.toSet());
////        System.out.println(setEmp);
//        List<Employee> employees = generatorListEmployee();
////        employees.stream().filter(employee -> employee.getId() % 2 == 0).filter(employee -> employee.getFio().length() > 4).peek(employee -> System.out.println("id:" + employee.getId() + " FIO:" + employee.getFio())).flatMap(employee -> employee.getEmployeeList().stream()).collect(Collectors.toMap(employee -> employee.getId(), employee -> employee.getFio()));
////
////        Predicate<Employee> five = employee -> employee.getFio().length() > 5;
////        Map<Boolean, List<Employee>> map = employees.stream().collect(Collectors.partitioningBy(five));
////        System.out.println(map);
//
//        Map<Integer, List<Employee>> booleanListMap = employees.stream()
//                .collect(Collectors.groupingBy(emp -> emp.getFio().length() ));
//        System.out.println(booleanListMap);
//        System.out.println("_____________________________________________________________________________________");
//        System.out.println(employees);
//        System.out.println("_____________________________________________________________________________________");
//        Double average = employees.stream()
//                .mapToInt(employee -> employee.getFio().length())
//                .average()
//                .getAsDouble();
//        System.out.println("Среднее первого уровня: " + average);  //Вычислить среднюю длину имени для сотрудников первого уровня
//        System.out.println("_____________________________________________________________________________________");
//        Double averageInner = employees.stream()
//
//                .flatMapToInt(employee -> employee.getEmployeeList()
//                        .stream()
//                        .mapToInt(emp -> emp.getFio()
//                                .length()))
//                .average().getAsDouble();
//        System.out.println("Среднее длина имени для всех сотрудников: " + (averageInner + average) / 2); //Вычислить среднюю длину имени для сотрудников внутреннего уровня
//        System.out.println("_____________________________________________________________________________________");
//        Integer maxFirstLvl = employees.stream()
//                .mapToInt(employee -> employee.getFio().length())
//                .max()
//                .getAsInt();
//        System.out.println("Максимальное фио первого уровня: " + maxFirstLvl);    //Вычислить максимальную длину фио для сотрудников первого уровня
//        System.out.println("_____________________________________________________________________________________");
//        Integer maxAllLvl = employees.stream()
//                .flatMapToInt(employee -> employee.getEmployeeList()
//                        .stream()
//                        .mapToInt(emp -> emp.getFio().length()))
//                .max()
//                .getAsInt();
//        System.out.println("Максимальная длина фио: " + (Math.max(maxFirstLvl, maxAllLvl)));  //Вычислить максимальную длину фио для сотрудников внутренного уровня
//        System.out.println("_____________________________________________________________________________________");
//        boolean anyMatch = employees.stream()
//                .flatMap(employee -> employee.getEmployeeList()
//                        .stream())
//                .anyMatch(emp -> emp.getFio().contains("a"));//.filter(emp -> emp.getFio().contains("a"))
//        System.out.println(anyMatch);        //.forEach(System.out::println);
//        System.out.println("_____________________________________________________________________________________");
//        employees.stream().forEach(employee -> System.out.println("Все имена сотрудников первого уровня: "+ employee.getFio()));
//
//        boolean toSet = employees.stream()
//                .<Object>flatMap(emp -> emp.getFio().lines()).isParallel();
//        Set<Character> letters = new HashSet<>();
//        employees.stream()
//                .forEach(employee -> employee.getFio().chars().mapToObj(c -> (char)c).toList().forEach(letter-> letters.add(letter)));
//        // Получить множество букв которые содержатся в ФИО менеджеров 1 уровня исп flatMap collection toSet работа с Fio
//        //Вывести все уникальные имена сотрудников первого уровня ?!
//        //Создать список всех сотрудников и первого и 2-ого уровня
//        Collectors <Employee> collectors;
//        List <Employee> employees1= employees.stream()
//                .flatMap(emp -> emp(1));//Вывести данные сотрудника с id 1
//       // Вывести список из-2х сотрудников через стрим
//
//                        /*Сложные задания
//Нужно вывести Карту содержащую символ и кол-во раз тоторое данный символ используеться
//Проход по фио сотрудников первого уровня(Менеджеров) - посдказка Grouping by
//Нужно вывести карту содержащую букву и связанный список слов где эта буква встречаеться
//Проход по фио сотрудников первого уровня(Менеджеров)
//
//
//Простые задания
//
//
//Вывести данные сотрудника с id 1
//Вывести список из-2х сотрудников через стрим*/
//
//        // System.out.println(employees);
//
//    }
//
//
//    public Position getPosition() {
//        return position;
//    }
//
////    static List<Employee> generateListEmployye(Long start, Long finish) {
////        return LongStream.rangeClosed(1L, 9L)
////                .filter(Objects::nonNull)
////                .filter(x -> x % 2 != 0)
////                .mapToObj(Employee::new)
////                .peek(System.out::println)
////                .collect(Collectors.toList());
////
////    }
//
//    public void setPosition(Position position) {
//        this.position = position;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFio() {
//        return fio;
//    }
//
//    public void setFio(String fio) {
//        this.fio = fio;
//    }
//
//    public List<Employee> getEmployeeList() {
//        return employeeList;
//    }
//
//    public void setEmployeeList(List<Employee> employeeList) {
//        this.employeeList = employeeList;
//    }
//
//    @Override
//
//    public String toString() {
//        return "Employee{" + "id=" + id +
//                ", fio='" + fio + '\'' +
//                '}';
//    }
//
//
//    enum Position {
//        MANAGER, EMPLOYEE
//    }
//}
//
//
///*import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.atomic.AtomicLong;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class Employee {
//    static AtomicLong counter = new AtomicLong(1L);
//    private Long id;
//    private String fio;
//    private Position position;
//    private List<Employee> employeeList;
//
//    public Employee(Long id, String fio) {
//        this.id = id;
//        this.fio = fio;
//    }
//
//    public Employee(String fio, List<Employee> list) {
//        generateId();
//
//        this.fio = fio;
//        this.employeeList = list;
//    }
//
//    public static AtomicLong getCounter() {
//        return counter;
//    }
//
//    public static void setCounter(AtomicLong counter) {
//        Employee.counter = counter;
//    }
//
//    static List<Employee> generatorListEmployee(Long count, Long depth) {
//        List<Employee> empList = new ArrayList<>();
//        empList = Stream.generate(() -> new Employee(generateId(), generateName())).limit(count).collect(Collectors.toList());
//        if (depth <= 1) {
//            empList.forEach(employee -> employee.setPosition(Position.EMPLOYEE));
//            return empList;
//        } else {
//            return empList.stream().peek(employee -> {
//                employee.setEmployeeList(generatorListEmployee(count, depth - 1));
//                employee.setPosition(Position.MANAGER);
//            }).collect(Collectors.toList());
//        }
////         Stream.generate(() -> new Employee(generateId(), generateName()))
////                .limit(count)
////                .collect(Collectors.toList());
//    }
//
//    static Long generateId() {
//        return counter.getAndIncrement();
//    }
//
//    static String generateName() {
//        String s = " ";
//        int wordLength = (int) (Math.random() * 4 + 3);
//        s = IntStream.rangeClosed(1, wordLength).mapToObj(e -> generateChar()).map(q -> q.toString()).collect(Collectors.joining());
//        return s;
//
//    }
//
//    static char generateChar() {
//        int a = (int) (Math.random() * 26 + 97);
//        return (char) a;
//    }
//
//    public static void main(String[] args) {
//
//        List<Employee> employees = generatorListEmployee(10L, 2L);
//        employees.stream().filter(employee -> employee.getId() % 2 == 0).filter(employee -> employee.getFio().length() > 4).peek(employee -> System.out.println("id:" + employee.getId() + " FIO:" + employee.getFio())).flatMap(employee -> employee.getEmployeeList().stream()).collect(Collectors.toMap(employee -> employee.getId(), employee -> employee.getFio()));
//
//        Predicate<Employee> five = employee -> employee.getFio().length() > 5;
//        Map<Boolean, List<Employee>> map = employees.stream().collect(Collectors.partitioningBy(five));
//        System.out.println(map);
//
//        double averageWordLength = employees.stream()
//                .mapToDouble(employee -> employee.getFio().length())
//                .average()
//                .getAsDouble();
//
//        System.out.println("AverageWordLength = " + averageWordLength);
//
//        double maxWordLength = employees.stream()
//                .mapToDouble(employee -> employee.getFio().length())
//                .max()
//                .getAsDouble();
//
//        System.out.println("MaxWordLength = " + maxWordLength);
//
//        employees.stream().flatMap(employee -> employee.getEmployeeList().stream()).anyMatch(employee -> employee.getFio().contains("a"));
//
//        employees.stream().flatMap(employee -> employee.getFio().toSet());
//        // Получить множество букв которые содержатся ФИО менеджеров 1 уровня исп flatMap collection toSet работа с Fio
//
//        // System.out.println(employees);
//
//    }
//
//    public Position getPosition() {
//        return position;
//    }
//
////    static List<Employee> generateListEmployye(Long start, Long finish) {
////        return LongStream.rangeClosed(1L, 9L)
////                .filter(Objects::nonNull)
////                .filter(x -> x % 2 != 0)
////                .mapToObj(Employee::new)
////                .peek(System.out::println)
////                .collect(Collectors.toList());
////
////    }
//
//    public void setPosition(Position position) {
//        this.position = position;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFio() {
//        return fio;
//    }
//
//    public void setFio(String fio) {
//        this.fio = fio;
//    }
//
//    public List<Employee> getEmployeeList() {
//        return employeeList;
//    }
//
//    public void setEmployeeList(List<Employee> employeeList) {
//        this.employeeList = employeeList;
//    }
//
//    @Override
//
//    public String toString() {
//        return "Employee{" + "id=" + id +
////                ", fio='" + fio + '\'' +
//                ", List=" + employeeList;
////                '}';
//    }
//
//
//    enum Position {
//        MANAGER, EMPLOYEE
//    }
//}
//
//// Вычислить среднюю длинну слова для сотрудников 1 уровня
//// Вычислить максимальную длину ФИО для сотрудников 1 уровня
//// Проверить есть ли у сотрудников 2 уровня (вложенные сотрудники) в ФИО буква А используем флэт map
//// Получить строку содержащую все ФИО сотрудников 1 уровня в 1 действие оператор joining
//// Получить множество букв которые содержатся ФИО менеджеров 1 уровня исп flatMap collection toSet работа с Fio */