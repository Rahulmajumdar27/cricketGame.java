import java.util.*;
import java.util.Random;
public class Main
{
    public static Scanner inp = new Scanner(System.in);
    public static int run(){
    Random random = new Random();
	int num = random.nextInt(7);
	return num;
    }
    public static void space(){
        System.out.print("  ");
	for(int i =0;i<=20;i++){
	    System.out.print("=");
	}
    }
    public static void ui(){
        space();
	  System.out.println();
	  System.out.println("      WELCOME BACK :)");
	  space();
	  System.out.println();
	  System.out.println("     *PLAY cRiCKeT*");
	  System.out.println("  *********************");
	  System.out.print("    Press 1 to Play: ");
    }
	public static void main(String[] args) {
	  ui();  
	  int aus = inp.nextInt();
	  if(aus == 1){
	      System.out.print("\033[H\033[2J");
	      int runs = 0;
	      runs=run();
	      System.out.println("");
	  }
	  else{
	      System.out.print("\033[H\033[2J");
	      System.out.println("Invaide!!!");
	  }
	}
}
