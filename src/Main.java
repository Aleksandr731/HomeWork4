public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        }
        int age2 = 17;
        if (age2 < 18) {
            System.out.println("Он не достиг совершеннолетния, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature1 = 4;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градусов, нужно надеть шапку");
        }
        int temperature2 = 6;
        if (temperature2 > 5) {
            System.out.println("На улице " + temperature2 + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("если скорость " + speed + ", то придется запладить штраф");
            int speed2 = 50;
            if (2 <= 60) {
                System.out.println("если скорость " + speed2 + ", то можно ехать спокойно");
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 20;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else {
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            } else {
                if (age >= 7 && age <= 18) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
                } else {
                    if (age > 18 && age <= 24) {
                        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                    } else {
                        if (age > 24 && age < 60) {
                            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
                        } else {
                            if (age > 60) {
                                System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
                            }
                        }

                    }
                }
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционе");
        } else {
            if (age >= 5 && age <= 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                if (age > 14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
                }
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 102;
        int place = 60;
        int human = 80;
        if (human < place) {
            System.out.println("есть сидячее место");
        } else {
            if (human >= place && human < capacity) {
                System.out.println("есть стоячее место");
            } else {
                if (human >= capacity) {
                    System.out.println("мест нет");
                }
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("one больше");
        } else  {
            if (two > one && two > three) {
                System.out.println("two больше");
            } else {
                if (three > one && three > two){
                    System.out.println("three больше");
                }
            }
        }

    }
}
