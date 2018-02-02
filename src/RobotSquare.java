/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	Random var = new Random();
   
    	// 1. Make a new Robot
    	
    
Robot square = new Robot();
int gee;
int blu;
int rud;
        // 3. Put the robot's pen down

int tur = 45;



square.penDown();

        // 6. Make the robot move as fast as possible
square.setSpeed(500);

        // 5. Do everything below here 4 times
for(int i = 0; i < 500; i++) {
blu = var.nextInt(256);
gee = var.nextInt(256);
rud = var.nextInt(256);
square.setPenColor(blu,gee,rud);	
        //         2. Move your robot 200 pixels
square.move(100);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
for(int t = 0; t < 8; t++) {
	square.move(100);
square.turn(tur+45);
square.turn(tur+90);
square.turn(tur+135);
}
for(int u = 0; u < 8; u++) {
	square.move(100);
square.turn(tur);
square.turn(tur);
square.turn(tur);
}
}}
}
