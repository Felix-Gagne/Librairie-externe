package org.example;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Jsoup {
    public static void main(String args[]) throws IOException {
        Document doc = org.jsoup.Jsoup.connect("https://departement-info-cem.github.io/3N5-Prog3/testbot/").get();
        Elements links = doc.select("a[href]");
        for (Element link : links){
            System.out.println(link.attr("abs:href"));
        }
    }
}
