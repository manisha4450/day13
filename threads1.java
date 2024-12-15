class a extends Thread{
    public void r()
    {
        System.out.println("hello i'm thread");
    }
}
public class threads1{
    public static void main(String[] args){
        a r=new a();
        Thread s=new Thread(r);
        s.start();
        s.run();
    }
}