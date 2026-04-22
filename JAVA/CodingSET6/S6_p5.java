
class MyThread extends Thread{
    MyThread(String n){
        super(n);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread Name :"+Thread.currentThread().getName()+(i+1));
            try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){System.out.println("Thread interrupted");}
        }
    }
    
}

class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("MIN_Priority Thread");
        MyThread t2 = new MyThread("NORMAL_Priority Thread");
        MyThread t3 = new MyThread("MAX_Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        
    }
}

