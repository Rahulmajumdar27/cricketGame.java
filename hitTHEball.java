import java.util.*;
import java.util.Random;
public class Main
{
  public static Random random = new Random ();
  public static Scanner inp = new Scanner (System.in);
  public static void space ()
  {
    System.out.print ("  ");
    for (int i = 0; i <= 20; i++)
      {
	System.out.print ("=");
      }
  }
  public static void ui ()
  {
    space ();
    System.out.println ();
    System.out.println ("      WELCOME BACK :)");
    space ();
    System.out.println ();
    System.out.println ("     *PLAY cRiCKeT*");
    System.out.println ("  *********************");
    System.out.print ("    Press 1 to Play: ");
  }

  public static void bat (int target, int wicket, int overs)
  {
      System.out.print ("\033[H\033[2J");
      System.out.println("YOUR TARGET IS "+target+" AND YOU HAVE "+wicket);
      int totalrun=0;
      overs=overs*6;
      while(overs!=0){
          int run=random.nextInt(8);
          
          System.out.print("BOLWER DELIVER THE BALL (ANY NUMBER KEY)FOR HIT : ");
          int hit=inp.nextInt();
          System.out.print ("\033[H\033[2J");
          overs--;
          if(run==1){totalrun=totalrun+1;System.out.println("ITS A ONLY A SINGLE (1)");}
          else if(run==2){totalrun=totalrun+2;System.out.println("GOOD RUNING BETWEEN BY THE BATSMEN (2)");}
          else if(run==3){totalrun=totalrun+3;System.out.println("BATSMEN HIT IN GAP AND ITS THREE RUNS (3)");}
          else if(run==4){totalrun=totalrun+4;System.out.println("WHAT A CLASS FORM THE BATSMEN FOUR RUNS (4)");}
          else if(run==5){totalrun=totalrun+1;System.out.println("BAD BALL FORM BOLWER WIDE BALL (1)");}
          else if(run==6){totalrun=totalrun+6;System.out.println("WOW PERFECT SHOT WITH FULL POWER SIX!! (6)");}
          else if(run==0){wicket=wicket-1;System.out.println("VERY GOOD BALL BY BOLWER AND WICKET DOWN (WICKET)");}
          else if(run==7){totalrun=totalrun+0;System.out.println("GOOD FIELDING BY THE FILDER DOT BALL (0)");}
          System.out.println(totalrun);
      }
  }


  public static void main (String[]args)
  {
    ui ();
    int aus = inp.nextInt ();
    if (aus == 1)
      {
	System.out.print ("\033[H\033[2J");
	int target, wicket, overs;
	target = random.nextInt (240) + 100;
	System.out.print ("Enter The Wickets : ");
	wicket = inp.nextInt ();
	System.out.print ("Enter The Overs : ");
	overs = inp.nextInt ();
    bat(target, wicket, overs);
      }
    else
      {
	System.out.print ("\033[H\033[2J");
	System.out.println ("Wrong Input :(");
      }
  }
}
