package Calculator;
/*
 * @author : Rishitha
 * */
public class Calculator {
	/*
	 * @param var1 indicates operand1
	 * @param var2 indicates operand2
	 * var1,var2 are used to perform addition
	 * */
	public int add(int var1,int var2) {
		return var1 + var2;
	}
	/*
	 * @param var1 indicates operand1
	 * @param var2 indicates operand2
	 * var1,var2 are used to perform subtraction
	 * */
	public int sub(int var1,int var2) {
		return var1 - var2;
	}
	/*
	 * @param var1 indicates operand1
	 * @param var2 indicates operand2
	 * var1,var2 are used to perform multiplication
	 * */
	public int multiplication(int var1,int var2) {
		return var1 * var2;
	}
	/*
	 * @param var1 indicates operand1
	 * @param var2 indicates operand2
	 * var1,var2 are used to perform division
	 * */
	public int division(int var1,int var2) {
		if(var2 > 0) return var1/var2;
		return 0;
	}
}
