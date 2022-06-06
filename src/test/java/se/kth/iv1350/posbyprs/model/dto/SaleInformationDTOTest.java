package se.kth.iv1350.posbyprs.model.dto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *

 */
public class SaleInformationDTOTest {
    


    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        SaleInformationDTO instance = new SaleInformationDTO(
        "Test product", 125, 200);
        String expResult = "Test product";
        String result = instance.getDescription();
        assertEquals(expResult, result, "The description Test product"
                + "was not returned properly.");
    }
    
    @Test
    public void testGetEmptyDescription() {
        System.out.println("getDescription");
        SaleInformationDTO instance = new SaleInformationDTO(
        "", 125, 200);
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result, "The empty description "
                + "was not returned properly.");
    }


    @Test
    public void testGetPriceInclVat() {
        System.out.println("getPriceInclVat");
        SaleInformationDTO instance = new SaleInformationDTO(
        "", 125, 200);
        double expResult = 125.0;
        double result = instance.getPriceInclVat();
        assertEquals(expResult, result, "The price 125 was not"
                + "returned properly.");
    }
    
    @Test
    public void testGetPriceInclVatZero() {
        System.out.println("getPriceInclVat");
        SaleInformationDTO instance = new SaleInformationDTO(
        "", 0, 200);
        double expResult = 0.0;
        double result = instance.getPriceInclVat();
        assertEquals(expResult, result, "The price 0 was not"
                + "returned properly.");
    }
    
    @Test
    public void testGetPriceInclVatNegative() {
        System.out.println("getPriceInclVat");
        SaleInformationDTO instance = new SaleInformationDTO(
        "", -1, 200);
        double expResult = -1.0;
        double result = instance.getPriceInclVat();
        assertEquals(expResult, result, "The price -1 was not"
                + "returned properly.");
    }
    

    @Test
    public void testGetRunningTotal() {
        System.out.println("getRunningTotal");
        SaleInformationDTO instance = new SaleInformationDTO(
        "Test product", 125, 200);
        double expResult = 200.0;
        double result = instance.getRunningTotal();
        assertEquals(expResult, result, "The total price"
                + "200 was not returned properly.");
    }
    
    @Test
    public void testGetRunningTotalZero() {
        System.out.println("getRunningTotal");
        SaleInformationDTO instance = new SaleInformationDTO(
        "Test product", 125, 0);
        double expResult = 0.0;
        double result = instance.getRunningTotal();
        assertEquals(expResult, result, "The total price"
                + "0 was not returned properly.");
    }
    
    @Test
    public void testGetRunningTotalNegative() {
        System.out.println("getRunningTotal");
        SaleInformationDTO instance = new SaleInformationDTO(
        "Test product", 125, -1);
        double expResult = -1.0;
        double result = instance.getRunningTotal();
        assertEquals(expResult, result, "The total price"
                + "-1 was not returned properly.");
    }

}
