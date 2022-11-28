import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Paralellepiped implements Paralelipiped {

    @Override
    public void square(double height, double width, double length) {

        try {
            if (height < 20 && width < 20 && length < 20) {
                try {
                    if (height > 0 && width > 0 && length > 0) {
                        double d = 2 * ((height * length) + (length * width) + (height * width));
                        System.out.println(d);
                    } else {
                        throw new ExceptionTers();
                    }
                } catch (ExceptionTers e) {
                    System.out.println("Ters san bolboit");
                }
            } else {
                throw new Big20();
            }
        } catch (Big20 e) {
            System.out.println("20 chon bolbouit");
        }
    }

    @Override
    public void volume(double height, double width, double length) {
        try {
            if (height < 20 && width < 20 && length < 20) {
                try {
                    if (height > 0 && width > 0 && length > 0) {
                        double d = (length * width * height);
                        System.out.println(d);
                    } else {
                        throw new ExceptionTers();
                    }
                } catch (ExceptionTers e) {
                    System.out.println("Терс сан  бергенге болбойт!!");
                }
            } else {
                throw new Big20();
            }
        } catch (Big20 e) {
            System.out.println("20 чон сан бергенге болбойт!!1");
        }

    }
}
