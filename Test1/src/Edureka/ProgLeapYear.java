package Edureka;

public class ProgLeapYear {

	public static void main(String[] args) {
		 int a=1900, b=2014, c= 2004, d=2000;
		 
		 if(a%4==0 && a%400!=0) {
			 System.out.println(a+ " is a non century leap year");
		 }
		 else
			 {if(a%400==0 && a%4==0)
			 System.out.println(a+ " is a century leap year");
		 else 
			 System.out.println(a+ " is not a leap year");
			 }
		 
		 if(b%4==0 && b%400!=0) {
			 System.out.println(b+ " is a non century leap year");
		 }
		 else
			 {if(b%400==0 && b%4==0)
			 System.out.println(b+ " is a century leap year");
		 else 
			 System.out.println(b+ " is not a leap year");
			 }
		
		 if(c%4==0 && c%400!=0) {
			 System.out.println(c+ " is a non century leap year");
		 }
		 else
			 {if(c%400==0 && c%4==0)
			 System.out.println(c+ " is a century leap year");
		 else 
			 System.out.println(c+ " is not a leap year");
			 }
		 
		 if(d%4==0 && d%400!=0) {
			 System.out.println(d+ " is a non century leap year");
		 }
		 else
			 {if(d%400==0 && d%4==0)
			 System.out.println(d+ " is a century leap year");
		 else 
			 System.out.println(d+ " is not a leap year");
			 }
		
	}

}
