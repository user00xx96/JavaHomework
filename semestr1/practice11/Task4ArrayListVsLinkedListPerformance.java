package semestr1.practice11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task4ArrayListVsLinkedListPerformance {

    public static void main(String[] args) {
        int n = 20000;
        System.out.println("================ БЕНЧМАРК ТА РОБОТА ЗІ СПИСКАМИ ================");

        System.out.println("1. БЕНЧМАРК ВСТАВКИ У ПОЧАТОК СПИСКУ (на " + n + " елементів):");
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, i);
        }

        long end = System.nanoTime();
        double arrayStartMs = (end - start) / 1000000.0;

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        double linkedStartMs = (end - start) / 1000000.0;


        System.out.println("  - Час для ArrayList: " + Math.round(arrayStartMs * 100) / 100.0 + " мс");
        System.out.println("  - Час для LinkedList: " + Math.round(linkedStartMs * 100) / 100.0 + " мс");
        if (linkedStartMs < arrayStartMs) {
            System.out.println("  Висновок: LinkedList швидше при вставці на початок");
        } else {
            System.out.println("  Висновок: ArrayList швидше при вставці на початок");
        }

        System.out.println();
        System.out.println("   БЕНЧМАРК ВСТАВКИ В СЕРЕДИНУ СПИСКУ (на " + n + " елементів):");
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList2.add(arrayList2.size() / 2, i);
        }
        end = System.nanoTime();
        double arrayMidMs = (end - start) / 1000000.0;

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList2.add(linkedList2.size() / 2, i);
        }
        end = System.nanoTime();
        double linkedMidMs = (end - start) / 1000000.0;

        System.out.println("  - Час для ArrayList: " + Math.round(arrayMidMs * 100) / 100.0 + " мс");
        System.out.println("  - Час для LinkedList: " + Math.round(linkedMidMs * 100) / 100.0 + " мс");
        if (linkedMidMs < arrayMidMs) {
            System.out.println("  Висновок: LinkedList швидше при вставці в середину");
        } else {
            System.out.println("  Висновок: ArrayList швидше при вставці в середину");
        }

        System.out.println();
        System.out.println("2. СОРТУВАННЯ СПИСКУ:");
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("   До сортування: " + numbers);
        Collections.sort(numbers);
        System.out.println("   Після сортування: " + numbers);

        System.out.println();
        System.out.println("3. РОБОТА З subList():");
        System.out.println("   Оригінальний список: " + numbers);
        List<Integer> sub = numbers.subList(1, 4);
        System.out.println("   Виділений subList (від індексу 1 до 4): " + sub);
        System.out.println("   Змінюємо елемент у subList на 999...");
        sub.set(0, 999);
        System.out.println("   subList після зміни: " + sub);
        System.out.println("   Оновлений оригінальний список: " + numbers);
        System.out.println("=========================================================+======");
    }
}