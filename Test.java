import java.util.ArrayList;
public class Test {
	private static ArrayList<Expression> expressionList;
	public static void main(String[] args) {
		//creating expressions and adding to the array list
		expressionList = new ArrayList<Expression>();
		Expression a1 = new AtomicExpression(5);
		expressionList.add(a1);
		Expression a2 =new AtomicExpression(3);
		expressionList.add(a2);
		Expression a3 = new AtomicExpression(2);
		expressionList.add(a3);
		Expression c = new AdditionExpression(a1,a2);
		expressionList.add(c);
		Expression d = new SubtractionExpression(a1, a2);
		expressionList.add(d);
		Expression e = new AdditionExpression(a1,c);
		expressionList.add(e);
		Expression f = new SubtractionExpression(c,d);
		expressionList.add(f);
		
		for(int i = 0 ; i < expressionList.size() ; i ++){
			System.out.println(expressionList.get(i));
			System.out.println("Calculation: " + expressionList.get(i).calculate());
		}
		
		// find and print equals expressions
		for(int i = 0 ; i < expressionList.size() ; i ++){
			for(int j =0 ; j< expressionList.size(); j ++){
				if(i != j  && i < j){
				Boolean equals = 	expressionList.get(i).equals(expressionList.get(j));
				if(equals){
					System.out.println("Equales of Expression " + expressionList.get(i) + " and " + expressionList.get(j));
				}
						
					
				}
			}
		}

	}

}
