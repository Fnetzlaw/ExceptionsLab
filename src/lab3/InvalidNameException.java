/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class InvalidNameException extends IllegalArgumentException{
    
    private static String message = "Must enter a First Name.";
    
    public InvalidNameException() {
    }

    public InvalidNameException(String message) {
        super(message);
    }

    public InvalidNameException(String message, Throwable t) {
        super(message, t);
    }

    public InvalidNameException(Throwable t) {
        super(t);
    }

    @Override
    public String getMessage() {
        return message;
    }

}
