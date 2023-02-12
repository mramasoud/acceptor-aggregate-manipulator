package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.web.resource.data.ShopWsDto;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.ActivationStatusEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.BusinessTypeEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.ETrustCertificateTypeEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.LocationOwnerShipTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "Shop")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BizUnit {
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
    String BizId;

    String generateBizId(ShopWsDto shopWsDto) {
        return BizId = null;
    }

    public static BizUnit fromMerchantWsDto(@NonNull ShopWsDto shopWsDto) {
        BizUnit bizUnit = new BizUnit();
        bizUnit.shopId = shopWsDto.getShopId();
        bizUnit.merchantId = shopWsDto.getMerchantId();
        bizUnit.telephoneNumber = shopWsDto.getTelephoneNumber();
        bizUnit.postalCode = shopWsDto.getPostalCode();
        bizUnit.taxPayerCode = shopWsDto.getTaxPayerCode();
        bizUnit.faxNumber = shopWsDto.getFaxNumber();
        bizUnit.emailAddress = shopWsDto.getEmailAddress();
        bizUnit.websiteAddress = shopWsDto.getWebsiteAddress();
        bizUnit.businessCertificateNumber = shopWsDto.getBusinessCertificateNumber();
        bizUnit.certificateExpiryDate = shopWsDto.getCertificateExpiryDate();
        bizUnit.description = shopWsDto.getDescription();
        bizUnit.isActive = shopWsDto.getIsActive();
        bizUnit.businessCategoryId = shopWsDto.getBusinessCategoryId();
        bizUnit.certificateIssueDate = shopWsDto.getCertificateIssueDate();
        bizUnit.rentalExpiryDate = shopWsDto.getRentalExpiryDate();
        bizUnit.rentalContractNumber = shopWsDto.getRentalContractNumber();
        bizUnit.address = shopWsDto.getAddress();
        bizUnit.countryId = shopWsDto.getCountryId();
        bizUnit.provinceId = shopWsDto.getProvinceId();
        bizUnit.cityId = shopWsDto.getCityId();
        bizUnit.ownershipType = shopWsDto.getOwnershipType();
        bizUnit.farsiName = shopWsDto.getFarsiName();
        bizUnit.englishName = shopWsDto.getEnglishName();
        bizUnit.businessType = shopWsDto.getBusinessType();
        bizUnit.etrustCertificateType = shopWsDto.getEtrustCertificateType();
        bizUnit.etrustCertificateIssueDate = shopWsDto.getEtrustCertificateIssueDate();
        bizUnit.etrustCertificateExpiryDate = shopWsDto.getEtrustCertificateExpiryDate();
        return bizUnit;
    }
}
