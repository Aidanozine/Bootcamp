package Book8.chapter5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.text.NumberFormat;

public class XMLTest {
    public static void main(String[] args) {
        Document doc = getDocument("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book8\\chapter5\\movies.xml");
        System.out.println("-----DOM created-----");
        //Version 1-------------------------------------------------
//        int count = 0;
//        Element root = doc.getDocumentElement();
//        Node movie = root.getFirstChild();
//        while (movie != null) {
//            count++;
//            movie = movie.getNextSibling();
//        }
//        System.out.println("There are " + count + " movies.");

        //Version 2-------------------------------------------------
        Element root = doc.getDocumentElement();
        NodeList movies = root.getChildNodes();
        for(int i = 0; i < movies.getLength(); i++){
            Node movie = movies.item(i);
            System.out.println(movie.getNodeName());
            System.out.println(movie.getFirstChild().getTextContent());
            System.out.println(movie.getAttributes().getNamedItem("year").getTextContent());
            System.out.println(movie.getFirstChild().getNextSibling().getTextContent()); //need first before sibling
        }
        System.out.println("There are " + movies.getLength() + " movies.");

        //Version 3-------------------------------------------------
//        Element root = doc.getDocumentElement();
//        Element movie = (Element)root.getFirstChild();
//        int oldest = 9999;
//        while(movie != null){
//            String s = movie.getAttribute("year");
//            int year = Integer.parseInt(s);
//            if(year < oldest){
//                oldest = year;
//            }
//            movie = (Element)movie.getNextSibling();
//        }
//        System.out.println("The oldest movie was made in " + oldest + ".");

        //Version 4-------------------------------------------------
//        Element root = doc.getDocumentElement();
//        NodeList movies = root.getChildNodes();
//        for(int i = 0; i < movies.getLength(); i++){
//            Element movie = (Element)movies.item(i);
//            NumberFormat cf = NumberFormat.getCurrencyInstance();
//            Node title = movie.getFirstChild();
//            System.out.println(getTextValue(title));
////            System.out.println(title.getTextContent()); //same as above without getTextValue() method
//            System.out.println(movie.getAttribute("year"));
//            Node price = movie.getFirstChild().getNextSibling();
//            Double dp = Double.parseDouble(getTextValue(price));
//            System.out.println(cf.format(dp));
//        }
    }

    private static String getTextValue(Node n){ //needed for ver.4
        return n.getFirstChild().getNodeValue();
    }


    private static Document getDocument(String name){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            factory.setValidating(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(new InputSource(name));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return  null;
    }
}
