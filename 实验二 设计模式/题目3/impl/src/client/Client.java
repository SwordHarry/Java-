package client;

import factory.ImageReaderFactory;
import product.ImageReader;
import util.XMLUtil;

public class Client {
    public static void main(String[] args) {

        ImageReaderFactory imageReaderFactory = (ImageReaderFactory) XMLUtil.getBean();
        ImageReader imageReader = imageReaderFactory.createImageReader();
        imageReader.readImage();
    }
}