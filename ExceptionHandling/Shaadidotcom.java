package ExceptionHandling;

public class Shaadidotcom {
	static void submit() throws MarriageException {
		int age = 21;
		if (age >= 21) {
			System.out.println("Happy life");
		} else {
			throw new MarriageException("Invalid age");
		}
	}

	public static void main(String[] args) {
		System.out.println("ms");
		try {
			submit();
		} catch (MarriageException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("me");
	}
}

class MarriageException extends Exception {
	String mes;

	MarriageException(String mes){
		this.mes=mes;
	}

	public String getMessage() {
		return mes;
	}
}
