package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ResidencyTypeEnum {

    LocalResident(0), ForeignCountryResident(1);

    ResidencyTypeEnum(int residencyTypeCode){
        this.residencyTypeCode = residencyTypeCode;
    }

    int residencyTypeCode;

    @JsonValue
    public int getResidencyTypeCode() {
        return residencyTypeCode;
    }

    public void setResidencyTypeCode(int residencyTypeCode) {
        if(residencyTypeCode < 0 || residencyTypeCode > 1){
            throw new IllegalArgumentException("The given residency type code is invalid.");
        }
        this.residencyTypeCode = residencyTypeCode;
    }

    public static List<ResidencyTypeEnum> getAllResidencyTypes(){
        List<ResidencyTypeEnum> retVal;
        retVal = new ArrayList<ResidencyTypeEnum>(Arrays.asList(ResidencyTypeEnum.values()));
        return retVal;
    }

    public static ResidencyTypeEnum getResidencyTypeByCode(int residencyTypeCode) {

        for (ResidencyTypeEnum residencyTypeEnum : ResidencyTypeEnum.values()) {

            if (residencyTypeEnum.getResidencyTypeCode() == residencyTypeCode) {
                return residencyTypeEnum;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String value;
        switch (this.residencyTypeCode) {
            case 0:
                value = "LocalResident";
                break;
            case 1:
                value = "ForeignCountryResident";
                break;
            default:
                value = "Undefined";
        }

        return value;
    }
}
