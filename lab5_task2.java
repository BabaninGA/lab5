//Программа удаляет из целочисленного списка A размерности N элементы, равные целому числу X.
//На экран выводятся как исходное состояние массива, так и итоговое.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Taks2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=0;
        try {
            System.out.println("Введите количество элементов в списке");
            N = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Количество элементов списка может быть задано только целым числом");
            System.exit(1);
        }
        if (N>=1) {
            ArrayList<Integer> Alist = new ArrayList<>();
            try {
                System.out.println("Введите элементы списка");
                for (int i = 0; i < N; i++) {
                Alist.add(i, in.nextInt());
            }
            } catch (InputMismatchException e) {
                System.out.println("Элементами списка в данной программе могут быть только целые числа");
                System.exit(1);
            }
            ArrayList<Integer> AlistNew = new ArrayList<>();
            AlistNew.addAll(Alist);
            int X=0;
            try {
                System.out.println("Введите значение. Все элементы заданного Вами списка, равные этому значению, будут удалены");
                X = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Элементы списка в данной программе могут сравниваться только с целым числом");
                System.exit(1);
            }
            for (int j = 0; j < N; j++) {
                if (AlistNew.get(j) == X) {
                    AlistNew.remove(j);
                    N--;
                    j--;
                }
            }
            int size = AlistNew.size();
            if (size >= 1) {
                System.out.println("Исходный список");
                System.out.println(Alist);
                System.out.println("Список после удаления элементов с заданным Вами значением");
                System.out.println(AlistNew);
            } else {
                System.out.println("Исходный список");
                System.out.println(Alist);
                System.out.println("Все элементы были удалены из заданного Вами списка");
            }
        } else {
            System.out.println("Для работы данной программы список должен содержать не меньше одного элемента");
        }
    }
}
