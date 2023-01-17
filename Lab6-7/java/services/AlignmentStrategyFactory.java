package services;
import models.AlignLeft;
import models.AlignRight;

public final class AlignmentStrategyFactory {
    public final void create(String textAlignment) throws Throwable {

        String var2 =  textAlignment.substring(textAlignment.lastIndexOf(',') + 1).trim();
        switch (var2) {
            case "left" -> {
                new AlignLeft();
            }
            case "right" -> {
                new AlignRight();
            }
            default -> throw (Throwable) (new Exception("I don't know how to deal with " + textAlignment + '.'));
        }

    }

    public AlignmentStrategyFactory( String StrategiesPrototypes) {
        super();
    }
}