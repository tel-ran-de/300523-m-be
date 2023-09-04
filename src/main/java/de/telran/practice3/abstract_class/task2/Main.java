package de.telran.practice3.abstract_class.task2;

public class Main {
    public static void main(String[] args) {
        ColorPrinter colorPrinter = new ColorPrinter();
        InkjetPrinter inkjetPrinter = new InkjetPrinter();

        colorPrinter.printDocument();
        inkjetPrinter.printDocument();
    }
}
