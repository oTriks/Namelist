import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv 5 namn");
        String input = sc.nextLine();
        String[] names = input.split(" ");
        List<String> names2 = Arrays.asList(names);
        ArrayList<String> nameList = new ArrayList<>(names2);


        System.out.print("Namnen är: ");
        for (String name : nameList) {
            System.out.print(name + " ");
        }
        System.out.println("Namnen omvänt är; ");
        Collections.reverse(nameList);
        for (String name : nameList) {
            System.out.print(name + " ");


        }
    }
}