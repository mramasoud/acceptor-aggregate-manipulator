package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum GenderEnum {

    @SerializedName("0")
    Female(0),
    @SerializedName("1")
    Male(1);

    GenderEnum(int code) {
        this.code = code;
    }

    private int code;

    @JsonValue
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static List<GenderEnum> getAllGenders(){
        List<GenderEnum> retVal;
        retVal = new ArrayList<GenderEnum>(Arrays.asList(GenderEnum.values()));
        return retVal;
    }

    public static GenderEnum getGender(boolean isMale) {
        return isMale ? GenderEnum.Male : GenderEnum.Female;
    }

    public static GenderEnum fromCivilRegistrationCode(Integer code) {
        if (code == null) {
            return null;
        }

        switch (code) {
            case 0:
                return GenderEnum.Female;
            case 1:
                return GenderEnum.Male;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        String value;

        switch (this.code) {
            case 0:
                value = "Female";
                break;
            case 1:
                value = "Male";
                break;
            default:
                value = "Undefined";
        }

        return value;
    }
}
