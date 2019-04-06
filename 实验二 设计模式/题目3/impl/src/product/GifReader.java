package product;

public class GifReader implements ImageReader {
    @Override
    public void readImage() {
        System.out.println("读取gif图");
    }
}