package org.example;

import java.util.ServiceLoader;

public class SpiTest {

    public static void main(String[] args) {
        // 使用Java的ServiceLoader进行加载
        ServiceLoader<Animal> load = ServiceLoader.load(Animal.class);
        load.forEach(Animal::call);
    }
}
