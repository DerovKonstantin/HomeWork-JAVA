import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.stream.IntStream;

public class Homework3 {

/*  //(Дополнительная задача) Реализовать алгоритм сортировки слиянием
    public static void main(String[] args){
        System.out.println("Реализовать алгоритм сортировки слиянием.");
        Scanner input = new Scanner(System.in);
        System.out.print("Введте размер массива: - ");
        int len = input.nextInt();
        Random rnd_num = new Random();
        ArrayList<Integer> list = new ArrayList<>(); //создаем список из N рондомных элементов
        while(list.size() < len){
            list.add(rnd_num.nextInt(10));
        }
        System.out.print(list+ "\n");

        int[] arr = list.stream().mapToInt(i -> i).toArray(); //переводим список в массив
        int[] arr_new = mergeSort(arr); //сортируем список с помощю метода
        System.out.println(Arrays.toString(arr_new));
    
    }
    public static int[] mergeSort(int[] arr) { //Метод сортировки слиянием через рекурсию
        if (arr.length <= 1) return arr;
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);//деление на левую и правую часть массива
        int[] right = Arrays.copyOfRange(arr, left.length, arr.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {//слияние левых и правых частей (массивов)
        int res_i = 0, lef_i = 0, rig_i = 0;
        int[] result = new int[left.length + right.length];

        while (lef_i < left.length && rig_i < right.length)
            if (left[lef_i] < right[rig_i])
                result[res_i++] = left[lef_i++];
            else result[res_i++] = right[rig_i++];

        while (res_i < result.length)
            if (lef_i != left.length)
                result[res_i++] = left[lef_i++];
            else result[res_i++] = right[rig_i++];

        return result;
    }
*/

//------------------------------------------------------------------------------------------------------------

/*  //2 Пусть дан произвольный список целых чисел, удалить из него чётные числа
    public static void main(String[] args){
        System.out.println("Дан произвольный список целых чисел, удалить из него чётные числа.");
        System.out.print("Введте размер списка: - ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        List<Integer> lst = new ArrayList<>(); //создаем список из N рондомных элементов
        Random rnd_num = new Random();
        while(lst.size() < len){
            lst.add(rnd_num.nextInt(10));
        }
        System.out.print(lst+ "\n");
        ///////////////////////////////////////// с помощю потока, фильтра и форич
        List<Integer> lst2 = new ArrayList<>(); 
        lst.stream()
            .filter(i -> i % 2 == 0)
            .forEach(s->lst2.add(s));
            System.out.print(lst2+ "\n");
        ///////////////////////////////////////// с помощю потока, фильтра и коллекции
        List<Integer> evenNumbers = lst.stream() 
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
            System.out.println(evenNumbers);
        ///////////////////////////////////////// с помощю цикла for
        //for (int i = lst.size()-1; i > 0; i--){ 
        //    if(lst.get(i) % 2 != 0){
        //        lst.remove(i);
        //    }
        //}
        //System.out.print(lst+ "\n");
        ///////////////////////////////////////// с помощю итератора
        //Iterator chek_lst = lst.iterator();
        //while(chek_lst.hasNext()) {
        //    if((int)chek_lst.next() % 2 != 0){
        //    chek_lst.remove();
        //    }
        //}
        //System.out.print(lst+ "\n");
        ///////////////////////////////////////// с помощю улучшеного цикла форич
        List<Integer> del_lst = new ArrayList<>();//список элементов для последующего удаления
        lst.forEach(num -> { if (num % 2 != 0) { del_lst.add(num); }});//новый способ записи, добавляем элементы под удаление
        //for (int num : lst) {//устаревший способ ввода
        //    if(num % 2 != 0){
        //        del_lst.add(num);//добавляем элементы под удаление
        //    }
        //}
        lst.removeAll(del_lst);//удаляем из списка все лишнее
        System.out.print(lst + "\n");
    }
*/
//------------------------------------------------------------------------------------------------------------
 
    //3 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
    public static void main(String[] args){
        System.out.println("Найти минимальное, максимальное и среднее ариф.");
        int[] arr = IntStream.range(0, 10).toArray();//создал массив инт, хотел перевести его в список Integer
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());// перевл массив в список
        Collections.shuffle(list);//перемешиваем элементы списка
        System.out.println(list);

        int min_num = Collections.min(list);
        int max_num = Collections.max(list);
        ////////////////////////////////////////////////////////////// с помощю forEach, список
        //double result = 0;
        //for (int num : list) {
        //   result += num;
        //}
        //result = result/list.size();
        //System.out.print(result + "\n");
        ////////////////////////////////////////////////////////////// с помощю лямбда-выражения, список
        double result = list.stream().mapToInt(value->value).sum();
        result = result/list.size();
        System.out.print(result + "\n");
        ////////////////////////////////////////////////////////////// с массивом, класс Arrays
        result = (double)Arrays.stream(arr).sum()/arr.length;
        System.out.print(result + "\n");
    }
}
