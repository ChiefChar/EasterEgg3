import java.awt.Desktop;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;


public class openpic {

    public static void main (String args[]) throws Exception

    {

        Path filepath = Paths.get("./snp.jpg");
        File f = new File ("C:\\Users\\charl\\Desktop\\Computer Science\\JavaProjects\\src\\snp.png");
        Desktop d = Desktop.getDesktop();
        d.open(f);
        System.out.println("imageviewer open;");



    }

}