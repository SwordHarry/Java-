public class Main {

    public static void main(String[] args) {
       AuthorityManager authorityManager = new ProxyManager();
       authorityManager.getUserAuthority("游客");
    }
}