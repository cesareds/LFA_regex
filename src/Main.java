import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("LFA_regex");
        do{
            System.out.print("\nExpressão regular:\t");
            expressaoRegular.setArbitraria(scanner.next());
            System.out.print("\nPalavra:\t");
            expressaoRegular.confere(expressaoRegular.getArbitraria(), scanner.next());
            System.out.println("Tentar de novo? (y/n)");
            opcao=scanner.next();
        }while (opcao.equals("y") || opcao.equals("Y"));
    }
    public static Scanner scanner = new Scanner(System.in);
    public static String opcao;
    public static ExpressaoRegular expressaoRegular = new ExpressaoRegular();
}
