package com.dh.g2.apicard.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Movement {                    // Movimientos de Tarjeta de Crédito

    private String movementId;              // ID movimiento
    private String cardNumber;              // Número de Tarjeta
    private String movementType;            // Tipo de movimiento (DÉBITO/CRÉDITO)
    private Amount amount;                  // Importe : Moneda, Valor
    private LocalDateTime transactionDate;  // Fecha de Operación
    private DebtCollector debtCollector;    // Cobrador: único
    private String description;             // Descripción
    private OrderDetail orderDetail;        // Detalle de compra: lista
    private String status;                  // Estado (ACTIVO, ANULADO)
    private BigDecimal walletCommission;    // Comisión Billetera: (Importe * 0,50%)

    public static class Amount {            // Importe
        private Currency currency;          // Moneda
        private BigDecimal value;           // Valor
    }

    public static class DebtCollector {
        private String idType;              // Tipo de Documento
        private String idNumber;            // Número de Documento
        private String name;                // Razón Social
    }

    public static class OrderDetail {       // Detalle de compra: lista
        private String product;             // Artículo/Servicio
        private int amount;                 // Cantidad
        private BigDecimal unitPrice;       // Importe Unitario
        private BigDecimal subTotal;        // Importe Subtotal
    }


}
