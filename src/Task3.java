import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double a = 0, b = 0;

    while (true) {
        System.out.println(" 1. a soniga b sonini qo'shish. ");
        System.out.println(" 2. a sonidan b sonini ayirish. ");
        System.out.println(" 3. a soniga b sonini ko'paytrish. ");
        System.out.println(" 4. a soniga b sonini bo'lish. ");
        System.out.println(" 5. a va b sonlari ichidan kattasi(max). ");
        System.out.println(" 6. a va b sonlari ichidan kichigi(min). ");
        System.out.println(" 0. Dasturdan chiqish. ");
        System.out.print(" >>> ");
        int n = scanner.nextInt();

    if (n != 0) {
        System.out.print(" Enter a: ");
        a = scanner.nextDouble();
        System.out.print(" Enter b: ");
        b = scanner.nextDouble();
    }

    switch (n) {
        case 0:
        for (int i = 0; i <= 100; i += 10) {
        System.out.print("  " + i + "%\t");
    }
    return;

    case 1:
        System.out.println(" Natija: " + Add(a, b));
        break;

    case 2:
        System.out.println(" Natija: " + Sub(a, b));
        break;

    case 3:
        System.out.println(" Natija: " + Mul(a, b));
        break;

    case 4:
        System.out.println(" Natija: " + Div(a, b));
        break;

    case 5:
        System.out.println(" Natija: " + Max(a, b));
        break;

    case 6:
        System.out.println(" Natija: " + Min(a, b));
        break;

    default:
        System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz! ");
        break;
        }
    }
}

    public static double Add(double a, double b) {
    return a + b;
    }

    public static double Sub(double a, double b) {
    return a - b;
    }

    public static double Mul(double a, double b) {
    return a * b;
    }

    public static double Div(double a, double b) {
    return a / b;
    }

    public static double Max(double a, double b) {
    return Math.max(a, b);
    }

    public static double Min(double a, double b) {
    return Math.min(a, b);
    }
}



