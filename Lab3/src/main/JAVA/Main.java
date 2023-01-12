
public final class Main {
    public static  void main(    String[] args) {
        long startTime = System.currentTimeMillis();
        Image img1 = new Image("Pamela Anderson");
        Image img2 = new Image("Kim Kardashian");
        Image img3 = new Image("Kirby Griffin");
        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book("Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
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
