package dictionary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    private static HashMap<String, String> englishToPolish = new HashMap<String, String>();

    public static void main(String[] args) {
        putNewStringToMap();
        translateEnglishToPolish("How to");
    }

    public static void translateEnglishToPolish(String searchingWord) {
        Set<String> strings = englishToPolish.keySet();
        List<String> collect = strings.stream().filter(e -> e.matches(searchingWord))
                .collect(Collectors.toList());
        System.out.println(collect);
        for (int i = 0; i < collect.size(); i++) {
            if (englishToPolish.containsKey(collect.get(i))){
                System.out.println();
        }
        } else {
            System.out.println("Wpisz poprawną frazę");
        }
    }

    public static void putNewStringToMap() {
        englishToPolish.put("How to kill a Shinigami? but he hasn't replied.",
                "Ciekawe, czy wie, jak zabić Shinigami? Wyemitowali wiadomość, " +
                        "w której proszę go o spotkanie ale jeszcze nie odpowiedział.");
        englishToPolish.put("How to take SPRYCEL The tablets must be swallowed whole, not crushed.",
                "Jak stosować SPRYCEL Tabletki muszą być połykane w całości, nie rozkruszone.");
        englishToPolish.put("How to take Tadalafil Lilly 4.", "Jak stosować lek Tadalafil Lilly 4.");
        englishToPolish.put("Possible side effects 5 How to store Tadalafil Lilly 6.",
                "Jak zażywać lek Olanzapine Teva 4.");
        englishToPolish.put("Possible side effects 5 How to store Clopidogrel Winthrop 6.",
                "Jak przechowywać lek Clopidogrel Winthrop 6.");
    }

//    public static void resultOfTranslating(){
//        System.out.println(translateEnglishToPolish());
//    }

}
