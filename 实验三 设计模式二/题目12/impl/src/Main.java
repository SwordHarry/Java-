import rendering.OtherRendering;
import rendering.RenderEngine;
import rendering.SurfaceRendering;

public class Main {

    public static void main(String[] args) {
       Scene scene = new Scene(new OtherRendering(new RenderEngine()));
       scene.renderding();
    }
}
