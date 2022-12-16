/*
В файле содержится строка с исходными данными в такой форме: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */

 package Homework_2.Task_1;


 import java.io.BufferedReader;
 import java.io.FileReader;
 import java.io.IOException;
//  import java.util.Arrays;
 
 public class Task1 {
 

    public static void main(String[] args) {
        String[] arrayS = convertFileToStrArr("Homework_2/Task_1/instruction1.json");
        // System.out.println(Arrays.toString(arrayS));
        String quer = createSQLQuery(arrayS);
        System.out.println(quer);

    }

     private static String[] convertFileToStrArr(String path) {


         StringBuilder sb = new StringBuilder();
         try (BufferedReader br = new BufferedReader(new FileReader(path))) {
             int ch;
             while ((ch = br.read()) != -1) {
                 sb.append((char) ch);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }

         String[] array = sb.toString().split("[\\s\\p{Punct}]+");
         String[] temp = new String[array.length - 1];
         System.arraycopy(array, 1, temp, 0, 8);
         return temp;
     }
 
 

     private static String createSQLQuery(String[] array) {
         StringBuilder sb = new StringBuilder("SELECT * FROM students WHERE "); 
         for (int i = 0; i < array.length; i += 2) {
             
             if (array[i].equals("name") || array[i].equals("country") || array[i].equals("city")) {
                 if (!array[i + 1].equals("null")) {

                     sb.append(String.format("\"%s\" = ", array[i])); 
                     sb.append(String.format("\"%s\"", array[i + 1])); 
                 } else {
                     continue; 
                 }

                 if (!array[i + 2].equals("age")){
                     sb.append(" AND "); 
                 }
             }
 
             if (array[i].equals("age") && !array[i + 1].equals("null")) {
                 sb.append(" AND ");
                 sb.append(array[i++]);
                 sb.append(" = ");
                 sb.append(array[i]);
             }
 
         }
         sb.append(";");
         return sb.toString();
     }
 

    }