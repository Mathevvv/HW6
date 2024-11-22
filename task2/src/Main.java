import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.
        greatest = first;
        if (first<second) {
            greatest = second;
            if (second<third) {
                greatest = third;
            }
        }

        smallest = first;
        if (first>second) {
            smallest = second;
            if (second>third) {
                smallest = third;
            }
        }


        if ((first>second && first<third) || (first<second && first>third)) average = first;
        if ((first>second && second>third) || (first>second && second<third)) average = second;
        if ((first>third && second<third) || (first<third && second>third)) average = third;





        //todo


        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
