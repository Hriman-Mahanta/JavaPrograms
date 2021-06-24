//54. Program to get parts of a URL.
import java.net.URL;

public class NetworkingURL {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.google.com");
        System.out.println("URL is " + url.toString());
        System.out.println("protocol is " + url.getProtocol());
        System.out.println("file name is " + url.getFile());
        System.out.println("host is " + url.getHost());
        System.out.println("path is " + url.getPath());
        System.out.println("port is " + url.getPort());
        System.out.println("default port is " + url.getDefaultPort());
    }
}