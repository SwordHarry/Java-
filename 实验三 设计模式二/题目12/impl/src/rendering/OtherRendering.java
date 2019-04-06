package rendering;

public class OtherRendering implements Renderding {

   private RenderEngine renderEngine;

   public OtherRendering(RenderEngine renderEngine) {
      this.renderEngine = renderEngine;
   }

   public void rendering() {
      renderEngine.rendering();
   }

}