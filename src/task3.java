import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
    linesLenght();
    }

    public static void linesLenght() {
        String[] arr = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово:");
            arr[i] = scanner.nextLine();
        }

        String a = arr[0];

        for (String el : arr) {
            if (el.length() > a.length()) {
                a = el;
            }
        }

        for (String el : arr) {
            if (el.length() == a.length()) {
                System.out.println(el);

            }
        }

    }
}
