public class Main {
    public static void main(String[] args) {
        ArvuuttajaCT ct1 = new ArvuuttajaCT();
        ArvuuttajaOG arvuuttaja1 = new ArvuuttajaOG();

        ArvuuttajaCT ct2 = new ArvuuttajaCT();
        ArvuuttajaOG arvuuttaja2 = new ArvuuttajaOG();

        ct1.liityPeliin(arvuuttaja1, "Asiakas 1");
        ct1.arvaus(arvuuttaja1, 38);

        ct2.liityPeliin(arvuuttaja2, "Asiakas 2");
        ct2.arvaus(arvuuttaja2, 69);
    }
}