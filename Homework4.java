import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

public class Homework4 {
/*  //Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

    public static void main(String[] args){
        System.out.println("Реализуйте метод(не void), который вернет “перевернутый” список.");
        Scanner input = new Scanner(System.in);
        System.out.print("Введте размер массива: - ");
        int len = input.nextInt();
        List<Integer> list = new ArrayList<>(); //создаем список
        for (int i = 0; i < len; i++){
            list.add(i);
        }
        System.out.print(list + "\n");
        
        List<Integer> reverse = reverseList(list);//реверс
        System.out.print(reverse + "\n");
    }
    public static<T> List<T> reverseList(List<T> list)//метод реверс
    {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
*/
//----------------------------------------------------------------------------------------------
/*  //Реализуйте очередь с помощью LinkedList со следующими методами:
    //enqueue() - помещает элемент в конец очереди,
    //dequeue() - возвращает первый элемент из очереди и удаляет его,
    //first() - возвращает первый элемент из очереди, не удаляя.
    
    public static void main(String[] args){
        System.out.println("Реализуем очередь, с помощью интерфейса Queue.");
        Scanner input = new Scanner(System.in);
        Queue<String> queue = new LinkedList<String>(); //создаем список на осове класса очередь

        boolean end = true;
        while(end){
            System.out.print("////////////////////////////////////////////////\n");
            String inem;
            String num_txt;
            if (queue.size() == 0){
                System.out.print("На данный момент список очереди пуст, вы можете:\n   1 - поместить элемент в очередь\n"
                + "   5 - выйти из программы\n   введите номер операции - ");
                num_txt = input.nextLine();
                switch (num_txt.charAt(0)){
                    case '1':
                        System.out.print("////////////////////////////////////////////////\nВведите содержание элемента - ");
                        String text = input.nextLine();
                        queue.add(text);
                        break;
                    case '5':
                        end = false;
                        break;
                    default:
                        System.out.print("////////////////////////////////////////////////\nОперация не распознана. Повторите ввод.\n");
                }
            }
            else{
                System.out.print("Выберите действие:\n   1 - поместить элемент в очередь\n   2 - уДалить первый элемент очереди\n"
                + "   3 - уВидеть первый элемент очереди\n   4 - уВидеть список(очередь)\n   5 - выйти из программы\n   введите номер операции - ");
                num_txt = input.nextLine();
                switch (num_txt.charAt(0)){
                    case '1':
                        System.out.print("////////////////////////////////////////////////\nВведите содержание элемента - ");
                        String text = input.nextLine();
                        queue.add(text);
                        break;
                    case '2':
                        inem = queue.remove();
                        System.out.println("////////////////////////////////////////////////\n" + inem + " - элемент удален.");
                        break;
                    case '3':
                        inem = queue.element();
                        System.out.println("////////////////////////////////////////////////\n" + inem + " - первый элемент очереди.");
                        break;
                    case '4':
                        System.out.println("////////////////////////////////////////////////\nЭлементы очереди - " + queue);
                        break;
                    case '5':
                        end = false;
                        break;
                    default:
                        System.out.println("////////////////////////////////////////////////\nОперация не распознана. Повторите ввод.\n");
                }

            }
            
        }

    }
*/
//---------------------------------------------------------------------------------------------------
    //В калькулятор добавьте возможность отменить последнюю операцию.

    public static void main(String[] args){

        System.out.println("Реализуем калькулятор с возможность отмены последней операцию, Stack.");
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>(); //создаем список
        System.out.print("//////////////////////////////////////////////////\n"
                         + "Калькулятор запущен, введите первое число: ");
        int f_num = input_num();
        System.out.print("Введите вид операции (+ - / *): ");
        char mat_op = input_mat_op();
        int result = second_part_calculator(f_num, mat_op);
        System.out.print("///////////////// Получилось = " + result + " /////////////////\n");
        stack.push(result);

        boolean end = true;
        while(end){
            System.out.print("Следующее действие:\n   продолжить вычисления (+ - / *)\n   удалить последнюю операцию(<)\n"
            + "   удалить все вычисление(#)\n   выход (=)\n   ");
            mat_op = input_mat_op();
            switch (mat_op){
                case '+':
                case '-':
                case '/':
                case '*':
                    result = second_part_calculator(stack.peek(), mat_op);
                    System.out.println("///////////////// Получилось = " + result + " /////////////////");
                    stack.push(result);
                    break;
                case '<':
                    if (stack.empty()){
                        System.out.print("Введите первое число: - ");
                        f_num = input_num();
                        System.out.print("Введите вид операции (+ - / *): - ");
                        mat_op = input_mat_op();
                        result = second_part_calculator(f_num, mat_op);
                        System.out.println("///////////////// Получилось = " + result + " /////////////////");
                        stack.push(result);
                    }
                    else{
                        stack.pop();
                        System.out.println("////////////// Предыдущее значение = " + stack.peek() + " //////////////");
                    }
                    break;
                case '#':
                    while (!stack.empty()){
                        stack.pop();
                    }
                    System.out.print("Введите первое число: - ");
                    f_num = input_num();
                    System.out.print("Введите вид операции (+ - / *): - ");
                    mat_op = input_mat_op();
                    result = second_part_calculator(f_num, mat_op);
                    System.out.println("///////////////// Получилось = " + result + " /////////////////");
                    stack.push(result);
                    break;

                case '=':
                    end = false;
                    break;
                default:
                    System.out.println("////////////////////////////////////////////////\n"
                                       + "Операция не распознана. Повторите ввод.\n");
            }

        }
        input.close();

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
    public static char input_mat_op(){
        char chr_txt;
        Scanner input = new Scanner(System.in);
        chr_txt = input.next().charAt(0);
        while (chr_txt != '*' & chr_txt != '/' & chr_txt != '+' & chr_txt != '-' & chr_txt != '<' & chr_txt != '#' & chr_txt != '='){
            System.out.print("Введены неверные данные, введите вид математической операции: ");
            chr_txt = input.next().charAt(0);
        }
        return chr_txt;
    }

    public static int second_part_calculator(int f_num, char mat_op){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите второе число: - ");
        int s_num = input_num();
        int res = 0;
        switch (mat_op){
            case '*':
                res = f_num * s_num;
                break;
            case '/':
                res = f_num / s_num;
                break;
            case '+':
                res = f_num + s_num;
                break;
            case '-':
                res = f_num - s_num;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
        return res;
    }
}
