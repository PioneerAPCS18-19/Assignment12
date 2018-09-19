
/**
 * Write a description of class Lottery here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lottery
{
    private int n1, n2, n3, jackpot;
    private int w1, w2, w3;

    /**
     * Constructor
     * 
     * @param 3 ints for the player's three numbers.
     * 
     * jackpot is initialized using the getJackpot method.
     * w1, w2, and w3 are initialized using the generateNum method.
     */
    public Lottery(int n1, int n2, int n3)
    {
        
    }
    
    
    /**
     * checkMatch
     * 
     * @param none
     * @return none
     * 
     * checks the player's numbers against the winning numbers.
     * Calls printResult method and passes corresponding value.
     */
    public void checkMatch()
    {
        

    }
    
    
    /* DO NOT EDIT BELOW THIS LINE */

    /**
     * getJackpot
     * 
     * @param none
     * @return an integer [1000, 9999]
     */
    private int getJackpot()
    {
        return (int) (10000 * Math.random() + 1000);
    }

    /**
     * generateNums
     * 
     * @param none
     * @return an integer [0, 9]
     */
    private int generateNum()
    {
        int n = (int) (10 * Math.random());
        
        while(n == w1 || n == w2)
        {
            n = (int) (10 * Math.random());
        }
        
        return n;
    }

    /**
     * printResult
     * 
     * @param int for result
     * @return none
     * 
     * win = 3 means all three numbers matched.
     * win = 2 means two numbers matched.
     * win = 1 means one number matched.
     * win = 0 means one number matched.
     */
    private void printResult(int win)
    {
        System.out.println("The winning numbers are: " + w1 + ", " + w2 + ", and " + w3);
        
        if(win == 3)
        {
            System.out.println("You win $" + jackpot + "!");
        }

        else if(win == 2)
        {
            System.out.println("You win $" + (jackpot / 2) + "!");
        }

        else if(win == 1)
        {
            System.out.println("You win $1!");
        }

        else 
        {
            System.out.println("You lost!");
        }
    }
}
