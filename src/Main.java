import javax.management.RuntimeErrorException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paralellepiped paralellepiped = new Paralellepiped();
        System.out.println("Введите число");
        try {
            paralellepiped.square(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        }catch (InputMismatchException e){
            System.err.println("tamga bergenge bolboit");
        }

        System.out.println("Введите число второй метода.");
        try {
            paralellepiped.volume(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        }catch (InputMismatchException e){
            System.out.println("тамга бергенге болбойт!");
        }
    }
}