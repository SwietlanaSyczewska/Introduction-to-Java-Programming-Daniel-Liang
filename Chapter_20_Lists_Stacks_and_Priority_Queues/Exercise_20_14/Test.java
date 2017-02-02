package Exercise_20_14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public abstract class Test {

	public static void main(String[] args) {
		System.out.print("Enter expression: ");
		Scanner input = new Scanner(System.in);
		String[] expression = removeEmptyElements(insertEmptySpaces(input.nextLine()).split(" "));
		System.out.println(evaluateExpression(expression));
		input.close();

	}

	private static int evaluateExpression(String[] expression) {
		Stack stack = new Stack();
		int result = 0;
		for (int i = 0; i < expression.length; i++) {
			if (!isOperator(expression[i])) {
				stack.push(expression[i]);
			} else {
				int microresult = process((String) stack.pop(), (String) stack.pop(), expression[i]);
				stack.push(String.valueOf(microresult));
			}

		}

		return result = Integer.valueOf((String) stack.pop());
	}

	private static int process(String operand1, String operand2, String operator) {
		int result = 0;
		switch (operator) {
		case "+":
			result = Integer.valueOf(operand1) + Integer.valueOf(operand2);
			break;
		case "-":
			result = Integer.valueOf(operand1) - Integer.valueOf(operand2);
			break;
		case "/":
			result = Integer.valueOf(operand1) / Integer.valueOf(operand2);
			break;
		case "*":
			result = Integer.valueOf(operand1) * Integer.valueOf(operand2);
			break;
		}

		return result;
	}

	public static String insertEmptySpaces(String expr) {
		String str = "";
		for (int i = 0; i < expr.length(); i++) {
			if (isOperator(expr.charAt(i))) {
				str += " " + expr.charAt(i) + " ";
			} else {
				str += expr.charAt(i);
			}
		}
		return str;
	}

	private static boolean isOperator(char sign) {
		if (sign == '+' || sign == '-' || sign == '/' || sign == '*') {
			return true;
		} else
			return false;
	}

	private static boolean isOperator(String sign) {
		if (sign.equals("+") || sign.equals("-") || sign.equals("/") || sign.equals("*")) {
			return true;
		} else
			return false;
	}

	public static String[] removeEmptyElements(String[] array1) {
		int arrayLength = 0;
		for (String s : array1) {
			if (!s.equals("")) {
				arrayLength++;
			}
		}
		String[] array2 = new String[arrayLength];
		int index = 0;
		for (String s : array1) {
			if (!s.equals("")) {
				array2[index++] = s;
			}
		}
		return array2;
	}

}
