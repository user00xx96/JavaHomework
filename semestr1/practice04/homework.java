//package semestr1.practice04;
//
//import java.util.Scanner;
//
//public class homework {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        // ex 1
//        for (int i = 0; i<7; i++)
//        {
//            System.out.println("Java - надійна та кросплатформна мова!");
//        }
//
//
//
//        // ex 2
//        System.out.print("Введіть текст: ");
//        String text = scanner.nextLine();
//
//        System.out.print("Введіть кількість повторень: ");
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println("[" + i + "] " + text);
//        }
//
//
//
//        // ex 3
//        int cash = 500;
//        for (int i = 1; i <= 12; i++)
//        {
//            System.out.println("Місяць " + i + ": " + cash);
//            cash += 500;
//        }
//
//
//        // ex 4
//        double rate = 44.5;
//        for (int i = 10; i<=100; i+=10)
//        {
//            System.out.println(i + " євро у гривнях = " + (rate * i));
//        }
//
//
//
//        // ex 5
//        int W = scanner.nextInt();
//        for (int i = 0; i<W; i++)
//        {
//            System.out.print("=");
//        }
//
//
//
//        // ex 6
//        int i = 10;
//        while (i != 0)
//        {
//            System.out.println(i);
//            if (i == 1)
//            {
//                System.out.println("Поїхали! Ракета запущена!");
//            }
//            i--;
//        }
//
//
//
//        // ex 7
//        int temp = 0;
//        while (true)
//        {
//            int num = scanner.nextInt();
//            temp += num;
//            if (num==0)
//            {
//                System.out.println("Sum: " + temp);
//                break;
//            }
//        }
//
//
//        // ex 8
//        int M = scanner.nextInt();
//        int nums = 1;
//        while (M>=nums)
//        {
//            System.out.println(nums);
//            nums *= 2;
//        }
//
//
//        // ex 9
//        System.out.print("Введіть число: ");
//        int n = scanner.nextInt();
//        int count = 0;
//        int sum = 0;
//
//        while (n > 0) {
//            sum += n % 10;
//            count++;
//            n /= 10;
//        }
//        System.out.println("Кількість цифр: " + count);
//        System.out.println("Сума цифр: " + sum);
//
//
//
//
//        // ex 10
//        System.out.print("Введіть число: ");
//        int n = scanner.nextInt();
//        int reverse = 0;
//
//        while (n > 0) {
//            reverse = reverse * 10 + n % 10;
//            n = n / 10;
//        }
//        System.out.println("Реверс: " + reverse);
//
//
//
//        // ex 11
//        System.out.print("Введіть початкову суму: ");
//        double money = scanner.nextDouble();
//        System.out.print("Введіть відсоток: ");
//        double percent = scanner.nextDouble();
//
//        double start = money;
//        int years = 0;
//
//        while (money < start * 2) {
//            money += money * percent / 100;
//            years++;
//        }
//        System.out.println("Потрібно років: " + years);
//        System.out.println("Сума: " + money);
//
//
//
//        // ex 12
//        System.out.print("Введіть число: ");
//        int n = scanner.nextInt();
//        int divisor = 2;
//
//        while (n % divisor != 0) {
//            divisor++;
//        }
//        System.out.println("Найменший дільник: " + divisor);
//
//
//
//        // ex 13
//        int secret = (int)(Math.random() * 100) + 1;
//        int guess = 0;
//        int attempts = 0;
//
//        while (guess != secret) {
//            System.out.print("Введіть число: ");
//            guess = scanner.nextInt();
//            attempts++;
//
//            if (guess < secret) {
//                System.out.println("Більше!");
//            } else if (guess > secret) {
//                System.out.println("Менше!");
//            }
//        }
//
//        System.out.println("Ви вгадали!");
//        System.out.println("Кількість спроб: " + attempts);
//
//
//
//        // ex 14
//        int choice;
//
//        do {
//            System.out.println("1. Розпочати нову гру");
//            System.out.println("2. Завантажити збереження");
//            System.out.println("3. Налаштування");
//            System.out.println("0. Вихід");
//
//            System.out.print("Ваш вибір: ");
//            choice = scanner.nextInt();
//
//            if (choice == 1) {
//                System.out.println("Нова гра");
//            } else if (choice == 2) {
//                System.out.println("Завантаження");
//            } else if (choice == 3) {
//                System.out.println("Налаштування");
//            }
//
//        } while (choice != 0);
//
//
//
//        // ex 15
//        int age;
//
//        do {
//            System.out.print("Введіть вік: ");
//            age = scanner.nextInt();
//        } while (age < 1 || age > 120);
//
//        System.out.println("Вік підтверджено: " + age);
//
//
//
//        // ex 16
//        int pin;
//        int attempts = 0;
//
//        do {
//            System.out.print("Введіть PIN: ");
//            pin = scanner.nextInt();
//            attempts++;
//
//            if (pin == 1234) {
//                System.out.println("Доступ надано");
//                break;
//            }
//
//        } while (attempts < 3);
//
//        if (pin != 1234) {
//            System.out.println("Карту заблоковано!");
//        }
//
//
//
//        // ex 17
//        char answer;
//
//        do {
//            System.out.print("Введіть два числа: ");
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//
//            System.out.println("Сума: " + (a + b));
//
//            System.out.print("Бажаєте продовжити? (y/n): ");
//            answer = scanner.next().charAt(0);
//
//        } while (answer == 'y');
//
//
//
//        // ex 18
//        int dice1;
//        int dice2;
//        int attempts = 0;
//
//        do {
//            dice1 = (int)(Math.random() * 6) + 1;
//            dice2 = (int)(Math.random() * 6) + 1;
//            attempts++;
//
//            System.out.println(dice1 + " " + dice2);
//
//        } while (dice1 != dice2);
//
//        System.out.println("Дубль!");
//        System.out.println("Кількість спроб: " + attempts);
//
//
//
//        // ex 19
//        System.out.print("Введіть чисельник: ");
//        double a = scanner.nextDouble();
//
//        double b;
//
//        do {
//            System.out.print("Введіть знаменник: ");
//            b = scanner.nextDouble();
//        } while (b == 0);
//        System.out.println("Результат: " + (a / b));
//
//
//
//
//        // ex 20
//        int sum = 0;
//        int count = 0;
//        int mark;
//
//        do {
//            System.out.print("Введіть бал (-1 для завершення): ");
//            mark = scanner.nextInt();
//
//            if (mark >= 0 && mark <= 100) {
//                sum = sum + mark;
//                count++;
//            } else if (mark >= 0) {
//                System.out.println("Некоректний бал!");
//            }
//
//        } while (mark >= 0);
//
//        if (count > 0) {
//            System.out.println("Середній бал: " + (double) sum / count);
//        }
//
//
//
//        // ex 21
//        System.out.print("Введіть початок: ");
//        int a = scanner.nextInt();
//        System.out.print("Введіть кінець: ");
//        int b = scanner.nextInt();
//
//        for (int i = a; i <= b; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//
//
//
//        // ex 22
//        System.out.print("Введіть число: ");
//        int n = scanner.nextInt();
//
//        long factorial = 1;
//
//        for (int i = 1; i <= n; i++) {
//            factorial = factorial * i;
//        }
//        System.out.println("Факторіал: " + factorial);
//
//
//
//        // ex 23
//        System.out.println("Число | Квадрат | Куб");
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
//        }
//
//
//
//        // ex 24
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                continue;
//            }
//
//            System.out.print(i + " ");
//        }
//
//
//
//        // ex 25
//        for (int i = 100; i <= 200; i++) {
//            if (i % 13 == 0 && i % 7 == 0) {
//                System.out.println("Знайдено: " + i);
//                break;
//            }
//        }
//
//
//
//
//        // ex 26
//        for (char ch = 'A'; ch <= 'Z'; ch++) {
//            System.out.println(ch + " - " + (int) ch);
//        }
//
//
//
//        // ex 27
//        System.out.print("Введіть кількість елементів: ");
//        int n = scanner.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                sum = sum - i;
//            } else {
//                sum = sum + i;
//            }
//        }
//        System.out.println("Сума: " + sum);
//
//
//
//        // ex 28
//        System.out.print("Перший член: ");
//        int a = scanner.nextInt();
//        System.out.print("Різниця: ");
//        int d = scanner.nextInt();
//        System.out.print("Кількість членів: ");
//        int n = scanner.nextInt();
//
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            int number = a + i * d;
//            System.out.print(number + " ");
//            sum = sum + number;
//        }
//        System.out.println("\nСума: " + sum);
//
//
//
//
//        // ex 29
//        byte b = 125;
//
//        for (int i = 1; i <= 6; i++) {
//            b = (byte)(b + 1);
//            System.out.println(b);
//        }
//
//
//
//        // ex 30
//        System.out.print("Скільки чисел: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("Введіть число: ");
//            sum = sum + scanner.nextInt();
//        }
//
//        double average = (double) sum / n;
//        int average2 = sum / n;
//        System.out.println("Точне середнє: " + average);
//        System.out.println("Без приведення: " + average2);
//
//
//
//        // ex 31
//        System.out.print("Введіть слово: ");
//        String word = scanner.nextLine();
//
//        String result = "";
//
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            result = result + (char)(ch + 1);
//        }
//        System.out.println("Зашифроване слово: " + result);
//
//
//
//        // ex 32
//        double[] prices = {19.99, 45.50, 12.10, 99.95, 3.40};
//
//        int UAH = 0;
//        int kop = 0;
//
//        for (int i = 0; i < prices.length; i++) {
//            UAH += (int) prices[i];
//            kop += (int)((prices[i] - (int)prices[i]) * 100);
//        }
//
//        System.out.println("Гривень: " + UAH);
//        System.out.println("Копійок: " + kop);
//
//
//
//
//        // ex 33
//        for (int i = 1; i <= 50; i++) {
//            int percent = (int)(((double)i / 50) * 100);
//            System.out.println("Завантажено: " + percent + "%");
//        }
//
//
//
//        // ex 34
//
//        long bigNumber = 3_000_000_000L;
//        int number = (int) bigNumber;
//
//        System.out.println("Long: " + bigNumber);
//        System.out.println("Int: " + number);
//
//
//        // ex 35
//        for (double d = 0.0; d <= 1.0; d += 0.1) {
//            System.out.println(d);
//        }
//
//        System.out.println("Правильний варіант:");
//
//        for (int i = 0; i <= 10; i++) {
//            double val = i / 10.0;
//            System.out.println(val);
//        }
//
//
//
//        // ex 36
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i * j + "\t");
//            }
//
//            System.out.println();
//        }
//
//
//
//
//        // ex 37
//        System.out.print("Висота: ");
//        int height = scanner.nextInt();
//        System.out.print("Ширина: ");
//        int width = scanner.nextInt();
//
//        for (int i = 1; i <= height; i++) {
//            for (int j = 1; j <= width; j++) {
//
//                if (i == 1 || i == height || j == 1 || j == width) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }
//
//
//
//        // ex 38
//        System.out.print("Висота: ");
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//
//
//        // ex 39
//        System.out.print("Введіть число: ");
//        int n = scanner.nextInt();
//
//        for (int i = 2; i <= n; i++) {
//            boolean simple = true;
//
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    simple = false;
//                    break;
//                }
//            }
//            if (simple) {
//                System.out.print(i + " ");
//            }
//        }
//
//
//        // ex 40
//        System.out.print("Розмір дошки: ");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//
//                if ((i + j) % 2 == 0) {
//                    System.out.print("_ ");
//                } else {
//                    System.out.print("# ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
