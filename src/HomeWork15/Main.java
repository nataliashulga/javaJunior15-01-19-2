package HomeWork15;





public class Main {
    public static void main(String[] args) {
        SetTTT setUtils = new SetTTT();
        try{
            setUtils.orderedSet(null, null);
        }catch (NullPointerException e){
            System.out.println("Ошибка!!");
        }

        System.out.println("sdfd");


    }
}
