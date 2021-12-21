public class HanExc {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c;
        int myArr[] = new int[3];

        try{
            
            c = b/a;
            System.out.println("Array Element: " + myArr[4]);
        }
        catch(ArithmeticException e){
            System.out.println("Can't Divide By Zero");
            c = 0;
            System.out.println("Value of C is: " + c);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Size Is Less, Exception Is Handled.");
        }
        finally{
            System.out.println("All Exceptions Are Handled.");
        }
    }
}
