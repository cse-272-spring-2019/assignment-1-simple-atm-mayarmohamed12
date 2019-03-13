package atm;
import java.util.Scanner;

public class Testcase {
	

	public static void main(String[] args) {
	myatm  mayar = new myatm(1235,0,74);
	//Transaction  tran = new Transaction();
	Scanner choice=new Scanner(System.in);
	double l=0 ;
	int x;

do{ 	
	System.out.println("choose no 1 for display the current balance");
	System.out.println("choose no 2 for deposite");
	System.out.println("choose no 3 for withdraw");
	System.out.println("choose no 4 for prev");
  x=choice .nextInt();
switch(x){
case 1: 

mayar.getcurrentbalance(l);
break;
case 2:
System.out.println("enter the amount u want to deposite");
Scanner amount1 =new Scanner(System.in);
double k=amount1 .nextDouble();
 //l= mayar.deposit(k);
mayar.getcurrentbalance(l);
//tran.pev("deposite",k);
                                                       
break;
case 3:
	System.out.println("enter the amount u want to with draw");
	Scanner amount2 =new Scanner(System.in);
	double p=amount2 .nextDouble();
	//l= mayar.withdraw(p);
	if (l<0){
		System.out.println("ur withdrawal morethan ur current balance");
	}else 
	mayar.getcurrentbalance(l);
	break;
//case 4:
	//if(x==2)
	//System.out.println(tran.pev("deposite",k));
}

}
while(x != 0);





}




	



	
	


	}

