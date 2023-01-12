
import models.Visitor;

public interface Visitee {
    void accept( Visitor var1);
    public static final class DefaultImpls {
        public static void accept(Visitee $this, Visitor v) {

        }
    }
}
