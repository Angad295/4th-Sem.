
class MyRunnable implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread Name :"+Thread.currentThread().getName()+(i+1));
             try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){}
        }
       
    }
}


class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread Name :"+Thread.currentThread().getName()+(i+1));
            try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){}
        }
        
    }
}

class Main {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        MyThread t1 = new MyThread();
        t.start();
        t1.start();
    }
}

