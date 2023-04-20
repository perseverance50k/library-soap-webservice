package lt.viko.eif.o.sharapova.client;

import org.apache.fop.apps.*;
import org.xml.sax.SAXException;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class PDFConverter {
    public static void convertToPDF() throws IOException, SAXException, TransformerException
    {
        File xsltFile = new File("src/main/resources/xsl/library-to-PDF.xsl");
        StreamSource xmlSource = new StreamSource(new File("src/main/resources/xml/library.xml"));
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
        OutputStream out;
        out = new java.io.FileOutputStream("src/main/resources/pdf/file1.pdf");

        try {
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

            Result res = new SAXResult(fop.getDefaultHandler());

            transformer.transform(xmlSource, res);
        }
        finally {
            out.close();
        }
    }
}
