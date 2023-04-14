
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Arrays;

public class Homewurk6 {
    // 1Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2Создать множество ноутбуков.
    // 3Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
    public static void main(String[] args){
        System.out.print("\n"
        + "Cтруктура класса Ноутбук для магазина техники.\n");

        NoteBook notebook1 = new NoteBook("Asus ", "8th Gen Core i7", 16, 1024, "SSD", "win7", "black");
        NoteBook notebook2 = new NoteBook("HP   ", "9th Gen Core i5", 24, 512, "SSD", "win8", "grey");
        NoteBook notebook3 = new NoteBook("Dell ", "9th Gen Core i6", 8, 128, "SSD", "win9", "grin");
        NoteBook notebook4 = new NoteBook("AGB  ", "7th Gen Core i5", 16, 1024, "SSD", "win10", "red");
        NoteBook notebook5 = new NoteBook("Acer ", "9th Gen Core i6", 6, 256, "SSD", "win11", "blu");
        NoteBook notebook6 = new NoteBook("Apple", "8th Gen Core i5", 8, 128, "SSD", "Mac OS Mojave", "white");
        NoteBook notebook7 = new NoteBook("Asus ", "7th Gen Core i6", 16, 2048, "SSD", "win7", "black");
        NoteBook notebook8 = new NoteBook("HP   ", "8th Gen Core i5", 24, 512, "SSD", "win8", "grey");
        NoteBook notebook9 = new NoteBook("Dell ", "9th Gen Core i6", 8, 128, "SSD", "win9", "grin");
        NoteBook notebook10 = new NoteBook("AGB  ", "7th Gen Core i5", 16, 2048, "SSD", "win10", "red");
        NoteBook notebook11 = new NoteBook("Acer ", "9th Gen Core i6", 6, 256, "SSD", "win11", "blu");
        NoteBook notebook12 = new NoteBook("Apple", "7th Gen Core i7", 8, 128, "SSD", "Mac OS Mojave", "white");
        NoteBook notebook13 = new NoteBook("Asus ", "6th Gen Core i5", 16, 512, "SSD", "win7", "black");
        NoteBook notebook14 = new NoteBook("HP   ", "7th Gen Core i7", 24, 512, "SSD", "win8", "grey");
        NoteBook notebook15 = new NoteBook("Dell ", "9th Gen Core i6", 8, 128, "SSD", "win9", "grin");
        NoteBook notebook16 = new NoteBook("AGB  ", "7th Gen Core i5", 16, 512, "SSD", "win10", "red");
        NoteBook notebook17 = new NoteBook("Acer ", "9th Gen Core i6", 6, 256, "SSD", "win11", "blu");
        NoteBook notebook18 = new NoteBook("Apple", "6th Gen Core i5", 8, 128, "SSD", "Mac OS Mojave", "white");
/*
        NoteBook notebook1 = new NoteBook("0 ", "Gen Core i0 ", 16, 1024, "SSD", "0 ", "q");
        NoteBook notebook2 = new NoteBook("1 ", "Gen Core i1 ", 24, 512, " SSD", "1 ", "w");
        NoteBook notebook3 = new NoteBook("2 ", "Gen Core i2 ", 8, 128, "  SSD", "2 ", "e");
        NoteBook notebook4 = new NoteBook("3 ", "Gen Core i3 ", 16, 1024, "SSD", "3 ", "r");
        NoteBook notebook5 = new NoteBook("4 ", "Gen Core i4 ", 6, 256, "  SSD", "4 ", "t");
        NoteBook notebook6 = new NoteBook("5 ", "Gen Core i5 ", 8, 128, "  SSD", "5 ", "y");
        NoteBook notebook7 = new NoteBook("6 ", "Gen Core i6 ", 16, 2048, "SSD", "6 ", "u");
        NoteBook notebook8 = new NoteBook("7 ", "Gen Core i7 ", 24, 512, " SSD", "7 ", "i");
        NoteBook notebook9 = new NoteBook("8 ", "Gen Core i8 ", 8, 128, "  SSD", "8 ", "o");
        NoteBook notebook10 = new NoteBook("9 ", "Gen Core i9 ", 16, 2048, "SSD", "9 ", "p");
        NoteBook notebook11 = new NoteBook("10", "Gen Core i10", 6, 256, "  SSD", "10", "a");
        NoteBook notebook12 = new NoteBook("11", "Gen Core i11", 8, 128, "  SSD", "11", "s");
        NoteBook notebook13 = new NoteBook("12", "Gen Core i12", 16, 512, " SSD", "12", "d");
        NoteBook notebook14 = new NoteBook("13", "Gen Core i13", 24, 512, " SSD", "13", "f");
        NoteBook notebook15 = new NoteBook("14", "Gen Core i14", 8, 128, "  SSD", "14", "g");
        NoteBook notebook16 = new NoteBook("15", "Gen Core i15", 16, 512, " SSD", "15", "h");
        NoteBook notebook17 = new NoteBook("16", "Gen Core i16", 6, 256, "  SSD", "16", "j");
        NoteBook notebook18 = new NoteBook("17", "Gen Core i17", 8, 128, "  SSD", "17", "k");
*/
        HashSet<NoteBook> notebook_set = new HashSet<NoteBook>();
        notebook_set.add(notebook1);
        notebook_set.add(notebook2);
        notebook_set.add(notebook3);
        notebook_set.add(notebook4);
        notebook_set.add(notebook5);
        notebook_set.add(notebook6);
        notebook_set.add(notebook7);
        notebook_set.add(notebook8);
        notebook_set.add(notebook9);
        notebook_set.add(notebook10);
        notebook_set.add(notebook11);
        notebook_set.add(notebook12);
        notebook_set.add(notebook13);
        notebook_set.add(notebook14);
        notebook_set.add(notebook15);
        notebook_set.add(notebook16);
        notebook_set.add(notebook17);
        notebook_set.add(notebook18);

        NoteBook[] notebook_arr = notebook_set.toArray(new NoteBook[notebook_set.size()]);
        LinkedHashSet<NoteBook> notebook_filtered_set = new LinkedHashSet<NoteBook>();
        System.out.print("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ПРИВЕТСТВУЮ  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n"
        + "Я помогу вам выбрать ноутбук, все что вам нужно, это выбрать критерии фильтрации:");
        boolean end = true;
        while(end){
            System.out.print("\n   1) Бренд\n   2) Процессор\n   3) Объем встроенной памяти\n"
            + "   4) Объем оперативной памяти\n   5) Операционная система\n   6) Цвет\n"
            + "   7) Ничего\n   ...");
            int num = input_num();
            switch (num){
                case 1:// Выбор по бренду
                    select_by_option(notebook_arr, notebook_filtered_set, "brand");
                    break;
                case 2:// Выбор по процессору
                    select_by_option(notebook_arr, notebook_filtered_set, "processor");
                    break;
                case 3:
                    select_by_memory(notebook_arr, notebook_filtered_set, "hd_space");
                    break;
                case 4:
                    select_by_memory(notebook_arr, notebook_filtered_set, "ram_size");
                    break;
                case 5:
                    select_by_option(notebook_arr, notebook_filtered_set, "op_system");
                    break;
                case 6:
                    select_by_option(notebook_arr, notebook_filtered_set, "color");
                    break;
                case 7:
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Процес подора завершон, ДОСВИДАНИЯ!!!...\n");
                    end = false;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
    }

    public static int input_num(){
        int num;
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){
            System.out.print("Введены неверные данные, введите число: - ");
            input.nextInt();
        }
        num = input.nextInt();
        return num;
    }

    public static int input_num_max(int max){
        int num = input_num();
            while (num > max){
                System.out.print("Введены неверные данные, число не должно превышать (" + max + "): - ");
                num = input_num();
            }
        return num;
    }

    public static boolean match_checky(HashSet<NoteBook> set, String txt_1, String txt_2){//проверяет есть ли в наборе схожие варианты строчные
        boolean yes = true;
        switch (txt_1){
            case "brand":
                for (NoteBook j : set){
                    if (j.brand.contains(txt_2)){
                        yes = false;
                    }
                }
                break;
            case "processor":
                for (NoteBook j : set){
                    if (j.processor.contains(txt_2)){
                        yes = false;
                    }
                }
                break;
            case "op_system":
                for (NoteBook j : set){
                    if (j.op_system.contains(txt_2)){
                        yes = false;
                    }
                }
                break;
            case "color":
                for (NoteBook j : set){
                    if (j.color.contains(txt_2)){
                        yes = false;
                    }
                }
                break;
        }
        return yes;
    }
   
    public static void List_of_selected_options(HashSet<NoteBook> set){
        System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
        + "Список выбранных вами вариантов...\n");
        for (NoteBook i : set){
            System.out.println("   " + i.brand + " - " + i.processor + " - " + i.hd_space + "ТБ " + i.hd_type + " - " + i.ram_size + "Гб - " + i.color);
        }
    }
    
    public static HashSet<NoteBook> adding_remove_hdd_from_selection(NoteBook[] arr, HashSet<NoteBook> set){//добавление удаление о объему встроенной памяти
        boolean end_add_del_hdd = true;
        while(end_add_del_hdd){
            System.out.print("////////////////////////////////////////////////////////////////////////////////\n"
            + "Выберите вариант сортирровки по объему встроенной памяти:\n   1) Посмотреть список выбранных вариантов\n   "
            + "2) Добавит вариант по объему встроенной памяти\n   3) Удалить вариант по объему встроенной памяти\n   "
            + "4) Оставить варианты с объемом памяти ОТ-ДО\n   5) Ничего\n   ...");
            int num_add_del = input_num();
            switch (num_add_del){
                case 1:
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Список выбранных вами вариантов...\n");
                    for (NoteBook i : set){
                        System.out.println("   " + i.brand + " - " + i.hd_space + "ТБ " + i.hd_type);
                    }
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.print("////////////////////////////////////////////////////////////////////////////////\n"
                    + "Выберите минимальный максимальный объем встроенной памяти, для добавления:\n   минимальный(1Тб)...");
                    int min_gb = input_num();
                    System.out.print("   максимальный(100Тб)...");
                    int max_gb = input_num();
                    int count = 0;
                    for (int i = 0; i < arr.length; i++){
                            if ( min_gb <= arr[i].hd_space){
                                if (max_gb >= arr[i].hd_space){
                                    set.add(arr[i]);
                                    count++;
                                    }
                                }
                            }
                    System.out.println("////////////////////////////////////////////////////////////////////////////////\n"
                    + "В список выбранных вами ноутбуков добавлен "+ count + " варианта...");
                    break;
                case 3:
                    System.out.print("////////////////////////////////////////////////////////////////////////////////\n"
                    + "Выберите минимальный максимальный объем встроенной памяти, для удаления:\n   минимальный(1Тб)...");
                    min_gb = input_num();
                    System.out.print("   максимальный(100Тб)...");
                    max_gb = input_num();
                    count = 0;
                    Iterator<NoteBook> del_set = set.iterator();
                    while(del_set.hasNext()) {
                        int num = del_set.next().hd_space;
                        if (min_gb <= num){
                            if (max_gb >= num){
                                del_set.remove();
                                count++;
                            }
                        }
                    }
                    System.out.println("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Из списка удалено "+ count + " варианта...");
                    break;
                case 4:
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Выберите минимальный максимальный объем встроенной памяти, которые хотите оставить:\n   минимальный(1Тб)...");
                    min_gb = input_num();
                    System.out.print("   максимальный(100Тб)...");
                    max_gb = input_num();
                    count = 0;
                    Iterator<NoteBook> chek_set = set.iterator();
                    while(chek_set.hasNext()) {
                        int num = chek_set.next().hd_space;
                        if (min_gb > num){
                            chek_set.remove();
                            count++;
                        }
                        if (max_gb < num){
                            chek_set.remove();
                            count++;
                        }
                    }
                    System.out.println("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Из списка удалено "+ count + " варианта...");
                    break;
                case 5:
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Процес сравнения завершон.\n");
                    end_add_del_hdd = false;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }   
        return set;                           
    }

    public static HashSet<NoteBook> adding_remove_ram_from_selection(NoteBook[] arr, HashSet<NoteBook> set){//добавление удаление по обему оперативно памяти
        boolean end_add_del_ram = true;
        while(end_add_del_ram){
            System.out.print("////////////////////////////////////////////////////////////////////////////////\n"
            + "Выберите вариант сортирровки по объему оперативной памяти:\n   1) Посмотреть список выбранных вариантов\n   "
            + "2) Добавит вариант по объему оперативной памяти\n   3) Удалить вариант по объему оперативной памяти\n   "
            + "4) Оставить варианты с объемом памяти ОТ-ДО\n   5) Ничего\n   ...");
            int num_add_del = input_num();
            switch (num_add_del){
                case 1:
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Список выбранных вами вариантов...\n");
                    for (NoteBook i : set){
                        System.out.println("   " + i.brand + " - " + i.ram_size + "Гб");
                    }
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.print("////////////////////////////////////////////////////////////////////////////////\n"
                    + "Выберите минимальный максимальный объем оперативной памяти, для добавления:\n   минимальный(100Гб)...");
                    int min_gb = input_num();
                    System.out.print("   максимальный(10000Гб)...");
                    int max_gb = input_num();
                    int count = 0;
                    for (int i = 0; i < arr.length; i++){
                            if ( min_gb <= arr[i].ram_size){
                                if (max_gb >= arr[i].ram_size){
                                    set.add(arr[i]);
                                    count++;
                                    }
                                }
                            }
                    System.out.println("////////////////////////////////////////////////////////////////////////////////\n"
                    + "В список выбранных вами ноутбуков добавлено "+ count + " варианта...");
                    break;
                case 3:
                    System.out.print("////////////////////////////////////////////////////////////////////////////////\n"
                    + "Выберите минимальный максимальный объем оперативной памяти, для удаления:\n   минимальный(100Гб)...");
                    min_gb = input_num();
                    System.out.print("   максимальный(10000Гб)...");
                    max_gb = input_num();
                    count = 0;
                    Iterator<NoteBook> del_set = set.iterator();
                    while(del_set.hasNext()) {
                        int num = del_set.next().ram_size;
                        if (min_gb <= num){
                            if (max_gb >= num){
                                del_set.remove();
                                count++;
                            }
                        }
                    }
                    System.out.println("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Из списка удалено "+ count + " варианта...");
                    break;
                case 4:
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Выберите минимальный максимальный объем оперативной памяти, которые хотите оставить:\n   минимальный(100Гб)...");
                    min_gb = input_num();
                    System.out.print("   максимальный(10000Гб)...");
                    max_gb = input_num();
                    count = 0;
                    Iterator<NoteBook> chek_set = set.iterator();
                    while(chek_set.hasNext()) {
                        int num = chek_set.next().ram_size;
                        if (min_gb > num){
                            chek_set.remove();
                            count++;
                        }
                        if (max_gb < num){
                            chek_set.remove();
                            count++;
                        }
                    }
                    System.out.println("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Из списка удалено "+ count + " варианта...");
                    break;
                case 5:
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Процес сравнения завершон.\n");
                    end_add_del_ram = false;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }   
        return set;         
    }
   
    public static LinkedHashSet<String> arr_selection_of_options(NoteBook[] arr, String txt, HashSet<NoteBook> set){
        LinkedHashSet<String> new_set = new LinkedHashSet<String>();
        int count = 0;
        switch (txt){
            case "brand":
                for (NoteBook i : arr){
                    if (match_checky(set, "brand", i.brand)){
                        if (new_set.add(i.brand)){
                            System.out.println("   " + (++count) + ") " + i.brand);
                        }
                    }
                }
                break;
            case "processor":
                for (NoteBook i : arr){
                    if (match_checky(set, "processor", i.processor)){
                        if (new_set.add(i.processor)){
                            System.out.println("   " + (++count) + ") " + i.processor);
                        }
                    }
                }
                break;
            case "op_system":
                for (NoteBook i : arr){
                    if (match_checky(set, "op_system", i.op_system)){
                        if (new_set.add(i.op_system)){
                            System.out.println("   " + (++count) + ") " + i.op_system);
                        }
                    }
                }
                break;
            case "color":
                for (NoteBook i : arr){
                    if (match_checky(set, "color", i.color)){
                        if (new_set.add(i.color)){
                            System.out.println("   " + (++count) + ") " + i.color);
                        }
                    }
                }
                break;
         }
        System.out.print("   " + (new_set.size()+1) + ") Ничего");
        System.out.print("\n   ...");
        return new_set;
    }

    public static HashSet<NoteBook> set_adding_options(NoteBook[] arr, String txt, HashSet<NoteBook> set, int num_add,  LinkedHashSet<String> add_set){
        int count = 0;
        String add_word = "";
        for (String i : add_set){
            if (++count == num_add){
                add_word = i;
            }
        }
        count = 0;
        switch (txt){
            case "brand":
                for (NoteBook i : arr){
                    if (i.brand.equals(add_word)){
                        set.add(i); count++;
                    }
                }
                break;
            case "processor":
                for (NoteBook i : arr){
                    if (i.processor.equals(add_word)){
                        set.add(i); count++;
                    }
                }
                break;
            case "op_system":
                for (NoteBook i : arr){
                    if (i.op_system.equals(add_word)){
                        set.add(i); count++;
                    }
                }
                break;
            case "color":
                for (NoteBook i : arr){
                    if (i.color.equals(add_word)){
                        set.add(i); count++;
                    }
                }
                break;
         }
        System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
        + "В список выбранных вами ноутбуков добавлены " + count + " варианта...");
        return set;
    }

    public static LinkedHashSet<String> set_selection_of_options(String txt, HashSet<NoteBook> set){
        int count = 0;
        LinkedHashSet<String> new_set = new LinkedHashSet<String>();
        switch (txt){
            case "brand":
                for (NoteBook i : set){
                    if (new_set.add(i.brand)){
                        System.out.println("   " + (++count) + ") " + i.brand);
                    }
                }
                break;
            case "processor":
                for (NoteBook i : set){
                    if (new_set.add(i.processor)){
                        System.out.println("   " + (++count) + ") " + i.processor);
                    }
                }
                break;
            case "op_system":
                for (NoteBook i : set){
                    if (new_set.add(i.op_system)){
                        System.out.println("   " + (++count) + ") " + i.op_system);
                    }
                }
                break;
            case "color":
                for (NoteBook i : set){
                    if (new_set.add(i.color)){
                        System.out.println("   " + (++count) + ") " + i.color);
                    }
                }
                break;
        }
        System.out.print("   " + (set.size()+1) + ") Ничего");
        System.out.print("\n   ...");
        return new_set;
    }

    public static HashSet<NoteBook> set_removal_options(String txt, HashSet<NoteBook> set, int num_del,  LinkedHashSet<String> del_set){
        int count = 0;
        String del_word = "";
        for (String i : del_set){
            if (++count == num_del){
                del_word = i;
            }
        }
        count = 0;
        Iterator<NoteBook> i = set.iterator();
        switch (txt){
            case "brand":
                while(i.hasNext()) {
                    if(i.next().brand.equals(del_word)){
                        i.remove(); count++;
                    }
                }
                break;
            case "processor":
                while(i.hasNext()) {
                    if(i.next().processor.equals(del_word)){
                        i.remove(); count++;
                    }
                }
                break;
            case "op_system":
                while(i.hasNext()) {
                    if(i.next().op_system.equals(del_word)){
                        i.remove(); count++;
                    }
                }
                break;
            case "color":
                while(i.hasNext()) {
                    if(i.next().color.equals(del_word)){
                        i.remove(); count++;
                    }
                }
                break;
        }
        System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
        + "Из списока удалено " + count + " варианта...");
        return set;
    }

    public static HashSet<NoteBook> set_adding_removing_options(NoteBook[] arr, HashSet<NoteBook> set, String txt_parameter){//Добавление и удаление вариантов
        boolean end_add_del = true;
        while(end_add_del){
            switch (txt_parameter){
                case "brand":
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Выберите вариант сортирровки:\n   1) Добавит вариант с брендом\n   "
                    + "2) Удалить вариант с брендом\n   3) Ничего\n   ...");
                    break;
                case "processor":
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Выберите вариант сортирровки:\n   1) Добавит вариант с процессором\n   "
                    + "2) Удалить вариант с процессором\n   3) Ничего\n   ...");
                    break;
                case "op_system":
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Выберите вариант сортирровки:\n   1) Добавит вариант с операционной системой\n   "
                    + "2) Удалить вариант с операционной системой\n   3) Ничего\n   ...");
                    break;
                case "color":
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Выберите вариант сортирровки:\n   1) Добавит вариант с цветом\n   "
                    + "2) Удалить вариант с цветом\n   3) Ничего\n   ...");
                    break;
            }
            int num_add_del = input_num();
            switch (num_add_del){
                case 1:
                    boolean add_yes = true;
                    while (add_yes){              
                        System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                        + "Какой из вариантов вы хотите добавить:\n");
                        LinkedHashSet<String> add_set = new LinkedHashSet<String>();
                        add_set = arr_selection_of_options(arr, txt_parameter, set);
                        int num_add = input_num_max(add_set.size() + 1);
                        if (num_add == add_set.size() + 1){
                            add_yes = false;
                        }
                        if (num_add <= add_set.size()){
                            set = set_adding_options(arr, txt_parameter,  set, num_add, add_set);
                        }
                    }
                    break;
                case 2:    
                    boolean del_yes = true;
                    while(del_yes){    
                        System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                        + "Выберите процессоры которые хотите удалить:\n");
                        LinkedHashSet<String> del_set = new LinkedHashSet<String>();
                        del_set = set_selection_of_options(txt_parameter, set);

                        int num_del = input_num_max(del_set.size() + 1);
                        if (num_del == del_set.size() + 1){
                            del_yes = false;
                        }
                        if (num_del <= del_set.size()){
                            set = set_removal_options(txt_parameter, set, num_del, del_set);
                        }
                    }
                    break;
                case 3:
                    end_add_del = false;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
        return set;
    }

    public static HashSet<NoteBook> additional_sorting_selected_options(NoteBook[] arr, HashSet<NoteBook> set){//Дополнительная сортировка выбранных вариантов
        boolean add_sorting = true;
        while(add_sorting){
            System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
            + "Выберите вариант дополнительной сортирровки:\n   1) Список выбранных вами вариантов...\n   2) Бренд\n   3) Объем встроенной памяти\n"
            + "   4) Объем оперативной памяти\n   5) Процессор\n   6) Операционная система\n   7) Цвет\n   8) Ничего\n   ...");
            int num_isort_set = input_num();
            switch (num_isort_set){
                case 1:
                    List_of_selected_options(set);
                    break;
                case 2: 
                    set = set_adding_removing_options(arr, set, "brand");
                    break;
                case 3:
                    set = adding_remove_hdd_from_selection(arr, set);
                    break;
                case 4:
                    set = adding_remove_ram_from_selection(arr, set);
                    break;
                case 5:
                    set = set_adding_removing_options(arr, set, "processor");
                    break;
                case 6:
                    set = set_adding_removing_options(arr, set, "op_system");
                    break;
                case 7:
                    set = set_adding_removing_options(arr, set, "color");
                    break;
                case 8:
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Процес дополнительной сортировки завершон...\n");
                    add_sorting = false;
                    break; 
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
        return set;
    }

    public static void select_by_option(NoteBook[] notebook_arr, HashSet<NoteBook> notebook_filtered_set, String txt_parameter){//Предварительный выбор строковых вариантов
        boolean add_yes = true;
        while (add_yes){              
            System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
            + "Какой из вариантов вы хотите добавить:\n");
            LinkedHashSet<String> add_set = new LinkedHashSet<String>();
            add_set = arr_selection_of_options(notebook_arr, txt_parameter, notebook_filtered_set);
            int num_add = input_num_max(add_set.size() + 1);
            if (num_add == add_set.size() + 1){
                add_yes = false;
            }
            if (num_add <= add_set.size()){
                notebook_filtered_set = set_adding_options(notebook_arr, txt_parameter,  notebook_filtered_set, num_add, add_set);
            }
        }
        boolean end_filter_set = true;
        while(end_filter_set){
            System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
            + "   1) Посмотреть список выбранных вариантов\n   2) Дополнительная сортировка\n   3) Очистить\n   4) Завершить\n   ...");
            int num_iset = input_num();
            switch (num_iset){ //Работа со списком вариантов процессора 
                case 1:
                    List_of_selected_options(notebook_filtered_set);
                    break;
                case 2:
                    notebook_filtered_set = additional_sorting_selected_options(notebook_arr, notebook_filtered_set);
                case 3:
                    notebook_filtered_set.clear();
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Cписок выбранных вариантов очищен...\n");
                    break;
                case 4:
                    notebook_filtered_set.clear();
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Процес подбора вариантов завершон, список выбранных вариантов очищен...\n");
                    end_filter_set = false;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
    }

    public static void select_by_memory(NoteBook[] notebook_arr, HashSet<NoteBook> notebook_filtered_set, String txt_parameter){//Предварительный выбор числовых вариантов
        
        int count = 0;
         
        int min_gb;
        int max_gb;
        switch (txt_parameter){
            case "hd_space":
                System.out.print("////////////////////////////////////////////////////////////////////////////////\n"
                + "Выберите минимальный максимальный объем встроенной памяти, для добавления:\n   минимальный(1Тб)...");
                min_gb = input_num();
                System.out.print("   максимальный(1000Тб)...");
                max_gb = input_num();
                for (int i = 0; i < notebook_arr.length; i++){
                        if ( min_gb <= notebook_arr[i].hd_space){
                            if (max_gb >= notebook_arr[i].hd_space){
                                notebook_filtered_set.add(notebook_arr[i]);
                                count++; 
                            }
                        }
                }
                break;
            case "ram_size":
                System.out.print("////////////////////////////////////////////////////////////////////////////////\n"
                + "Выберите минимальный максимальный объем оперативной памяти, для добавления:\n   минимальный(100Гб)...");
                min_gb = input_num();
                System.out.print("   максимальный(10000Гб)...");
                max_gb = input_num();
                for (int i = 0; i < notebook_arr.length; i++){
                        if ( min_gb <= notebook_arr[i].ram_size){
                            if (max_gb >= notebook_arr[i].ram_size){
                                 notebook_filtered_set.add(notebook_arr[i]);
                                count++; 
                            }
                        }
                }
                break;
        }
        
        System.out.println("////////////////////////////////////////////////////////////////////////////////\n"
        + "В список выбранных вами ноутбуков добавлен "+ count + " варианта...");
        boolean end_filter_set = true;
        while(end_filter_set){
            System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
            + "   1) Посмотреть список выбранных вариантов\n   2) Дополнительная сортировка\n   3) Очистить\n   4) Завершить\n   ...");
            int num_iset = input_num();
            switch (num_iset){ //Работа со списком вариантов процессора 
                case 1:
                    List_of_selected_options(notebook_filtered_set);
                    break;
                case 2:
                    notebook_filtered_set = additional_sorting_selected_options(notebook_arr, notebook_filtered_set);
                case 3:
                    notebook_filtered_set.clear();
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Cписок выбранных вариантов очищен...\n");
                    break;
                case 4:
                    notebook_filtered_set.clear();
                    System.out.print("\n////////////////////////////////////////////////////////////////////////////////\n"
                    + "Процес подбора вариантов завершон, список выбранных вариантов очищен...\n");
                    end_filter_set = false;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
    }
}

