
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
//import java.util.Arrays;


public class Homework5 {

/*  // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    //Добавить функции 1) Добавление номера
    //                 2) Вывод всего
    public static void main(String[] args){

        Map<String, String> phone_book = new HashMap<String, String>();
        phone_book.put("Ivanov", "89535811111");
        phone_book.put("Petrov", "89535812222");
        phone_book.put("Sidorov", "89535813333");
        phone_book.put("Maximus", "Почтовые голуби");

        System.out.println("\n////////////////////////////////////////////////////////////////////////////////\n"
        + "Реализуем структуру телефонной книги с помощью HashMap");
        System.out.print("////////////////////////////////////////////////////////////////////////////////\n"
        + "Вы запустили телефонный справочьник, наш богатый функционал позволяет вам:\n");
        Scanner input = new Scanner(System.in);
        boolean end = true;
        while(end){
            System.out.print("   1) Найти человека по ФАМИЛИИ\n   2) Найти челолвека по НОМЕРУ\n"
            + "   3) Вывести весь список\n   4) Добавит номер\n   5) Закрыть программу\n   ...");
            String phone_nums;
            int num = input_num();
            switch (num){
                case 1:
                    System.out.print("Напишите фамилию - ");
                    String last_name = input.next();
                    if (phone_book.containsKey(last_name)){
                        phone_nums = phone_book.get(last_name);
                        System.out.println("////////////////////////////////////////////////////////////////////////////////\nФамилия - "
                        + last_name + ". Номера телефонов " + phone_nums);
                        Recording_deleting_phone_num(phone_book, last_name, phone_nums);
                    }
                    else{
                        System.out.println("////////////////////////// Данная фамилия в списках не числится //////////////////////////");
                    }
                    break;
                case 2:
                    boolean num_found = true;
                    while(num_found){
                        System.out.print("Напишите номер телефона - ");
                        String phone_num_look = input.next();
                        for(Map.Entry<String, String> item : phone_book.entrySet()){
                            String txtKey = item.getKey();
                            String txtValue = item.getValue();
                            if (txtValue.contains(phone_num_look)){
                                phone_nums = phone_book.get(txtKey);
                                System.out.println("////////////////////////// Владелец номера найден //////////////////////////\nФамилия - "
                                + txtKey + ". Номера телефонов " + txtValue);
                                Recording_deleting_phone_num(phone_book, txtKey, txtValue);
                                num_found = false;
                            }
                        }
                        if (num_found == true){
                            System.out.println("////////////////////////// Номер не найден, повторить попытку? //////////////////////////\n"
                            + "   1) да\n   2) нет\n   ...");
                            int yes_no = input.nextInt();
                            switch (yes_no){
                                case 1:
                                    num_found = true;
                                    break;
                                case 2:
                                    num_found = false;
                                    System.out.println("////////////////////////// Поиск человека по номеру ОСТАНОВЛЕН //////////////////////////");
                                    break;
                                default:
                                    System.out.println("Операция не распознана. Повторите ввод.");
                            }
                        }
                    }
                    break;
                case 3:
                    for(Map.Entry<String, String> item : phone_book.entrySet()){
                        String txtKey = item.getKey();
                        String txtValue = item.getValue();
                        System.out.println("--------------------------------------------------------------------------------\nФамилия - "
                        + txtKey + ". | Номера телефонов - " + txtValue);
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.print("Напишите фамилию человека для добавления номера. - ");
                    last_name = input.next();
                    if (phone_book.containsKey(last_name)){
                        phone_nums = phone_book.get(last_name);
                        System.out.println("////////////////////////////////////////////////////////////////////////////////\nФамилия - "
                        + last_name + ". Номера телефонов " + phone_nums);
                        Recording_deleting_phone_num(phone_book, last_name, phone_nums);
                    }
                    else{
                        System.out.println("////////////////////////// Данная фамилия в списках не числится //////////////////////////");
                    }
                    break;
                case 5:
                    end = false;
                    System.out.println("////////////////////////////////////////////////////////////////////////////////\n"
                    + "Телефонный справочник завершает свою работу, всего хорошего.\n"
                    + "////////////////////////////////////////////////////////////////////////////////");
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
    }

    public static Map<String, String> Recording_deleting_phone_num(Map<String, String> phone_book, String last_name, String phone_nums){
        Scanner input = new Scanner(System.in);
        System.out.print("   1)Добавит номер\n   2)Удалить номер\n   3)Оставит как есть\n   ...");
        int num_1 = input_num();
        switch (num_1){
            case 1:
                System.out.print("Напишите номер для добавления - ");
                String in_pho_num = input.next();
                phone_nums = phone_nums + ", " + in_pho_num;
                phone_book.replace(last_name, phone_nums);
                System.out.println("////////////////////////// Номер - "+ in_pho_num +" был добавлен //////////////////////////");
                break;
            case 2:
                boolean repeat = true;
                while(repeat){
                    int len = phone_nums.length();
                    System.out.print("Напишите номер для удаления - ");
                    in_pho_num = input.next();
                    phone_nums = phone_nums.replaceAll(", " + in_pho_num, "");
                    phone_nums = phone_nums.replace(in_pho_num + ", ", "");
                    if (phone_nums.length() < len){
                        phone_book.replace(last_name, phone_nums);
                        System.out.println("////////////////////////// Номер - "+ in_pho_num +" был удален //////////////////////////");
                        repeat = false;
                    }
                    else{
                        System.out.println("////////////////////////// Неверно набран номер, повторите попытку //////////////////////////\n"
                        + "   1) да\n   2) нет\n   ...");
                        int yes_no = input.nextInt();
                        switch (yes_no){
                            case 1:
                                repeat = true;
                                break;
                            case 2:
                                repeat = false;
                                System.out.println("////////////////////////// Номера оставлены без изменений //////////////////////////");
                                break;
                            default:
                                System.out.println("Операция не распознана. Повторите ввод.");
                        }
                    }
                }
                break;
            case 3:
                System.out.println("////////////////////////// Номера оставлены без изменений //////////////////////////");
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
        return phone_book;
    }

    public static int input_num(){
        int num;
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){
            System.out.print("Введены неверные данные, введите число: - ");
            input.next();
        }
        num = input.nextInt();
        return num;
    }
*/
//---------------------------------------------------------------------------------------------------------
/*  // Пусть дан список сотрудников. 
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности Имени.

    public static void main(String[] args){

        System.out.print("\n////////////////////////////////////////////////////////////////////////\n"
        + "Программа найдет и выведет повторяющиеся имена с количеством повторений.\n"
        + "////////////////////////////////////////////////////////////////////////\n");
        //String txt = "Иван Иванов1 Светлана Петрова2 Иван Иванов3 Анна Мусина4 Иван Иванов5 Иван Юрин6 Иван Иванов7";
        String txt = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков"
        + " Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна"
        + " Владимирова Иван Мечников Петр Петин Иван Ежов";
        String[] words = txt.split(" ");
        ArrayList<String> lst_employees = new ArrayList<>(txt.length());
        for (int i = 0; i < words.length ; i++ ){
            lst_employees.add(words[i] + " " + words[++i]);
        } // Из строки сформировали список сотрудников

/////////////////////// Первый вариант решения, медленный /////////////////////////////

        ArrayList<String> lst_names = new ArrayList<>();
        int count = 0;
        for (String i : lst_employees){
            String[] names = i.split(" ");
            for (String j : lst_employees){
                if(j.contains(names[0])){   
                    count++;
                }
            }
            boolean add = true;
            for (String c : lst_names){
                if(c.contains(names[0])){
                    add = false;
                }
            }
            if(add){
                lst_names.add(count + names[0]);
            }
            count = 0;
        }

////////////// Второй вариант решения должен быть побыстрее и красивее //////////////////

        ArrayList<String> lst_names = new ArrayList<>();
        while(lst_employees.size() > 0){
            String[] names=  lst_employees.get(0).split(" ");
            int count = 0; int j = 0;
            while(j < lst_employees.size()){
                if(lst_employees.get(j).contains(names[0])){ 
                    lst_employees.remove(j);
                    count++;
                }
                else
                    j++;
            }
            lst_names.add(count+" - "+ names[0]);
        }

        for (String i : lst_names) {
            System.out.println(i);
        }
    }
*/
//-------------------------------------------------------------------------------

    // На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
    // И вывести Доску. Пример вывода доски 8x8

    public static void main(String[] args){

        System.out.print("\n////////////////////////////////////////\n"
        + " На шахматной доске расставить 8 ферзей\n"
        + "////////////////////////////////////////\n");
        String chess_board[][];
        chess_board = new String[8][8];
        for (int i = 0; i < chess_board.length ; i++ ){ //записываем массив точек для наглядности
            for (int j = 0; j < chess_board[i].length ; j++ ){
                chess_board[i][j] = " . ";
            }
        }
        
        int count = 0;
        int len = chess_board[0].length;
        for (int f_1 = 0; f_1 < len ; f_1++ ){
            if(!chess_board[0][f_1].contains("X") & variant_check(0, f_1, chess_board)){
                chess_board[0][f_1] = " X ";
                for (int f_2 = 0; f_2 < len ; f_2++ ){
                    if(!chess_board[1][f_2].contains("X") & variant_check(1, f_2, chess_board)){
                        chess_board[1][f_2] = " X ";
                        for (int f_3 = 0; f_3 < len ; f_3++ ){
                            if(!chess_board[2][f_3].contains("X") & variant_check(2, f_3, chess_board)){
                                chess_board[2][f_3] = " X ";
                                for (int f_4 = 0; f_4 < len ; f_4++ ){
                                    if(!chess_board[3][f_4].contains("X") & variant_check(3, f_4, chess_board)){
                                        chess_board[3][f_4] = " X ";
                                        for (int f_5 = 0; f_5 < len ; f_5++ ){
                                            if(!chess_board[4][f_5].contains("X") & variant_check(4, f_5, chess_board)){
                                                chess_board[4][f_5] = " X ";
                                                for (int f_6 = 0; f_6 < len ; f_6++ ){ 
                                                    if(!chess_board[5][f_6].contains("X") & variant_check(5, f_6, chess_board)){
                                                        chess_board[5][f_6] = " X ";
                                                        for (int f_7 = 0; f_7 < len ; f_7++ ){  
                                                            if(!chess_board[6][f_7].contains("X") & variant_check(6, f_7, chess_board)){
                                                                chess_board[6][f_7] = " X "; 
                                                                for (int f_8 = 0; f_8 < len ; f_8++ ){    
                                                                    if(!chess_board[7][f_8].contains("X") & variant_check(7, f_8, chess_board)){
                                                                        chess_board[7][f_8] = " X ";
                                                                        count++;
                                                                        System.out.println("///// ВАРИАНТ № " + count + " /////");
                                                                        array_printing(chess_board);
                                                                        //System.out.println();
                                                                    }
                                                                    chess_board[7][f_8] = " . ";
                                                                }
                                                            }
                                                            chess_board[6][f_7] = " . ";
                                                        }
                                                   } 
                                                   chess_board[5][f_6] = " . ";
                                                }
                                            }
                                            chess_board[4][f_5] = " . ";
                                        }
                                    }
                                    chess_board[3][f_4] = " . ";
                                }
                            }
                            chess_board[2][f_3] = " . ";
                        }
                    }
                    chess_board[1][f_2] = " . ";
                }
            }
            chess_board[0][f_1] = " . ";
        }

    }

    public static boolean variant_check(int i, int j, String arr[][]){
        int ilen = arr.length-1; int jlen = arr[i].length-1;
        int y = i; int x = j;
        Boolean clean = true;
        while( i > 0){//8
            i--;
            if( arr[i][j].contains("X")){
                //System.out.println(i+""+j+" false");
                clean = false;
            }
        }
        i = y;
        while( i > 0 & j < jlen & clean){//9
            i--; j++;
            if( arr[i][j].contains("X")){
                //System.out.println(i+""+j+" false");
                clean = false;
            }
        }
        i = y; j = x;
        while( j < jlen & clean){//6
            j++;
            if( arr[i][j].contains("X")){
                //System.out.println(i+""+j+" false");
                clean = false;
            }
        }
        j = x;
        while( i < ilen & j < jlen & clean){//3
            i++; j++;
            if( arr[i][j].contains("X")){
                //System.out.println(i+""+j+" false");
                clean = false;
            }
        }
        i = y; j = x;
        while( i < ilen & clean){//2
            i++;
            if( arr[i][j].contains("X")){
                //System.out.println(i+""+j+" false");
                clean = false;
            }
        }
        i = y;
        while( i < ilen & j > 0 & clean){//1
            i++; j--;
            if( arr[i][j].contains("X")){
                //System.out.println(i+""+j+" false");
                clean = false;
            }
        }
        i = y; j = x;
        while( j > 0 & clean){//4
            j--;
            if( arr[i][j].contains("X")){
                //System.out.println(i+""+j+" false");
                clean = false;
            }
        }
        j = x;
        while( i > 0 & j > 0 & clean){//7
            i--; j--;
            if( arr[i][j].contains("X")){
                //System.out.println(i+""+j+" false");
                clean = false;
            }
        }
        i = y; j = x;
        return clean;
    }
    
    public static void array_printing(String arr[][]){
        for (int i = 0; i < arr.length ; i++ ){//печатаем
            for (int j = 0; j < arr[i].length ; j++ ){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

}
