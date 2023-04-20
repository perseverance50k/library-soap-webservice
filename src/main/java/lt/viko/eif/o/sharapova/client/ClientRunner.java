package lt.viko.eif.o.sharapova.client;

import org.apache.fop.apps.FOPException;
import org.xml.sax.SAXException;

import javax.xml.transform.TransformerException;
import java.io.IOException;

public class ClientRunner {
    public static void main(String[] args) {
        try {
            PDFConverter.convertToPDF();
        }
        catch (FOPException | IOException | TransformerException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
