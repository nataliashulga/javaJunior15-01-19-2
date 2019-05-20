package lesson12;

public class MeizuM5 implements Phone, Photoapparat {
    @Override
    public void call() {
        System.out.println("MeizuM5 осуществление звонка ... ");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("MeizuM5 отправяем смс ... " + message);
    }

    @Override
    public void doPhoto() {
        System.out.println("MeizuM5 делаем фото ... ");
    }

    @Override
    public void doVideo() {
        System.out.println("MeizuM5 делаем видео ... ");
    }
}
