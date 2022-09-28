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

              if (age5 >=24) {
                  System.out.println("Ты закончил университет. Неплохо было бы найти работу");
              }else{
                  if (age5 >=18) {
                      System.out.println("Ты закончил школу и можешь пойти учиться дальше в университет");
                  }else{
                      if (age5 > 7) {
                          System.out.println("Ты учишься в школе");
                      }


                  }
              }




          }

      }
       }
      }


