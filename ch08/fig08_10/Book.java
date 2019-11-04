public enum Book {
    JHTP("Java How to Program", "2015"), CHTP("C How to Program", "2013"), CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014");

    private final String title;
    private final String copyrightYear;

    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCopyrightYear() {
        return this.copyrightYear;
    }
}