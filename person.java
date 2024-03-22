import java.util.Scanner;
public class person {
    String name;
    int age;
    String petname;
    person(String n,int a,String pa){
        this.name=n;
        this.age=a;
        this.petname=pa;

        
    }



    public  void output(){
        System.out.println("your name "+name);
        System.out.println("your age is " +age);
        System.out.println("your pet name " +petname);
    }


    public  void  input(){
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("enter your name:");
        this.name=sc.nextLine();
        System.out.println("enter your age:");
        this.age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter your pet name:");
        this.petname=sc.nextLine();
      //  sc.nextLine();

        sc.close();
    }


}
