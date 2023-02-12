package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ScatteredSettlementTypeEnum {


    NoScatteredSettlement(0),
    IbansInSingleBank(1),
    IbansInMultipleBanks(2);

    ScatteredSettlementTypeEnum(int scatteredSettlementTypeCode) {
        this.scatteredSettlementTypeCode = scatteredSettlementTypeCode;
    }

    int scatteredSettlementTypeCode;

    @JsonValue
    public int getScatteredSettlementTypeCode() {
        return scatteredSettlementTypeCode;
    }

    public void setScatteredSettlementTypeCode(int scatteredSettlementTypeCode) {
        if(scatteredSettlementTypeCode < 0 || scatteredSettlementTypeCode > 2){
            throw new IllegalArgumentException("The given scattered settlement type code is invalid.");
        }

        this.scatteredSettlementTypeCode = scatteredSettlementTypeCode;
    }

    public static List<ScatteredSettlementTypeEnum> getAllScatteredSettlementTypes(){
        List<ScatteredSettlementTypeEnum> retVal;
        retVal = new ArrayList<ScatteredSettlementTypeEnum>(Arrays.asList(ScatteredSettlementTypeEnum.values()));
        return retVal;
    }

    public static ScatteredSettlementTypeEnum getScatteredSettlementTypeEnumByCode(int value) {
        for (final ScatteredSettlementTypeEnum scatteredSettlementType : ScatteredSettlementTypeEnum.values()) {
            if (scatteredSettlementType.getScatteredSettlementTypeCode() == value) {
                return scatteredSettlementType;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public String getSwitchCode() {
        switch (this) {
            case NoScatteredSettlement:
                return "N";
            case IbansInSingleBank:
                return "Y";
            case IbansInMultipleBanks:
                return "M";
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        switch (this) {
            case NoScatteredSettlement:
                return "NoScatteredSettlement";
            case IbansInSingleBank:
                return "IbansInSingleBank";
            case IbansInMultipleBanks:
                return "IbansInMultipleBanks";
            default:
                return "Undefined";
        }
    }
}
