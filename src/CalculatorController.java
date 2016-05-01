import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	private CalculatorModel theModel;
	private CalculatorView theView;
	
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.theModel = model;
		this.theView = view;
		
		this.theView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int firstNumber,secondNumber = 0;
			
			try{
				firstNumber = theView.getFisrtNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			}
			catch(NumberFormatException exception){
				theView.displayMessage("You need to enter two integers.");
			}
			
		}
		
	}

}
