package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum AcceptorTypeEnum {

    Simple(0),
    PaymentFacilitator(1),
    Sponsored(2),
    DirectSettlementSponsored(3),
    DirectSettlementPaymentFacilitator(4);

    AcceptorTypeEnum(int acceptorTypeCode) {
        this.acceptorTypeCode = acceptorTypeCode;
    }

    int acceptorTypeCode;

    @JsonValue
    public int getAcceptorTypeCode() {
        return acceptorTypeCode;
    }

    public static List<AcceptorTypeEnum> getAllAcceptorTypes(){
        return new ArrayList<AcceptorTypeEnum>(Arrays.asList(AcceptorTypeEnum.values()));
    }

    public static AcceptorTypeEnum getAcceptorTypeByCode(Integer value) {
        for (final AcceptorTypeEnum anEnum : AcceptorTypeEnum.values()) {
            if (anEnum.getAcceptorTypeCode()==value) {
                return anEnum;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static List<AcceptorTypeEnum> getAllPfAcceptorTypes() {
        List<AcceptorTypeEnum> pfTypes = new ArrayList<>();
        pfTypes.add(AcceptorTypeEnum.PaymentFacilitator);
        pfTypes.add(AcceptorTypeEnum.DirectSettlementPaymentFacilitator);
        return pfTypes;
    }
}
