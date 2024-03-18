import java.util.Scanner;
public class Calculator{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("welcome to the calculator program");
    while (true) {
        System.out.println("enter first number:");
        double num1=sc.nextDouble();
        System.out.println("enter your second number:");
        double num2=sc.nextDouble();
        System.out.println(" +,-,*,/");
        char operator=sc.next().charAt(0);
        double result=0;
        switch (operator) {
            case '+':
                {
                    result=num1+num2;

                }
                break;
                case '-':{
                    result=num1-num2;
                }
                break;
                case '*':
            {
                result=num1 *num2;

            }
            break;
            case '/':
            {
                if (num2!=0) {
                    result=num1/num2;

                }
                else{
                    System.out.println("cannnot divide by zero");
                }
                break;
            }


            default:{
                System.out.println("please put the correct number");
            }
            continue;
                
        }
                System.out.println("result is  "+ result);    
                System.out.println("do you want to continue :yes or no");
                String choice=sc.next();
                if (!choice.equalsIgnoreCase("yes")) {
                    break;
                    
                }
                
            }
            
                        sc.close();
                        System.out.println("thankyou for using calculator ");
}    
}
