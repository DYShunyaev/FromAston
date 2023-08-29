package DYShunyaev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean working = false;
        while (!working) {
            try {
                boolean one = false,two = false;
                while (!one || !two) {
                    System.out.println("Введите имя или число.");
                    String sting = reader.readLine();
                    int number;
                    if (sting.matches("\\d+")) {
                        number = Integer.parseInt(sting);
                        System.out.println(exerciseOne(number));
                        one = true;
                    } else {
                        System.out.println(exerciseTwo(sting));
                        two = true;
                    }
                }
                System.out.println("Введите числа массива, через запятую, в одну строку");
                String[] massStr = reader.readLine().split(",");
                int[] mass = new int[massStr.length];
                for (int i = 0; i < mass.length; i++) {
                    mass[i] = Integer.parseInt(massStr[i]);
                }
                System.out.println(Arrays.toString(exerciseThree(mass)));
                working = true;
                System.out.println("4)Дана скобочная последовательность: [((())()(())]]\n" +
                        "     - Можно ли считать эту последовательность правильной?\n" +
                        "     - Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?\n" +
                        "\n" +
                        "     Ответ: Нет, последовательность не правильная. Необходимо изменить 2 случая. [((())')'()(())\"]\"].\n" +
                        "     '' - добавить.\n" +
                        "     \"\" - убрать."
                + "\n[((()))()(())]");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    /**
     * 1) Составить алгоритм: если введенное число больше 7, то вывести “Привет” **/
    public static String exerciseOne(int number) {
        if (number > 7) return "Привет";
        return "";
    }
    /** 2) Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
     **/
    public static String exerciseTwo(String name) {
        if (name.equals("Вячеслав")) return "Привет, Вячеслав";
        return "Нет такого имени";
    }

    /** 3) Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
     **/
    public static int[] exerciseThree(int[] mass) {
        return Arrays.stream(mass).filter(number -> number % 3 == 0).toArray();
    }

    /** 4)Дана скобочная последовательность: [((())()(())]]
     - Можно ли считать эту последовательность правильной?
     - Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?

     Ответ: Нет, последовательность не правильная. Необходимо изменить 2 случая. [((())')'()(())"]"].
     '' - добавить.
     "" - убрать.
     **/

}
