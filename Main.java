//Main.java

//NAme: Vedant Shitole
//PRN: 23070126143
//Batch: AIML B3

import java.io.PrintStream;
import java.util.Scanner;

class Main {
   Main() {
   }
      public static void main(String[] var0) {
      Calculator var1 = new Calculator();
      UserInput var2 = new UserInput();
      Scanner var3 = new Scanner(System.in);

      while(true) {
      System.out.println("Select an operation:");
      System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Fibonacci\n6. Sum of Array\n7. Mean of Array\n0. Exit");
      int var4 = var3.nextInt();

      if (var4 == 0) {
      System.out.println("Exiting the program.");
      var3.close();
      return;
      }
      PrintStream var10000;
         int[] var5;
         int var7;
         switch (var4) {
            case 1:
               var5 = var2.getTwoNumbers();
               var10000 = System.out;
               var7 = var1.add(var5);
               var10000.println("Sum: " + var7);
               break;
            case 2:
               var5 = var2.getTwoNumbers();
               var10000 = System.out;
               var7 = var1.subtract(var5);
               var10000.println("Difference: " + var7);
               break;
            case 3:
               var5 = var2.getTwoNumbers();
               var10000 = System.out;
               var7 = var1.multiply(var5);
               var10000.println("Product: " + var7);
               break;
            case 4:
               var5 = var2.getTwoNumbers();
               var10000 = System.out;
               var7 = var1.divide(var5);
               var10000.println("Quotient: " + var7);
               break;
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      }

   }

}
