package stock.application;

import stock.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();//objeto produto chamando os métodos atribuídos a classe produto
        System.out.println("Enter product date: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);//irá imprimir conforme métodos aplicados a classe

        System.out.println();
        System.out.println("Enter the number of produtcs to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.println("Enter the number of produtcs to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }
}
