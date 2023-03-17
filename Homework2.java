
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Arrays;

public class Homework2 {
//    public static void main(String[] args){
/* //ЗАДАЧА 1
        // Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
        // результат после каждой итерации запишите в лог-файл.

        System.out.println("Реализуем алгоритм сортировки пузырьком числового массива");
        Scanner input = new Scanner(System.in);
        System.out.print("Введте числа массива через пробел(1 5 4 2 3): - ");
        String text = input.nextLine();

        boolean only_num = false;
        while (only_num == false){  // проверяем правельность ввода
            for (int i = 0; i < text.length(); i++){
                if(Character.isLetter(text.charAt(i))){
                    System.out.print("Введть нужно только числа через пробел (1 5 4 2 3): - ");
                    text = input.nextLine();
                }
            }
            only_num = true;
        }
        String[] words = text.split(" ");

        int num_array[];
        num_array = new int[words.length];
        for (int i = 0; i < words.length; i++){
            num_array[i] = Integer.parseInt(words[i]);
        }

        boolean end = false;
        int end_len = num_array.length;
        while (end == false & end_len > 1){ // Корректируем массив и добавляем в файл
            boolean change = false;
            for (int i = 1; i < end_len ; i++ ){
                int copy_num;
                if (num_array[i-1] > num_array[i]){
                    copy_num = num_array[i-1];
                    num_array[i-1] = num_array[i];
                    num_array[i] = copy_num;
                    change = true;
                    String num_txt = Arrays.toString(num_array);
                    String file_name = "1.txt";
                    File file = new File(file_name);
                    try{
                        FileWriter writer = new FileWriter(file, true);
                        writer.write(num_txt);
                        writer.write("\n");
                        writer.close();
                        System.out.println("Данные добавлены");
                    }
                    catch (Exception e){
                        System.out.println("Ошибка");
                    }  
                }
                else if (change == false & i == end_len -1){
                    end = true;
                    end_len = 1;
                }
            }
            end_len--;    
        }
        //------------------------------------
*/


/* //ЗАДАЧА 2
        //------------------------------------
        
        //Дана строка (получение через обычный текстовый файл!!!)
        //"фамилия":"Иванов","оценка":"5","предмет":"Математика"
        //"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
        //Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
        //Студент [фамилия] получил [оценка] по предмету [предмет].
        //Пример вывода:
        //Студент Иванов получил 5 по предмету Математика.
        //Студент Петрова получил 4 по предмету Информатика.
        //Студент Краснов получил 5 по предмету Физика. 

        System.out.println("изменение строки с помощю метода StringBuilder");
        try(FileWriter writer = new FileWriter("2.txt", false)){  // создаем файл
            String text = "\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\""
            +"\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"";
            writer.write(text);
            writer.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Создали текстовый файл.");
        
        StringBuilder new_txt = new StringBuilder();
        try(FileReader reader = new FileReader("2.txt")){  //считываем файл
           // читаем посимвольно
            int x;
            while((x=reader.read())!=-1){
                new_txt.append((char)x);
            } 
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }   
        System.out.println("Прочитали текстовый файл.");

        // второй вариант решения - создание массива строк из трех последовательных элементов
        String new_str = new_txt.toString();  // убираем все лшнее из строки
        new_str = new_str.replaceAll(",", "").replaceAll(":", "");
        new_str = new_str.replaceAll("\"фамилия\"", "").replaceAll("\"оценка\"", "").replaceAll("\"предмет\"", "");
        new_str = new_str.replaceAll("\"\"", " ").replaceAll("\"", "");
        int count = 0;
        for (String word : new_str.split(" ")) {
            count++;
        }
        int c = 0;
        String[] lst_word = new String[count];
        for (String word : new_str.split(" ")) { //создаем список нужных нам слов
            lst_word[c] = word;
            c++;
        }
        String[] bild_txt = new String[lst_word.length/3];
        StringBuilder bild_str = new StringBuilder(); 
        int i = 0, j = 0;
        for (int l = 0; l < bild_txt.length ; l++ ){ //создаем текст(массив) на основе списока слов
                while(j < 3){
                    if (j == 0);{
                        bild_str.append("Студент ");
                        bild_str.append(lst_word[i]);   
                        j++; i++;
                    }
                    if (j == 1);{
                        bild_str.append(" получил ");
                        bild_str.append(lst_word[i]); 
                        j++; i++;
                    }
                    if (j == 2);{
                        bild_str.append(" по предмету ");
                        bild_str.append(lst_word[i]);   
                        j++; i++;
                    }
                }
                j = 0;
                bild_str.append(".");
                //System.out.println(bild_str.toString());
                bild_txt[l] = bild_str.toString();
                bild_str = new StringBuilder();
        }
        for (int x = 0; x < bild_txt.length ; x++ ){
            System.out.println(bild_txt[x]);
        }
        
        //------------------------------
         // первый вариант решения - побуквинное считываение и создание нового текста
        String new_str = new_txt.toString();
        new_str = new_str.replaceAll(",", "");  // убираем все лшнее из строки
        new_str = new_str.replaceAll(":", "");
        new_str = new_str.replaceAll("\"", "");
        new_str = new_str.replaceAll("фамилия", "X");
        new_str = new_str.replaceAll("оценка", "Y");
        new_str = new_str.replaceAll("предмет", "Z");
        int len = 0;
        for (int i = 0; i < new_str.length() ; i++ ){ // определяем максимальный размер массива
            if(new_str.charAt(i) == 'X'){
                len++;
            }
        }
        String lst_str[];        //составляем новые строкм на основе имеющихся
        lst_str = new String[len];
        StringBuilder word = new StringBuilder();
        int i = 0, j = 0;
        while (i < new_str.length()-1){
            if(new_str.charAt(i) == 'X'){
                i++;
                word.append("Студент ");
                while (new_str.charAt(i) != 'Y'){
                    word.append(new_str.charAt(i));
                    i++;
                }
                i++; 
                word.append(" получил ");
                while (new_str.charAt(i) != 'Z'){
                    word.append(new_str.charAt(i));
                    i++;
                }
                i++;
                word.append(" по предмету ");
                while (new_str.charAt(i) != 'X' & i < new_str.length()-1){
                    word.append(new_str.charAt(i));
                    i++;
                }
                word.append(".");
                lst_str[j] = word.toString();
                word = new StringBuilder();
                j++;
            }
        }
        for (int x = 0; x < lst_str.length ; x++ ){
            System.out.println(lst_str[x]);
        }
        
        //------------------------------------
*/


/* //ЗАДАЧА 3
        //------------------------------------
        //Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом 
        //(возвращает boolean значение). Без встр. функций
        
        System.out.println("метод, принимает на вход строку (String) и определяет является ли строка палиндромом");
        Scanner input = new Scanner(System.in);
        System.out.print("Введте текст (пример полиндрома - Казак; шалаш; 12321): - ");
        String text = input.next();
        text = text.toLowerCase();
        System.out.println(palindrome(text));        
    }
    public static boolean palindrome(String txt){
        boolean pal = true;
        int last_i = txt.length()-1;
        for (int i = 0; i < txt.length()/2; i++ ){
            if (txt.charAt(i) == txt.charAt(last_i-i)){
                pal = true;
            }
            else{
                pal = false;
                return pal;
            }
        }
        return pal;
    }
    
    //------------------------------------
*/


    //ЗАДАЧА 4 ДОПОЛНИТЕЛЬНАЯ
    public static void main(String[] args){
        //*дополнительно. К калькулятору из предыдущего дз добавить логирование.
        System.out.println("Реализуем простой калькулятор (+ - / *), с добавлением логирования");
        Scanner input = new Scanner(System.in);
        int first_num;
        System.out.print("Введите первое число: - ");
        while (!input.hasNextInt()){
            System.out.print("Введены неверные данные, введите число: - ");
            input.next();
        }
        first_num = input.nextInt();
        int second_num;
        System.out.print("Введите второе число: - ");
        while (!input.hasNextInt()){
            System.out.print("Введены неверные данные, введите число: - ");
            input.next();
        }
        second_num = input.nextInt();

        char mat_op;
        System.out.print("Введите вид математической операции (+ - / *): - ");
        mat_op = input.next().charAt(0);
        while (mat_op != '*' & mat_op != '/' & mat_op != '+' & mat_op != '-'){
            System.out.print("Введены неверные данные, введите вид математической операции: ");
            mat_op = input.next().charAt(0);
        }
        int result = 0;
        switch (mat_op){
            case '*':
                result = first_num * second_num;
                break;
            case '/':
                result = first_num / second_num;
                break;
            case '+':
                result = first_num + second_num;
                break;
            case '-':
                result = first_num - second_num;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }

        System.out.printf("Результат будет равен - %d \n", result);
        input.close();

        try(FileWriter writer = new FileWriter("3.txt", true)){  // создаем файл
            String text = first_num +" "+ mat_op +" "+ second_num +" = "+ result;
            writer.write(text);
            writer.write("\n");
            writer.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }    
}