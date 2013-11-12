package motd.service;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bearsoftware
 * Date: 21/06/2013
 * Time: 14:42
 * To change this template use File | Settings | File Templates.
 */
public class MessageOfTheDayServiceImpl implements MessageOfTheDayService {

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;


    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    private List<String> messages;

    public String sayHello() {

        int day = new GregorianCalendar().get(Calendar.DAY_OF_WEEK);

        // days are 1 based in Java!
        String message = messages.get(day-1);

        return message;
    }
}
