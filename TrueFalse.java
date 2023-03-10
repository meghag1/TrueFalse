
//Megha Gaitoncde




package gettingstarted;
import java.util.Scanner;
import com.phidget22.*;

public class TrueFalse {

public static void main(String[] args) throws Exception  {
	
	int count1=0;
	int count2=0;
	
	 //Create | Cre ate objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

	
	System.out.println("Hello. We will now ask you true and false questions about recursion. If you believe that the answer is true, please click the green button. If you think the answer is false, please click the red button. A red light flashing signifies you chose the wrong answer but a green one means you got it correct.");
	System.out.println("1st question: Recursion can be used when writing a binary search method."); 
	
	while(true){
 // detect which button is being pressed
            if( redButton.getState()){
                redLED.setState(true);
                System.out.print("count1++");
                Thread.sleep(150);
                count1++;
                redLED.setState(false);
                greenLED.setState(false);
            } 


            else if(greenButton.getState()){
                greenLED.setState(true);
                System.out.print("count2++");
                Thread.sleep(150);
                count2++;
                redLED.setState(false);
                greenLED.setState(false);
            } 

            Thread.sleep(150);
 /*
	if (count1==1) { // if its the wrong answer then display red
		 //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets 
        for(int i=0; i<5; i++) {
            redLED.setState(true);
            Thread.sleep(1000);
            redLED.setState(false);
            Thread.sleep(1000);
          }//close for
	  }//close if
	  
	  else if (count2==1) { // if right answer display green
		  
        //Address 
        greenLED.setHubPort(1);
        greenLED.setIsHubPortDevice(true);

        //Open 
        greenLED.open(1000);

        //Use your Phidgets 
        for(int i=0; i<5; i++){
            greenLED.setState(true);
            Thread.sleep(1000);
            greenLED.setState(false);
            Thread.sleep(1000);
        }//close for
      }//close else if
       
      greenLED.setState(false);
      redLED.setState(false); */
  }
	
}


}
