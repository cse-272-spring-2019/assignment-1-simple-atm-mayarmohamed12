package atm;

import java.util.Scanner;

public class myatm {
	private double password;
	private double currentbalance;
	private double accnumber;
	private String history[] =new String[5];
	int historyIndex = 0;
	
	public myatm(double password,int currentbalance1,double accnumber){
		this.password=password;
		currentbalance=currentbalance1;
		this.accnumber=accnumber;
		historyIndex=0;
	}
	public double validation (){
		accnumber=1234;
		
		
	 return accnumber;
	}
	
	public double getcurrentbalance(double b){
	//String  balance=""+ b;
		
	//currentbalance=currentbalance+b;
	System.out .println(" the current balance is "+ currentbalance);
	
	return currentbalance ;
	}
	public void withdraw(double y){

		double w =getcurrentbalance(currentbalance);
		if (y > w){
			System.out.println("invalid operation");
		}else{
		 currentbalance=currentbalance -y ;
		System.out.println("currentbalance after withdraw"+currentbalance);}
		String z= "withdraw" + String.valueOf(y);
		
		save(z);
	}
	
	public double deposit(Double l){
		//System.out.println("enter the value to deposit");
		//Scanner amount1 =new Scanner(System.in);
		//double k=amount1 .nextDouble();
		currentbalance =currentbalance+l;
		//System.out.println("the balance after "+currentbalance);
		getcurrentbalance(currentbalance);
		String z= "deposite" + String.valueOf(l);
		
save(z);
		
		return currentbalance;
	}
	//public  Transaction prev(String l){
	
		//return history[--historyIndex];

	 
	//]return history[historyIndex];
	//}
	
//}
	public void save (String k){
		historyIndex++;
		int x = 4;
		while(x>0)
		{
			history[x] = history[x-1];
			x--;
		}
		history[0] = k;
		historyIndex++;
		
	}
	

	public String gethistory(int i){
		return history[i];
	}
}

