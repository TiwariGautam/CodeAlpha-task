
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tiwar
 */
 class BankAccount2 
{

    /**
     * @param args the command line arguments
     */   
    private String accno;  
    private String name;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
    //method to open new account  
    public void openAccount() 
    {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
    //method to display account details  
    public void showAccount()
    {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);   
        System.out.println("Balance: " + balance);  
    }  
    //method to deposit money  
    public void deposit()
    {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
    //method to withdraw money  
    public void withdrawal() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    //method to search an account number  
    public boolean search(String ac_no)
    {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  

     public static void main(String[] args) 
     { 
         String ac_no;
        Scanner sc = new Scanner(System.in);  
        //create initial accounts
        System.out.println("Welcome"); 
        BankAccount2 C[] = new BankAccount2[1];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new BankAccount2();  
            C[i].openAccount();  
        }  
        // loop runs until number 4 is not pressed to exit  
        int ch;  
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Deposit the amount \n 3. Withdraw the amount \n 4.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].showAccount();  
                        }  
                        break;  
                    case 2:    
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();    
                        for (int i = 0; i < C.length; i++) {    
                                C[i].deposit(); 
                        }       
                                break;  
                          
                    case 3:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        for (int i = 0; i < C.length; i++) {  
                                C[i].withdrawal(); 
                        }        
                                break; 
                            
                    case 4:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 4);  
    }   }  