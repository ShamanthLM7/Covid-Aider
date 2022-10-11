package CovidAid;

import java.io.BufferedReader;
import java.io.BufferedWriter;

//JAVA PROJECT - COVID AIDER

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*; 

//interface of beds
interface bedex{
	void bed1();
	void bed2();
	void bed3();
	void bed4();
	void bed5();
	void bed6();
}
class beds implements bedex{
	public void bed1() {
		System.out.println("MUMBAI CURRENTLY HAS "+1000+" BEDS");
	}
	public void bed2() {
		System.out.println("MANGALORE CURRENTLY HAS "+500+" BEDS");
  	
	}public void bed3() {
		System.out.println("BENGALURU CURRENTLY HAS "+900+" BEDS");
  	
	}public void bed4() {
		System.out.println("DELHI CURRENTLY HAS "+1100+" BEDS");
  	
	}public void bed5() {
		System.out.println("HYDERABAD CURRENTLY HAS "+950+" BEDS");
  	
	}public void bed6() {
		System.out.println("KOLKATA CURRENTLY HAS "+650+" BEDS");
  	
	}
	
}




//SERVICES
class oxygencylinder{
	public static void write(int a12, String f)
	{   try
	  {	
		FileWriter fw = new FileWriter(f);
		fw.write(a12);
		fw.close();
	  } 
	    catch(Exception e)
	  {
	    	
	  }
	
	}
  void oxygen(){
	  
	  try {
         FileReader f = new FileReader("C:\\Users\\Shamanth Naik\\Desktop\\qwe.txt");
         BufferedReader bf = new BufferedReader(f);
         String st =bf.readLine();
         
        	 StringTokenizer stn = new StringTokenizer(st);
        	 int a11=Integer.parseInt(stn.nextToken());
         
		
  	Scanner s=new Scanner(System.in);           //scanner
  	System.out.println("We have "+a11+" beds");
		System.out.println("enter the the number of oxygen cylinders you want: ");
		int o1=s.nextInt();
		if(o1<=a11) {
			try {
				Thread.sleep(2000);
				}
				catch(Exception e) {
				}
			System.out.println(+o1+" cylinders are booked");
	    	System.out.println("Now Available beds are: "+(a11-o1));
	    	write(a11-o1,f);
	        
	    
             
	    	 
		}
		else {
			System.out.println("CHECK LATER");
	    	System.out.println("Now Available beds are: "+a11);
		}
  	System.out.println("\n");
	}
  
  catch(Exception e)
  {
	  
  }
}
}
class bookbed extends oxygencylinder {
	void BED() {
		int bb=10;
		Scanner s=new Scanner(System.in);           //scanner
  	System.out.println("We have "+bb+" beds");
		System.out.println("enter the the number of beds you want: ");
		int B=s.nextInt();
		if(B<=bb) {
			try {
				Thread.sleep(2000);
				}
				catch(Exception e) {
				}
			System.out.println(+B+" Beds is booked");	
	    	System.out.println("Now Available beds are: "+(bb-B));
	    	
		}
		else {
			System.out.println("CHECK LATER");
	    	System.out.println("Now Available beds are: "+bb);
		}
  	System.out.println("\n");
	}
}

class appoinment extends bookbed  {
	void appoin() {
		Scanner s=new Scanner(System.in);           //scanner
		System.out.println("enter the date you want to schedule: ");
		System.out.println("enter the DAY(DD): ");
		int d=s.nextInt();
		System.out.println("enter the MONTH(M): ");
		int m=s.nextInt();
      int y=2021;
      try {
			Thread.sleep(2000);
			}
			catch(Exception e) {
			}
		System.out.println("YOUR APPOINTMENT IS SCHEDULED ON DATE "+d+"-"+m+"-"+y);
  	System.out.println("\n");
	}
}

class testing extends appoinment{
	void test() { 
		Scanner s=new Scanner(System.in);           //scanner
		System.out.println("PLEASE NOTE");
		System.out.println("---------------------------------------------------");
		System.out.println("If the symptoms are serious\nThen please visit near by testing center immediately");
		System.out.println("PLEASE SCHEDULE IT TODAY OR TOMORROW DONT DELAY");
		System.out.println("---------------------------------------------------");
		System.out.println("enter the DAY(DD): ");
		int d=s.nextInt();
		System.out.println("enter the MONTH(M): ");
		int m=s.nextInt();
      int y=2021;
      try {
			Thread.sleep(2000);
			}
			catch(Exception e) {
			}
		System.out.println("YOUR APPOINTMENT IS SCHEDULED ON DATE "+d+"-"+m+"-"+y);
  	System.out.println("\n");
	}

}







//MAIN CLASS

public class S {
	String name;
	static Scanner scan = new Scanner(System.in);
	private static Scanner x;
	public static void main(String args[])
	{
		 
  	Scanner s=new Scanner(System.in);           //scanner
  	beds sri=new beds();        //interface
  	testing t=new testing();    //services ->INHERITANCE
  	
  	
  //LOGIN START
  for(;;)
 	 {
  	System.out.println("******************************Welcome to Covid Aider*********************************************\n");
 	    System.out.print("Do you want to register(y/n): ");
 		String d = scan.next();
 		if(d.contentEquals("y") || d.contentEquals("Y"))
 		{
 			System.out.print("Enter number of people to be registered: ");
 	        int n = scan.nextInt();
 	        String[] s1 = new String[n];
 	        String[] pass = new String[n];
 	        for (int i=0; i<n ;i++){
 	        	System.out.println();
 	            System.out.println(i+1+") Registration");
 		        System.out.print("Enter First Name: ");
 		        String FN = scan.next();
 		        System.out.print("Enter Last Name: ");
 		        String LN = scan.next();
              System.out.print("Enter Username: ");
 	            s1[i] = scan.next();
 	            System.out.print("Password: ");
 	            pass[i] = scan.next();
 	            for (int j=0;j<n;j++){
 	            	try{
 	            		FileWriter myWriter = new FileWriter("Database.txt",true);
 		                myWriter.write(s1[j]+","+pass[j]+"\n");
 		                myWriter.flush();
 		                myWriter.close();
 		                }
 	            	
 		
 	           catch(IOException e){
 	        	   System.out.println("Error catched during filewriter");
                 e.printStackTrace(); 
                 }
            }
 	   }
 	        try {
 	        Thread.sleep(1000);
         	System.out.print("\nRegistration Sucessfull !");
 	        }
 	        catch(Exception e) {
 	        	
 	        }
 		}
 		else
 		{
 	    System.out.println();
 	    System.out.println();
 	    boolean found;
 	    System.out.println("**************************************Login Page***************************************************");
 	    System.out.print("Enter Username: ");
 	    String usn = scan.next();
 	
 	    System.out.print("Enter Password: ");
 	    String password = scan.next();
 	
 	    String filepath = "Database.txt";
 	    login(usn,password,filepath);  //login method call
 	   
 	    break;
 		}
 	 }//LOGIN END
  	
      //SERVICES
  	for(;;) {
  	System.out.println("---------------------------------------------------");
  	System.out.println("We can provide you services like: ");    
  	System.out.println("1.BOOK OXYGEN CYLINDER\n"
  			         + "2.BOOK A BED\n"
  			         + "3.MAKE A APPOINTMENT WITH DOCTOR\n"
  			         + "4.SCHEDULE AN COVID TEST\n"
  			         + "5.SOP's\n"
  			         + "6.EXIT\n"
  			         + "7.KNOW INFO ABOUT DIFFERNT CITIES\\n");
  	
		System.out.println("---------------------------------------------------");
      System.out.println("enter your choice");
      int c=s.nextInt();
      //FIRST SWITCH
      switch(c) {
      case 1:t.oxygen();
		break;

      case 2:t.BED();
		break;

      case 3:t.appoin();
		break;

      case 4:t.test();
		break;
		
      case 5:
      	System.out.println("\n");
  		System.out.println("SOP's to be followed are: ");
  		System.out.println("Individal must maintain minimum distance of 6 feet");
  		System.out.println("Use face covers/masks all the times");
  		System.out.println("Practice frequent hand washing with soap");
  		System.out.println("Follow repiratory etiquettes");
  		System.out.println("Self-monitoring of health must be done");
  		System.out.println("Spitting anywhere is prohibited");
  		System.out.println("Download Aarogya Setu app for more INFO");
  		System.out.println("ALL THE SOP's MUST BE FOLLOWED STRICTLY OTHERWISE STRICT LEGAL ACTIONS WIL BE TAKEN");
  		System.out.println("\n");
  		break;
  		
  	case 6:
  		int i=0;
  		System.exit(i);
  		break;

      case 7:{
	    //CASE 5 STATEMENTS
      //SECOND SWITCH
      for(;;) {
  	System.out.println("Select the city of which you want to know information about");
  	System.out.println("\n");

  	System.out.println("1.mumbai\n2.mangalore\n3.bengaluru\n4.delhi\n5.hyderabad\n6.kolkata");
  	System.out.println("\n");

  	System.out.println("enter the serial code");
  	int b=s.nextInt();
  	switch(b){
  	case 1:
  		System.out.println("MUMBAI HAS "+30000+" ACTIVE CASES");
  		sri.bed1();
      	System.out.println("\n");
  		break;
  	case 2:
  		System.out.println("MANGALORE HAS "+280+" ACTIVE CASES");
  		sri.bed2();
      	System.out.println("\n");
  		break;
  	case 3:
  		System.out.println("BENGALURU HAS "+2500+" ACTIVE CASES");
  		sri.bed3();
      	System.out.println("\n");
  		break;
  	case 4:
  		System.out.println("DELHI HAS "+29500+" ACTIVE CASES");
  	    sri.bed4();
      	System.out.println("\n");
  		break;
  	case 5:
  		System.out.println("HYDERABAD HAS "+20000+" ACTIVE CASES");
  		sri.bed5();
      	System.out.println("\n");
  		break;
  	case 6:
  		System.out.println("KOLKATA HAS "+3000+" ACTIVE CASES");
  		sri.bed6();
      	System.out.println("\n");
  		break;

  	}//second switch
  	break;   //CASE 5 BREAK STATEMENT
       }//second for loop
      }//case 5 close

  	

    }//first switch
  }//first for loop
}//public main 
//main class

	
	
//LOGIN method
public static void login(String usn,String password,String filepath)
	{
		boolean found = false;
		String tempusn = "";
		String temppassword = "";
		
		try
		{
			Scanner x = new Scanner(new File(filepath));
			x.useDelimiter("[,\n]");
			
			while(x.hasNext() && !found)
			{
				tempusn = x.next();
				temppassword = x.next();
				
				if(tempusn.trim().equals(usn.trim()) && temppassword.trim().equals(password.trim()))
				{
					found = true;
				}
			}
			x.close();
			if(found==(true))
			{  System.out.println();
		       System.out.println("Login Sucessful");
			}
			else
			{    System.out.println();
				 System.out.println("Invalid Username or Password");
				 System.exit(0);
			}
			
		}

		catch(Exception e)
		{
			System.out.print("Error");
		}
		
	}	


}

