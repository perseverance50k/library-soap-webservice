package lt.viko.eif.o.sharapova.service.jetty;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

public class JettyServer {
    private Server server;

    public void start() throws Exception {
        server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8090);
        server.setConnectors(new Connector[] {connector});

        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);
        servletHandler.addServletWithMapping(JettyPDFStaticServlet.class, "/pdf/static");
        servletHandler.addServletWithMapping(JettyMainServlet.class, "/pdf/*");

        server.start();
    }

    public void stop() throws Exception {
        server.stop();
    }
}
