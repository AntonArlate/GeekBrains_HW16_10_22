// Реализовать алгоритм пирамидальной сортировки (HeapSort)


public class program2 {

    public static void main(String[] args) {

        int[] arr = {4, 8, 15, 13, 12, 3, 6, 5, 9, 10};
        int len = arr.length;

        view_arr(arr);
        
        // Первичная генерация. Проверяем есть ли возможность подняться по дереву (i != 0) если есть, запускаем от имени верхнего индекса.
        for (int i = len-1; i >= 0; i--) {
            HeapSort (arr, len, i);
            
        }
        
        view_arr(arr);

        // меняеем i0 и iend
        swap(arr, 0, len-1);

        while (len > 2) {
        // уменьшаем len на 1
        len--;
        // спускаем i0 на новое место
        HeapSort (arr, len, 0);
        // меняеем i0 и iend
        swap(arr, 0, len-1);
        }
        view_arr(arr);

    }    

    static void HeapSort (int[] arr, int len, int i) { // создаём кучу
        // проверяем есть ли у текущего элемента дочерний 1
        int max_i = i;

        if (i*2+1 <= len-1) {
        // если есть сравниваем больше ли он, записываем индекс больего
            if (arr[i] < arr [i*2+1]) {
                max_i = i*2+1;
            }    
        // проверяем есть ли дочерний 2 (можно пропустить если нет первого)
            if (i*2+2 <= len-1) {
        // сравнваем с текущим макс и записываем индекс
                if (arr[max_i] < arr [i*2+2]) {
                    max_i = i*2+2;
                }        
            }
        }
        // если индекс не изменён то ничего не делаем. Если иначе, меняем с текущим индексом и запускаем сортировку от имени изменившегося индекса.
        if (max_i != i) {
            swap(arr, i, max_i);
            HeapSort(arr, len, max_i);
        }

    }

    static void swap (int arr[],int i, int max_i) {
        int temp = arr [i];
        arr [i] = arr [max_i];
        arr [max_i] = temp;
    }

    static void view_arr (int arr[]) {
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }


}