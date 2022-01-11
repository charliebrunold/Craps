/**
 * Write a description of class Die here.
 *
 * @author Charlie Brunold
 * @version 2022-01-11
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        roll = rollDie();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int rollDie()
    {
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
    
    public int getRoll()
    {
        return roll;
    }
}
