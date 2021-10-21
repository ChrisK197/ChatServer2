public class MessageCtoS_PM extends Message{
    public String recipientUserName;
    public String msg;

    public MessageCtoS_PM(String recipient, String msg) {
        this.recipientUserName = recipient;
        this.msg = msg;

    }

}
