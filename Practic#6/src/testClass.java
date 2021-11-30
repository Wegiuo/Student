public class testClass {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Bob", 6 , 4.2),
                new Student("Alice", 5, 4.9),
                new Student("Albert", 2,3.0),
                new Student("Hary", 8, 2.9),
                new Student("Olga", 1, 5.0),
                new Student("Mary", 3, 5.0),
                new Student("Georg", 7, 2.0),
                new Student("Арина", 4, 4),
        };
        printStudents(students);
        students = Sort(students);
        printStudents(students);

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.QuickSort(students, 0, students.length-1);
        printStudents(students);

        Student[] students2 = {
                new Student("Oleg",     4.3),
                new Student("Marry",   3.0),
                new Student("Diper",  1.2),
                new Student("Amogus",    2.9),
        };
        Student[] mix = new Student[students.length + students2.length];
        System.arraycopy(students, 0,mix, 0, students.length);
        System.arraycopy(students2, 0,mix, students.length, students2.length);
        mix = sort.mergeSort(mix);
        printStudents(mix);


        /*SortingStudentsByGPA mark = new SortingStudentsByGPA(x);
        mark.Print();
        mark.QuickSort(0, x-1);
        mark.Print();*/
    }

    static void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.print("Name = ");
            students[i].PrintName();
            System.out.print("; ID = ");
            students[i].PrintID();
            System.out.print("; Score = ");
            students[i].PrintScore();
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    static Student[] Sort(Student[] students){
        for (int left = 0; left < students.length; left++) {
            // Вытаскиваем значение элемента
            String name = students[left].GetName();
            int ID = students[left].GetID();
            Double score = students[left].GetScore();
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (ID < students[i].GetID()) {
                    //ID[i + 1] = ID[i];
                    students[i + 1].SetID(students[i].GetID());
                    students[i + 1].SetName(students[i].GetName());
                    students[i + 1].SetScore(students[i].GetScore());
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            //ID[i + 1] = ID;
            students[i + 1].SetID(ID);
            students[i + 1].SetName(name);
            students[i + 1].SetScore(score);
        }
        return students;
    }

}