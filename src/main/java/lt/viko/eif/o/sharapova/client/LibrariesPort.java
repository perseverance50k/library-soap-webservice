
package lt.viko.eif.o.sharapova.client;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LibrariesPort", targetNamespace = "http://spring.io/guides/gs-producing-web-service")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LibrariesPort {


    /**
     * 
     * @param getLibraryRequest
     * @return
     *     returns lt.viko.eif.o.sharapova.client.GetLibraryResponse
     */
    @WebMethod
    @WebResult(name = "getLibraryResponse", targetNamespace = "http://spring.io/guides/gs-producing-web-service", partName = "getLibraryResponse")
    public GetLibraryResponse getLibrary(
        @WebParam(name = "getLibraryRequest", targetNamespace = "http://spring.io/guides/gs-producing-web-service", partName = "getLibraryRequest")
        GetLibraryRequest getLibraryRequest);

}
