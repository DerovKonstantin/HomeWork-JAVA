
import java.util.Scanner;


public class Homework1 {
    public static void main(String[] args){
        /*
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
        System.out.println("Вычислить сумма чисел от 1 до n, а так же произведение чисел от 1 до n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int sum = 0;
        int pro = 1;
        for (int i = 1; i <= num; i++){
            sum += i;
        }
        for (int j = 1; j <= num; j++){
            pro *= j;
        }
        System.out.printf("Сумма чисел - %d, произведение чисел - %d \n", sum, pro);
        in.close();
        
        //----------------------------------------------------------------
        
        // Вывести все простые числа от 1 до 1000
        System.out.println("Вывести все простые числа от 1 до 1000");
        for(int i = 2; i <= 1000; ++i){
            int count = 0;
            for(int j = 2; j <= i && count < 2 ;++j){
                if(i % j == 0){
                    ++count;
                }
            }
            if(count < 2){
                if(i == 2)
                    System.out.print(i);
                else
                    System.out.print(", " + i);
            }
        }
        System.out.println(".");
        
        //--------------------------------------------------

        // Реализовать простой калькулятор (+ - / *)
        System.out.println("Реализуем простой калькулятор (+ - / *)");
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

        char mat_operation;
        System.out.print("Введите вид математической операции (+ - / *): - ");
        mat_operation = input.next().charAt(0);
        while (mat_operation != '*' & mat_operation != '/' & mat_operation != '+' & mat_operation != '-'){
            System.out.print("Введены неверные данные, введите вид математической операции: ");
            mat_operation = input.next().charAt(0);
        }

        int result = 0;
        switch (mat_operation){
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
        */
        //--------------------------------------------------

        // *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
        // Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
        // Требуется восстановить выражение до верного равенства.
        // Предложить хотя бы одно решение или сообщить, что его нет.
        // Ввод: 2? + ?5 = 69
        // Вывод: 24 + 45 = 69

        System.out.println("Задано уравнение вида q + w = e, требуется восстановить выражение до верного равенства.");
        Scanner input = new Scanner(System.in);

        String mat_text;
        System.out.print("Введите уравнение (2?2? + ?5?? = 4048): - ");
        mat_text = input.nextLine();
        mat_text = mat_text.replaceAll(" ", "");
        
        int numbers_and_indices[][];
        int first_nums[];
        first_nums = new int[1];
        int second_number[];
        second_number = new int[1];
        int result_number = 0;

        for (int i = 0; i < mat_text.length(); i++){ // определяем числа
            numbers_and_indices = number_search( mat_text, i); //Определяем первое число(+ индекс последнего элемента-числа в списке)
            first_nums = numbers_and_indices[0];               //выводим массив чисел       
            i = numbers_and_indices[1][0];                     //выводим индекс последнего элемента-числа
            while (!Character.isDigit(mat_text.charAt(i)) & mat_text.charAt(i) != '?'){
                i++;
            }
            numbers_and_indices = number_search( mat_text, i); //повторяем для второго числа
            second_number = numbers_and_indices[0];
            i = numbers_and_indices[1][0];
            while (!Character.isDigit(mat_text.charAt(i))){
                i++;
            }
            for ( ; i < mat_text.length(); i++){               //определяем третье число
                if (Character.isDigit(mat_text.charAt(i)) & result_number == 0)
                    result_number = result_number + Character.digit(mat_text.charAt(i), 10);
                else if (Character.isDigit(mat_text.charAt(i)) & result_number > 0)
                    result_number = result_number * 10  + Character.digit(mat_text.charAt(i), 10);
            }
        }
        int count = 0;
        for (int i = 0; i < first_nums.length; i++){ // ищем верное равенсво
            for (int j = 0; j < second_number.length; j++){
                if (first_nums[i] + second_number[j] == result_number){
                    count++;
                    System.out.printf("(%d) %d + %d = %d \n",count , first_nums[i], second_number[j], result_number);   
                }
            }
        }
        if (count == 0)
            System.out.println("Решения данного уравнения нет");

        input.close();
    }
    static int[][] number_search(String mat_text, int i){
        int nums_i[][];
        int nums[];
        nums = new int[1];
        if (Character.isDigit(mat_text.charAt(i))){ // если первым определили число
            nums[0] = Character.digit(mat_text.charAt(i), 10); // записываем 1 число
            for (int c = i+1; c < mat_text.length(); c++, i++){ // цикл определяет число и все возможные варианты числа
                if (Character.isDigit(mat_text.charAt(c))){
                    for (int j = 0; j < nums.length; j++){
                        nums[j] = nums[j] * 10 + Character.digit(mat_text.charAt(c), 10); // корректируем список чисел
                    }
                }
                else if (mat_text.charAt(c) == '?'){
                    int new_nums[];
                    new_nums = new int[nums.length * 10];
                    for (int j = 0; j < nums.length; j++){
                        for (int g = 0; g < 10; g++){
                            new_nums[10*j+g] = nums[j] * 10 + g; // корректируем список чисел добавляем 10 ваиантов
                        }
                    }
                    nums = new_nums.clone();
                }
                else if (mat_text.charAt(c) == '+' | mat_text.charAt(c) == '='){
                    c = mat_text.length();
                }
            } 
        }

        else if (mat_text.charAt(i) == '?'){ // если первым определили неизвестный элемент
            int new_nums[];
            new_nums = new int[nums.length * 9];
            for (int j = 0; j < nums.length; j++){
                for (int g = 0; g < 9; g++){
                    new_nums[10*j+g] = nums[j] * 10 + (g+1); // создали предварительный список из 10 чисел
                }
            }
            nums = new_nums.clone();
            for (int c = i+1; c < mat_text.length(); c++, i++){ // определяет все возможные варианты числа
                if (Character.isDigit(mat_text.charAt(c))){
                    for (int j = 0; j < nums.length; j++){
                        nums[j] = nums[j] * 10 + Character.digit(mat_text.charAt(c), 10); // корректируем список чисел
                    }
                }
                else if (mat_text.charAt(c) == '?'){
                    //int new_nums[];
                    new_nums = new int[nums.length * 10];
                    for (int j = 0; j < nums.length; j++){
                        for (int g = 0; g < 10; g++){
                            new_nums[10*j+g] = nums[j] * 10 + g; // корректируем список чисел добавляем 10 ваиантов
                        }
                    }
                    nums = new_nums.clone();
                }
                else if (mat_text.charAt(c) == '+' | mat_text.charAt(c) == '='){
                    c = mat_text.length();
                }
            } 
        }
        
        nums_i = new int[2][];
        nums_i[0] = new int[nums.length];
        nums_i[1] = new int[1];
        nums_i[0] = nums;
        nums_i[1][0] = i;
        return nums_i;
    } 
}
