package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.inheritance.Millenials;
import com.kodilla.patterns.strategy.social.inheritance.YGeneration;
import com.kodilla.patterns.strategy.social.inheritance.ZGeneration;
import com.kodilla.patterns.strategy.social.implement.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        User cypisek = new YGeneration("Cypisek Rozbujnika");
        User rumcajs  = new Millenials("Rumcajs Rozbujnik");
        User hanka = new ZGeneration("Hanka Rozbujnika");

        // When
        System.out.println("Test nr 1.");
        System.out.println("Testowanie domyślnej strategii udostępniania.\n");

        String cypisekUses = cypisek.sharePost();
        String rumcajsUses = rumcajs.sharePost();
        String hankaUses = hanka.sharePost();
        System.out.println(cypisek.getName() + " używa " + cypisekUses);
        System.out.println(rumcajs.getName() + " używa " + rumcajsUses);
        System.out.println(hanka.getName() + " używa " + hankaUses);

        //  Then
        Assert.assertEquals("Snapchat", cypisekUses);
        Assert.assertEquals("Facebook", rumcajsUses);
        Assert.assertEquals("Twitter", hankaUses);
    }

    @Test
    public void testIndividualSharingStrategy(){

        // Given
        User cypisek =  new YGeneration("Cypisek Rozbujnika");

        // When
        System.out.println("\nTest nr 2");
        System.out.println("Testowanie indywidualnej strategii dzielenia się.\n");

        String cypisekUses = cypisek.sharePost();
        System.out.println(cypisek.getName() + " używa " + cypisekUses);
        cypisek.setSocialPublisher(new FacebookPublisher());
        cypisekUses = cypisek.sharePost();
        System.out.println("Okazuje się jednak, że " + cypisek.getName() + " używa również " + cypisekUses + "-a.");

        // Then
        Assert.assertEquals("Facebook", cypisekUses);
    }
}
