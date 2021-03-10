package structural.proxy;

//Видео не загружается до того момента, пока это не понадобится. Прокси только отображает картинку, но не создает реальный обьект.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Video realVideo = new RealVideo("Картинка с котейкой");
        Video proxyVideo = new ProxyVideo("Картинка с котейкой");
        proxyVideo.load();
    }
}
