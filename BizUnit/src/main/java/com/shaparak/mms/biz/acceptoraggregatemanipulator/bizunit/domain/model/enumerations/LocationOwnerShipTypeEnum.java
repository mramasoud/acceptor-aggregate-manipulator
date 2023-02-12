package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LocationOwnerShipTypeEnum {


    Owned(0),
    Leased(1);

    LocationOwnerShipTypeEnum(int ownershipTypeCode) {
        this.ownershipTypeCode = ownershipTypeCode;
    }

    int ownershipTypeCode;

    @JsonValue
    public int getOwnershipTypeCode() {
        return ownershipTypeCode;
    }

    public void setOwnershipTypeCode(int ownershipTypeCode) {
        if(ownershipTypeCode < 0 || ownershipTypeCode > 1){
            throw new IllegalArgumentException("The given ownership type code is invalid.");
        }

        this.ownershipTypeCode = ownershipTypeCode;
    }

//    public static List<LocationOwnerShipTypeEnum> getAllLocationOwnershipTypes(){
//        List<LocationOwnerShipTypeEnum> retVal;
//        retVal = new ArrayList<LocationOwnerShipTypeEnum>(Arrays.asList(LocationOwnerShipTypeEnum.values()));
//        return retVal;
//    }

    @Override
    public String toString() {
        String value;
        switch (this.ownershipTypeCode) {
            case 0:
                value = "Owned";
                break;
            case 1:
                value = "Leased";
                break;
            default:
                value = "Undefined";
        }

        return value;
    }
}
