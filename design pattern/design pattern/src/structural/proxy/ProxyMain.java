package structural.proxy;

import java.util.Arrays;
import java.util.List;

public class ProxyMain {
    public static void main(String[] args) {
        List<String> sites = Arrays.asList("google", "twitter", "youtube", "facebook" ,"instagram");

        InternetServiceProvider isp = new InternetProxy();

        for(String site:sites) {
            System.out.println(isp.serveSite(site));
        }
    }
}
