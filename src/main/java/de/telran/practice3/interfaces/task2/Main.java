package de.telran.practice3.interfaces.task2;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Java specification documentation.");
        boolean isDocumentContainsKeyword = document.search("documentation");
        System.out.println("Document contains keyword 'sample': " + isDocumentContainsKeyword);

        WebPage webPage = new WebPage("https://www.oracle.com", "This is main page contains information about java language.");
        boolean isWebPageContainsKeyword = webPage.search("java");
        System.out.println("Webpage contains keyword 'webpage': " + isWebPageContainsKeyword);
    }
}
