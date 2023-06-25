package directorycall;

import directoryfunction.Directorysfunction;

import java.util.Scanner;

public class Directorycall extends Directorysfunction{
   public void  callingFunction() {
       Scanner bn = new Scanner(System.in);
       while (true) {
           System.out.println("\n1)add \n2)delete \n3)search \n4)display \n5)exit \nenter the choice");
           int ch = bn.nextInt();
           switch (ch) {
               case 1:
                   add();
                   break;
               case 2:
                   delete();
                   break;
               case 3:
                   search();
                   break;
               case 4:
                   display();
                   break;
               case 5:
                   System.exit(0);
                   break;
               default:
                   System.out.println("enter the corect choice bro...");
                   break;
           }
       }
   }
}
