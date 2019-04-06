package factory;

import product.GifReader;
import product.ImageReader;

public class GifReaderFactory extends ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        return new GifReader();
    }
}