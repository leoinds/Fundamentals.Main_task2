import java.util.Scanner;

public class JavaSecond {

    public static void main(String[] args) {
        JavaSecond jl = new JavaSecond ();
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите аргументы");
        int text = scanner.nextInt ();
        System.out.println ("Зеркальное отображение " + jl.mirror (text));

    }

    public String mirror(int x) {
        StringBuilder newStr = new StringBuilder (String.valueOf (x));
        return newStr.reverse ().toString ();
    }
}