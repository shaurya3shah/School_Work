package Chapter1;

/*modify*/

import java.net.URL;
import javax. swing. ImageIcon;
 import javax. swing. JOptionPane;
public class p17
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL("https://www.bigfootdigital.co.uk/wp-content/uploads/2020/07/image-optimisation-scaled.jpg");
        JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation)) ;
}

}




 
        
       
        

