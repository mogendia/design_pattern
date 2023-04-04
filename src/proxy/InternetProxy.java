package proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements ISP{
    private final List<String>blockedWebSite= Arrays.asList("Facebook","Twitter");
    @Override
    public String serveSite(String url) {
        internetLog(url);
        if(blockedWebSite.contains(url))
        {
            return "Its Blocked";
        }
            return new Vodafone().serveSite(url);
    }

    private void internetLog(String url) {
        System.out.printf("[%d] -> %s requested \n",System.currentTimeMillis(),url);
    }
}
