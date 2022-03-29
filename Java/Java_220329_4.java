import java.util.Scanner;

public class Java_220329_4 {
    public static void main(String[] fuck) {
        int deposit;
        float interestRate;
        float firstYear_asset;
        float secondYear_asset;

        Scanner sc = new Scanner(System.in);

        System.out.println("예금액을 처 입력하세요! : ");
        deposit = sc.nextInt();
        
        System.out.println("연이율을 처 입력하세요!<단위 = %> : ");
        interestRate = sc.nextFloat();

        firstYear_asset = deposit*(interestRate/100) + deposit ;
        secondYear_asset = firstYear_asset*(interestRate/100) + firstYear_asset;
        
        System.out.println("2년 후의 예금액은 " + secondYear_asset + "인데, 돈 빼시기 전에 은행이 망해서 보상은 어렵겠네요ㅠㅠ");

        sc.close();
    }
}