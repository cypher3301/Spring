package ua.mytestprojects.springapp.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "employee", schema = "chinook", catalog = "")
public class EmployeeEntity implements BaseEntity{
    private boolean deleted;

    private Long id;
    private int employeeId;
    private String lastName;
    private String firstName;
    private String title;
    private Integer reportsTo;
    private Timestamp birthDate;
    private Timestamp hireDate;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String phone;
    private String fax;
    private String email;
    private Collection<CustomerEntity> customersByEmployeeId;
    private EmployeeEntity employeeByReportsTo;
    private Collection<EmployeeEntity> employeesByEmployeeId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "EmployeeId", nullable = false)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "LastName", nullable = false, length = 20)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "FirstName", nullable = false, length = 20)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "Title", nullable = true, length = 30)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "ReportsTo", nullable = true)
    public Integer getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Integer reportsTo) {
        this.reportsTo = reportsTo;
    }

    @Basic
    @Column(name = "BirthDate", nullable = true)
    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "HireDate", nullable = true)
    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    @Basic
    @Column(name = "Address", nullable = true, length = 70)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "City", nullable = true, length = 40)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "State", nullable = true, length = 40)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "Country", nullable = true, length = 40)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "PostalCode", nullable = true, length = 10)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "Phone", nullable = true, length = 24)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "Fax", nullable = true, length = 24)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = 60)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return employeeId == that.employeeId && Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName) && Objects.equals(title, that.title) && Objects.equals(reportsTo, that.reportsTo) && Objects.equals(birthDate, that.birthDate) && Objects.equals(hireDate, that.hireDate) && Objects.equals(address, that.address) && Objects.equals(city, that.city) && Objects.equals(state, that.state) && Objects.equals(country, that.country) && Objects.equals(postalCode, that.postalCode) && Objects.equals(phone, that.phone) && Objects.equals(fax, that.fax) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, lastName, firstName, title, reportsTo, birthDate, hireDate, address, city, state, country, postalCode, phone, fax, email);
    }

    @OneToMany(mappedBy = "employeeBySupportRepId")
    public Collection<CustomerEntity> getCustomersByEmployeeId() {
        return customersByEmployeeId;
    }

    public void setCustomersByEmployeeId(Collection<CustomerEntity> customersByEmployeeId) {
        this.customersByEmployeeId = customersByEmployeeId;
    }

    @ManyToOne
    @JoinColumn(name = "ReportsTo", referencedColumnName = "EmployeeId")
    public EmployeeEntity getEmployeeByReportsTo() {
        return employeeByReportsTo;
    }

    public void setEmployeeByReportsTo(EmployeeEntity employeeByReportsTo) {
        this.employeeByReportsTo = employeeByReportsTo;
    }

    @OneToMany(mappedBy = "employeeByReportsTo")
    public Collection<EmployeeEntity> getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(Collection<EmployeeEntity> employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }

    @Override
    public Boolean getDeleted() {
        return deleted;
    }

    @Override
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
