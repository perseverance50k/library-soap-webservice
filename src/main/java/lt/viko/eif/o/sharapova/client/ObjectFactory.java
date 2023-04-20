
package lt.viko.eif.o.sharapova.client;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.eif.o.sharapova.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eif.o.sharapova.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Library }
     * 
     */
    public Library createLibrary() {
        return new Library();
    }

    /**
     * Create an instance of {@link Library.Loans }
     * 
     */
    public Library.Loans createLibraryLoans() {
        return new Library.Loans();
    }

    /**
     * Create an instance of {@link Library.Books }
     * 
     */
    public Library.Books createLibraryBooks() {
        return new Library.Books();
    }

    /**
     * Create an instance of {@link GetLibraryResponse }
     * 
     */
    public GetLibraryResponse createGetLibraryResponse() {
        return new GetLibraryResponse();
    }

    /**
     * Create an instance of {@link GetLibraryRequest }
     * 
     */
    public GetLibraryRequest createGetLibraryRequest() {
        return new GetLibraryRequest();
    }

    /**
     * Create an instance of {@link Library.Loans.LibraryLoan }
     * 
     */
    public Library.Loans.LibraryLoan createLibraryLoansLibraryLoan() {
        return new Library.Loans.LibraryLoan();
    }

    /**
     * Create an instance of {@link Library.Books.LibraryBook }
     * 
     */
    public Library.Books.LibraryBook createLibraryBooksLibraryBook() {
        return new Library.Books.LibraryBook();
    }

}
