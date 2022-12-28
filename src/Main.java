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

    public static void task1 () {
        System.out.println("Задача 1");

        int age = 17;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");

        int outsideTemp = 5;

        if (outsideTemp > 5) {
            System.out.println("На улице " + outsideTemp + " градуса(ов), можно идти без шапки");
        } else {
            System.out.println("На улице " + outsideTemp + " градуса(ов), нужно надеть шапку");
        }

    }

    public static void task3 () {
        System.out.println("Задача 3");

        int carSpeed = 80;

        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + " км/ч, можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int age = 24;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то его место в университете");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему пора ходить на работу");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int age = 4;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься на аттракционе без сопровождении взрослого");
        }

    }

    public static void task6 () {
        System.out.println("Задача 6");

        int passengersInVag = 50;
        int vagCapacity = 102;
        int vagSeats = 60;
        int vagStandingPlaces = vagCapacity - vagSeats;

        if (passengersInVag > vagSeats && passengersInVag < vagCapacity) {
            System.out.println("В вагоне едут " + passengersInVag + " пассажиров. В вагоне остались только стоячие места.");
        } else if (passengersInVag < vagSeats){
                System.out.println("В вагоне едут " + passengersInVag + " пассажиров. В вагоне есть сидячие места.");
        } else {
                System.out.println("В вагоне едут 102 пассажира. Вагон уже полностью забит.");
            }
        }

    public static void task7 () {
        System.out.println("Задача 7");

        int one = 5;
        int two = 4;
        int three = 3;

        if (one > two) {
            if (one > three) {
                System.out.println("Самое большое число one = " + one);
            }
            else {
                System.out.println("Самое большое число three = " + three);
            }
        }
        else {
            if (two > three) {
                System.out.println("Самое большое число two = " + two);
            }
            else {
                System.out.println("Самое большое число three = " + three);
            }
        }

    }

}