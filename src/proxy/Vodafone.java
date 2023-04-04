package proxy;

public class Vodafone implements ISP{

    private final int browsingSpeed=10; //نعرف لو ينفع حد يستخدمها من شبكة تانية ولا لا
    @Override
    public String serveSite(String url) {
        return String.format("https://%s.com",url);
    }
    public int getBrowsingSpeed() {
        return browsingSpeed;
    }
}
