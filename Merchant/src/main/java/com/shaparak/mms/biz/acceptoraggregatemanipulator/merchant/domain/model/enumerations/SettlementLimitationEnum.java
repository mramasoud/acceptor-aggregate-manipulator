package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum SettlementLimitationEnum {

    FirstCycleSettlementLimitation(0),
    NightlyCycleSettlementLimitation(1),
    NoLimitation(2);

    SettlementLimitationEnum(int settlementLimitationCode) {
        this.settlementLimitationCode = settlementLimitationCode;
    }

    int settlementLimitationCode;

    @JsonValue
    public int getSettlementLimitationCode() {
        return settlementLimitationCode;
    }

    public void setSettlementLimitationCode(int settlementLimitationCode) {
        if(settlementLimitationCode < 0 || settlementLimitationCode > 2){
            throw new IllegalArgumentException("The given settlement limitation code is invalid.");
        }

        this.settlementLimitationCode = settlementLimitationCode;
    }

    public static List<SettlementLimitationEnum> getAllSettlementLimitations(){
        List<SettlementLimitationEnum> retVal;
        retVal = new ArrayList<SettlementLimitationEnum>(Arrays.asList(SettlementLimitationEnum.values()));
        return retVal;
    }

    @Override
    public String toString() {
        switch (this) {
            case FirstCycleSettlementLimitation:
                return "FirstCycleSettlementLimitation";
            case NightlyCycleSettlementLimitation:
                return "NightlyCycleSettlementLimitation";
            case NoLimitation:
                return "NoLimitation";
            default:
                return "Undefined";
        }
    }

    public String getSwitchCode() {
        switch (this) {
            case FirstCycleSettlementLimitation:
                return "FB";
            case NightlyCycleSettlementLimitation:
                return "DB";
            case NoLimitation:
                return "ND";
            default:
                return "Undefined";
        }
    }
}
