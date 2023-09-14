package Book8.chapter5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.text.NumberFormat;

public class ListMoviesXML {
    private static NumberFormat cf = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        Document doc = getDocument("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book8\\chapter5\\movies.xml");
        Element root = doc.getDocumentElement();
        Element movieElement = (Element)root.getFirstChild();
        Movie m;
        while(movieElement != null){
            m = getMovie(movieElement);
            String msg = Integer.toString(m.year);
            msg += ": " + m.title;
            msg += " (" + cf.format(m.price) + ")";
            System.out.println(msg);
            movieElement = (Element)movieElement.getNextSibling();
        }
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
        return null;
    }

    private static class Movie{
        String title;
        int year;
        Double price;
        public Movie(String title, int year, Double price){
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }

    private static Movie getMovie(Element e){
        String yearString = e.getAttribute("year");
        int y = Integer.parseInt(yearString);
        Element titleElement = (Element)e.getFirstChild();
        String t = getTextValue(titleElement).trim();
        Element priceElement = (Element)titleElement.getNextSibling();
        String priceString = getTextValue(priceElement).trim();
        Double p = Double.parseDouble(priceString);
        return new Movie(t, y, p);
    }

    private static String getTextValue(Element node){
        return node.getFirstChild().getNodeValue();
    }
}
