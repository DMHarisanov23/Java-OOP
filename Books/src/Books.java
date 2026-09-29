class Book {
    String title;
    String author;
    int year;
    // Начало на конструктора//
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        //Край на конструктора//
    }
    //Мотода се пише извън конструктора//
    //Метод//
    void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        // Край на метода//
    }
    //Мейн метод, главния метод в джава//
    public static void main(String[] args) {

        //Начало на обект//
        Book book1 = new Book("Harry Potter", "J.K.Rowling", 1997);
        Book book2 = new Book("The Hobbit", "J.R.R.Tolkien", 1937);
        //Извежда информацията на обектите//
        book1.showInfo();
        System.out.println("Author: " + book1.author);
        book2.showInfo();

    }
}