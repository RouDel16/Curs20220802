public class Joc {
    private String numeJoc;

    public String getNumeJoc() {
        return numeJoc;
    }

    public void setNumeJoc(String numeJoc) {
        this.numeJoc = numeJoc;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTipDeJoc() {
        return tipDeJoc;
    }

    void setTipDeJoc(String tdjParam) {
        for (String tdjiterator : posibilTipDeJoc) {
            if (tdjParam.equals(tdjiterator)) {
                tipDeJoc = tdjParam;
            }
        }
    }

    private double pret;
    private String date;
    private String tipDeJoc;

    static String[] posibilTipDeJoc = {"RPG", "RTS", "FPS", "JDF"};


}
