import java.util.Random;
import java.util.Scanner;
public class rockpapersicissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 for Rock,1 for Paper,2 for Scissor");
        int userinput=sc.nextInt();

        Random rand=new Random();
        int computerinput=rand.nextInt(3);
        if (computerinput==userinput) {
            System.out.println("draw");
        }
        else if(userinput==0&& computerinput==2||userinput==1&& computerinput==0||userinput==2&& computerinput==1){
            System.out.println("ypu win!");
        }
        else{
            System.out.println("computer win");
    }
    System.out.println("computer choice:" +computerinput);
    }
}

 