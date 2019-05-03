public class Printer {

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }

    int tonerLevel;
    int numberOfPages;
    boolean duplexPrinter;

    public void fillToner(int tonerLevel){
        System.out.println("Filling toner to "+tonerLevel);
    }

    public void printPages(int numberOfPages){

        for(int i=0;i<numberOfPages;i++)
            System.out.println("Printing page "+i);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.setTonerLevel(100);
        printer.setNumberOfPages(6);
        printer.setDuplexPrinter(true);

        printer.fillToner(printer.getTonerLevel());

        printer.printPages(printer.getNumberOfPages());


    }

}
