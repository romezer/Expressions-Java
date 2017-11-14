
public abstract class Expression {

	public abstract double calculate();
	
	// overrides Object equals
	public boolean equals(Object other){
		if(other instanceof Expression){
			Expression myOther = (Expression)other;
			return this.calculate() == myOther.calculate();
		}
		else{
			return false;
		}
	}
	
	
}
