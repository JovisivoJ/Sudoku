package pacotesoprater;
import modelo.Board;
import java.util.Scanner;
import java.util.stream.*;
import java.util.*;


public class Main {

	final static Scanner scanner = new Scanner(System.in);
	private static Board board;
	private final static int BOARD_LIMIT = 9;
	public static void main(String[] args) {
		final var posições   = Stream.of(args)
				.collect(toMap(
						k -> k.split(";")[0],
						v -> v.split(";")[1]
						));
		var option = -1;
		while (true) {
			System.out.println("Selecione uma das opções a seguir");
			System.out.println("1 - Iniciar um novo jogo");
			System.out.println("2 - Colocar um novo número");
			System.out.println("3 - Remover um número");
			System.out.println("4 - Visualizar jogo atual");
			System.out.println("5 - Verificar status do jogo");
			System.out.println("6 - Limpar jogo");
			System.out.println("7 - Finalizar jogo");
			System.out.println("8 - Sair");
			option = scanner.nextInt();

			switch (option) {
			case 1 -> iniciarJogo();
			case 2 -> mudarValor();
			case 3 -> removerNumero();
			case 4 -> Atual();
			case 5 -> Status();
			case 6 -> limparEspaço();
			case 7 -> jogoFinalizado();
			case 8 -> System.exit(0);
			default -> System.out.println("Opção invalida, selecione uma das opções do menu");
			}
		}

	}
	private static Object iniciarJogo() {
		// TODO Auto-generated method stub

	}
	private static Object jogoFinalizado() {
		// TODO Auto-generated method stub

	}
	private static Object limparEspaço() {
		// TODO Auto-generated method stub

	}
	private static Object Status() {
		// TODO Auto-generated method stub

	}
	private static Object Atual() {
		// TODO Auto-generated method stub

	}
	private static Object removerNumero() {

	}
	private static Object mudarValor() {

	}




