package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //  Given
        Invoice invoice = new Invoice("2017/06/A001");

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