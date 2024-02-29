package structural.proxy;

public class Zain implements InternetServiceProvider{

    @Override
    public String serveSite(String url) {
        return String.format("https://%s.com", url);
    }

}
