// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numberOfTime = Integer.parseInt(args[0]);
		double approximated = 1;
		int j = 3;
		for(int i =1; i<numberOfTime; i++)
		{
			if(i%2 != 0)
			{
				approximated = approximated - (double)1/j;
			}
			else
			{
				approximated = approximated + (double)1/j;
			}
			j = j+2;
		}
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:     " + approximated*4);
		
	}
}
