package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac_11_5z.Bigmac;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;

public class BigmacTestSuite {
    @Test
    public void testBigBurgerNew() {
        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Ciasto puszyste")
                .burgers(2)
                .ingredients("Szczypioreczek ECO")
                .sauce("Pikany")
                .sauce("Słodki")
                .sauce("Słodziutki")
                .sauce("Kwaśny z lekkką nutką dekadencji :D")
                .ingredients("Sałąta lodowa")
                .ingredients("Kurczaczek siekany")
                .ingredients("Rukola")
                .ingredients("Papryczka czerwona, prosto z drzewka")
                .ingredients("I Bóg wie jeszcze co ;) ")
                .build();

        // When
        System.out.println(bigmac.toString());

        // Then
        Assert.assertEquals(6, bigmac.getIngredients().size());
        Assert.assertEquals(4, bigmac.getSauce().size());
    }
}