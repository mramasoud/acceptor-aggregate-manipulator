package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum BusinessTypeEnum {


    Physical(0),
    PhysicalAndVirtual(1),
    Virtual(2);

    BusinessTypeEnum(int BusinessTypeCode) {
        this.BusinessTypeCode = BusinessTypeCode;
    }

    int BusinessTypeCode;

    @JsonValue
    public int getBusinessTypeCode() {
        return BusinessTypeCode;
    }

    public void setBusinessTypeCode(int BusinessTypeCode) {
        if(BusinessTypeCode < 0 || BusinessTypeCode > 2){
            throw new IllegalArgumentException("The given business type code is invalid.");
        }

        this.BusinessTypeCode = BusinessTypeCode;
    }

    public static List<BusinessTypeEnum> getAllBusinessTypes(){
        List<BusinessTypeEnum> retVal;
        retVal = new ArrayList<BusinessTypeEnum>(Arrays.asList(BusinessTypeEnum.values()));
        return retVal;
    }

    @Override
    public String toString() {
        switch (this) {
            case Physical:
                return "Physical";
            case PhysicalAndVirtual:
                return "PhysicalAndVirtual";
            case Virtual:
                return "Virtual";
            default:
                return "Undefined";
        }
    }
}
