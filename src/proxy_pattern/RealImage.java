package proxy_pattern;

/**
 * Created by Kong on 2016/11/2.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }

}
