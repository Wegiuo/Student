import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Student test = new Student(x);
        test.Print();
        test.Sort();
        test.Print();

        SortingStudentsByGPA mark = new SortingStudentsByGPA(x);
        mark.Print();
        mark.QuickSort(0, x-1);
        mark.Print();
    }
}
