package com.at.creatomatejavaexamples;

import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {
  /*
  @Scheduled(fixedDelay = 5000, initialDelay = 1000)
  public void taskA() throws InterruptedException {
    System.out.println("[A] Starting 1 cycle of scheduled task");

    // Simulate an operation that took 5 seconds.
    long startTime = System.currentTimeMillis();
    while (System.currentTimeMillis() - startTime <= 5000);

    System.out.println("[A] Done 1 cycle of scheduled task");
  }

  @Scheduled(fixedDelay = 5000, initialDelay = 2000)
  public void taskB() throws InterruptedException {
    System.out.println("[B] Starting 2 cycle of scheduled task");

    System.out.println("[B] Done 2 cycle of scheduled task");
  }
*/

  @Scheduled(fixedRate = 5000) // Run every 5 seconds
  public void task1() {
    System.out.println("Task 1 executed at: " + new Date());
  }

  @Scheduled(cron = "0 0/2 * * * ?") // Run every 2 minutes
  public void task2() throws InterruptedException {
    System.out.println("Task 2 executed at: " + new Date());
    Thread.sleep(20000);
  }
}
