import java.util.ArrayList;

public class Covid19Data {
        private String region;
        private String aldersGruppe;
        private int bekræftetTilfælde;
        private int døde;
        private String indlagtePåIntensiv;
        private int indlagte;
        private String dato;




    public Covid19Data(String region, String aldersGruppe, int bekræftetTilfælde, int døde, String indlagtePåIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræftetTilfælde = bekræftetTilfælde;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    @Override
    public String toString() {
        return "Covid19Data" +
                "region='" + region + '\'' +
                ", aldersGruppe='" + aldersGruppe + '\'' +
                ", bekræftetTilfælde=" + bekræftetTilfælde +
                ", døde=" + døde +
                ", indlagtePåIntensiv='" + indlagtePåIntensiv + '\'' +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'';
    }

    public String getAldersGruppe() {
        return aldersGruppe;
    }

    public int getBekræftetTilfælde() {
        return bekræftetTilfælde;
    }

    public int getDøde() {
        return døde;
    }

    public String getIndlagtePåIntensiv() {
        return indlagtePåIntensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

    public String getRegion() {
        return region;
    }
}
