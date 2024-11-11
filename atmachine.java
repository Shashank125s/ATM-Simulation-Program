package ATM;

import java.util.Scanner;

class atm{
    float balance;
    int PIN = 1805;
    
    atm(){
        System.out.println("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if(pin == PIN){
            menu();
    }else{
        System.out.println("Invalid PIN");
        new atm();
        
    
        }
    }

    
    public void menu(){
        System.out.println("Enter your choice ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit ");

        Scanner sc = new Scanner(System.in);  
        int opt = sc.nextInt();
        
        if(opt ==1 ){
            checkbalance();
        }else if(opt == 2){
            withdrawMoney();
        }else if(opt == 3){
            depositemoney();
        }else if(opt ==4){
            return;
        }else{
            System.out.println("enter a valid choice");
        }

    }

    public void checkbalance(){
        System.out.println("Balance: "  + balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if(amount>=balance){
            System.out.println("Insufficient Balance");
        }else{
            balance-= amount;
            System.out.println("Money Withdraw successfully");
        }
        menu();
    }
    public void depositemoney(){
        System.out.println("Enter Amount to Deposite");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        balance+= amount;
        System.out.println("Amount added successfully");
        menu();
    }
}

public class atmachine {
    public static void main(String[] args){

        // atm obj = new atm(1805);
        // obj.checkpin();

        new atm();
        
    }
    
}
