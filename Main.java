import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        scanner Scanner = new Scanner(system.in);
        String input;
        System.out.println("Skriv något");
        input = Scanner.nextLine();

        if(input.equalsIgnoreCase("Daniel drink")) {
            food();
        }
        else if (input.equalsIgnoreCase("Daniel")) {
            hello();
        }
        else {
            System.out.println(input);
        }
    }
    public static void food() {
        System.out.println("Daniel gillar pizza");
    }
    public static void hello() {
        System.out.println("Daniel säger hello");
    }
}