package Assignment6;
import java.util.HashMap;
public class HashMap_Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  HashMap<Integer,Integer> Sc =new HashMap<>();
		for (int i=1;i<=15;i++)
		{
			int SQU = i*i;
			Sc.put(i, SQU);
		}

		System.out.println(Sc); 	

	}
}
