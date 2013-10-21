package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;
    private static final String ERR_MSG = "Invaild name";

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() throws Exception {


        String fullName = JOptionPane.showInputDialog(ERR_MSG);
        String lastName = "";
        try {
            lastName = nameService.extractLastName(fullName);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            startConversation();
            return;
        }

        String msg = "Your last name is: " + lastName;

    }
}
