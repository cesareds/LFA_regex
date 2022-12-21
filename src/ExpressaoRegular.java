public class ExpressaoRegular {
    private String arbitraria;

    public String getArbitraria() {
        return arbitraria;
    }

    public void setArbitraria(String arbitraria) {
        this.arbitraria = arbitraria;
    }

    public void confere(String exp, String sentenca){
        if(sentenca.matches(exp)){
            System.out.println("W:`" + sentenca + "` aceita!");
        }else {
            System.err.println("W:`" + sentenca + "` rejeitada.");
        }
    }
}
