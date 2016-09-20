/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrillictoqwerty;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rasendori
 */
public class ConverterTest {

    @Test
    public void convertTest() {
        String testOne = "ыешдд Ш цфте ещ ыефн рщьу :)";
        String convertedOne = "still I want to stay home :)";
        Converter con = new Converter();
        String conversion = con.convert(testOne);
        assertEquals(convertedOne, conversion);
    }
    
}
