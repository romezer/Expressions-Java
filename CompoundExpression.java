
public abstract class CompoundExpression extends Expression  {
	private Expression firstExpression;
	private Expression secondExpression;
	
	public CompoundExpression(Expression fisrtExpression , Expression secondExpression){
		this.firstExpression = fisrtExpression;
		this.secondExpression = secondExpression;
	}
	
	// get methods
	public Expression getFirstExpression(){
		return firstExpression;
	}
	
	public Expression getSecondExpression(){
		return secondExpression;
	}

}
