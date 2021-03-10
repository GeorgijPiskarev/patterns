package structural.proxy;

public class RealVideo implements Video {
    String image;
    static boolean isDisplayed;

    public RealVideo(String image) throws InterruptedException {
        this.image = image;
        load();
    }

    @Override
    public void load() throws InterruptedException {
        if (!isDisplayed) {
            System.out.println(image);
        }
        Thread.sleep(1000);
        System.out.println("Видео загружается");
        isDisplayed = false;
    }
}
