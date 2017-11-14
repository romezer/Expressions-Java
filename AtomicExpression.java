
public class AtomicExpression extends Expression {
	private double atomicNum;
	
	public AtomicExpression(double num){
		this.atomicNum = num;
	}
	
	// atomic expression calculate function
	public double calculate(){
		return atomicNum;
	}
	
	//override toString
	public String toString(){
		return atomicNum + "";
	}
	
	

}
