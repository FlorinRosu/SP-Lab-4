
public final class Main {
    public static final void main( String[] args) {
        long startTime = System.currentTimeMillis();

        ImageProxy img1 = new ImageProxy("Pamela Anderson");
        ImageProxy img2 = new ImageProxy("Kim Kardashian");
        ImageProxy img3 = new ImageProxy("Kirby Griffin");
        Section playboyS1 = new Section("Front Cover");

        playboyS1.add((Element)img1);

        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add((Element)img2);

        playboyS2.add((Element)img3);

        Book playboy = new Book("Playboy");

        playboy.addContent((Element)playboyS1);

        playboy.addContent((Element)playboyS2);

        long endTime = System.currentTimeMillis();

        String var11 = "Creation of the content took " + (endTime - startTime) + " milliseconds";

        boolean var12 = false;

        System.out.println(var11);

        startTime = System.currentTimeMillis();
        playboyS1.print();

        endTime = System.currentTimeMillis();
        var11 = "Printing of the section 1 took " + (endTime - startTime) + " milliseconds";
        System.out.println(var11);

        startTime = System.currentTimeMillis();
        playboyS1.print();

        endTime = System.currentTimeMillis();
        var11 = "Printing again the section 1 took " + (endTime - startTime) + " milliseconds";
        System.out.println(var11);
    }
}