package AllTests;

public class uncheckedExceptions {
    @SuppressWarnings("null")
	public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // Throws NullPointerException
    }
}

