package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    private ItemDao itemDao;


    @Test
    public void testInvoiceDaoSave(){
        //  Given
        Invoice invoice = new Invoice("2017/06/A001");
        Invoice invoice2 = new Invoice("2017/07/B0131");
        Invoice invoice3 = new Invoice("2017/0&/A109");

        Product product1 = new Product("Stokrotki-sadzonki" );
        Product product2 = new Product("Grabki" );
        Product product3 = new Product("Super nawóz" );

        Item item1 = new Item(new BigDecimal(101.12), 1, new BigDecimal(123.12) );
        Item item2 = new Item(new BigDecimal(23.12), 1, new BigDecimal(111.11) );

        item1.setProduct(product1);
        product1.getItems().add(item1);

        /*
        item1.setProduct(product2);
        item1.setProduct(product3);
*/

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoiceDao.save(invoice);



        String invoiceNumber = invoice.getNumber();

        // When
        List<Invoice> readInvoice = invoiceDao.findByNumber(invoiceNumber);

        Assert.assertEquals(1, readInvoice.get(0).getId());
    }


}


/*
Napisz test o nazwie testInvoiceDaoSave(), który sprawdza czy faktura z kilkoma pozycjami zapisuje się poprawnie w bazie danych
Pamiętaj, że test musi być idempotentny (musi zostawiać bazę danych w stanie takim, w jakim ją zastał - bez nowych wpisów)
 */