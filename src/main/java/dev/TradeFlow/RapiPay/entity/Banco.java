package dev.TradeFlow.RapiPay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "bancos")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Banco {
    @Id
    private ObjectId id;
    private String nomBanco;
    private float TEA;
    private float TEM;
    private float TEQ;

}
