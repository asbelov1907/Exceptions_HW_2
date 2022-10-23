package Task_2;
/* Дан следующий код, исправьте его там, где требуется:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */
public class Program_2 {
    public static void main(String[] args) {
        int[] intArray = new int[] {5,4,6,8,4,9,8,4,5,8,9,4};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching Arithmetic Exception : " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching array index exception: " + e);
        }

    }
}
