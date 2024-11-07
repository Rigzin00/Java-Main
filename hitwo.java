class Mythread extends Thread{
  public void run(){
    System.out.println("Current thread name : " +Thread.currentThread().getName());
  }
}


class threadone extends Thread{
  synchronized public void run(){
    for (int i = 0; i < 5; i++) {
        
      System.out.println("current thread 1 " + (i*-1));
    }
  }
}

class threadtwo extends Thread{
  synchronized public void run(){
    for (int i = 0; i < 5; i++) {
        
      System.out.println("current thread 2 " + (i*2));
    }
  }
}

class threadthree extends Thread{
  synchronized public void run(){
    for (int i = 0; i < 5; i++) {
        
      System.out.println("current thread 3 " + ((i*2)-1));
    }
  }
}


public class hitwo {
  public static void main(String[] args) {
    Mythread t = new Mythread();
    t.start();
    t.run();
    synchronized(){

      threadone t1 = new threadone();
      t1.start();
      threadtwo ts = new threadtwo();
      ts.start();
      threadthree re = new threadthree();
      re.start();
    }
  }
}
