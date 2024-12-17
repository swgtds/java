public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;  // Arithmetic Exception
            } catch (ArithmeticException e) {
                System.out.println("Caught Arithmetic Exception: " + e);
            }
            String str = null;
            System.out.println(str.length());  // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointer Exception: " + e);
        }
    }
}
