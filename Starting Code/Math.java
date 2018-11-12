/**
 * Math utilities
 *
 * @author Mike Mulder
 * @version 1.0
 */
public class Math
{
    // Constants
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";
    private static final String MODULUS = "%";
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final int TRIPLE = 3;
    
    /**
     * Divides x by y.
     * 
     * @param x The x value
     * @param y The y value
     */
    public int divide(int x, int y) {
     
        if (y == 0) {
            System.out.println("ERROR");
            return 0;
        }
        
        return x / y;
    }
    
    /**
     * Get the maximum of x and y.
     * 
     * @param x The x value
     * @param y The y value
     */
    public int max(int x, int y) {
        
        if (x > y) {
            return x;
        }
        
        return y;
    }
    
    /**
     * Remainder of dividing x by y.
     * 
     * @param x The x value
     * @param y The y value
     */
    public int remainder(int x, int y) {
        
        if (y == 0) {
            System.out.println("ERROR");
            return 0;
        }
        
        return x % y;
    }

    /**
     * Gets the value of 3 times x.
     * 
     * @param x The x value
     */
    public int triple(int x) {
        
        return x * TRIPLE;
    }
    
    /**
     * Determines if the operation is valid.
     * 
     * @param opetation The arithmetic operation
     */
    public boolean isValidOperation(String operation) {
        
        boolean isValid = false;
        
        switch (operation) {
        
            case MULTIPLICATION:
            case DIVISION:
            case MODULUS:
            case PLUS:
            case MINUS:
                isValid = true;
                break;
            default:
                isValid = false;
                break;
        }
        
        return isValid;
    }   
}



