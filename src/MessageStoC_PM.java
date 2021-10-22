public class MessageStoC_PM extends Message{
    public String userName;
    public String msg;

    public MessageStoC_PM(String userName, String msg){
        this.userName = userName;
        this.msg = msg;
    }

    public String toString(){
        return "Private Chat Message from " + userName + ": " + msg;
    }

}
