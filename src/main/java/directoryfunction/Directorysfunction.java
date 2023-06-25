package directoryfunction;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Directorysfunction{
    Scanner bn=new Scanner(System.in);
    String name;
    HashMap<String, LinkedList<Object>> cont;
   public Directorysfunction(){
        System.out.println("welcome to phone directory");
        cont=new HashMap<>();
    }
    protected void add() {
        System.out.println("enter the number of contact to be added:");
        int no=bn.nextInt();
        for(int i=0;i<no;i++) {
            System.out.println("enter the name:");
            name = bn.next();
            System.out.println("enter the phone number:");
            int pno = bn.nextInt();
            System.out.println("enter the email id:");
            String id = bn.next();
            LinkedList<Object> list = new LinkedList<>();
            list.addLast(pno);
            list.addLast(id);
            cont.put(name, list);
            System.out.println("details added successfully");
        }


    }
    protected void delete()
    {
        System.out.println("do you want to delete whole phone directory:(yes/no)");
        char ch=bn.next().charAt(0);
        if((ch=='y')||(ch=='Y')){
            cont.clear();
            System.out.println("cleared all contact");
        }
        else{
            System.out.println("enter the name to be delete the contact;");
            String na=bn.next();
            cont.remove(na);
            System.out.println("the given name has been delted from the contact");
        }
    }

    protected void display(){


        if(cont.isEmpty()){
            System.out.println("no contact found");
        }
        else {
            System.out.println("the saved contacts are:");
            for(Map.Entry m : cont.entrySet()){
                System.out.println("name -> "+m.getKey()+" -> "+" phone no,email -> "+m.getValue());
            }
        }
    }
    protected void search()
    {
        System.out.println("Enter the name to search: ");
        String nam=bn.next();
        if(cont.containsKey(nam)) {
            for(Map.Entry m : cont.entrySet()){
                System.out.println("name -> "+m.getKey()+" -> "+" phone no,email -> "+m.getValue());
            }
        }
        else {
            System.out.println("no contact found...");
        }
    }
}

