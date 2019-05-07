package pl.sii.javatraining;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        Person person = new Person();
        person.setName("Jimmy");
        person.setAge(35);

        Person person2 = new Person();
        person2.setName("Joe");
        person2.setAge(25);

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        System.out.println(list);

        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person2);
        System.out.println(people);

        Set<Person> peopleSet = new HashSet<>();
        peopleSet.add(person);
        peopleSet.add(person2);
        System.out.println(peopleSet);

        List<String> numbers = new ArrayList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("two");
        numbers.add("two");
        numbers.add("three");

        List<String> result = numbers.stream().filter(s -> !"two".equals(s))
                .collect(Collectors.toList());
        System.out.println(result);

        Optional<String> optionStr = Optional.of("joe");

        OptionalInt longestTextLength = numbers.stream().mapToInt(str -> str.length())
                .max();
        System.out.println(longestTextLength.orElse(0));

        System.out.println(youngestName(people));
        //jkaby było zero to nie będzie wyjątku
    }

    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    private static class Person {
        private String name;
        private int age;
        private boolean female;

        public void setAge(int age) {
            if(age<=0) throw new IllegalArgumentException("Age cannot be negative.");
            this.age = age;
        }
    }

    private static String youngestName(List<Person> list) {
        return list.stream().min(Comparator.comparing(Person::getAge)).map(Person::getName).orElse("empty");
    }
}