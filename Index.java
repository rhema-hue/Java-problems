import java.util.Scanner;
public class Index {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]arr={1,2,3,4,5,6,7,8};
        System.out.println("Enter the index to find element:");
        int ind=sc.nextInt();
        System.out.print(arr[ind]);
        sc.close();
    }
}

