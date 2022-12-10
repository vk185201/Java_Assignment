import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        int amount=sc.nextInt();
        double tax=0;
        if(amount<80000){
            tax=0;
        } else if (amount>80000 && amount<150000) {
            tax=((amount-80000)*20)/100;
        }else {
                tax=(80000*20)/100+ ((amount-150000)*30)/100;
        }
        System.out.println(tax);

    }
}