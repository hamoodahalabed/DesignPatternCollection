package structural.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider {

    private List<String> blockedSite = Arrays.asList("youtube", "facebook", "instagram");

    @Override
    public String serveSite(String url) {
        internetLog(url);

        if(blockedSite.contains(url))
            return "The website is blocked.";
        return new Zain().serveSite(url);
    }

    private void internetLog(String url) {
        System.out.printf("[%d] -> %s requested \n", System.currentTimeMillis(), url);
    }
}
