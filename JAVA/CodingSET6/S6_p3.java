
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Before sleep "+(i+1));
          System.out.println("Thread Name :"+Thread.currentThread().getName()+(i+1)); 
           try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){System.out.println("Thread interrupted");}
        System.out.println("After sleep" +(i+1));
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}

