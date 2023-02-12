package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ETrustCertificateTypeEnum {

    OneStarCertificate(0),
    TwoStarCertificate(1);

    ETrustCertificateTypeEnum(int certificateTypeCode){
        this.certificateTypeCode = certificateTypeCode;
    }

    private int certificateTypeCode;

    @JsonValue
    public int getCertificateTypeCode() {
        return certificateTypeCode;
    }

    public void setCertificateTypeCode(int certificateTypeCode) {
        if(certificateTypeCode < 0 || certificateTypeCode > 1){
            throw new IllegalArgumentException("The given E-Trust certificate type code is invalid.");
        }

        this.certificateTypeCode = certificateTypeCode;
    }

//    public static List<ETrustCertificateTypeEnum> getAllElectronicAssuranceCertificateTypes(){
//        List<ETrustCertificateTypeEnum> retVal;
//        retVal = new ArrayList<ETrustCertificateTypeEnum>(
//                Arrays.asList(ETrustCertificateTypeEnum.values()));
//        return retVal;
//    }

    @Override
    public String toString() {
        String value;
        switch (this.certificateTypeCode) {
            case 0:
                value = "OneStarCertificate";
                break;
            case 1:
                value = "TwoStarCertificate";
                break;
            default:
                value = "Undefined";
        }

        return value;
    }
}
