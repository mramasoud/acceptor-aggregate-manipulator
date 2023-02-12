package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.enumerations.AcceptorTypeEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.enumerations.ActivationStatusEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.enumerations.ScatteredSettlementTypeEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.web.resource.data.AcceptorWsDto;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "AcceptorRequest")
@Data
public class AcceptorRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "acceptorRequest_id", nullable = false)
    private Long acceptorRequestId;
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

    public static AcceptorRequest fromWsDto(@NonNull AcceptorWsDto acceptorWsDto) {
        AcceptorRequest acceptor = new AcceptorRequest();
        acceptor.acceptorRequestId = acceptorWsDto.getAcceptorId();
        acceptor.facilitatorAcceptorId = acceptorWsDto.getFacilitatorAcceptorId();
        acceptor.shopId = acceptorWsDto.getShopId();
        acceptor.switchId = acceptorWsDto.getSwitchId();
        acceptor.oldSystemAcceptorId = acceptorWsDto.getOldSystemAcceptorId();
        acceptor.acceptorCode = acceptorWsDto.getAcceptorCode();
        acceptor.acceptorType = acceptorWsDto.getAcceptorType();
        acceptor.taxPayerCode = acceptorWsDto.getTaxPayerCode();
        acceptor.cancelable = acceptorWsDto.getCancelable();
        acceptor.refundable = acceptorWsDto.getRefundable();
        acceptor.blockAble = acceptorWsDto.getBlockAble();
        acceptor.chargeBackAble = acceptorWsDto.getChargeBackAble();
        acceptor.settledSeparately = acceptorWsDto.getSettledSeparately();
        acceptor.allowScatteredSettlement = acceptorWsDto.getAllowScatteredSettlement();
        acceptor.acceptCreditCardTransaction = acceptorWsDto.getAcceptCreditCardTransaction();
        acceptor.allowIranianProductsTrx = acceptorWsDto.getAllowIranianProductsTrx();
        acceptor.allowKaraCardTrx = acceptorWsDto.getAllowKaraCardTrx();
        acceptor.allowGoodsBasketTrx = acceptorWsDto.getAllowGoodsBasketTrx();
        acceptor.allowFoodSecurityTrx = acceptorWsDto.getAllowFoodSecurityTrx();
        acceptor.allowJcbCardTrx = acceptorWsDto.getAllowJcbCardTrx();
        acceptor.allowUpiCardTrx = acceptorWsDto.getAllowUpiCardTrx();
        acceptor.allowVisaCardTrx = acceptorWsDto.getAllowVisaCardTrx();
        acceptor.allowMasterCardTrx = acceptorWsDto.getAllowMasterCardTrx();
        acceptor.allowAmericanExpressTrx = acceptorWsDto.getAllowAmericanExpressTrx();
        acceptor.allowOtherInternationACardsTrx = acceptorWsDto.getAllowOtherInternationACardsTrx();
        acceptor.description = acceptorWsDto.getDescription();
        acceptor.isActive = acceptorWsDto.getIsActive();
        acceptor.userId = acceptorWsDto.getUserId();
        return acceptor;
    }
}
