// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   String name = args[0];
           int numberOfTimes = Integer.parseInt(args[1]);
           for(int i = 0; i<name.length(); i++)
           {
                if(name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'f'|| name.charAt(i) == 'H' || name.charAt(i) == 'I' || name.charAt(i) == 'L'||
                name.charAt(i) == 'M' || name.charAt(i) == 'N'|| name.charAt(i) == 'O'|| name.charAt(i) == 'R' || name.charAt(i) == 'S' || name.charAt(i) == 'X')
                {
                        System.out.println("Give me an" + " "  + name.charAt(i) + ":" + " " + name.charAt(i) + "!");
                }
                else
                {
                        System.out.println("Give me a" + " " + " " + name.charAt(i) + ":" + " " + name.charAt(i) + "!");  
                }
           }
           System.out.println("What does that spell?");
           for(int i =0; i<numberOfTimes; i++)
           {
                System.out.println(args[0] + "! ! !");
           }


        }
}
