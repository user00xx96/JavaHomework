package semestr1.practice02;/*

Sheka Maxym
Шека Максим
КНД-12

 */




public class homework {
    public static void main(String[] args){
        // ex 1
        //int age = 17;
        double height = 1.82;
        char firstLetter = 'M';
        boolean isStudent = true;

        //System.out.println(age);
        System.out.println(height);
        System.out.println(firstLetter);
        System.out.println(isStudent);



        // ex 2
        byte temperature = -15;
        short currentYear = 2026;
        int cityPopulation = 1200000;
        long worldPopulation = 8100000000L;

        System.out.println(temperature);
        System.out.println(currentYear);
        System.out.println(cityPopulation);
        System.out.println(worldPopulation);



        // ex 3
        float floatValue = 1.1234567f;
        double doubleValue = 1.123456789012345;

        System.out.println(floatValue);
        System.out.println(doubleValue);



        // ex 4
        char symbol1 = 'J';
        char symbol2 = 74;
        char symbol3 = '\u004A';
        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);



        // ex 5
        boolean isJavaFun = true;
        boolean isFishFly = false;
        boolean isSkyBlue = true;
        System.out.println(isJavaFun);
        System.out.println(isFishFly);
        System.out.println(isSkyBlue);



        // ex 6
        final double GRAVITY = 9.81;
        final int DAYS_IN_WEEK = 7;
        final String UNIVERSITY_NAME = "Львівська Політехніка";
        System.out.println(GRAVITY);
        System.out.println(DAYS_IN_WEEK);
        System.out.println(UNIVERSITY_NAME);
        // GRAVITY = 10.0;



        // ex 7
        int intVal = 250;
        double doubleVal = intVal;
        System.out.println(intVal);
        System.out.println(doubleVal);



        // ex 8
        double priceWithPennies = 49.99;
        int roundedPrice = (int) priceWithPennies;
        System.out.println(roundedPrice);



        // ex 9
        int firstNumber = 5;
        double userWeight = 72.5;
        String userCity = "Kyiv";
        boolean isValidUser = true;
        System.out.println(firstNumber + ", " + userWeight + ", " + userCity + ", " + isValidUser);



        // ex 10
        String firstName = "Тарас";
        String lastName = "Шевченко";
        int age = 47;
        System.out.println("Мене звати " + firstName + " " + lastName + ", мені " + age + " років" );



        // ex 11
        int a = 10;
        int b = 20;
        System.out.println("Сума без дужок: " + a + b);         // Перший тип данних String, тому для компілятора a та b це текст
        System.out.println("Сума з дужками: " + (a + b));



        // ex 12
        String login = "ivan.petrenko";
        String domain = "gmail.com";
        String role = "student";
        String email = login + "@" + domain;
        System.out.println("Користувач " + login + " (роль: " + role + ") має пошту: " + email);



        // ex 13
        String productName = "Ноутбук";
        int quantity = 2;
        double pricePerUnit = 24500.50;
        System.out.println("ЧЕК: \nТовар: " + productName + "\nКількість: " + quantity + " шт." + "\nЦіна: " + pricePerUnit + " грн");



        // ex 14
        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        System.out.println("Поточний баланс: " + hryvnias + "." + kopecks + " " + currency);



        // ex 15
        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;
        System.out.println("Запит відправлено на: " + protocol + host + endpoint + "/" +userId);



        // ex 16
        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println("Мова: " + language + " | " + "Рівень: " + level + " | " + "Готовність до практики: " + isReady);



        // ex 17
        int number = 19;
        int remainder = number % 2;
        System.out.println("Число " + number + " при діленні на 2 дає остачу: " + remainder);



        // ex 18
        int totalSeconds = 385;
        System.out.println(totalSeconds + " секунд = " + (totalSeconds / 60) + " хв " + (totalSeconds % 60) + " сек");



        // ex 19
        int n = 47;
        System.out.println("Число: " + n + ". Десятки: " + (n / 10) + ", Одиниці: " + (n % 10) + ". Сума цифр: " + (((n / 10)+(n % 10))));



        // ex 20
        int score = 100;
        System.out.println("Очікуваний результат:");
        score += 50;
        System.out.println("Після додавання: " + score);
        score -= 20;
        System.out.println("Після віднімання: " + score);
        score *= 2;
        System.out.println("Після множення: " + score);
        score /= 4;
        System.out.println("Після ділення: " + score);



        // ex 21
        int counter = 5;
        System.out.println(counter++);          // Спочатку повертає старе значення а потім додає на 1
        System.out.println(counter);



        // ex 22
        int counter1 = 5;
        System.out.println(++counter1);        // Спочатку збільшує значення, потім виводить його, а постфіксний інкремент повертає старе значення



        // ex 23
        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        System.out.println("Середній бал: " + (grade1 + grade2 + grade3) / 3.0);



        // ex 24
        double celsius = 25.0;
        System.out.println(celsius + "C = " + (celsius*1.8+32) + "F");
        System.out.println(celsius + "C = " + (celsius+273.15) + " K");



        // ex 25
        int userAge = 17;
        boolean isAdult = userAge >= 18;
        System.out.println("Вік: " + userAge + ". Чи є повнолітнім: " + isAdult);



        // ex 26
        int x = 15; int y = 20;
        System.out.println("x == y: " + (x == y));
        System.out.println( "x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));



        // ex 27
        int speed = 75;
        boolean isSafeSpeed = (speed >= 20) && (speed <= 80);
        System.out.println(isSafeSpeed);



        // ex 28
        int personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);
        System.out.println("Вік: " + personAge + ". Право на безкоштовний проїзд: " + hasFreePass);



        // ex 29
        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;
        System.out.println("Двері зачинені: " + isDoorLocked);
        System.out.println("Чи можна увійти: " + canEnter);



        // ex 30
        int number1 = 30;
        boolean isDivisibleByBoth = (number1 % 3 == 0) && (number1 % 5 == 0);
        System.out.println(number1 + ": " + isDivisibleByBoth);
        number1 = 25;
        isDivisibleByBoth = (number1 % 3 == 0) && (number1 % 5 == 0);
        System.out.println(number1 + ": " + isDivisibleByBoth);



        // ex 31
        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
        System.out.println(canLogin);



        // ex 32
        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeapYear);



        // ex 33
        double a1 = 3.0;
        double b1 = 4.0;
        double c = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));
        System.out.println("Катети: " + a1 + " та " + b1 + " Гіпотенуза: " + c);



        // ex 34
        double radius = 5.0;
        double L = 2 * Math.PI * radius;
        double S = Math.PI * Math.pow(radius, 2);
        System.out.println("Радіус: " + radius);
        System.out.println("Довжина кола: " + L);
        System.out.println("Площа круга: " + S);



        // ex 35
        double dayTemp = 18.5;
        double nightTemp = -3.2;
        System.out.println("Модуль різниці: " + Math.abs(dayTemp - nightTemp));
        System.out.println("Максимальну температуру: " + Math.max(dayTemp, nightTemp));
        System.out.println("Мінімальну температуру: " + Math.min(dayTemp, nightTemp));



        // ex 36
        double num = 5.67;
        double negNum = -5.67;
        System.out.println("Round : " + Math.round(num) + " Ceil: " + Math.ceil(num) + " Floor: " +  Math.floor(num));
        System.out.println("Round : " + Math.round(negNum) + " Ceil: " + Math.ceil(negNum) + " Floor: " +  Math.floor(negNum));



        // ex 37
        double a2 = 1.0; double b2 = -7.0; double c2 = 10.0;
        double d = Math.pow(b2, 2) - 4 * a2 * c2;
        double x1 = ((-b2 + Math.sqrt(d)) / (2 * a2));
        double x2 = ((-b2 - Math.sqrt(d)) / (2 * a2));
        System.out.println("Дискримінант D = " + d);
        System.out.println("Корінь х1 = " + x1);
        System.out.println("Корінь х2 = " + x2);



        // ex 38
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Випало на кубику: " + dice);



        // ex 39
        int min = -10;
        int max = 35;
        int randomTemp = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(randomTemp);



        // ex 40
        double P = 10000.0;
        double r = 12.0;
        int t = 3;

        double finalAmount = P * Math.pow(1 + r / 100, t);
        double profit = finalAmount - P;

        System.out.println("+------------------------------------+");
        System.out.println("|     ДЕПОЗИТНИЙ КАЛЬКУЛЯТОР        |");
        System.out.println("+------------------------------------+");
        System.out.println("Початкова сума: " + P);
        System.out.println("Термін: " + t +  " роки під " + r +  " річних");
        System.out.println("Підсумкова сума: " + finalAmount);
        System.out.println("Чистий прибуток: " + profit);
        System.out.println("+------------------------------------+");
    }

}










