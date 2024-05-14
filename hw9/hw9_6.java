package hw9;

import java.util.Scanner;

public class hw9_6 {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        Scanner sc=new Scanner(System.in);
        while(true){
            if (sc.nextInt()==1){
                break;
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
class StopWatch{
    long startTime;
    long stopTime;
    long elapsedTime;
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        stopTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return stopTime - startTime;
    }

}
