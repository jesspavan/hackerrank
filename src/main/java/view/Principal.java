package view;

import controller.ThreadDoor;

import java.util.concurrent.Semaphore;

public class Principal {

    public static void main(String[] args){

        int permissions = 1;
        Semaphore door = new Semaphore(permissions);

        for (int person = 1; person <= 4; person++){
            Thread threadDoor = new ThreadDoor(person, door);
            threadDoor.start();
        }
    }
}
