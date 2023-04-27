/*
Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
 */


import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String[] arraysStringAndInteger = {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"};
        ArrayList<String> stringAndInteger = new ArrayList<>(Arrays.asList(arraysStringAndInteger));
        System.out.println(stringAndInteger);
        for (int i = 0; i < stringAndInteger.size(); i++) {
            if (stringAndInteger.get(i).matches("\\d+")) {
                stringAndInteger.remove(i);
                i--;
            }
        }
        System.out.println(stringAndInteger);
    }
}
