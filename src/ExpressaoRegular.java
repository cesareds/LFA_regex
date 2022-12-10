public class ExpressaoRegular {
    public String linguagem1 = "(a|b)*(aa|bb)";
    public String linguagem2 = "a(a|b)*a";
    public String linguagem3 = ".*(\\.jp(e?)g|\\.png|\\.bmp)";
    public void confere(String exp, String sentenca){
        if(sentenca.matches(exp)){
            System.out.println("W:`" + sentenca + "` aceita!");
        }else {
            System.err.println("W:`" + sentenca + "` rejeitada.");
        }
    }
}
