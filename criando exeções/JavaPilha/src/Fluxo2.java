public class Fluxo2 {

	public static void main(String[] args) {

		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExecao2 e) {
			System.out.println("Exception" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExecao2 {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExecao2 {
		System.out.println("Ini do metodo2");
		throw new MinhaExecao2("Deu muito erro");
		// System.out.println("Fim do metodo2");
	}
}
