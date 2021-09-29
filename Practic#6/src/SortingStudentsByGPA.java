import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator {
    int[] middleMark;

    public SortingStudentsByGPA(int x) {
        Scanner sc = new Scanner(System.in);
        middleMark = new int[x];
        for (int i = 0; i < x; i++) {
            middleMark[i] = sc.nextInt();
        }
    }

    @Override
    public void QuickSort(int[] middleMark, int low, int high) {
        if (middleMark.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = middleMark[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (middleMark[i] < opora) {
                i++;
            }

            while (middleMark[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = middleMark[i];
                middleMark[i] = middleMark[j];
                middleMark[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            QuickSort(middleMark, low, j);

        if (high > i)
            QuickSort(middleMark, i, high);
    }

    public void QuickSort(int high, int low) {
        if (middleMark.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = middleMark[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (middleMark[i] < opora) {
                i++;
            }

            while (middleMark[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = middleMark[i];
                middleMark[i] = middleMark[j];
                middleMark[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            QuickSort(middleMark, low, j);

        if (high > i)
            QuickSort(middleMark, i, high);
        this.middleMark=middleMark;
    }
    public void Print(){
        System.out.print(middleMark[0]);
        for (int i = 1; i < middleMark.length; i++) {
            System.out.print(", "+middleMark[i]);
        }
        System.out.println();
    }
}
