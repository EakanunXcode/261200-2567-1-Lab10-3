public class DocFileHandler extends Handler {
    @Override
    public void handle(File file) {
        if (file.getType().equalsIgnoreCase("doc")) {
            System.out.println("Processing and handling document file: " + file.getName());
        } else if (nextHandler != null) {
            nextHandler.handle(file);
        } else {
            System.out.println("No handler found for file: " + file.getName());
        }
    }
}