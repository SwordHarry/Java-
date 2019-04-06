public class ProxyManager implements AuthorityManager {

   private AuthorityValidator authorityValidator;

   private RealManager realManager = new RealManager();

   public boolean validate(String userId) {
      authorityValidator = new AuthorityValidator();
      return authorityValidator.validate(userId);
   }

   public void getUserAuthority(String userId) {
      if(this.validate(userId)) {
         realManager.getUserAuthority(userId);
      } else {
         System.out.println("对不起，只有看帖子的权限");
      }
   }

}