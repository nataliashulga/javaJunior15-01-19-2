package lesson8;

public class Tovar {
    private int idTovara;
    private int fixPrise;
    private int discont;
    private String nameTovar;
    private String type;
    private String colorId;
    private String nameColor;
    private boolean available;
    private Harakteristika[] harakteristikas = new Harakteristika[20];
    private Otziv[] otzivs = new Otziv[1000];

    public int getIdTovara() {
        return idTovara;
    }

    public void setIdTovara(int idTovara) {
        this.idTovara = idTovara;
    }

    public int getFixPrise() {
        return fixPrise;
    }

    public void setFixPrise(int fixPrise) {
        this.fixPrise = fixPrise;
    }

    public int getDiscont() {
        return discont;
    }

    public void setDiscont(int discont) {
        this.discont = discont;
    }

    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Harakteristika[] getHarakteristikas() {
        return harakteristikas;
    }

    public void setHarakteristikas(Harakteristika[] harakteristikas) {
        this.harakteristikas = harakteristikas;
    }

    public Otziv[] getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(Otziv[] otzivs) {
        this.otzivs = otzivs;
    }

    public void addHaracteristika(Harakteristika harakteristika) {
        for (int i = 0; i < harakteristikas.length; i++) {
            if (harakteristikas[i] == null) {
                harakteristikas[i] = harakteristika;
                return;
            }
        }
    }

    public void addOtziv(Otziv otziv) {
        for (int i = 0; i < otzivs.length; i++) {
            if (otzivs[i] == null) {
                otzivs[i] = otziv;
                return;
            }
        }
    }

    public void printInfo() {
        System.out.printf("Товар: имя - %s, цена - %d, " +
                "скидка - %d, тип - %s", nameTovar, fixPrise, discont, type);
        System.out.println("skjdhfj");
        System.out.println("jdfhkjf");
        System.out.println();
        for (Harakteristika h : harakteristikas) {
            if(h != null){
                System.out.println(h.getKey() + ": " +h.getValue());
            }
        }
        System.out.println();
        for (Otziv o : otzivs) {
            if(o != null){
                System.out.println("Отзыв от " + o.getNameClient() + ", рейтинг отзыва - " + o.getReiting());
            }
        }

    }
}
