package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum LimitationTypeEnum {

    AddMerchantToBlackList(0),
    LimitMerchant(1),
    LimitAcceptor(2),
    LimitPsp(3),
    AddAcceptorToBlackList(4);

    int limitationTypeCode;

    LimitationTypeEnum(int limitationTypeCode) {
        this.limitationTypeCode = limitationTypeCode;
    }

    public static List<LimitationTypeEnum> getAllLimitationTypes() {
        List<LimitationTypeEnum> retVal;
        retVal = new ArrayList<LimitationTypeEnum>(Arrays.asList(LimitationTypeEnum.values()));
        return retVal;
    }

    public static List<LimitationTypeEnum> getAllMerchantLimitationTypes() {
        List<LimitationTypeEnum> retVal = new ArrayList<LimitationTypeEnum>();

        retVal.add(LimitationTypeEnum.AddMerchantToBlackList);
        retVal.add(LimitationTypeEnum.AddAcceptorToBlackList);

        return retVal;
    }

    @JsonValue
    public int getLimitationTypeCode() {
        return limitationTypeCode;
    }

    public String getSwitchCode() {
        switch (this) {
            case AddMerchantToBlackList:
            case AddAcceptorToBlackList:
                return "D";
            case LimitMerchant:
                return "C";
            case LimitAcceptor:
                return "A";
            case LimitPsp:
                return "P";
            default:
                return "Undefined";
        }
    }
}
