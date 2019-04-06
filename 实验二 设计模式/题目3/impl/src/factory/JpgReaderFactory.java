package factory;

import product.ImageReader;
import product.JpgReader;

public class JpgReaderFactory extends ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        return new JpgReader();
    }
}