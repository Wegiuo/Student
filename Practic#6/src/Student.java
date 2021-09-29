import java.util.Scanner;

public class Student {
    int[] ID;

    public Student(int x) {
        Scanner sc = new Scanner(System.in);
        ID = new int[x];
        for (int i = 0; i < x; i++) {
            ID[i] = sc.nextInt();
        }
    }

    public void Sort(){
        for (int left = 0; left < ID.length; left++) {
            // Вытаскиваем значение элемента
            int value = ID[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < ID[i]) {
                    ID[i + 1] = ID[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            ID[i + 1] = value;
        }
    }

    public void Print(){
        System.out.print(ID[0]);
        for (int i = 1; i < ID.length; i++) {
            System.out.print(", "+ID[i]);
        }
        System.out.println();
    }
}
