package com.vyatsu.ooplab.lab5.phonebook;

import java.util.*;

class Phonebook {

    private Map<String, HashSet<String>> map;

    Phonebook() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phone) {
        LinkedHashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = (LinkedHashSet<String>) map.get(lastName);
        } else {
            numbers = new LinkedHashSet<>();
        }
        numbers.add(phone);
        map.put(lastName, numbers);

    }
    //TODO добавить LinkedSet, чтобы показывались номера в порядке добавления
    Set<String> get(String lastName) {
        return map.get(lastName);
    }
    Set<Map.Entry<String, HashSet<String>>> getAll(){
        return map.entrySet();
    }
}
