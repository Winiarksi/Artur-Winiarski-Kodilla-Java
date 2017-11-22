package decorator.taxiportal;

import decorator.taxiportal.Company.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BasicTaxiOrderTestSuit {
    @Test
    public void testBasicTaxiOrderGetCost() {
        //  Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //  When
        BigDecimal calculatorCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(5), calculatorCost);
        }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost(){
        //  Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //  When
            BigDecimal theCost = theOrder.getCost();
        //  Then
        assertEquals(new BigDecimal(40), theCost );
    }

    @Test
    public void testTaxiNetworkGetDescription(){
        //  Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //  When
            String description = theOrder.getDescription();
        //  Then
            assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost(){
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(37), theCost);
    }


    @Test
    public void testMyTaxiWithChildSeatGetDescription(){
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testUberTaxiWithChildSeatGetCost(){
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(29), theCost);
    }

    @Test
    public void testUberTaxiWithChildSeatGetDescription(){
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course by MyTaxi Network + child seat + child seat", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(52), theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription(){
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course by Taxi Network variant VIP + child seat", description);
    }
}