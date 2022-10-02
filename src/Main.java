public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Пока ты не достиг совершеннолетия. Подожди чуть-чуть");

            // Задача 2
            int age1 = 25;

            if (age1 >= 18)
                if (age1 < 24) {
                    System.out.println("Ты закончил школу и можешь пойти учиться дальше в университет");
                }
            if (age1 >= 7)
                if (age1 < 18) {
                    System.out.println("Ты учишься в школе");
                }

            if (age1 >= 24) {
                System.out.println("Ты закончил университет. Неплохо было бы найти работу");
            }

            // Задача 3

            int passengers = 77;

            if (passengers < 60) {
                System.out.println("В вагоне есть сидячие и стоячие места");
            }
            if (passengers >= 60)
                if (passengers < 120) {
                    System.out.println("В вагоне есть только стоячие места");
                }
            if (passengers >= 120) {
                System.out.println("Мест нет");

            }
            //Задача 4
            int age2 = 19;
            if (age2 >= 18) {
                System.out.println("Поздравляем с совершеннолетием!");
            } else {
                System.out.println("Пока ты не достиг совершеннолетия. Подожди чуть-чуть");
            }
            // Задача 5

            int age5 = 19;

            if (age5 >= 24) {
                System.out.println("Ты закончил университет. Неплохо было бы найти работу");
            } else {
                if (age5 >= 18) {
                    System.out.println("Ты закончил школу и можешь пойти учиться дальше в университет");
                } else {
                    if (age5 > 7) {
                        System.out.println("Ты учишься в школе");
                    }
                }
            }
        }
        //Задача 6

        int passengers2 = 12;

        if (passengers2 >= 120) {
            System.out.println("Мест нет");
        } else if (passengers2 >= 60) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            if (passengers2 < 60) {
                System.out.println("В вагоне есть сидячие и стоячие места");
            }
        }
        // Задача 7

        int age7 = 7;
        if (age7 >= 2 && age7 <= 6) {
            System.out.println("Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад");
        }
            if (age7 >= 7 && age7 < 18){
                System.out.println("Если человек от 7 до 18 лет, то ему нужно ходить в школу");
            }
            if (age7 >= 18 && age7 < 24) {
                System.out.println("Если человеку больше 18 лет, но меньше 24, то его место в университете");
            }
            if (age7 >=24) {
                System.out.println("А если человеку больше 24, то ему пора ходить на работу");
        }

        //Задача 8

        int age8 =8;
            boolean adult = false;
            if (age8<5) {
                System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе");
            }
            if (age8 >= 5 && age8 <14 && adult == true){
                System.out.println("Со взрослым ребенок может кататься на атракционе");
            }else{
                System.out.println("Без взрослого на атракционе кататься нельзя");
            }
            if (age8 >= 14){
                System.out.println("Можно кататься на атракционе без взрослого");}
    }




}
