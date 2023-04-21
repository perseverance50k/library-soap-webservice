
package lt.viko.eif.o.sharapova.client;

import org.olhas.librarysystem.models.Book;
import org.olhas.librarysystem.models.Loan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for library complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="library">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Library_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Books">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Library_Book" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Book_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="Book_Author_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="Book_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Book_Edition" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="Book_Release_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Loans">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Library_Loan">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Loan_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="Loan_Student_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="Loan_Book_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="Loan_From" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="Loan_To" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "library", propOrder = {
    "libraryName",
    "books",
    "loans"
})
public class Library {

    @XmlElement(name = "Library_Name", required = true)
    protected String libraryName;
    @XmlElement(name = "Books", required = true)
    protected List<Book> books;
    @XmlElement(name = "Loans", required = true)
    protected List<Loan> loans;

    /**
     * Gets the value of the libraryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * Sets the value of the libraryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryName(String value) {
        this.libraryName = value;
    }

    /**
     * Gets the value of the books property.
     * 
     * @return
     *     possible object is
     *     {@link Library.Books }
     *     
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Sets the value of the books property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.Books }
     *     
     */
    public void setBooks(List<Book> value) {
        this.books = value;
    }

    /**
     * Gets the value of the loans property.
     * 
     * @return
     *     possible object is
     *     {@link Library.Loans }
     *     
     */
    public List<Loan> getLoans() {
        return loans;
    }

    /**
     * Sets the value of the loans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.Loans }
     *     
     */
    public void setLoans(List<Loan> value) {
        this.loans = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Library_Book" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Book_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="Book_Author_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="Book_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Book_Edition" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="Book_Release_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "libraryBook"
    })
    public static class Books {

        @XmlElement(name = "Library_Book", required = true)
        protected List<Library.Books.LibraryBook> libraryBook;

        /**
         * Gets the value of the libraryBook property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the libraryBook property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLibraryBook().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Library.Books.LibraryBook }
         * 
         * 
         */
        public List<Library.Books.LibraryBook> getLibraryBook() {
            if (libraryBook == null) {
                libraryBook = new ArrayList<Library.Books.LibraryBook>();
            }
            return this.libraryBook;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Book_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="Book_Author_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="Book_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Book_Edition" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="Book_Release_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bookID",
            "bookAuthorID",
            "bookTitle",
            "bookEdition",
            "bookReleaseDate"
        })
        public static class LibraryBook {

            @XmlElement(name = "Book_ID")
            @XmlSchemaType(name = "unsignedByte")
            protected short bookID;
            @XmlElement(name = "Book_Author_ID")
            @XmlSchemaType(name = "unsignedByte")
            protected short bookAuthorID;
            @XmlElement(name = "Book_Title", required = true)
            protected String bookTitle;
            @XmlElement(name = "Book_Edition")
            @XmlSchemaType(name = "unsignedByte")
            protected short bookEdition;
            @XmlElement(name = "Book_Release_Date", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar bookReleaseDate;

            /**
             * Gets the value of the bookID property.
             * 
             */
            public short getBookID() {
                return bookID;
            }

            /**
             * Sets the value of the bookID property.
             * 
             */
            public void setBookID(short value) {
                this.bookID = value;
            }

            /**
             * Gets the value of the bookAuthorID property.
             * 
             */
            public short getBookAuthorID() {
                return bookAuthorID;
            }

            /**
             * Sets the value of the bookAuthorID property.
             * 
             */
            public void setBookAuthorID(short value) {
                this.bookAuthorID = value;
            }

            /**
             * Gets the value of the bookTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookTitle() {
                return bookTitle;
            }

            /**
             * Sets the value of the bookTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookTitle(String value) {
                this.bookTitle = value;
            }

            /**
             * Gets the value of the bookEdition property.
             * 
             */
            public short getBookEdition() {
                return bookEdition;
            }

            /**
             * Sets the value of the bookEdition property.
             * 
             */
            public void setBookEdition(short value) {
                this.bookEdition = value;
            }

            /**
             * Gets the value of the bookReleaseDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getBookReleaseDate() {
                return bookReleaseDate;
            }

            /**
             * Sets the value of the bookReleaseDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setBookReleaseDate(XMLGregorianCalendar value) {
                this.bookReleaseDate = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Library_Loan">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Loan_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="Loan_Student_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="Loan_Book_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="Loan_From" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="Loan_To" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "libraryLoan"
    })
    public static class Loans {

        @XmlElement(name = "Library_Loan", required = true)
        protected Library.Loans.LibraryLoan libraryLoan;

        /**
         * Gets the value of the libraryLoan property.
         * 
         * @return
         *     possible object is
         *     {@link Library.Loans.LibraryLoan }
         *     
         */
        public Library.Loans.LibraryLoan getLibraryLoan() {
            return libraryLoan;
        }

        /**
         * Sets the value of the libraryLoan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Library.Loans.LibraryLoan }
         *     
         */
        public void setLibraryLoan(Library.Loans.LibraryLoan value) {
            this.libraryLoan = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Loan_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="Loan_Student_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="Loan_Book_ID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="Loan_From" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="Loan_To" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "loanID",
            "loanStudentID",
            "loanBookID",
            "loanFrom",
            "loanTo"
        })
        public static class LibraryLoan {

            @XmlElement(name = "Loan_ID")
            @XmlSchemaType(name = "unsignedByte")
            protected short loanID;
            @XmlElement(name = "Loan_Student_ID")
            @XmlSchemaType(name = "unsignedByte")
            protected short loanStudentID;
            @XmlElement(name = "Loan_Book_ID")
            @XmlSchemaType(name = "unsignedByte")
            protected short loanBookID;
            @XmlElement(name = "Loan_From", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar loanFrom;
            @XmlElement(name = "Loan_To", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar loanTo;

            /**
             * Gets the value of the loanID property.
             * 
             */
            public short getLoanID() {
                return loanID;
            }

            /**
             * Sets the value of the loanID property.
             * 
             */
            public void setLoanID(short value) {
                this.loanID = value;
            }

            /**
             * Gets the value of the loanStudentID property.
             * 
             */
            public short getLoanStudentID() {
                return loanStudentID;
            }

            /**
             * Sets the value of the loanStudentID property.
             * 
             */
            public void setLoanStudentID(short value) {
                this.loanStudentID = value;
            }

            /**
             * Gets the value of the loanBookID property.
             * 
             */
            public short getLoanBookID() {
                return loanBookID;
            }

            /**
             * Sets the value of the loanBookID property.
             * 
             */
            public void setLoanBookID(short value) {
                this.loanBookID = value;
            }

            /**
             * Gets the value of the loanFrom property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLoanFrom() {
                return loanFrom;
            }

            /**
             * Sets the value of the loanFrom property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLoanFrom(XMLGregorianCalendar value) {
                this.loanFrom = value;
            }

            /**
             * Gets the value of the loanTo property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLoanTo() {
                return loanTo;
            }

            /**
             * Sets the value of the loanTo property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLoanTo(XMLGregorianCalendar value) {
                this.loanTo = value;
            }

        }

    }

}
