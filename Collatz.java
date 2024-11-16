// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		int d = n;
		String mode1 = "v";
		String mode2 = "c";
		String mode = args[1];
		if(mode2.equals(mode))
				{
					System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
					return;
				}
		if(d ==1)
		{
			System.out.println("1 4 2 1 (4)");
			System.out.println("Every one of the first 1 hailstone sequences reached 1.");
			return;
		}
		else
		{
			
			System.out.println("1 4 2 1 (4)");
			for(int i =2; i<n+1; i++)
			{
				
				int k = i;
				int numberOfTimes = 1;
				System.out.print(k + " ");
				if(mode2.equals(mode))
				{

				}
				while(k!=1)
				{
					if(k%2==0)
					{
						k = k/2;
					}
					else
					{
						k = (k*3) + 1;
					}
					if(k!=1)
					{
						System.out.print(k + " ");
					}
					else
					{
						System.out.print(k);
					}
					numberOfTimes++;
				
			}
			System.out.println( " " + "(" +  +numberOfTimes + ")");
		}
		}
		System.out.println("Every one of the first" + " " + n + " " + "hailstone sequences reached 1.");
		
		
}
}

		
		

	
		
			
			
			
			
		
		
		
		
		
	

