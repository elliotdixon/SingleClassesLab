public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int paperLeft() {
        return this.paper;
    }

    public int tonerLeft() {
        return this.toner;
    }

    public void print(int pages, int copies) {

        if (this.paper >= (pages * copies)) {
            this.paper -= (pages * copies);
            this.paper -= (pages * copies);
        }
    }

    public void refill(int pagesInserted) {

        paper += pagesInserted;
    }
}
