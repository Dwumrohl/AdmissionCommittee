package com.company.admissioncommittee.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@JmixEntity
@Embeddable
public class Documents {
    @Column(name = "DOC_SNILS")
    private Integer docSNILS;

    @Column(name = "PASSPORT", nullable = false)
    @NotNull
    private String passport;

    @Column(name = "DOC_INN")
    private Integer docINN;

    public Integer getDocINN() {
        return docINN;
    }

    public void setDocINN(Integer docINN) {
        this.docINN = docINN;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Integer getDocSNILS() {
        return docSNILS;
    }

    public void setDocSNILS(Integer docSNILS) {
        this.docSNILS = docSNILS;
    }
}