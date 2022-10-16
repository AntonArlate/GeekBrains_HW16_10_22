// Написать программу вычисления n-ого треугольного числа.

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите N для треугольного числа: ");
        int n = iScanner.nextInt();
        System.out.println((n*(n+1))/2);
        iScanner.close();


        show (n,0);

    }    

    static void show (int n, int count) {
        
        for (int i = 0; i < count; i++) {
            System.out.printf("  ");      
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("  X ");       
        }
        System.out.println();
        if (n==1) return;
        show(n-1, ++count);
    }

}