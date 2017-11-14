
public class SubtractionExpression extends CompoundExpression {
	private final String operator;
	
	public SubtractionExpression(Expression fisrtExpression , Expression secondExpression){
		super(fisrtExpression, secondExpression);
		operator = "-";
	}
	
	// calculate function
	public double calculate(){
		Expression firstExpression = getFirstExpression();
		Expression secondExpression = getSecondExpression();
		return firstExpression.calculate() - secondExpression.calculate();
	}
	
	//override toString
	public String toString(){
		Expression firstExpression = getFirstExpression();
		Expression secondExpression = getSecondExpression();
		
		return "(" + firstExpression + " " + operator + " " + secondExpression + ")";
		 
	}
}
