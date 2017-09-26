/**
 * Created by roman.pipchenko on 9/13/2017.
 */
public class Result {
    private int cows = 0;
    private int bulls = 0;
    private String messageForUser;


    public String getMessageForUser() {
        return messageForUser;
    }

    public void setMessageForUser(String messageForUser) {
        this.messageForUser = messageForUser;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getBulls() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls = bulls;
    }
}
