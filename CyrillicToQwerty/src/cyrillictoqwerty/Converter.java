/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrillictoqwerty;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rasendori
 */
public class Converter {
    private Map<Character, Character> conversions;
    
    /**
     * Initiliaze the converter and creates the conversion table
     * TODO for now the table is created here, but in future will be read out from a file instead.
     */
    public Converter() {
        conversions = new HashMap<>();
        conversions.put('ё', '`');
        conversions.put('й', 'q');
        conversions.put('ц', 'w');
        conversions.put('у', 'e');
        conversions.put('к', 'r');
        conversions.put('е', 't');
        conversions.put('н', 'y');
        conversions.put('г', 'u');
        conversions.put('ш', 'i');
        conversions.put('щ', 'o');
        conversions.put('з', 'p');
        conversions.put('х', '[');
        conversions.put('ъ', ']');
        conversions.put('ф', 'a');
        conversions.put('ы', 's');
        conversions.put('в', 'd');
        conversions.put('а', 'f');
        conversions.put('п', 'g');
        conversions.put('р', 'h');
        conversions.put('о', 'j');
        conversions.put('л', 'k');
        conversions.put('д', 'l');
        conversions.put('ж', ';');
        conversions.put('э', '\'');
        conversions.put('я', 'z');
        conversions.put('ч', 'x');
        conversions.put('с', 'c');
        conversions.put('м', 'v');
        conversions.put('и', 'b');
        conversions.put('т', 'n');
        conversions.put('ь', 'm');
        conversions.put('б', ',');
        conversions.put('ю', '.');
        
    }

    /**
     * Converts cyrillic character to latin character thats in the same position on the keyboard
     * @param input Cyrillic character
     * @return latin character
     */
    private char convertChar(char input) {
        return conversions.get(input);
    }
    
    public String convert(String input) {
        StringBuilder output = new StringBuilder();
        for(char c : input.toCharArray()) {
            boolean isUpper = false;
            if(Character.isUpperCase(c)) {
                isUpper = true;
                c = Character.toLowerCase(c);
            }
            if(conversions.containsKey(c)) {
                c = convertChar(c);
            }
            if(isUpper){
                c = Character.toUpperCase(c);
            }
            output.append(c);
        }
        return output.toString();
    }
}
