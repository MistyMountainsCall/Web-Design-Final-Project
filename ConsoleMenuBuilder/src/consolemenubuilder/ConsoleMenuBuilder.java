package consolemenubuilder;

import java.util.Scanner;

public class ConsoleMenuBuilder {

    private static String aboveContent;
    private static String belowContent;
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter number of menu items.\t>>>");
        int n = cin.nextInt();
        String[] filenames = new String[n];
        String[] discriptions = new String[n];
        
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the filename of food image.\t>>>");
            filenames[i] = cin.next();
            System.out.println("Enter the discription of food.\t>>>");
            discriptions[i] = cin.next();
        }
        
        String out = "";
        out += aboveContent;
        
        
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
}
