package menubuilder;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MenuBuilder implements ActionListener {

    private static String aboveContent;
    private static String belowContent;
    
    
    private static JFrame wn, pre;
    private static JButton build, next, prev, enter;
    private static JTextField imageGet, discriptionGet, numGet;
    
    
    public static void main(String[] args) {
        new MenuBuilder().init();
    }

    private void init() {
        pre = new JFrame("Enter number of menu items");
        pre.setSize(150, 50);
        pre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        LayoutManager lm = new GridLayout(2, 1);
        pre.setLayout(lm);
        enter = new JButton("Enter");
        numGet = new JTextField();
        pre.add(numGet);
        pre.add(enter);
        enter.addActionListener(this);
        pre.setVisible(true);
    }
    
    private static void buildWindow() {
        wn = new JFrame("Menu Generator");
        wn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wn.setSize(800, 600);

        //window elements
    }
    
    private static void defineStaticPageElements() {
        aboveContent = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "	<meta charset=\"UTF-8\">\n"
                + "	<title>Title</title>\n"
                + "	<link rel=\"stylesheet\" href=\"css/global.css\" type=\"text/css\">\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "	\n"
                + "	<div id=\"nav\">\n"
                + "		<ul>\n"
                + "			<li><a href=\"index.html\"><img src=\"images/carb_horz.png\" id=\"logo\" alt=\"homepage\"></a>\n"
                + "			</li>\n"
                + "			\n"
                + "			<li><a href=\"menu.html\">Menu</a>\n"
                + "			</li>\n"
                + "			\n"
                + "			<li><a href=\"reviews.html\">Reviews</a>\n"
                + "			</li>\n"
                + "			\n"
                + "			<li><a href=\"https://www.youtube.com/watch?v=dQw4w9WgXcQ\">Orders</a>\n"
                + "			</li>\n"
                + "			\n"
                + "		</ul>\n"
                + "	</div>";
        belowContent = "	<div id=\"footer\">\n"
                + "		<a href=\"https://www.google.com/maps/place/Haufbrau/@45.6784247,-111.0466736,18.75z/data=!4m2!3m1!1s0x0000000000000000:0xfc99de3fc88a1d12\">123 Food Str. Bozeman, MT 59715</a>\n"
                + "		<br>\n"
                + "		Contact us at our email: <a href=\"hunter.lloyd@montana.edu\">client.name@clientserver.com</a>\n"
                + "	</div>";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
