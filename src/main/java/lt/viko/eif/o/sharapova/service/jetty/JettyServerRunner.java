package lt.viko.eif.o.sharapova.service.jetty;

public class JettyServerRunner {
    public static void main(String[] args) {
        JettyServer server = new JettyServer();
        try {
            server.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
