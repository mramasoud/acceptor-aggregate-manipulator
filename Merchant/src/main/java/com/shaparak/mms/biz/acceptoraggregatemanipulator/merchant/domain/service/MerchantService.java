package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.service;


import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.Merchant;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.web.resource.data.MerchantWsDto;
import jdk.jshell.spi.ExecutionControl;

public interface MerchantService {
     Merchant create(MerchantWsDto request) throws ExecutionControl.NotImplementedException;

     void delete(Long id ) throws ExecutionControl.NotImplementedException;
     boolean isMerchantLimited(Long id);

    Merchant merchantExistOrNotExist(String merchantBizId, MerchantWsDto merchantWsDto);

}
