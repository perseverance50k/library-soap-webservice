package lt.viko.eif.o.sharapova.service;

import lt.viko.eif.o.sharapova.client.Library;
import org.olhas.librarysystem.models.Book;
import org.olhas.librarysystem.models.Loan;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.*;

@Component
public class LibraryRepository {
    private static final Map<String, Library> libraries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Library library = new Library();
        List<Book> books = new ArrayList<>();
        List<Loan> loans = new ArrayList<>();

        books.add(new Book(1, 1, "Java Core", 9, LocalDate.of(2016, 2, 10)));
        books.add(new Book(2, 3, "Atomic Habits", 3, LocalDate.of(2018, 7, 7)));
        books.add(new Book(3, 3, "Thinking, Fast and Slow", 2, LocalDate.of(2022, 2, 10)));
        books.add(new Book(4, 3, "46 seconds", 1, LocalDate.of(2019, 5, 18)));
        books.add(new Book(5, 3, "Hooked", 4, LocalDate.of(2014, 7, 11)));
        books.add(new Book(6, 3, "Emotional Intelligence", 10, LocalDate.of(2015, 3, 19)));

        loans.add(new Loan(1, 2, 1, LocalDate.of(2023, 3, 3),
                LocalDate.of(2023, 3, 10)));
        loans.add(new Loan(2, 3, 4, LocalDate.of(2023, 3, 3),
                LocalDate.of(2023, 3, 10)));
        loans.add(new Loan(3, 3, 6, LocalDate.of(2023, 3, 3),
                LocalDate.of(2023, 3, 12)));

        library.setLibraryName("The British Library");
        library.setBooks(books);
        library.setLoans(loans);

        libraries.put(library.getLibraryName(), library);
    }

    public lt.viko.eif.o.sharapova.client.Library findLibraryByName(String name) {
        Assert.notNull(name, "The library's name must not be null");
        return libraries.get(name);
    }

    public List<Library> findLibrariesByBook(String bookName) {
        Assert.notNull(bookName, "The book's name must not be null");
        List<Library> targetLibraries = new ArrayList<>();

        libraries.forEach((libraryName, library) -> {
            if (hasSpecifiedBook(library, bookName)) {
                targetLibraries.add(library);
            }
        });

        return targetLibraries;
    }

    private boolean hasSpecifiedBook(Library library, String bookName) {
        Optional<Book> targetBook = library.getBooks().stream().filter(book -> book.getTitle().equalsIgnoreCase(bookName)).findFirst();
        return targetBook.isPresent();
    }
}
