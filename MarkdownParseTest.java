import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void getLinksTestFile() throws IOException{
        //create list of answer links
        List<String> linksList = List.of("https://something.com", "some-thing.html");

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);

    }

    @Test
    public void getLinksTestFile2() throws IOException{
        //create list of answer links
        List<String> linksList = List.of("hello.com", "https://nyaa.si","hello.com");

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file-2.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);

    }
    @Test
    public void getLinksTestNewFile() throws IOException{
        //create list of answer links
        List<String> linksList = List.of("nyaa.si", "hello.com");

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("new-file.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);

    }

}