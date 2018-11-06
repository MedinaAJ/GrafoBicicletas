
package grafobicicletas;

public class Trayecto {
    private int viajeid;
    private int duracion;
    private String tinicial;
    private String tfinal;
    private int estacionid;
    private double latitudi;
    private double longitudi;
    private int estacionidfinal;
    private double latitudf;
    private double longitudf;
    private int biciid;
    private int planduracion;
    private String categoriaruta;
    private String tipopass;

    public Trayecto(int viajeid, int duracion, String tinicial, String tfinal, int estacionid, double latitudi, double longitudi, int estacionidfinal, double latitudf, double longitudf, int biciid, int planduracion, String categoriaruta, String tipopass) {
        this.viajeid = viajeid;
        this.duracion = duracion;
        this.tinicial = tinicial;
        this.tfinal = tfinal;
        this.estacionid = estacionid;
        this.latitudi = latitudi;
        this.longitudi = longitudi;
        this.estacionidfinal = estacionidfinal;
        this.latitudf = latitudf;
        this.longitudf = longitudf;
        this.biciid = biciid;
        this.planduracion = planduracion;
        this.categoriaruta = categoriaruta;
        this.tipopass = tipopass;
    }

    public int getViajeid() {
        return viajeid;
    }

    public void setViajeid(int viajeid) {
        this.viajeid = viajeid;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTinicial() {
        return tinicial;
    }

    public void setTinicial(String tinicial) {
        this.tinicial = tinicial;
    }

    public String getTfinal() {
        return tfinal;
    }

    public void setTfinal(String tfinal) {
        this.tfinal = tfinal;
    }

    public int getEstacionid() {
        return estacionid;
    }

    public void setEstacionid(int estacionid) {
        this.estacionid = estacionid;
    }

    public double getLatitudi() {
        return latitudi;
    }

    public void setLatitudi(double latitudi) {
        this.latitudi = latitudi;
    }

    public double getLongitudi() {
        return longitudi;
    }

    public void setLongitudi(double longitudi) {
        this.longitudi = longitudi;
    }

    public int getEstacionidfinal() {
        return estacionidfinal;
    }

    public void setEstacionidfinal(int estacionidfinal) {
        this.estacionidfinal = estacionidfinal;
    }

    public double getLatitudf() {
        return latitudf;
    }

    public void setLatitudf(double latitudf) {
        this.latitudf = latitudf;
    }

    public double getLongitudf() {
        return longitudf;
    }

    public void setLongitudf(double longitudf) {
        this.longitudf = longitudf;
    }

    public int getBiciid() {
        return biciid;
    }

    public void setBiciid(int biciid) {
        this.biciid = biciid;
    }

    public int getPlanduracion() {
        return planduracion;
    }

    public void setPlanduracion(int planduracion) {
        this.planduracion = planduracion;
    }

    public String getCategoriaruta() {
        return categoriaruta;
    }

    public void setCategoriaruta(String categoriaruta) {
        this.categoriaruta = categoriaruta;
    }

    public String getTipopass() {
        return tipopass;
    }

    public void setTipopass(String tipopass) {
        this.tipopass = tipopass;
    }
    
}
