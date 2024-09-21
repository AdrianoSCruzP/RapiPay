package dev.TradeFlow.RapiPay.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collation = "carteras")
@Data
@AllArgsConstructor

public class Cartera {
    @Id
    private ObjectId id;
    private int idCartera;
    private String nomCartera;
    private String descripcion;
    private String nomBanco;
    private Status status;
    private double totalMontoFact;
    private List<Factura> listFacturas;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date createDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date sendDate;

    public Cartera() {
        this.createDate = new Date();
        this.status = Status.CLOSED;
    }
}
