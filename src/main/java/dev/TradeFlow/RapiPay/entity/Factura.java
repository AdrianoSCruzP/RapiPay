package dev.TradeFlow.RapiPay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "facturas")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Factura {
    @Id
    private ObjectId id;
    private int idFactura;

}
