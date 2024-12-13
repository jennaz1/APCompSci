
package pkg;
import java.util.Arrays;


public class CVMath {		
	
	
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int n){
		int x = 0;
		double sum = 0;
		for (int i=1; x<n; i++){
			sum+=i;
			if (Math.sqrt(sum) == (int)(Math.sqrt(sum))){
				System.out.println((int)sum);
				x++;
			}
		}

		
	
	
}
}