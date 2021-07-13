
public class Principal {
	
	public static void main(String[] args) {

        String nome = "Alura";
        System.out.println("ANTES");

        try {
            System.out.println(1/0);
        } catch(ArithmeticException | NullPointerException ex) {
            ex.printStackTrace();
        //} catch(NullPointerException ex) {
            ex.printStackTrace();    
        }

        System.out.println("DEPOIS");
    }

}
