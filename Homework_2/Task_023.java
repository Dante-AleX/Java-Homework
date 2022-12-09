package Java_Homework.Homework_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

public class Task_023 {
        public static void main(String[] args) {
                HashMap<String, String> map_dect_1 = new HashMap<>();
                map_dect_1.put("фамилия", "Иванов");
                map_dect_1.put("оценка", "5");
                map_dect_1.put("предмет", "Математика");
                HashMap<String, String> map_dect_2 = new HashMap<>();
                map_dect_2.put("фамилия", "Петрова");
                map_dect_2.put("оценка", "4");
                map_dect_2.put("предмет", "Информатика");
                HashMap<String, String> map_dect_3 = new HashMap<>();
                map_dect_3.put("фамилия", "Краснов");
                map_dect_3.put("оценка", "5");
                map_dect_3.put("предмет", "Физика");

                System.out.println("Студент " + (map_dect_1.get("фамилия")) + " получил " + (map_dect_1.get("оценка"))
                                + " по предмету " + (map_dect_1.get("предмет")) + ".");
                System.out.println("Студент " + (map_dect_2.get("фамилия")) + " получил " + (map_dect_2.get("оценка"))
                                + " по предмету " + (map_dect_2.get("предмет")) + ".");
                System.out.println("Студент " + (map_dect_3.get("фамилия")) + " получил " + (map_dect_3.get("оценка"))
                                + " по предмету " + (map_dect_3.get("предмет")) + ".");

        }
}