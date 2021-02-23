package ua.mytestprojects.springapp.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "invoice", schema = "chinook", catalog = "")
public class InvoiceEntity {
    private Long id;
    private int invoiceId;
    private int customerId;
    private Timestamp invoiceDate;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private String billingCountry;
    private String billingPostalCode;
    private BigDecimal total;
    private CustomerEntity customerByCustomerId;
    private Collection<InvoicelineEntity> invoicelinesByInvoiceId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "InvoiceId", nullable = false)
    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Basic
    @Column(name = "CustomerId", nullable = false)
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "InvoiceDate", nullable = false)
    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @Basic
    @Column(name = "BillingAddress", nullable = true, length = 70)
    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Basic
    @Column(name = "BillingCity", nullable = true, length = 40)
    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    @Basic
    @Column(name = "BillingState", nullable = true, length = 40)
    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    @Basic
    @Column(name = "BillingCountry", nullable = true, length = 40)
    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    @Basic
    @Column(name = "BillingPostalCode", nullable = true, length = 10)
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    @Basic
    @Column(name = "Total", nullable = false, precision = 2)
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceEntity that = (InvoiceEntity) o;
        return invoiceId == that.invoiceId && customerId == that.customerId && Objects.equals(invoiceDate, that.invoiceDate) && Objects.equals(billingAddress, that.billingAddress) && Objects.equals(billingCity, that.billingCity) && Objects.equals(billingState, that.billingState) && Objects.equals(billingCountry, that.billingCountry) && Objects.equals(billingPostalCode, that.billingPostalCode) && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId, customerId, invoiceDate, billingAddress, billingCity, billingState, billingCountry, billingPostalCode, total);
    }

    @ManyToOne
    @JoinColumn(name = "CustomerId", referencedColumnName = "CustomerId", nullable = false)
    public CustomerEntity getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(CustomerEntity customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    @OneToMany(mappedBy = "invoiceByInvoiceId")
    public Collection<InvoicelineEntity> getInvoicelinesByInvoiceId() {
        return invoicelinesByInvoiceId;
    }

    public void setInvoicelinesByInvoiceId(Collection<InvoicelineEntity> invoicelinesByInvoiceId) {
        this.invoicelinesByInvoiceId = invoicelinesByInvoiceId;
    }
}
