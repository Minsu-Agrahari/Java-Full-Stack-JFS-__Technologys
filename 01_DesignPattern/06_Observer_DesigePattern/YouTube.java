package DesignPattern.Observer_DesigePattern;

public class YouTube {
    public static void main(String[] args){
        Channel Orez = new Channel();

        Subscriber s1 = new Subscriber("Minsu");
        Subscriber s2 = new Subscriber("Aditi");
        Subscriber s3 = new Subscriber("Subham");
        Subscriber s4 = new Subscriber("Tisha");
        Subscriber s5 = new Subscriber("Rishi");
        
        Orez.Subscribe(s1);
        Orez.Subscribe(s2);
        Orez.Subscribe(s3);
        Orez.Subscribe(s4);
        Orez.Subscribe(s5);

        Orez.unSubscribe(s3);
        
        s1.subscribeChannel(Orez);
        s2.subscribeChannel(Orez);
        s3.subscribeChannel(Orez);
        s4.subscribeChannel(Orez);
        s5.subscribeChannel(Orez);

        Orez.upload("How to learn Design Pattern");
    }
}
