package lab8.rabbit;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i%2==0){
                Thread th = new RabbitThread(i);
                th.start();
            }else{
                Thread th = new Thread(new RabbitRunnable(i));
                th.run();
            }
        }
    }
}
