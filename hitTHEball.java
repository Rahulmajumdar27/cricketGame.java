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

  }

  public static void play (int target, int wicket, int overs)
  {
    System.out.print ("\033[H\033[2J");
    System.out.println ("Your Target Is " + target + " and Your Have " +
			wicket + " Wickets" + " and " + overs +
			" Overs lefts");
    System.out.
      println ("------LESS PADUP AND READY FOR BATTING AND ENTER 1------");
    int hit = inp.nextInt ();
    overs = overs * 6;
    if (hit == 1)
      {
	System.out.print ("\033[H\033[2J");
	System.out.print ("BOLWER DELIVER THE BALL (0)HIT : ");
	int dev = inp.nextInt ();
	int run = random.nextInt (7);
	int runs =0;
	if (run == 0)
	  {
	    System.out.println ("Ooo No Its Out (0)");
	    wicket = wicket - 1;
	    System.out.println("Runs = "+runs+"Wickets = "+wicket);
	  }
	else if (run == 1)
	  {
	    System.out.println ("Its A Single : One Run(1)");
	    runs = runs + 1;
	    System.out.println("Runs = "+runs+"Wickets = "+wicket);
	  }
	else if (run == 2)
	  {
	      runs = runs + 2; 
	    System.out.println ("Good Runing Between (2)");
	    System.out.println("Runs = "+runs+"Wickets = "+wicket);
	  }
	else if (run == 3)
	  {
	      runs = runs + 3;
	    System.out.println ("Wow its Three Run Add To Total");
	    System.out.println("Runs = "+runs+"Wickets = "+wicket);
	  }
	else if (run == 4)
	  {
	      runs = runs + 4;
	    System.out.println ("Class Of Batsman Its a Four (4)");
	    System.out.println("Runs = "+runs+" Wickets lefts = "+wicket);
	  }
	else if (run == 5)
	  {
	     runs = runs + 1;
	    System.out.println ("No No.... Wide Bad Ball (1)");
	    System.out.println("Runs = "+runs+"Wickets = "+wicket);
	  }
	else if (run == 6)
	  {
	      runs = runs + 6;
	    System.out.println ("Its A Big One What A Shot SIX!! (6)");
	    System.out.println("Runs = "+runs+"Wickets = "+wicket);
	  }
      }
    else
      {
	System.out.println ("WRONG INPUT :(");
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
	play (target, wicket, overs);
      }
    else
      {
	System.out.print ("\033[H\033[2J");
	System.out.println ("Wrong Input :(");
      }
  }
}
