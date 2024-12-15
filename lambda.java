public class lambda{
    public static void main(String[] args){
        Runnable r=()->System.out.println("i am new from java8 version");
        Thread t=new Thread(r);
        t.start();
    }
}