import java.awt.*;
import BreezyGUI.*;

public class Calculator extends GBFrame 
{
	private Label numeratorOneLabel;
	private Label denominatorOneLabel;
	private Label numeratorTwoLabel;
	private Label denominatorTwoLabel;
	
	private IntegerField numeratorOneField;
	private IntegerField denominatorOneField;
	private IntegerField numeratorTwoField;
	private IntegerField denominatorTwoField;
	
	private TextArea outputArea;
	
	private Button additionButton;
	private Button subtractionButton;
	private Button multiplicationButton;
	private Button divisionButton;
	private Button simplifyButton;
	private Button clearButton;
	
	private Fraction answer;

	public Calculator()
	{
		numeratorOneLabel = addLabel("First Numerator",1,1,1,1);
		denominatorOneLabel = addLabel("First Denominator",2,1,1,1);
		numeratorTwoLabel = addLabel("Second Numerator",3,1,1,1);
		denominatorTwoLabel = addLabel("Second Denominator",4,1,1,1);
		
		numeratorOneField = addIntegerField(0,1,2,1,1);
		denominatorOneField = addIntegerField(1,2,2,1,1);
		numeratorTwoField = addIntegerField(0,3,2,1,1);
		denominatorTwoField = addIntegerField(1,4,2,1,1);
		
		outputArea = addTextArea("",5,1,4,4);
		
		additionButton = addButton("+",9,1,1,1);
		subtractionButton = addButton("-",9,2,1,1);
		multiplicationButton = addButton("x",9,3,1,1);
		divisionButton = addButton("/",10,1,1,1);
		simplifyButton = addButton("Simplify",10,2,1,1);
		clearButton = addButton("Clear",10,3,1,1);
		
	}
	
	public void buttonClicked (Button buttonObj) 
	{
		int num1 = numeratorOneField.getNumber();
		int den1 = denominatorOneField.getNumber();
		int num2 = numeratorTwoField.getNumber();
		int den2 = denominatorTwoField.getNumber();
			
		Fraction one = new Fraction(num1, den1);
		Fraction two = new Fraction(num2, den2);
			
		if(buttonObj == additionButton)
		{
			answer = one.add(two);
			outputArea.append(one.toString() +" + " + two.toString() + " = ");
			outputArea.append(answer.toString() + "\n");
		}
		if(buttonObj == subtractionButton)
		{
			answer = one.subtract(two);
			outputArea.append(one.toString() +" - " + two.toString() + " = ");
			outputArea.append(answer.toString() + "\n");
		}	
		if(buttonObj == multiplicationButton)
		{
			answer = one.multiply(two);
			outputArea.append(one.toString() +" * " + two.toString() + " = ");
			outputArea.append(answer.toString() + "\n");
		}	
		if(buttonObj == divisionButton)
		{
			answer = one.divide(two);
			outputArea.append(one.toString() +" Ö " + two.toString() + " = ");
			outputArea.append(answer.toString() + "\n");
		}	
		if(buttonObj == simplifyButton)
		{
			if(answer == null)
			{
				outputArea.append("No fraction to simplify\n");
			}	
			else
			{
				outputArea.append(answer.toString() + " simplified is ");
				answer.simplify();
				outputArea.append(answer.toString() + "\n");
			}
		}
		if(buttonObj == clearButton)
		{
			outputArea.setText("");
			numeratorOneField.setNumber(0);
			numeratorTwoField.setNumber(0);
			denominatorOneField.setNumber(1);
			denominatorTwoField.setNumber(1);
			answer = null;
		}	
	}
		
	
	
	public static void main(String[] args)
	{
		GBFrame frm = new Calculator();
		frm.setSize(500,600);
		frm.setVisible(true);
	}
	
}