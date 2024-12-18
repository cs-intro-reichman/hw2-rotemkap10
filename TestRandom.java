// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int testRun = Integer.parseInt(args[0]);
		int i = 0;
		double numberOfS = 0;
		double numberOfb = 0;
		double ratio = 0;
		while(i<testRun)
		{
			if(Math.random()>0.5)
			{
				numberOfb++;
			}
			else
			{
				numberOfS++;
			}
			i++;
		if(numberOfS>numberOfb)
		{
			 ratio = numberOfb/numberOfS;
		}
		else
		{
			  ratio = numberOfS/numberOfb;
		}
		}
		
		if(numberOfS == 0|| numberOfb == 0)
			{
				System.out.println("> 0.5:   " + (int)(numberOfS) + " " + "times");
				System.out.println("<= 0.5:  " + (int)(numberOfb)+ " " + "times");
			}
		else
			{
				System.out.println("> 0.5:   " + (int)numberOfS + " " + "times");
				System.out.println("<= 0.5:  " + (int)numberOfb + " " + "times");
				System.out.println("Ratio:   " + ratio);
			}
		
	}
}
