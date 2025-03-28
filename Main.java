import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Rasmus rasmus = new Rasmus();
        rasmus.hello();
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv in nåt kul");
        String fun = input.nextLine();
        System.out.println(fun);
        System.out.println("Det var inte så kul");

    }
}
