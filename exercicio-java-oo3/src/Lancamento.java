
public class Lancamento {
	
	public static void main(String[] args) {
		System.out.println("In�cio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("In�cio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("In�cio do metodo2");
        ArithmeticException exception = new ArithmeticException();
        
    }

}
