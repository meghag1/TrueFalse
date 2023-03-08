import doodlepad.*;
import doodlepad.Text;

public class Quiz {
	private Rectangle quest;
	private Text questT;
	private Rectangle falseB;
	private Text falseT;
	private Rectangle trueB;
	private Text trueT;

//Quiz constructor
	public Quiz() {
		//creates the main rectangle object 
		quest = new Rectangle(150, 60, 300, 80);
		quest.setStrokeWidth(5);
		questT = new Text("Question here", 155, 65, 20);
		
		//creates false button
		falseB = new Rectangle(95, 150, 200, 80);
		falseB.setFillColor(255, 32, 32);
		falseT = new Text ("FALSE", 153, 183, 25);
		
		//creates true button
		trueB = new Rectangle(305, 150, 200, 80);
		trueB.setFillColor(114, 219, 45);
		trueT = new Text ("TRUE", 363, 183, 25);
	}//end constructor

//method to set each question and run code to see if they are right
	public void Answer(String question, boolean answ) {
		questT.setText(question); //changes the question text
		//have it trigger when either button state becomes true
		//check if it is red or green based on true or false boolean input
		//have question text display if it is right or wrong
	}//end Answet
	

	public static void main(String[] args) {
		Quiz myQuiz = new Quiz();
	}//end main
	
}//end Quiz
