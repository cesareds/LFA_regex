
public class Main {
    public static void main(String[] args) {
        ExpressaoRegular expressaoRegular = new ExpressaoRegular();
        System.out.println("LFA_regex");
        expressaoRegular.confere(expressaoRegular.linguagem1, "aababaaa");
        expressaoRegular.confere(expressaoRegular.linguagem2, "babbaa");
        expressaoRegular.confere(expressaoRegular.linguagem3, "IMG_20220702.jpg");
    }
}
