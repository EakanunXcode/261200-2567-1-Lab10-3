public class ImageFileHandler extends Handler {
    @Override
    public void handle(File file) {
        if (file.getType().equalsIgnoreCase("image")) {
            System.out.println("Processing and handling image file: " + file.getName());
        } else if (nextHandler != null) {
            nextHandler.handle(file);
        } else {
            System.out.println("No handler found for file: " + file.getName());
        }
    }
}