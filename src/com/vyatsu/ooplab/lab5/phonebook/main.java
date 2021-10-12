package com.vyatsu.ooplab.lab5.phonebook;

import java.util.*;

public class main {
    public static void main(String[] args) {
        String[] words = {"good", "top", "loop", "good", "done", "nice", "loop", "map", "hashmap", "map"};
        //Задание 1
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        //Задание 2
        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "123");
        pb.add("Petrov", "456");
        pb.add("Zubilo","711");
        pb.add("Petrov", "789");
        pb.add("Aloha", "762");
        pb.add("Zubilo", "758");
        pb.add("Zubilo", "759");
        pb.add("Zubilo","495");


        System.out.println(pb.getAll());
    }
}