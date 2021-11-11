import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        System.out.println(negtiveValue());

    }


    public static int negtiveValue() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        do {
            System.out.println("Введите число: ");
            list.add(scanner.nextInt());
        }while (list.get(list.size() -1) != 100);

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                count++;
            }

        }
        return count;
    }
}



