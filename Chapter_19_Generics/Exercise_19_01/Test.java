package Exercise_19_01;

public class Test {
	public static void main(String[] args) {

		GenericStack<String> stackNamesList = new GenericStack<>();
		stackNamesList.push("Swieta");
		stackNamesList.push("Joanna");
		stackNamesList.push("Marciusz");
		GenericStack<Integer> stackNumbersList = new GenericStack<>();
		for (int i = 0; i < 100; i++) {
			stackNumbersList.push(i + 1);
		}
		System.out.println("Stack Names: ");
		while (!stackNamesList.isEmpty()) {
			System.out.print(stackNamesList.pop() + " ");
		}
		System.out.println("\n");
		System.out.println("Stack Integers: ");
		for (int i = 1; !stackNumbersList.isEmpty(); i++) {
			if (i % 10 == 0) {
				System.out.println(stackNumbersList.pop());
			} else {
				System.out.print(stackNumbersList.pop() + " ");
			}

			System.out.println();
		}

		GenericStack<String> stackNamesArray = new GenericStack<>();
		stackNamesArray.push("Swieta");
		stackNamesArray.push("Joanna");
		stackNamesArray.push("Marciusz");
		GenericStack<Integer> stackNumbersArray = new GenericStack<>();
		for (int i = 0; i < 100; i++) {
			stackNumbersArray.push(i + 1);
		}
		System.out.println("Stack Names: ");
		while (!stackNamesArray.isEmpty()) {
			System.out.print(stackNamesArray.pop() + " ");
		}
		System.out.println("\n");
		System.out.println("Stack Integers: ");
		for (int i = 1; !stackNumbersArray.isEmpty(); i++) {
			if (i % 10 == 0) {
				System.out.println(stackNumbersArray.pop());
			} else {
				System.out.print(stackNumbersArray.pop() + " ");
			}

			System.out.println();
		}

	}

}
