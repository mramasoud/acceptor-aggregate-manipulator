package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum MerchantTypeEnum {


    Real(0), Legal(1);

    MerchantTypeEnum(int merchantTypeCode) {
        this.merchantTypeCode = merchantTypeCode;
    }

    int merchantTypeCode;

    @JsonValue
    public int getMerchantTypeCode() {
        return merchantTypeCode;
    }

    public void setMerchantTypeCode(int merchantTypeCode) {
        if(merchantTypeCode < 0 || merchantTypeCode > 1){
            throw new IllegalArgumentException("The given merchant type code is invalid.");
        }

        this.merchantTypeCode = merchantTypeCode;
    }

    public static List<MerchantTypeEnum> getAllMerchantTypes(){
        List<MerchantTypeEnum> retVal;
        retVal = new ArrayList<MerchantTypeEnum>(Arrays.asList(MerchantTypeEnum.values()));
        return retVal;
    }

    public static MerchantTypeEnum getMerchantTypeByCode(int merchantTypeCode) {

        for (MerchantTypeEnum merchantType : MerchantTypeEnum.values()) {

            if (merchantType.getMerchantTypeCode() == merchantTypeCode) {
                return merchantType;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String value;
        switch (this.merchantTypeCode) {
            case 0:
                value = "Real";
                break;
            case 1:
                value = "Legal";
                break;
            default:
                value = "Undefined";
        }

        return value;
    }
}
