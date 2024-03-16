import java.util.Scanner;

public class converter {
   public converter() {
   }

   public static void main(String[] var0) {
      System.out.println("welcome to the temp converter");
      Scanner var1 = new Scanner(System.in);
      System.out.println("1.Convert celcius to fahrenheit");
      System.out.println("2.Convert ferenehit to celcius");
      System.out.println("enter your choice");
      int var2 = var1.nextInt();
      double var3 = 0.0;

      String var7;
      do {
         System.out.println("enter temperature");
         double var5 = var1.nextDouble();
         if (var2 != 1 && var2 != 2) {
            break;
         }

         if (var2 == 1) {
            var3 = fahrenheit(var5);
         } else {
            var3 = celcius(var5);
         }

         System.out.println("result is  " + var3);
         System.out.println("do you want to do another");
         var7 = var1.next();
      } while(var7.equalsIgnoreCase("yes"));

      var1.close();
      System.out.println("thankyou for  using :)");
   }

   public static double fahrenheit(double var0) {
      return var0 * 9.0 / 5.0 + 32.0;
   }

   public static double celcius(double var0) {
      return 0.0 * (var0 - 32.0);
   }
}