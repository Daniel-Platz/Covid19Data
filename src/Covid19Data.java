public class Covid19Data {

    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int indlagtePåIntensiv;
    private int indlagte;
    private String dato;


    Covid19Data(String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagtePåIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }
    public int getBekræftedeTilfælde() {
        return bekræftedeTilfælde;

    } public int getDøde() {
        return døde;

    } public int getIndlagtePåIntensiv() {
        return indlagtePåIntensiv;

    } public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }


    @Override
    public String toString() {
        return String.format("%-15s | %-12s | %,-20d | %-5d | %-17d | %-8d | %s",
                region, aldersgruppe, bekræftedeTilfælde, døde, indlagtePåIntensiv, indlagte, dato);
    }
}