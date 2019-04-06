package product;

public class JpgReader implements ImageReader {
    @Override
    public void readImage() {
        System.out.println("读取jpg图片");
    }
}