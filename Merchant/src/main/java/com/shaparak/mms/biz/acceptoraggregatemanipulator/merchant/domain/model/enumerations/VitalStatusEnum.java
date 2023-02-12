package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum VitalStatusEnum {
    Alive(0), Deceased(1);

    VitalStatusEnum(int vitalStatusCode) {
        this.vitalStatusCode = vitalStatusCode;
    }

    int vitalStatusCode;

    @JsonValue
    public int getVitalStatusCode() {
        return vitalStatusCode;
    }

    public void setVitalStatusCode(int vitalStatusCode) {
        if (vitalStatusCode < 0 || vitalStatusCode > 1) {
            throw new IllegalArgumentException("The given vital status code is not valid.");
        }

        this.vitalStatusCode = vitalStatusCode;
    }

    public static List<VitalStatusEnum> getAllVitalStatuses() {
        List<VitalStatusEnum> retVal;
        retVal = new ArrayList<VitalStatusEnum>(Arrays.asList(VitalStatusEnum.values()));
        return retVal;
    }

    public static VitalStatusEnum fromCivilRegistrationCode(int code) {
        switch (code) {
            case 0:
                return VitalStatusEnum.Alive;
            case 1:
                return VitalStatusEnum.Deceased;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        String value;
        switch (this.vitalStatusCode) {
            case 0:
                value = "Alive";
                break;
            case 1:
                value = "Deceased";
                break;
            default:
                value = "Undefined";
        }

        return value;
    }
}
