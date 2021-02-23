package ua.mytestprojects.springapp.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "invoiceline", schema = "chinook", catalog = "")
public class InvoicelineEntity {
    private Long id;
    private int invoiceLineId;
    private int invoiceId;
    private int trackId;
    private BigDecimal unitPrice;
    private int quantity;
    private InvoiceEntity invoiceByInvoiceId;
    private TrackEntity trackByTrackId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "InvoiceLineId", nullable = false)
    public int getInvoiceLineId() {
        return invoiceLineId;
    }

    public void setInvoiceLineId(int invoiceLineId) {
        this.invoiceLineId = invoiceLineId;
    }

    @Basic
    @Column(name = "InvoiceId", nullable = false)
    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Basic
    @Column(name = "TrackId", nullable = false)
    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    @Basic
    @Column(name = "UnitPrice", nullable = false, precision = 2)
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "Quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoicelineEntity that = (InvoicelineEntity) o;
        return invoiceLineId == that.invoiceLineId && invoiceId == that.invoiceId && trackId == that.trackId && quantity == that.quantity && Objects.equals(unitPrice, that.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceLineId, invoiceId, trackId, unitPrice, quantity);
    }

    @ManyToOne
    @JoinColumn(name = "InvoiceId", referencedColumnName = "InvoiceId", nullable = false)
    public InvoiceEntity getInvoiceByInvoiceId() {
        return invoiceByInvoiceId;
    }

    public void setInvoiceByInvoiceId(InvoiceEntity invoiceByInvoiceId) {
        this.invoiceByInvoiceId = invoiceByInvoiceId;
    }

    @ManyToOne
    @JoinColumn(name = "TrackId", referencedColumnName = "TrackId", nullable = false)
    public TrackEntity getTrackByTrackId() {
        return trackByTrackId;
    }

    public void setTrackByTrackId(TrackEntity trackByTrackId) {
        this.trackByTrackId = trackByTrackId;
    }
}
