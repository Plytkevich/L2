package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int i, summ;

        //Генерация массива из 15 "рандомных имён"

        String x[] = new String[15];
        RandomNameGenerator rnd = new RandomNameGenerator(5);
        for (i = 0; i < 15; i++) {
            String name = rnd.next();
            x[i] = name;
            System.out.println("Hello, " + x[i]);
        }

        //Сортировка массива из 15-ми имён и смена регистра букв

        Arrays.sort(x);
        System.out.println("Отсортированный массив + верхний регистр:");
        for (i = 0; i < 15; i++) {
            System.out.println("Hello, " + x[i].toUpperCase());
        }

        //Вывод 3-5 элемнтов массива

        System.out.println("Приветствие от 3 до 5-го элемента");
        System.out.println("Hello, " + x[2]);
        System.out.println("Hello, " + x[3]);
        System.out.println("Hello, " + x[4]);

        //Генерация 30-ти рандомных чисел и сложение только чётных

        int mas[] = new int[30];
        summ = 0;
        for (i = 0; i < 30; i++) {
            mas[i] = (int) (Math.random() * 5);
            if (i % 2 == 1)
                summ = summ + mas[i];
            System.out.println("mas[" + i + "] = " + mas[i]);
        }
        System.out.println("Сумма чётных элементов - " + summ);

        //Разбиение имени на буквы, сортировка букв в порядке возрастания и подсчёт количества буквы в имени

        int summLetter = 0;
        String myName = "Андрей";
        char nm[] = myName.toCharArray();
        Arrays.sort(nm);
        for (i = 0; i < nm.length; i++) {
            if (nm[i] == 'е')
                summLetter += 1;
            System.out.println("Буква из имени по возрастанию :" + nm[i]);
        }
        System.out.println("В вашем имени " + summLetter + " букв е");

        //Генерация списка из 15 "рандомных имён"

        List<String> Mass = new ArrayList<String>();
        for (i = 0; i < 15; i++) {
            String name = rnd.next();
            Mass.add(name);
        }
        System.out.println("Hello, " + Mass);

        //Сортировка списка из 15-ми имён и смена регистра букв

        Collections.sort(Mass);
        System.out.println("Отсортированный массив + верхний регистр:");
        for (String s : Mass)
            System.out.println(s.toUpperCase());


        //Вывод 3-5 элемнтов списка

        System.out.println("Приветствие от 3 до 5-го элемента");
        System.out.println("Hello, " + Mass.get(2));
        System.out.println("Hello, " + Mass.get(3));
        System.out.println("Hello, " + Mass.get(4));

        //Генерация 30-ти рандомных чисел и сложение только чётных + минимальный и максимальный элемент

        List<String> MassInt = new ArrayList<String>();
        Double summary = 0.0;
        for (i = 0; i < 30; i++) {
            Double name = (Math.random() * 5);
            MassInt.add(name.toString());
            if (i % 2 == 1) {
                Double d = Double.valueOf(MassInt.get(i));
                summary = summary + d;
            }
            System.out.println("mas[" + (i + 1) + "] = " + MassInt.get(i));
        }
        System.out.println("Сумма чётных элементов - " + summ);
        System.out.println("Минимальный элемент - " + Collections.min(MassInt));
        System.out.println("Максимальный элемент - " + Collections.max(MassInt));

    }

}
