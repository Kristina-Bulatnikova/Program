import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        getList();
    }
    public static void getList() {
        List<Product> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Name, price, description:");
            list.add(new Product(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), scanner.nextLine()));
        } while (!scanner.nextLine().equals("end"));
        setList(list);
    }

    public static void setList(List<Product> list) {
        System.out.println("path:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Product product : list) {
                String ss = product.toString();
                writer.write(ss + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}