package Assignment7;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class File_1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		  File obj=new File("C:\\Users\\Anudip\\eclipse-workspace\\java.project\\src\\jpg\\suraj.txt");
		    
		     Scanner sc=new Scanner(obj);
		     String st="";
		     String s=sc.nextLine();
		     for(int i=0;i<s.length();i++)
		     {
		    	 if(s.charAt(i)!=' ') 
		    	 {
		    		 st+=s.charAt(i);
		    	 }
		    	 else
		    	 {
		    		if(st.length()>5)
		    			System.out.println(st+" ");
		    		st=" "; 
		    	 }
		     }
		     sc.close();
	}

}
