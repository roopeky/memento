import java.util.Random;

public class ArvuuttajaOG {
    private String asiakas;
    private int rndNumber;

    public Object liityPeliin(String uusiAsiakas) {
        this.asiakas = uusiAsiakas;

        Random rnd = new Random();
        rndNumber = rnd.nextInt(100);

        return new Memento(this.asiakas, this.rndNumber);
    }

    public boolean arvaus(Object obj, int arvaus) {

        Memento memento = (Memento) obj;

        this.asiakas = memento.asiakas;
        this.rndNumber = memento.rdnNumber;

        System.out.println("Arvottu numero on: " + rndNumber);
        System.out.println(asiakas + ", arvauksesi oli: " + arvaus);

        if (arvaus == rndNumber) {
            System.out.println("Arvauksesi on oikein!\n");
            return true;
        } else {
            System.out.println("Arvauksesi ei osunut kohdilleen.\n");
            return false;
        }
    }
}
