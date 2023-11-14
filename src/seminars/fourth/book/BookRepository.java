package seminars.fourth.book;

import java.util.List;

public interface BookRepository {
    Book findById(String id);

    Book findByAuthor(String author);

    List<Book> findAll();
}
