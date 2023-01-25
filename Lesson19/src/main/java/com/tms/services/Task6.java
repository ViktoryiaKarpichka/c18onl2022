package com.tms.services;

import com.tms.models.Book;
import com.tms.models.EmailAddress;
import com.tms.models.Library;
import com.tms.models.Reader;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Task6 {
    private static final Random random = new Random();

    private static List<Book> getRandomReaderBooks(Library library) {
        int randomBooksForReader = random.nextInt(library.getBooks().size() - 1);
        int[] randomIndexes =
                random.ints(randomBooksForReader, 0, library.getBooks().size() - 1).toArray();
        List<Book> result = new ArrayList<>();
        for (int randomIndex : randomIndexes) {
            result.add(library.getBooks().get(randomIndex));
        }
        return result;
    }

    public static void main(String[] args) {
        // * 6) Пишем библиотеку.
        List<Book> books = Arrays.asList(
                new Book("Лев Толстой", "Смерть Ивана Ильича", 1886),
                new Book("Фёдор Михайлович Достоевский", "Преступление и наказание", 1886),
                new Book("Чарлз Диккенс", "Повесть о двух городах", 1859),
                new Book("Чарлз Диккенс", "Оливер Твист", 1839),
                new Book("Антон Павлович Чехов", "Вишнёвый сад", 1901),
                new Book("Антон Павлович Чехов", "Попрыгунья", 1891),
                new Book("Виктор Гюго", "Человек, который смеётся", 1860),
                new Book("Виктор Гюго", "Собор Парижской Богоматери", 1831),
                new Book("Виктор Гюго", "Отверженные", 1862),
                new Book("Эрнест Хемингуэй", "По ком звонит колокол", 1940),
                new Book("Эрнест Хемингуэй", "Снега Килиманджаро", 1936),
                new Book("Александр Сергеевич Пушкин", "Руслан и Людмила", 1820),
                new Book("Александр Сергеевич Пушкин", "Медный всадник", 1833),
                new Book("Александр Сергеевич Пушкин", "Борис Годунов", 1825));

        List<Reader> readers = Arrays.asList(
                new Reader("Петров Ф.А.", "petrov@gmail.com", true),
                new Reader("Дрозд В.А.", "drozd@gmail.com", true),
                new Reader("Иванова Л.М.", "ivanova@gmail.com", false),
                new Reader("Сидор Н.Я.", "sidor@gmail.com", true));
        //readers.get(0).setBooks(Arrays.asList(books.get(1)));
        //        readers.get(1).setBooks(Arrays.asList(books.get(2), books.get(3)));
        //        readers.get(2).setBooks(Arrays.asList(books.get(4)));
        //        readers.get(3).setBooks(Arrays.asList(books.get(4), books.get(8)));

        Library library = new Library(books, readers);

        readers.stream()
                .peek(reader -> reader.setBooks(getRandomReaderBooks(library)))
                .forEach(System.out::println);
        //     * a) Получить список всех книг библиотеки, отсортированных по году издания.
        books.stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .forEach(System.out::println);

        //     * b) Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
        //     * При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
        List<String> emailAddressList = library.getReaders().stream()
                .map(Reader::getEmail).toList();
        System.out.println(emailAddressList);

        //     * c) Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
        //     * Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
        List<EmailAddress> emailAddressBySubscribe = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(reader -> reader.getBooks().size() > 1)
                .map(Reader::getEmail)
                .map(EmailAddress::new)
                .toList();
        System.out.println(emailAddressBySubscribe);

//* d) Получить список всех книг, взятых читателями.
//   * Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
        List<Book> booksBorrowedByReaders = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .toList();
        System.out.println(booksBorrowedByReaders);

        //     * e) Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Пушкина Александра Сергеевича.
        boolean checkAuthorBooks = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> "Пушкин".equals(book.getAuthor()));
        System.out.println(checkAuthorBooks);

        //     * а) Узнать наибольшее число книг, которое сейчас на руках у читателя.
        Integer maxBooksReader = library.getReaders().stream()
                .map(reader -> reader.getBooks().size())
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(maxBooksReader);

        //* b) Необходимо рассылать разные тексты двум группам:
        //     * тем, у кого взято меньше двух книг, просто расскажем о новинках библиотеки;
        //     * * тем, у кого две книги и больше, напомним о том, что их нужно вернуть в срок.
        //     * То есть надо написать метод, который вернёт два списка адресов (типа EmailAddress): с пометкой OK — если книг не больше двух,
        //     * или TOO_MUCH — если их две и больше. Порядок групп не важен.
        Map<String, List<EmailAddress>> map = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(Collectors.groupingBy(reader -> reader.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                        Collectors.mapping(reader -> new EmailAddress(reader.getEmail()), Collectors.toList())));
        for (Map.Entry<String, List<EmailAddress>> entry : map.entrySet()) {
            String emails = entry.getValue().stream()
                    .map(EmailAddress::getEmail)
                    .collect(joining(","));
            System.out.println(entry.getKey() + " - " + emails);
        }
        map.values().stream()
                .flatMap(Collection::stream)
                .map(EmailAddress::getEmail)
                .forEach(System.out::println);

        // * с)Если нужны не адреса, а просто списки читателей в каждой группе:
        Map<String, List<Reader>> readerstMap = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK"));
        //* d) Если для каждой группы нужны ФИО читателей из этой группы, перечисленные через запятую. И ещё каждый такой список ФИО нужно обернуть фигурными скобками.
        {
            Map<String, String> readersFIOMap = library.getReaders().stream()
                    .filter(Reader::isSubscriber)
                    .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                            mapping(Reader::getFio, joining(", ", "{", "}"))));
            String readersFios = readersFIOMap.get("OK");
            System.out.println(readersFios);
        }
    }
}
