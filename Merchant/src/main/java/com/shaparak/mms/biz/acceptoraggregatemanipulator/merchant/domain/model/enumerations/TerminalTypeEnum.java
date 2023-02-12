package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TerminalTypeEnum {

    Pos(0),
    Int(1),
    Mob(2),
    WirelessPos(3),
    QR(4),
    HybridQR(5),
    Ikt(6),
    App(7);

    TerminalTypeEnum(int terminalTypeCode) {
        this.terminalTypeCode = terminalTypeCode;
    }

    int terminalTypeCode;

    public static TerminalTypeEnum getTerminalTypeByCode(Integer value) {
        for (final TerminalTypeEnum anEnum : TerminalTypeEnum.values()) {
            if (anEnum.getTerminalTypeCode() == value) {
                return anEnum;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    @JsonValue
    public int getTerminalTypeCode() {
        return terminalTypeCode;
    }

    public static TerminalTypeEnum getBySwitchCode(String switchCode) {
        if ("POS".equals(switchCode)) {
            return TerminalTypeEnum.Pos;
        } else if ("INT".equals(switchCode)) {
            return TerminalTypeEnum.Int;
        } else if ("MOB".equals(switchCode)) {
            return TerminalTypeEnum.Mob;
        } else if ("IKT".equals(switchCode)) {
            return TerminalTypeEnum.Ikt;
        } else if ("APP".equals(switchCode)) {
            return TerminalTypeEnum.App;
        } else {
            return null;
        }
    }

    public static List<TerminalTypeEnum> getAllTerminalTypes() {
        List<TerminalTypeEnum> retVal;
        retVal = new ArrayList<TerminalTypeEnum>(Arrays.asList(TerminalTypeEnum.values()));
        return retVal;
    }

  /*  public static HashMap<String, String> getAllTerminalTypesWithTrl(Locale locale) {
        HashMap<String, String> retVal = new HashMap<String, String>();
        MessageSource messageSource;
        ApplicationContext currentAppContext = ApplicationContextProvider.getApplicationContext();
        messageSource = (MessageSource) currentAppContext.getBean("messageSource");
        for (TerminalTypeEnum enumValue : TerminalTypeEnum.values()) {
            retVal.put(enumValue.toString(), messageSource.getMessage(enumValue.toString(), null, locale));
        }
        return retVal;
    }
*/
    public void setTerminalTypeCode(int terminalTypeCode) {
        if (terminalTypeCode < 0 || terminalTypeCode > 7) {
            throw new IllegalArgumentException("The given terminal type code is invalid.");
        }

        this.terminalTypeCode = terminalTypeCode;
    }

    @Override
    public String toString() {
        String value;
        switch (this.terminalTypeCode) {
            case 0:
                value = "Pos";
                break;
            case 1:
                value = "Int";
                break;
            case 2:
                value = "Mob";
                break;
            case 3:
                value = "WirelessPos";
                break;
            case 4:
                value = "QR";
                break;
            case 5:
                value = "HybridQR";
                break;
            case 6:
                value = "Ikt";
                break;
            case 7:
                value = "App";
                break;
            default:
                value = "Undefined";
        }

        return value;
    }

    public String getSwitchCode() {
        switch (this) {
            case Pos:
            case WirelessPos:
                return "POS";
            case Int:
            case QR:
            case HybridQR:
                return "INT";
            case Mob:
                return "MOB";
            case Ikt:
                return "IKT";
            case App:
                return "APP";
            default:
                return "UNDEFINED";
        }
    }
/*    public boolean verifySubsidyCode(SubsidyTypeEnum subsidyTypeEnum) {

        switch (this) {
            case Pos:
            case WirelessPos:
                return true;
            case Int:
            case QR:
            case HybridQR:
            case App:
            case Mob:
            case Ikt:
                if(SubsidyTypeEnum.SubsidyByMenu != subsidyTypeEnum){
                    return true;
                }else{
                    return false;
                }
            default:
                return false;
        }
    }*/
}
