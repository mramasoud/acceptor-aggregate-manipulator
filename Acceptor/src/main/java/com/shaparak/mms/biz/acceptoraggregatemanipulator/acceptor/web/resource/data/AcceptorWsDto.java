package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.web.resource.data;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.enumerations.AcceptorTypeEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.enumerations.ActivationStatusEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.enumerations.ScatteredSettlementTypeEnum;
import lombok.Data;

@Data
public class AcceptorWsDto {
    private Long acceptorId;
    private Long facilitatorAcceptorId;
    private Long shopId;
    private Long switchId;
    private Long oldSystemAcceptorId;
    private String acceptorCode;
    private AcceptorTypeEnum acceptorType;
    private String taxPayerCode;
    private Boolean cancelable;
    private Boolean refundable;
    private Boolean blockAble;
    private Boolean chargeBackAble;
    private Boolean settledSeparately;
    private ScatteredSettlementTypeEnum allowScatteredSettlement;
    private Boolean acceptCreditCardTransaction;
    private Boolean allowIranianProductsTrx;
    private Boolean allowKaraCardTrx;
    private Boolean allowGoodsBasketTrx;
    private Boolean allowFoodSecurityTrx;
    private Boolean allowJcbCardTrx;
    private Boolean allowUpiCardTrx;
    private Boolean allowVisaCardTrx;
    private Boolean allowMasterCardTrx;
    private Boolean allowAmericanExpressTrx;
    private Boolean allowOtherInternationACardsTrx;
    private String description;
    private ActivationStatusEnum isActive;
    private Long userId;
}
