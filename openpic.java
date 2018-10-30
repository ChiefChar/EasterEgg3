import java.awt.Desktop;
import java.io.File;



public class openpic {

    public static void main (String args[]) throws Exception

    {


        File f = new File ("snp.png");
        Desktop d = Desktop.getDesktop();
        d.open(f);
        System.out.println("imageviewer open;");



    }

}