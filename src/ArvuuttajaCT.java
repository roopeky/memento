public class ArvuuttajaCT {
    private String asiakas;
    private Object obj;
    private int numero;

    public void liityPeliin(ArvuuttajaOG arvuuttaja, String asiakas) {
        this.asiakas = asiakas;
        this.obj = arvuuttaja.liityPeliin(asiakas);
    }

    public void arvaus(ArvuuttajaOG arvuuttaja, int arvattuNumero) {
        this.numero = arvattuNumero;
        arvuuttaja.arvaus(obj, numero);
    }
}
