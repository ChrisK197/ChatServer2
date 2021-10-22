public class MessageStoC_PM_Error extends Message{
    public String name;

    public MessageStoC_PM_Error(String name) {
        this.name = name;
    }

    public String toString() {
        return "There is no such user of name: " + name;
    }
}
