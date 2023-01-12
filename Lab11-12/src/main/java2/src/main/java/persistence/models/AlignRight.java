package persistence.models;

import persistence.services.AlignStrategy;

public class AlignRight implements AlignStrategy {
    public void render( String p) {
        String var2 = "##" + p;
        boolean var3 = false;
        System.out.println(var2);
    }
}
