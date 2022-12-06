package cr.ac.ucr.sa.rp.examen2.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class OrdenTest {

    Orden testOrder = new Orden();
    float totalDue;

    @BeforeEach
    public void setup() {

        /********************ATTRIBUTES**********************/
        testOrder.setNumOrden(1);
        testOrder.setFechaOrden(new Date());
        //Testing customer
        Cliente customerJesus = new Cliente(1, "Jesús", "Gutiérrez Matarrita");
        //Testing hardware products
        Producto testProduct = new ProductoHardware(1, "Este es un producto de hardware para pruebas", 292000, "Costa Rica");
        //Create list with items
        List<ItemOrden> testItems = new ArrayList<>();
        //items
        ItemOrden itemOrder1 = new ItemOrden(1, 56, 25900, testProduct);
        ItemOrden itemOrder2 = new ItemOrden(2, 70, 56900, testProduct);
        //add items to the list of items
        testItems.add(itemOrder1);
        testItems.add(itemOrder2);
        //set Customer
        testOrder.setCliente(customerJesus);
        //set Items
        testOrder.setItemes(testItems);
        totalDue = 0;

    }

    @Test
    public void getTotalBillFromOrder() {
        List<ItemOrden> items = testOrder.getItemes();
        Assertions.assertEquals(2,items.size());
        for (ItemOrden item : items) {
            totalDue += item.getPrecioUnitario() * item.getCantidad();
        }
        Assertions.assertEquals(5433400,totalDue);
    }

}
