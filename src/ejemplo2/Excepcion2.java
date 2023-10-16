package ejemplo2;

public class Excepcion2 {
    public static void main (String[] args) {
        try{
            System.out.println(4/0);
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException :divide by 0");
        } catch(Exception e) {
            System.out.println("Exception : dividir por 0");
        }
    }
}
