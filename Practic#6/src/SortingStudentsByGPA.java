public class SortingStudentsByGPA implements Comparator {
    Student[] middleMark;

    @Override
    public void QuickSort(Student[] students, int low, int high) {
        middleMark = students;
        if (middleMark.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student opora = middleMark[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (middleMark[i].GetScore() > opora.GetScore()) {
                i++;
            }

            while (middleMark[j].GetScore() < opora.GetScore()) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = middleMark[i];
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
        Student opora = middleMark[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (middleMark[i].GetScore() > opora.GetScore()) {
                i++;
            }

            while (middleMark[j].GetScore() < opora.GetScore()) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = middleMark[i];
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

    public Student[] mergeSort(Student[] arrayA){ // сортировка Массива который передается в функцию

        // проверяем не нулевой ли он?
        if (arrayA.length == 0) {
            return arrayA;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length == 1) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }
        // копируем левую часть от начала до середины
        Student[] arrayB = new Student[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        Student[] arrayC = new Student[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = mergeSort(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = mergeSort(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC);
    }

    public Student[] mergeArray(Student[] arrayА, Student[] arrayB) {

        Student[] arrayC = new Student[arrayА.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayА.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayА[positionA];
                positionA++;
            } else if (arrayА[positionA].GetScore() < arrayB[positionB].GetScore()) {
                arrayC[i] = arrayА[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }

        return arrayC;
    }
}
