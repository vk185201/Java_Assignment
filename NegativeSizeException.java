import java.util.Scanner;

public class NegativeSizeException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int [] arr=new int[n];
        //get the number of positive  elements
        int m=0;
        try {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                        if (arr[i] < 0) {
                            System.out.print("Exception is :");
                            throw new custom_NegativeSizeException("Negative elements are not allowed");
                        }
                        m++;
                    }
        }
        catch (custom_NegativeSizeException s) {
                    System.out.println(s.getMessage());
                }
        //Print the positive elements
        for (int i = 0; i < m; i++) {
                System.out.print(arr[i]+" ");
        }
    }
}

class custom_NegativeSizeException  extends Exception{
    public custom_NegativeSizeException(String message){
        //Pass the custom Exception message in Exception block
        super(message);;
    }
}
