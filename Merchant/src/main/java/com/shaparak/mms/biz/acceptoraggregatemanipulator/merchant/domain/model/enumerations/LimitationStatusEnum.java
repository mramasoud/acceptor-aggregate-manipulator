package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum LimitationStatusEnum {

    Active(0),
    Merged(1),
    RemovalDueToExpiry(2),
    ForceRemoval(3);

    LimitationStatusEnum(int limitationStatusCode) {
        this.limitationStatusCode = limitationStatusCode;
    }

    int limitationStatusCode;

    @JsonValue
    public int getLimitationStatusCode() {
        return limitationStatusCode;
    }

    public void setLimitationStatusCode(int limitationStatusCode) {
        if(limitationStatusCode < 0 || limitationStatusCode > 3){
            throw new IllegalArgumentException("The given limitation status code is invalid.");
        }

        this.limitationStatusCode = limitationStatusCode;
    }

    public static List<LimitationStatusEnum> getAllLimitationStatuses(){
        List<LimitationStatusEnum> retVal;
        retVal = new ArrayList<LimitationStatusEnum>(Arrays.asList(LimitationStatusEnum.values()));
        return retVal;
    }

    @Override
    public String toString() {
        switch (this) {
            case Active:
                return "Active";
            case Merged:
                return "Merged";
            case RemovalDueToExpiry:
                return "RemovalDueToExpiry";
            case ForceRemoval:
                return "ForceRemoval";
            default:
                return "Undefined";
        }
    }
}
