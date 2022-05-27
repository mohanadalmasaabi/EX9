public class task2 {
    public static void ErrorChecking(int a, int b){
        int result;
        int Ar[] = new int[5];


        try {

            a = 5;
            b = 0;
            result = a / b;
            Ar[10] = 5;


        } catch (ArithmeticException e) {
            System.out.println("You Shouldn't divide a number by zero; "+e);
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bonds"+e);
        } finally {
            System.out.println("End of our try/catch!");
        }

    }
}
class Tester2 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            Task2.ErrorChecking(5,0);
}
