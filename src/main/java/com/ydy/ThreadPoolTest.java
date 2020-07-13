package com.ydy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPoolTest {

    private static volatile int i = 1000;

    private static  int j = 1;

    public static void main(String[] args) throws Error {
        //创建线程池
        ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

        final ReentrantLock lock = new ReentrantLock();

        while (j != 100){
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    if(j < 100)
                        System.out.println(j++);
                }
            });
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pool.shutdown();
        System.out.println("-----------------");
        System.out.println(j);

    }
}
