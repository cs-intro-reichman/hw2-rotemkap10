// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   String name = args[0];
           String upperCase = name.toUpperCase();
           int numberOfTimes = Integer.parseInt(args[1]);
           for(int i = 0; i<name.length(); i++)
           {
                if(upperCase.charAt(i) == 'A' || upperCase.charAt(i) == 'E' || upperCase.charAt(i) == 'f'|| name.charAt(i) == 'H' || upperCase.charAt(i) == 'I' || upperCase.charAt(i) == 'L'||
                upperCase.charAt(i) == 'M' || upperCase.charAt(i) == 'N'|| upperCase.charAt(i) == 'O'|| upperCase.charAt(i) == 'R' || upperCase.charAt(i) == 'S' || upperCase.charAt(i) == 'X'|| upperCase.charAt(i) == 'F')
                {
                        System.out.println("Give me an" + " "  + upperCase.charAt(i) + ":" + " " + upperCase.charAt(i) + "!");
                }
                else
                {
                        System.out.println("Give me a" + " " + " " + upperCase.charAt(i) + ":" + " " + upperCase.charAt(i) + "!");  
                }
           }
           System.out.println("What does that spell?");
           for(int i =0; i<numberOfTimes; i++)
           {
                System.out.println(upperCase + "!!!");
           }


        }
}
