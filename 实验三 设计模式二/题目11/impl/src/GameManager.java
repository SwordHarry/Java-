
public class GameManager {



   public SoundEffect soundEffect;

   public Scene scene;

   public Role role;

   private GameManager() {}

   private static class HolderClass {
      private final static GameManager gameManager = new GameManager();
   }

   public static GameManager getManager() {
      return HolderClass.gameManager;
   }
   

   public void setSound() {
      soundEffect = new SoundEffect();
      soundEffect.setSound();
   }
   

   public void setScene() {
      scene = new Scene();
      scene.setScene();
   }
   

   public void setRole() {
      role = new Role();
      role.setRole();
   }

}