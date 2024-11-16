public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMinutes = Integer.parseInt(args[1]);
        if(hours<10)
        {
            hours = hours%10;
        }
        int totalMinutes = (hours*60) + minutes + addMinutes;
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;
        int newMinutes = totalMinutes - (totalHours*60);
        if(newHours>9)
        {
           if(newMinutes>9)
           {
            System.out.println(newHours + ":" + newMinutes);
           } 
           else
           {
            System.out.println(newHours + ":" + "0" + newMinutes);
           }
          
        }
        else 
        {
            if(newMinutes>9)
           {
            System.out.println("0" +newHours + ":" + newMinutes);
           } 
           else
           {
            System.out.println("0" + newHours + ":" + "0" + newMinutes);
           }
        
        }
        }
        }
    

