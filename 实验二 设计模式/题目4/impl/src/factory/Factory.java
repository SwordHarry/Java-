package factory;

import product.Button;
import product.Text;

public interface Factory {

   Button createButton();

   Text createText();

}