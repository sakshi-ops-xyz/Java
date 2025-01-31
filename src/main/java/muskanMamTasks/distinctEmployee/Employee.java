package muskanMamTasks.distinctEmployee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.compare;

public class Employee {
    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Set<Integer> mySet=new HashSet<>();

        Employee e1=new Employee(1, "A");
        Employee e2=new Employee(2, "B");
        Employee e3=new Employee(3, "C");
        Employee e4=new Employee(3, "D");
        Employee e5=new Employee(4, "C");

        List<Employee> list=List.of(e1, e2, e3, e4, e5);

        Map<Integer, String> m=list.stream()
                .collect(Collectors
                        .toMap(x-> x.getId(), x -> x.getName(), (exist, relace) -> exist));

        System.out.println(m);
    }
}
