package com.company.admissioncommittee.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.EmbeddedParameters;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "CONTACT", indexes = {
        @Index(name = "IDX_CONTACT_STUDENT_ID", columnList = "STUDENT_ID")
})
@Entity
public class Contact {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "STUDENT_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Student student;

    @InstanceName
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "SECOND_PHONE_NUMBER")
    private String secondPhoneNumber;

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "REG_ADDRESS_COUNTRY")),
            @AttributeOverride(name = "region", column = @Column(name = "REG_ADDRESS_REGION")),
            @AttributeOverride(name = "city", column = @Column(name = "REG_ADDRESS_CITY")),
            @AttributeOverride(name = "street", column = @Column(name = "REG_ADDRESS_STREET")),
            @AttributeOverride(name = "house", column = @Column(name = "REG_ADDRESS_HOUSE")),
            @AttributeOverride(name = "building", column = @Column(name = "REG_ADDRESS_BUILDING")),
            @AttributeOverride(name = "apartment", column = @Column(name = "REG_ADDRESS_APARTMENT")),
            @AttributeOverride(name = "index", column = @Column(name = "REG_ADDRESS_INDEX_"))
    })
    private Address regAddress;

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "REAL_ADDRESS_COUNTRY")),
            @AttributeOverride(name = "region", column = @Column(name = "REAL_ADDRESS_REGION")),
            @AttributeOverride(name = "city", column = @Column(name = "REAL_ADDRESS_CITY")),
            @AttributeOverride(name = "street", column = @Column(name = "REAL_ADDRESS_STREET")),
            @AttributeOverride(name = "house", column = @Column(name = "REAL_ADDRESS_HOUSE")),
            @AttributeOverride(name = "building", column = @Column(name = "REAL_ADDRESS_BUILDING")),
            @AttributeOverride(name = "apartment", column = @Column(name = "REAL_ADDRESS_APARTMENT")),
            @AttributeOverride(name = "index", column = @Column(name = "REAL_ADDRESS_INDEX_"))
    })
    private Address realAddress;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @DeletedBy
    @Column(name = "DELETED_BY")
    private String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedDate;

    public Address getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(Address regAddress) {
        this.regAddress = regAddress;
    }

    public Address getRealAddress() {
        return realAddress;
    }

    public void setRealAddress(Address realAddress) {
        this.realAddress = realAddress;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public void setSecondPhoneNumber(String secondPhoneNumber) {
        this.secondPhoneNumber = secondPhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}