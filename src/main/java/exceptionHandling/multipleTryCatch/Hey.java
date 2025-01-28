package exceptionHandling.multipleTryCatch;

public class Hey {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Specific exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("General index exception");
        } catch (Exception e) {
            System.out.println("Generic exception");
        }
    }
}
