import java.util.Scanner;

public class pone {
    public static void main(String[] args){
    public void determineLargestValue()
    {
    Scanner input = new Scanner(System.in);
    
    int intCounter = 0;
    int total = 0;
    int number;
    int largest;
    
    System.out.println("Enter number: ");
    largest = input.nextInt();
    
    total += largest;
    
    while (intCounter < 9)
    {
    System.out.println("Enter number: ");
    number = input.nextInt();
    if(number > largest)
    {
    largest = number;
    }
    total += number;
    intCounter++;
    }
    
    }
    System.out.printf("The total is : %d\n", total);
    System.out.printf("\nThe largest of all 10 integers is: %d\n", largest, number);
}
}
}
    