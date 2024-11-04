package ie.atu.week7;


import java.util.ArrayList;
import java.util.Scanner;

public class orderapp {
    public static void main(String[] args){
        ArrayList<String>orderDetails = new ArrayList<String>();




        try(Scanner scan = new Scanner(System.in) ){
            while(true){
                try{
                    System.out.println("Order Management Menu\n1.Add order\n2.Update Order\n3.Display All Orders\n4.Exit\nEnter number\n");

                    String input  = scan.nextLine();
                    int number = Integer.parseInt(input);

                    if(number < 1  && number >4 ){
                        System.out.println("Invalid number");
                    }
                    if(number ==1){
                        orderDetails.add

                    }
                    if(number == 4){// exit the menu
                        break;
                    }
                }
                catch(NumberFormatException nf){
                    System.out.println("enter a number between 1 -4 to access the menu" + nf);
                }


            }
        }











    }



}
