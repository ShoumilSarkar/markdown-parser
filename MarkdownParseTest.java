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
    public void getLinksTestFile2old() throws IOException{
        //create list of answer links
        List<String> linksList = List.of("hello.com", "https://nyaa.si","hello.com");

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file-2.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);

    }




    //new tests start here

    @Test
    public void getLinksTestNewFile2() throws IOException{
        //create list of answer links
        List<String> linksList = List.of("https://something.com", "some-page.html");

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);

    }

    @Test
    public void getLinksTestFile3() throws IOException{
        //create list of answer links
        List<String> linksList = List.of();

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);

    }

    @Test
    public void getLinksTestNewFile4() throws IOException{
        //create list of answer links
        List<String> linksList = List.of();

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);

    }

    @Test
    public void getLinksTestNewFile5() throws IOException{
        //create list of answer links
        List<String> linksList = List.of();

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);

    }

    @Test
    public void getLinksTestNewFile6() throws IOException{
        //create list of answer links
        List<String> linksList = List.of();

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);

    }
    @Test
    public void getLinksTestNewFile7() throws IOException{
        //create list of answer links
        List<String> linksList = List.of();

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);
    }

    @Test
    public void getLinksTestNewFile8() throws IOException{
        //create list of answer links
        List<String> linksList = List.of("a link on the first line");

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);
    }

    @Test
    public void getLinksTestNewFile9() throws IOException{
        //create list of answer links
        List<String> linksList = List.of();

        //get the file data, read it as a string and passs it into the markdown parse function
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content),linksList);
    }
}
