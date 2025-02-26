public class Main {
    public static void main(String[] args) {
        Handler textHandler = new TextFileHandler();
        Handler docHandler = new DocFileHandler();
        Handler imageHandler = new ImageFileHandler();

        textHandler.setNextHandler(docHandler);
        docHandler.setNextHandler(imageHandler);

        File file1 = new File("document1.txt", "text");
        File file2 = new File("presentation.doc", "doc");
        File file3 = new File("photo.jpg", "image");
        File file4 = new File("unknown.dat", "binary");

        textHandler.handle(file1);
        textHandler.handle(file2);
        textHandler.handle(file3);
        textHandler.handle(file4);
    }
}