package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.*;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.web.resource.data.MerchantWsDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "MerchantRequest")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MerchantRequest {
    @Id
    private Long merchantId;
    private Long shaparakId;
    private String shahabCode;
    private String firstNameFa;
    private String lastNameFa;
    private String fatherNameFa;
    private String firstNameEn;
    private String lastNameEn;
    private String fatherNameEn;
    private GenderEnum gender;
    private Timestamp birthDate;
    private Timestamp registerDate;
    private String nationalCode;
    private String registerNumber;
    private String comNameFa;
    private String comNameEn;
    private MerchantTypeEnum merchantType;
    private ResidencyTypeEnum residencyType;
    private VitalStatusEnum vitalStatus;
    private Long birthCrtfctNumber;
    private Integer birthCrtfctSerial;
    private BirthCertificateSeriesLetterEnum birthCrtfctSeriesLetter;
    private Integer birthCrtfctSeriesNumber;
    private ActivationStatusEnum isActive;
    private String nationalLegalCode;
    private String commercialCode;
    private Long countryId;
    private Long cityId;
    private Long provinceId;
    private String foreignPervasiveCode;
    private String passportNumber;
    private Timestamp passportExpireDate;
    private String description;
    private Long userId;
    private String telephoneNumber;
    private String cellPhoneNumber;
    private String emailAddress;
    private String webSite;
    private String fax;


    public static MerchantRequest fromDto(@NonNull MerchantWsDto merchantWsDto) {
        MerchantRequest merchant = new MerchantRequest();
        merchant.merchantId = merchantWsDto.getMerchantId();
        merchant.shaparakId = merchantWsDto.getShaparakId();
        merchant.shahabCode = merchantWsDto.getShahabCode();
        merchant.firstNameFa = merchantWsDto.getFirstNameFa();
        merchant.lastNameFa = merchantWsDto.getLastNameFa();
        merchant.fatherNameFa = merchantWsDto.getFatherNameFa();
        merchant.firstNameEn = merchantWsDto.getFirstNameEn();
        merchant.lastNameEn = merchantWsDto.getLastNameEn();
        merchant.fatherNameEn = merchantWsDto.getFatherNameEn();
        merchant.gender = merchantWsDto.getGender();
        merchant.birthDate = merchantWsDto.getBirthDate();
        merchant.registerDate = merchantWsDto.getRegisterDate();
        merchant.nationalCode = merchantWsDto.getNationalCode();
        merchant.registerNumber = merchantWsDto.getRegisterNumber();
        merchant.comNameFa = merchantWsDto.getComNameFa();
        merchant.comNameEn = merchantWsDto.getComNameEn();
        merchant.merchantType = merchantWsDto.getMerchantType();
        merchant.residencyType = merchantWsDto.getResidencyType();
        merchant.vitalStatus = merchantWsDto.getVitalStatus();
        merchant.birthCrtfctNumber = merchantWsDto.getBirthCrtfctNumber();
        merchant.birthCrtfctSerial = merchantWsDto.getBirthCrtfctSerial();
        merchant.birthCrtfctSeriesLetter = merchantWsDto.getBirthCrtfctSeriesLetter();
        merchant.birthCrtfctSeriesNumber = merchantWsDto.getBirthCrtfctSeriesNumber();
        merchant.isActive = merchantWsDto.getIsActive();
        merchant.nationalLegalCode = merchantWsDto.getNationalLegalCode();
        merchant.commercialCode = merchantWsDto.getCommercialCode();
        merchant.countryId = merchantWsDto.getCountryId();
        merchant.cityId = merchantWsDto.getCityId();
        merchant.provinceId = merchantWsDto.getProvinceId();
        merchant.foreignPervasiveCode = merchantWsDto.getForeignPervasiveCode();
        merchant.passportNumber = merchantWsDto.getPassportNumber();
        merchant.passportExpireDate = merchantWsDto.getPassportExpireDate();
        merchant.description = merchantWsDto.getDescription();
        merchant.userId = merchantWsDto.getUserId();
        merchant.telephoneNumber = merchantWsDto.getTelephoneNumber();
        merchant.cellPhoneNumber = merchantWsDto.getCellPhoneNumber();
        merchant.emailAddress = merchantWsDto.getEmailAddress();
        merchant.webSite = merchantWsDto.getWebSite();
        merchant.fax = merchantWsDto.getFax();
        return merchant;

    }
}
