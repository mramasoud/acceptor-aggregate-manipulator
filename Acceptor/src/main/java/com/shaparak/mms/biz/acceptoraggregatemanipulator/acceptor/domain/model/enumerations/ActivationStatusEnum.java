package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ActivationStatusEnum {

    Inactive(0), Active(1);

    ActivationStatusEnum(int activationStatusCode){
        this.activationStatusCode = activationStatusCode;
    }

    private int activationStatusCode;

    @JsonValue
    public int getActivationStatusCode() {
        return activationStatusCode;
    }

    public void setActivationStatusCode(int activationStatusCode) {
        if(activationStatusCode < 0 || activationStatusCode > 1){
            throw new IllegalArgumentException("The given activation status code is invalid.");
        }
        this.activationStatusCode = activationStatusCode;
    }

    public List<ActivationStatusEnum> getAllActivationStatuses() {
        List<ActivationStatusEnum> retVal;
        retVal = new ArrayList<ActivationStatusEnum>(Arrays.asList(this.values()));
        return retVal;
    }

    @Override
    public String toString(){
        String value;
        switch (this.activationStatusCode){
            case 0:
                value = "Inactive";
                break;
            case 1:
                value = "Active";
                break;
            default:
                value = "Undefined";
        }

        return value;
    }

    public String getSwitchCode() {
        switch (this) {
            case Inactive:
                return "N";
            case Active:
                return "Y";
            default:
                return null;
        }
    }
}
