/* 
Дана строка sql-запроса "select * from students where ". 
 Сформируйте часть WHERE этого запроса, используя StringBuilder. 
 Данные для фильтрации приведены ниже в виде json строки.
 Если значение null, то параметр не должен попадать в запрос.
 Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/
 
package Java_Homework.Homework_2;
import java.util.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;

public class Task_021 {
    public static void main(String[] args) {
        HashMap<String, String> map_dect = new HashMap<>();
        map_dect.put("name", "Ivanov");
        map_dect.put("country", "Russia");
        map_dect.put("city", "Moscow");
        map_dect.put("age", null);

        System.out.println("вся запись в базе : " + map_dect);
        ArrayList<String> kes_map_dect = new ArrayList<>(map_dect.keySet());
        ArrayList<String> values_map_dect = new ArrayList<>(map_dect.values());

        StringBuilder zapros_str = new StringBuilder("select * from students where ");

        for (int i = 0; i < kes_map_dect.size(); i++) {
            if (values_map_dect.get(i) != null) {
                if (i > 0) {
                    zapros_str.append(" and ");
                }
                zapros_str.append(kes_map_dect.get(i));
            }
        }
        System.out.println(zapros_str);

    }
}