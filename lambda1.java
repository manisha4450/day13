public class lambda1{
    public static void main(String[] args){
        Runnable r=()->System.out.println("i am new from java8 version");
        Thread t=new Thread(r);
        t.start();
        System.out.println(t.isAlive());
    }
}