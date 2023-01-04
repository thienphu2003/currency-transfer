import java.util.Scanner;
public class CurrencyTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter USD :");
        float moneyUSD = sc.nextFloat();
        System.out.println("Money after transfer to VND is :"+Math.round(moneyUSD*23000));
    }
}
