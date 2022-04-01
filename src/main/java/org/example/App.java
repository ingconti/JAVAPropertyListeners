package org.example;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Product p = new Product("apple", 1);
        Mailer mailer = new Mailer();
        p.setListener(mailer);

        buidMyTimer(p);
        //was p.setCost(100);
    }

    static double fakeCost = 100;

    static void buidMyTimer(final Product p){

        TimerTask task = new TimerTask() {
            public void run() {
                p.setCost(fakeCost++);
            }
        };
        Timer timer = new Timer("Timer");

        long delay = 1000L;
        timer.scheduleAtFixedRate(task, 0,1000);
    }
}
