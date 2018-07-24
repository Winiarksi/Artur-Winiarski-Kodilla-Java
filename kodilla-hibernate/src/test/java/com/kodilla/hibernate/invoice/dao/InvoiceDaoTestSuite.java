package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Ignore
    @Test
    public void testInvoiceDaoSave(){
        //  Given
        Invoice invoice = new Invoice("2017/06/A001");
        Invoice invoice2 = new Invoice("2017/07/B0131");

        Product product1 = new Product("Stokrotki-sadzonki" );
        Product product2 = new Product("Grabki" );
        Product product3 = new Product("Super nawóz" );

        Item item1 = new Item(new BigDecimal(101.12), 1 );
        Item item2 = new Item(new BigDecimal(23.12), 1);
        Item item3 = new Item(new BigDecimal(3.11), 3 );

        item1.setProduct(product1);
        item2.setProduct(product3);
        item3.setProduct(product2);
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        invoiceDao.save(invoice);

        invoice2.getItems().add(item3);
        item3.setInvoice(invoice2);
        invoiceDao.save(invoice2);

        String invoiceNumber = invoice.getNumber();
        String invoiceNumber2 = invoice.getNumber();

        // When
        List<Invoice> readInvoice = new ArrayList<>();
        readInvoice.addAll(invoiceDao.findByNumber(invoiceNumber));
        readInvoice.addAll(invoiceDao.findByNumber(invoiceNumber2));

        System.out.println(readInvoice.size());
        System.out.println(readInvoice.get(0).getId());

        Assert.assertEquals(1, readInvoice.get(0).getId());

        try {
            invoiceDao.delete(invoice);
            invoiceDao.delete(invoice2);
            productDao.delete(product1);
            productDao.delete(product2);
            productDao.delete(product3);

        } catch (Exception e) {
            // do nothing
        }
    }
}