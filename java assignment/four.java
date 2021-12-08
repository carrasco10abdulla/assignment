import java.util.Scanner;
public class four {
    public static void main(String[] args){
        String name;
        int age;
        Scanner SC =new Scanner(System.in);
        System.out.print("enter name:  ");
        name = SC.nextLine();
        System.out.print("enter age: ");
        age = SC.nextInt();
        System.out.println("welcome: "+ name +"your age is:" + age);

    }
    
}
