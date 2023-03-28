package controller;

import java.util.concurrent.Semaphore;

public class ThreadDoor extends Thread{

    private int person;
    private Semaphore door;

    public ThreadDoor (int person, Semaphore door){
        this.person = person;
        this.door = door;
    }

    @Override
    public void run(){
        move();

        try {
            System.out.println("Person" + person + " arrives at the door");
            door.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            door.release();
            personEntered();
        }
    }

    public void move(){

        int distance = 0;
        System.out.println("Person "+ person + " is moving!");

        while(distance < 200){
            distance += (int) (Math.random() * 2) + 4;
            try {
                Thread.sleep(1000); // 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void personEntered(){
        System.out.println("Person "+ person + " entered");
    }

}
