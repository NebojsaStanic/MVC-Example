
public class MVCCalculator {

	public static void main(String[] args) {
		
		CalculatorView view = new CalculatorView();
		
		CalculatorModel model = new CalculatorModel();
		
		CalculatorController controller = new CalculatorController(model, view);
		
		view.setVisible(true);

	}

}
