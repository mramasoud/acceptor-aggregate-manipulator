package com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.domain.model;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.web.resource.data.ShopWsDto;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.ActivationStatusEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.BusinessTypeEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.ETrustCertificateTypeEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.LocationOwnerShipTypeEnum;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ShopRequest")
@Data
public class BizUnitRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shop_id", nullable = false)
    private Long shopId;

    private Long merchantId;
    private String telephoneNumber;
    private String postalCode;
    private String taxPayerCode;
    private String faxNumber;
    private String emailAddress;
    private String websiteAddress;
    private String businessCertificateNumber;
    private Timestamp certificateExpiryDate;
    private String description;
    private ActivationStatusEnum isActive;
    private Long businessCategoryId;
    private Timestamp certificateIssueDate;
    private Timestamp rentalExpiryDate;
    private String rentalContractNumber;
    private String address;
    private Long countryId;
    private Long provinceId;
    private Long cityId;
    private LocationOwnerShipTypeEnum ownershipType;
    private String farsiName;
    private String englishName;
    private BusinessTypeEnum businessType;
    private ETrustCertificateTypeEnum etrustCertificateType;
    private Timestamp etrustCertificateIssueDate;
    private Timestamp etrustCertificateExpiryDate;

    public static BizUnitRequest fromDto(@NonNull ShopWsDto shopWsDto) {
            BizUnitRequest shop = new BizUnitRequest();
        shop.shopId = shopWsDto.getShopId();
        shop.merchantId = shopWsDto.getMerchantId();
        shop.telephoneNumber = shopWsDto.getTelephoneNumber();
        shop.postalCode = shopWsDto.getPostalCode();
        shop.taxPayerCode = shopWsDto.getTaxPayerCode();
        shop.faxNumber = shopWsDto.getFaxNumber();
        shop.emailAddress = shopWsDto.getEmailAddress();
        shop.websiteAddress = shopWsDto.getWebsiteAddress();
        shop.businessCertificateNumber = shopWsDto.getBusinessCertificateNumber();
        shop.certificateExpiryDate = shopWsDto.getCertificateExpiryDate();
        shop.description = shopWsDto.getDescription();
        shop.isActive = shopWsDto.getIsActive();
        shop.businessCategoryId = shopWsDto.getBusinessCategoryId();
        shop.certificateIssueDate = shopWsDto.getCertificateIssueDate();
        shop.rentalExpiryDate = shopWsDto.getRentalExpiryDate();
        shop.rentalContractNumber = shopWsDto.getRentalContractNumber();
        shop.address = shopWsDto.getAddress();
        shop.countryId = shopWsDto.getCountryId();
        shop.provinceId = shopWsDto.getProvinceId();
        shop.cityId = shopWsDto.getCityId();
        shop.ownershipType = shopWsDto.getOwnershipType();
        shop.farsiName = shopWsDto.getFarsiName();
        shop.englishName = shopWsDto.getEnglishName();
        shop.businessType = shopWsDto.getBusinessType();
        shop.etrustCertificateType = shopWsDto.getEtrustCertificateType();
        shop.etrustCertificateIssueDate = shopWsDto.getEtrustCertificateIssueDate();
        shop.etrustCertificateExpiryDate = shopWsDto.getEtrustCertificateExpiryDate();
            return shop;
        }
}
