public class print {
    public static void main(String[] args) {
        MessagePrinter m = new MessagePrinter();
        m.printMessage("Hello");
        m.printMessage("Hello",5);
        m.printMessage("Ajay", "hello");
    }
}
class MessagePrinter{
    public void printMessage(String message){
        System.out.println(message);
    } 
    public void printMessage(String message,int n) {
        for(int i=1;i<=n;i++){
            System.out.println(message);
        }
    }
    public void printMessage(String message, String prefix){
        System.out.println(prefix+" "+message);
    }
}
