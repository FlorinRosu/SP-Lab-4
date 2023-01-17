package persistence.services;


public final class ImageLoaderFactory {
    public final void create( String toCreate) throws Throwable {
        String var2 = toCreate.substring(toCreate.lastIndexOf(',') + 1).trim();
        switch (var2) {
            case "bmp" -> {
                new BMPImageLoader();
            }
            case "jpg"-> {
                new JPGImageLoader();
                break;
            }
            default -> throw (Throwable) (new Exception("I don't know how to deal with " + toCreate + '.'));
        }

    }
}
