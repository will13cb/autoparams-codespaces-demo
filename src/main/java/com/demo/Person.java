package com.demo;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public String name() { return name; }
    public int age()     { return age; }

    @Override public String toString() {
        return "Person{name='%s', age=%d}".formatted(name, age);
    }
}
