//51. Program to change the host name to ip address.
import java.net.InetAddress;
import java.net.UnknownHostException;
public class NetworkingHostName {
    public static void main(String[] args) {
        InetAddress address=null;
        try {
            address = InetAddress.getByName("www.javatutorial.com");
        } catch(UnknownHostException e){
            System.exit(2);
        }
        System.out.println(address.getHostName()+"="+address.getHostAddress());
        System.exit(0);
    }
}
