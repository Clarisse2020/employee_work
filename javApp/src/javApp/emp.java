package javApp;
import java.util.*;
public class emp {
	public int type;
	public int gross_salary_salary_salary;
	public int rssb;
	public int net_salary;
	public int salary;
	public int tax;
	public String name;
	public int hour;

	public static class month extends emp{
		public void person1()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter salary per month");
			salary=in.nextInt();
			
		tax= (salary*30)/100;
		rssb=(salary*3)/100;
		net_salary=salary-(tax+rssb);
		
		
		}
		
		
	}
	public static class week extends emp{
		public void person2(){
			System.out.println("Enter salary per week");
			Scanner in = new Scanner(System.in);
			salary=in.nextInt();
			net_salary=salary;
			
		}
	}
	public static class hour extends emp{
		
	public  int person3(){
		System.out.println("Please enter number of hours");
		Scanner in = new Scanner(System.in);
		hour = in.nextInt();
		System.out.println("Please enter salary per hours");
		salary = in.nextInt();
		
		if(hour<=40){
		return(net_salary = hour*salary);
		
		}
		else{
			return(net_salary=(hour*salary)+((40-hour)*salary));
			
			
		}
	}
	}


	
	public  static void main(String[] args) {
		
		hour b = new hour();
        week c=new week();
        month d=new month();
		System.out.println("Please enter employee name:");
		Scanner in = new Scanner(System.in);
      b.name=in.nextLine();
        System.out.println("Please select type of emp according to type:");
        System.out.println("--------------------------------------------");
        System.out.println("1.month,2.weekly,3.hour");
        b.type=in.nextInt();
        System.out.println("name is "+b.name);
		if(b.type==1)
		{
			d.person1();
			System.out.println("Salary is: "+d.net_salary);
			
		}
		else if(b.type==2){
			c.person2();
			System.out.println("Salary is: "+c.net_salary);
		}
		else if(b.type==3){
		    b.person3();
			System.out.println("Salary is: "+b.net_salary);
			
		}
		else{
			System.out.println("Invalid type!");
		}
                
		
		}
	
}
