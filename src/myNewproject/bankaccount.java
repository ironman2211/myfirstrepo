package myNewproject;

import java.util.Scanner;

public class bankaccount {

	public static void main(String[] args) {
	
		code b=new code(696969,"mr brahma");
		b.showmenu();
	}
 }

class code{
	int id;
	String name;
	int balance;
	int previoustransaction;
	
	
	code(int id1,String name2){
		id=id1;
		name=name2;
	}
	
   void deposite(int amount){
	  
	   if( amount!=0) {
		   balance+=amount;
		   previoustransaction=amount;
		   System.out.println("amount deposited sucessefully");
	   }
   }
   void withdrawl(int amount) {
	   if(amount!=0 ) {
		   balance-=amount;
		   previoustransaction=-amount;
		   System.out.println("amount withdrawl succesfully"); 
	   }
   }
   void showbalance() {
	   if(previoustransaction>0) {
		   System.out.println("the amount that has been credited is"+previoustransaction);
	   }
	   else if(previoustransaction<0) {
		
		   System.out.println("the amount that has been debited is"+previoustransaction);
	   }
	   else {
		   System.out.println("no transation ocure");
	   }
	   
   }
   void showmenu()
   {
	   
	   char option='\0';
	   Scanner sc=new Scanner(System.in);
	   System.out.println("****************************************************************************");
	   System.out.println("                         welcome to Gang.bank"+"\n"+id+"\n"+name);
	   System.out.println("A.account balanc"+"                                                     "+"B.deposite");
	   System.out.println("C.withdrawl"+"                                                          "+"C.previous transaction");
	   System.out.println("D.exit");
	   System.out.println("****************************************************************************");
	   
	  do {
		  
		  System.out.println("-------------------------------------------------------------------------------");
		  System.out.println("enter an option");
		  System.out.println("--------------------------------------------------------------------------------");
		 
		  
		  option=sc.next().charAt(0);
		  switch(option) {
		  
		  case 'A':
			  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
			  System.out.println("balance in your acoount is:"+balance);
			  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");	  
		      break;
		  
		  case 'B':
			  System.out.println("*****************************************************************************"+"\n");
			  int amount2= sc.nextInt();
			  deposite(amount2);
			  System.out.println("\n");
			  System.out.println("********************************************************************************");
		      break;
			  
		  case 'c':
			  System.out.println("*******************************************************************************"+"\n");
			 int amount1=sc.nextInt();
			  withdrawl(amount1); 
			 System.out.println("\n");
			 System.out.println("**********************************************************************************");
			 break;
		  case 'd':
			  System.out.println("*********************************************************************************");
			  System.out.println("\n");
			  System.out.println("your last transaction is"+previoustransaction+"\n");
			  System.out.println("*********************************************************************************");
		      break;
		  case 'E':
			  System.out.println("-------------------------------------------------------------------------------"+"\n");
			  System.out.println("thanks for using gang.bank");
		      break;
		  default:
			  System.out.println("404 error not fouund ");
		  }
		  
		  
		  
		  
		  
		  
	  
	  }while(option !='t');
	   
   }

   
}

