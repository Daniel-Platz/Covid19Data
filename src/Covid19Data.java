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

    @Override
    public String toString() {
        return String.format(
                "Covid-19 Data:\n" +
                        "  Region                   : %s\n" +
                        "  Aldersgruppe             : %s\n" +
                        "  Bekræftede tilfælde      : %d\n" +
                        "  Døde                     : %d\n" +
                        "  Indlagte på intensiv     : %d\n" +
                        "  Indlagte                 : %d\n" +
                        "  Dato                     : %s\n",
                region, aldersgruppe, bekræftedeTilfælde, døde, indlagtePåIntensiv, indlagte, dato
        );
    }
}