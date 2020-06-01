package lab8.increment;

import java.sql.SQLOutput;

public class Interference {
    public static int v = 0;

    public static void main(String[] args) throws Exception{
        System.out.println("before" + v);
        Runnable runnable = new Runnable() {
                public void run(){
                    System.out.println(v);
                    v++;
                    System.out.println(v);
                    v++;
                }
        };

        for (int i=0;i<500;i++){
            (new Thread(runnable)).start();
        }

        Thread.sleep(1000);
        System.out.println("after" + v);


    }
}
