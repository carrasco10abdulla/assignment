import java.util.Scanner;
public class five {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float k;
        float m;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        k =sc.nextFloat();
        System.out.println("the value of k before adding:"+k);
        System.out.println("enter m:");
        m=sc.nextFloat();
        k+=m;
        System.out.println("the value of k after adding:"+k);

    }
    
}
