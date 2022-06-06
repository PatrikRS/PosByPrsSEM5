package se.kth.iv1350.posbyprs.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.kth.iv1350.posbyprs.model.dto.ProductDTO;

/**
 *
 */
public class ProductTest {
    
    

    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 0.25, 111));
        String expResult = "Test product";
        String result = instance.getDescription();
        assertEquals(expResult, result,
            "The product description Test product was not returned properly.");
    }
    
    @Test
    public void testGetEmptyDescription() {
        System.out.println("getDescription");
        Product instance = new Product(new ProductDTO("", 150, 1, 25, 111));
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result,
                "The empty product description was not returned properly.");
    }

    
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 0.25, 111));
        double expResult = 150.0;
        double result = instance.getPrice();
        assertEquals(expResult, result,
                "The price 150 was not returned properly.");
    }
    @Test
    public void testGetPriceZero() {
        System.out.println("getPrice");
        Product instance = new Product(new ProductDTO(
                "Test product", 0, 1, 0.25, 111));
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result,
                "The price 0 was not returned properly.");
    }
    
    @Test
    public void testGetPriceNegative() {
        System.out.println("getPrice");
        Product instance = new Product(new ProductDTO(
                "Test product", -1, 1, 0.25, 111));
        double expResult = -1.0;
        double result = instance.getPrice();
        assertEquals(expResult, result,
                "The price -1 was not returned properly.");
    }
    
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 0.25, 111));
        int expResult = 1;
        int result = instance.getQuantity();
        assertEquals(expResult, result,
                "The quantity 1 was not returned properly.");
    }
    
    @Test
    public void testGetQuantityZero() {
        System.out.println("getQuantity");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 0, 0.25, 111));
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result,
                "The quantity 0 was not returned properly.");
    }
    
    @Test
    public void testGetQuantityNegative() {
        System.out.println("getQuantity");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, -1, 0.25, 111));
        int expResult = -1;
        int result = instance.getQuantity();
        assertEquals(expResult, result,
                "The quantity -1 was not returned properly.");
    }

    @Test
    public void testGetVatRate() {
        System.out.println("getVatRate");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 0.25, 111));
        double expResult = 0.25;
        double result = instance.getVatRate();
        assertEquals(expResult, result,
                "The VAT rate 0.25 was not returned properly.");
    }
    
    @Test
    public void testGetVatRateZero() {
        System.out.println("getVatRate");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 0, 111));
        double expResult = 0.0;
        double result = instance.getVatRate();
        assertEquals(expResult, result,
                "The VAT rate 0 was not returned properly.");
    }
    
    @Test
    public void testGetVatRateNegative() {
        System.out.println("getVatRate");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, -0.25, 111));
        double expResult = -0.25;
        double result = instance.getVatRate();
        assertEquals(expResult, result,
                "The VAT rate -0.25 was not returned properly.");
    }
    
    
    @Test
    public void testGetIdentifier() {
        System.out.println("getIdentifier");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 0.25, 111));
        int expResult = 111;
        int result = instance.getIdentifier();
        assertEquals(expResult, result,
                "The identifier 111 was not returned properly.");
    }
    
    @Test
    public void testGetIdentifierZero() {
        System.out.println("getIdentifier");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 0.25, 0));
        int expResult = 0;
        int result = instance.getIdentifier();
        assertEquals(expResult, result,
                "The identifier 0 was not returned properly.");
    }
    
    @Test
    public void testGetIdentifierNegative() {
        System.out.println("getIdentifier");
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 0.25, -1));
        int expResult = -1;
        int result = instance.getIdentifier();
        assertEquals(expResult, result,
                "The identifier -1 was not returned properly.");
    }
    
    
    @Test
    public void testGetPriceInclVat() {
        System.out.println("getPriceInclVat");
        Product instance = new Product(new ProductDTO(
                "Test product", 100, 1, 0.25, 111));
        double expResult = 125.0;
        double result = instance.getPriceInclVat();
        assertEquals(expResult, result,"A product with base cost 100"
                + " and VAT rate 0.25 does not return 125.");
    }
    
    @Test
    public void testGetPriceInclVatZeroVatRate() {
        System.out.println("getPriceInclVat");
        Product instance = new Product(new ProductDTO(
                "Test product", 100, 1, 0, 111));
        double expResult = 100.0;
        double result = instance.getPriceInclVat();
        assertEquals(expResult, result, "A product with base cost 100"
                + " and VAT rate 0 does not return 100.");
    }
    
    @Test
    public void testGetPriceInclVatNegativeVatRate() {
        System.out.println("getPriceInclVat");
        Product instance = new Product(new ProductDTO(
                "Test product", 100, 1, -0.25, 111));
        double expResult = 75.0;
        double result = instance.getPriceInclVat();
        assertEquals(expResult, result, "A product with base cost 100"
                + " and VAT rate -0.25 does not return 75.");
    }
    
    @Test
    public void testGetPriceInclVatZeroBaseCost() {
        System.out.println("getPriceInclVat");
        Product instance = new Product(new ProductDTO(
                "Test product", 0, 1, 0.25, 111));
        double expResult = 0.0;
        double result = instance.getPriceInclVat();
        assertEquals(expResult, result, "A product with base cost 0"
                + " and VAT rate 0.25 does not return 0.");
    }
    
    @Test
    public void testGetPriceInclVatZeroBaseCostZeroVatRate() {
        System.out.println("getPriceInclVat");
        Product instance = new Product(new ProductDTO(
                "Test product", 0, 1, 0, 111));
        double expResult = 0.0;
        double result = instance.getPriceInclVat();
        assertEquals(expResult, result, "A product with base cost 0"
                + " and VAT rate 0 does not return 0.");
    }
    

    @Test
    public void testAddQuantity() {
        System.out.println("addQuantity");
        int quantity = 1;
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 25, 111));
        instance.addQuantity(quantity);
        int expResult = 2;
        int result = instance.getQuantity();
        assertEquals(expResult, result, "Adding quantity 1 to a product"
                + " with quantity 1 does not update the quantity to 2.");
    }
    
    @Test
    public void testAddQuantityOneToZero() {
        System.out.println("addQuantity");
        int quantity = 1;
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 0, 25, 111));
        instance.addQuantity(quantity);
        int expResult = 1;
        int result = instance.getQuantity();
        assertEquals(expResult, result, "Adding quantity 1 to a product"
                + " with quantity 0 does not update the quantity to 1.");
    }
    
    @Test
    public void testAddQuantityZeroToOne() {
        System.out.println("addQuantity");
        int quantity = 0;
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 25, 111));
        instance.addQuantity(quantity);
        int expResult = 1;
        int result = instance.getQuantity();
        assertEquals(expResult, result, "Adding quantity 0 to a product"
                + " with quantity 1 does not update the quantity to 1.");
    }
    
    @Test
    public void testAddQuantityZeroToZero() {
        System.out.println("addQuantity");
        int quantity = 0;
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 0, 25, 111));
        instance.addQuantity(quantity);
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result, "Adding quantity 0 to a product"
                + " with quantity 0 does not update the quantity to 0.");
    }
    
    @Test
    public void testAddQuantityNegativeToOne() {
        System.out.println("addQuantity");
        int quantity = -1;
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 1, 25, 111));
        instance.addQuantity(quantity);
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result, "Adding quantity -1 to a product"
                + " with quantity 1 does not update the quantity to 0.");
    }
    
    @Test
    public void testAddQuantityNegativeToZero() {
        System.out.println("addQuantity");
        int quantity = -1;
        Product instance = new Product(new ProductDTO(
                "Test product", 150, 0, 25, 111));
        instance.addQuantity(quantity);
        int expResult = -1;
        int result = instance.getQuantity();
        assertEquals(expResult, result, "Adding quantity -1 to a product"
                + " with quantity 0 does not update the quantity to -1.");
    }
    
    
}
