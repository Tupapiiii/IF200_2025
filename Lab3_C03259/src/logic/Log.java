
package logic;
import java.util.Date;
/**
 *
 * @author alvin
 */
public class Log { //Bitácoras
    private static int counter = 1;
    private int idEvent;
    private String event;
    private Date date;
    private Account account;

    public Log(String event, Account account) {
        this.idEvent = counter++;
        this.event = event;
        this.date = new Date();
        this.account = account;
    }

    @Override
    public String toString() {
        return "\nLog Entry"
                + "\n--------------------"
                + "\nEvent ID: " + idEvent
                + "\nEvent: " + event
                + "\nDate: " + date
                + "\nAccount Affected: " + account.getNumber();
    }
    
    
    
    
}
