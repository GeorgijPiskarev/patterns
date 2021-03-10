package structural.proxy;

public class ProxyVideo implements Video {
    String image;
    RealVideo realVideo;

    public ProxyVideo(String image) {
        this.image = image;
        showImg();
    }

    @Override
    public void load() throws InterruptedException {
        if (realVideo == null) {
            realVideo = new RealVideo(image);
        }
    }

    public void showImg() {
        System.out.println(image);
        RealVideo.isDisplayed = true;
    }
}
