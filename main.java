class TBA implements Runnable{
    int avt=5;
    public void run()
    {
        String name=Thread.currentThread().getName();
        synchronized(this){
            System.out.println(name+"you are trying to book ticket for pushpa2");
            if(avt>0)
            {
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e)
                {
                    System.out.println(name+" "+e);
                }
                avt--;
                System.out.println(name+"your ticket is booked for pushpa2");
            }else{
                System.out.println(name+"sorry go and ask allu arjun");
            }
        }
    }
}
class main{
    public static void main(String[] args){
        TBA g=new TBA();
        Thread t1=new Thread(g,"amar");
        Thread t2=new Thread(g,"mani");
        Thread t3=new Thread(g,"manikanta");
        Thread t4=new Thread(g,"allu");
        Thread t5=new Thread(g,"neha");
        Thread t6=new Thread(g,"ammu");
        Thread t7=new Thread(g,"priya");
        Thread t8=new Thread(g,"ahalya");
        Thread t9=new Thread(g,"araha");
        Thread t10=new Thread(g,"bindhu");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}