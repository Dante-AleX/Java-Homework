/*
Подумать над структурой класса Ноутбук для магазина техники - 
выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий 
(или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например: “Введите цифру, 
соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет
Далее нужно запросить минимальные значения для указанных 
критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и 
вывести проходящие по условиям.
*/

package Java_Homework.Final_Work;

import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Final_Task {
        public static String notebook_market(int request) {
                String rez;
                Map<String, String> Asus = new HashMap<>();
                Asus.put("RAM", "4 Gb");
                Asus.put("HDD", "256 Gb");
                Asus.put("OS", "Linux");
                Asus.put("Color", "Красный");
                Map<String, String> Lenovo = new HashMap<>();
                Lenovo.put("RAM", "8 Gb");
                Lenovo.put("HDD", "512 Gb");
                Lenovo.put("OS", "Ubuntu");
                Lenovo.put("Color", "Серый");
                Map<String, String> Acer = new HashMap<>();
                Acer.put("RAM", "16 Gb");
                Acer.put("HDD", "1024 Gb");
                Acer.put("OS", "Windows");
                Acer.put("Color", "Чёрный");

                switch (request) {

                        case 1:
                                rez = "1: 4Gb;" + "\n" +
                                                "2: 8Gb;" + "\n" +
                                                "3: 16Gb." + "\n";
                                break;
                        case 2:
                                rez = "1: 256Gb;" + "\n" +
                                                "2: 512Gb;" + "\n" +
                                                "3: 1024Gb." + "\n";
                                break;
                        case 3:
                                rez = "1: Windows;" + "\n" +
                                                "2: Linux;" + "\n" +
                                                "3: Ubuntu." + "\n";
                                break;
                        case 4:
                                rez = "1: Красный;" + "\n" +
                                                "2: Чёрный;" + "\n" +
                                                "3: Серый." + "\n";
                                break;
                        default:
                                rez = "Error!";
                }

                return rez;
        }

        public static void main(String[] args) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("\nВыберите категорию сортировки: \n 1-RAM; \n 2-HDD; \n 3-OS; \n 4-Цвет.");
                int a = sc1.nextInt();
                if (a == 1) {
                        System.out.println("\nСортировка по ОЗУ: \n" + notebook_market(1));
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("Выберите количество ОЗУ:");
                        int b = sc2.nextInt();
                        if (b == 1) {
                                System.out.println("\nAsus: \n ОЗУ: 4Gb; \n HDD: 256Gb; \n OS: Linux; \n Цвет: Красный.");
                        } 
                        else if (b == 2) {
                                System.out.println("\nLenovo: \n ОЗУ: 8Gb; \n HDD: 512Gb; \n OS: Ubuntu; \n Цвет: Серый.");
                        } 
                        else if (b == 3) {
                                System.out.println("\nAcer: \n ОЗУ: 16Gb; \n HDD: 1024Gb; \n OS: Windows; \n Цвет: Чёрный.");
                        } 
                        else if (b > 3) {
                                System.out.println("\nНеверный ввод!");
                        }
                } 
                else if (a == 2) {
                        System.out.println("\nСортировка по HDD: \n" + notebook_market(2));
                        Scanner sc3 = new Scanner(System.in);
                        System.out.println("Выберите размер HDD:");
                        int c = sc3.nextInt();
                        if (c == 1) {
                                System.out.println("\nAsus: \n HDD: 256Gb; \n ОЗУ: 4Gb; \n OS: Linux; \n Цвет: Красный.");
                        } 
                        else if (c == 2) {
                                System.out.println("\nLenovo: \n HDD: 512Gb; \n ОЗУ: 8Gb; \n OS: Ubuntu; \n Цвет: Серый.");
                        } 
                        else if (c == 3) {
                                System.out.println("\nAcer: \n HDD: 1024Gb; \n ОЗУ: 16Gb; \n OS: Windows; \n Цвет: Чёрный.");
                        } 
                        else if (c > 3) {
                                System.out.println("\nНеверный ввод!");
                        }
                } 
                else if (a == 3) {
                        System.out.println("\nСортировка по OS: \n" + notebook_market(3));
                        Scanner sc4 = new Scanner(System.in);
                        System.out.println("Выберите OS:");
                        int d = sc4.nextInt();
                        if (d == 1) {
                                System.out.println("\nAcer: \n OS: Windows; \n ОЗУ: 16Gb; \n HDD: 1024Gb; \n Цвет: Чёрный.");
                        } 
                        else if (d == 2) {
                                System.out.println("\nAsus: \n OS: Linux; \n ОЗУ: 4Gb; \n HDD: 256Gb; \n Цвет: Красный.");
                        } 
                        else if (d == 3) {
                                System.out.println("\nLenovo: \n OS: Ubuntu; \n ОЗУ: 8Gb; \n HDD: 512Gb; \n Цвет: Серый.");
                        } 
                        else if (d > 3) {
                                System.out.println("\nНеверный ввод!");
                        }
                } 
                else if (a == 4) {
                        System.out.println("\nСортировка по цвету: \n" + notebook_market(4));
                        Scanner sc5 = new Scanner(System.in);
                        System.out.println("Выберите цвет:");
                        int e = sc5.nextInt();
                        if (e == 1) {
                                System.out.println("\nAsus: \n Цвет: Красный; \n ОЗУ: 4Gb; \n HDD: 256Gb; \n OS: Linux.");
                        } 
                        else if (e == 2) {
                                System.out.println("\nAcer: \n Цвет: Чёрный; \n ОЗУ: 16Gb; \n HDD: 1024Gb; \n OS: Windows.");
                        } 
                        else if (e == 3) {
                                System.out.println("\nLenovo: \n Цвет: Серый; \n ОЗУ: 8Gb; \n HDD: 512Gb; \n OS: Ubuntu.");
                        } 
                        else if (e > 3) {
                                System.out.println("\nНеверный ввод!");
                        }
                } 
                else if (a > 4) {
                        System.out.println("\nНеверный ввод!");
                }
        }
}