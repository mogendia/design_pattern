package proxy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>sites= Arrays.asList("youtube","speak2geek","Facebook","Twitter");
        ISP isp=new InternetProxy();
        for (String site:sites){
            System.out.println(isp.serveSite(site));
        }
    }
}
