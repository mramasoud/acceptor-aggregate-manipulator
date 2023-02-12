package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum InfractionCodeEnum {

    HiddenPOS(0),
    GeneralInfraction(1),
    IrrelevantTerminalUse(2),
    MakingFakeTransactions(3),
    NotProvidingReceipt(4),
    NotReturningExtraAmount(5),
    UnannouncedAddressChange(6),
    NotReturningTerminal(7),
    ChargingExtraAmount(8),
    AskingForCardPin(9),
    MakingInvalidOrSimulatedTransaction(10),
    TamperingTransactions(11),
    StoringCardOwnersPersonalData(12),
    TryingToHackTheSystem(13),
    BreakingCardOwnersTrust(14),
    ProvidingFabricatedInformation(15),
    TamperingTerminal(16),
    JudicialOrder(17),
    MoneyLaundering(18),
    MakingLiquidityCycleDisorders(19);

    InfractionCodeEnum(int infractionCode) {
        this.infractionCode = infractionCode;
    }

    int infractionCode;

    @JsonValue
    public int getInfractionCode() {
        return infractionCode;
    }

    public void setInfractionCode(int infractionCode) {
        if(infractionCode < 0 || infractionCode > 19){
            throw new IllegalArgumentException("The given infraction code is invalid.");
        }

        this.infractionCode = infractionCode;
    }

    public static List<InfractionCodeEnum> getAllInfractionCodes(){
        List<InfractionCodeEnum> retVal;
        retVal = new ArrayList<InfractionCodeEnum>(Arrays.asList(InfractionCodeEnum.values()));
        return retVal;
    }

    @Override
    public String toString() {
        switch (this) {
            case HiddenPOS:
                return "HiddenPOS";
            case GeneralInfraction:
                return "GeneralInfraction";
            case IrrelevantTerminalUse:
                return "IrrelevantTerminalUse";
            case MakingFakeTransactions:
                return "MakingFakeTransactions";
            case NotProvidingReceipt:
                return "NotProvidingReceipt";
            case NotReturningExtraAmount:
                return "NotReturningExtraAmount";
            case UnannouncedAddressChange:
                return "UnannouncedAddressChange";
            case NotReturningTerminal:
                return "NotReturningTerminal";
            case ChargingExtraAmount:
                return "ChargingExtraAmount";
            case AskingForCardPin:
                return "AskingForCardPin";
            case MakingInvalidOrSimulatedTransaction:
                return "MakingInvalidOrSimulatedTransaction";
            case TamperingTransactions:
                return "TamperingTransactions";
            case StoringCardOwnersPersonalData:
                return "StoringCardOwnersPersonalData";
            case TryingToHackTheSystem:
                return "TryingToHackTheSystem";
            case BreakingCardOwnersTrust:
                return "BreakingCardOwnersTrust";
            case ProvidingFabricatedInformation:
                return "ProvidingFabricatedInformation";
            case TamperingTerminal:
                return "TamperingTerminal";
            case JudicialOrder:
                return "JudicialOrder";
            case MoneyLaundering:
                return "MoneyLaundering";
            case MakingLiquidityCycleDisorders:
                return "MakingLiquidityCycleDisorders";
            default:
                return "Undefined";
        }
    }

    public int getSwitchCode() {
        switch (this) {
            case HiddenPOS:
                return 101;
            case GeneralInfraction:
                return 102;
            case IrrelevantTerminalUse:
                return 201;
            case MakingFakeTransactions:
                return 202;
            case NotProvidingReceipt:
                return 203;
            case NotReturningExtraAmount:
                return 204;
            case UnannouncedAddressChange:
                return 205;
            case NotReturningTerminal:
                return 206;
            case ChargingExtraAmount:
                return 207;
            case AskingForCardPin:
                return 208;
            case MakingInvalidOrSimulatedTransaction:
                return 301;
            case TamperingTransactions:
                return 302;
            case StoringCardOwnersPersonalData:
                return 303;
            case TryingToHackTheSystem:
                return 304;
            case BreakingCardOwnersTrust:
                return 305;
            case ProvidingFabricatedInformation:
                return 306;
            case TamperingTerminal:
                return 307;
            case JudicialOrder:
                return 401;
            case MoneyLaundering:
                return 402;
            case MakingLiquidityCycleDisorders:
                return 403;
            default:
                return -1;
        }
    }
}
