import java.util.Scanner;

public class Java_220329_5 {
    public static void main(String[] fuck) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int discriminant;
        double rootedDiscriminant;
        double answer1;
        double answer2;

        System.out.println("ax^2 + bx + c");

        System.out.println("a를 처 입력하시오 : ");
        a = sc.nextInt();

        System.out.println("b를 처 입력하시오 : ");
        b = sc.nextInt();

        System.out.println("c를 처 입력하시오 : ");
        c = sc.nextInt();

        discriminant = b*b - 4*a*c;
        rootedDiscriminant = Math.sqrt(discriminant);

        if (discriminant > 0) {
            answer1 = (-b+rootedDiscriminant) / (2*a);
            answer2 = (-b-rootedDiscriminant) / (2*a);
            System.out.println("이차방정식의 근은 " + answer1 + "또는" + answer2 + "입니다.");
        }

        if (discriminant == 0) {
            answer1 = (-b+rootedDiscriminant) / (2*a);
            System.out.println("이차방정식의 근은 " + answer1 + "입니다.");
        }

        if (discriminant < 0) {
            System.out.println("이차방정식의 근이요? 있어요? 없어요. 있었어요? 아니 없었다고요 싯팔!");
        }

        sc.close();
    }
}
