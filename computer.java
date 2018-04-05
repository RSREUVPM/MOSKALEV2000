public class computer {
    private String igrovoy;

    private String Monogopolzovat;

    private String Karmaniy;

    private String Mobilniy;

    public computer() {
    }

    public computer(String igr, String mnpolz, String karman, String mobil) {
        this.igrovoy = igr;
        this.Monogopolzovat = mnpolz;
        this.Karmaniy = karman;
        this.Mobilniy = mobil;
    }

    public String isIgrovoy() {
        return igrovoy;
    }

    public String setIgrovoy() {
        this.igrovoy = igrovoy;
    }

    public String getMonogopolzovat() {
        return Monogopolzovat;
    }

    public String setMonogopolzovat() {
        this.Monogopolzovat = Monogopolzovat;
    }

    public String getKarmaniy() {
        return Karmaniy;
    }

    public String setKarmaniy() {
        this.Karmaniy = Karmaniy;
    }

    public String getMobilniy() {
        return Mobilniy;
    }

    public String setMobilniy() {
        this.Mobilniy = Mobilniy;
    }
}