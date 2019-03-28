package lesson8;

public class Main {
    public static void main(String[] args) {
        Tovar blender = new Tovar();
        blender.setNameTovar("Philips Avent Блендер-пароварка 2 в 1");
        blender.setIdTovara(7324820);
        blender.setFixPrise(12200);
        blender.setDiscont(19);
        blender.setAvailable(true);

        Harakteristika obem = new Harakteristika();
        obem.setKey("Объем, л.");
        obem.setValue("0,8");

        Harakteristika color = new Harakteristika();
        color.setKey("Цвет");
        color.setValue("Белый");

        blender.addHaracteristika(obem);
        blender.addHaracteristika(color);

        Otziv otziv1 = new Otziv();
        otziv1.setAge(35);
        otziv1.setBuyInOzon(true);
        otziv1.setComment("эта модель продаётся сейчас за 6499 в других онлайн магазинах. Жаль что поздно увидела.  ");
        otziv1.setDislike(4);
        otziv1.setLike(7);
        otziv1.setPlus("Все быстро и просто  ");
        otziv1.setMinus("Громко работает блендер  ");
        otziv1.setNameClient("Ковалевич Гузель Евгеньевна");

        blender.addOtziv(otziv1);

        blender.printInfo();

    }
}
