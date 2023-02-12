package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.service;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.web.resource.data.ShopWsDto;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.BizUnit;
import jdk.jshell.spi.ExecutionControl;

public interface BizUnitService {
     BizUnit create(ShopWsDto request) throws ExecutionControl.NotImplementedException;

     void delete(Long id ) throws ExecutionControl.NotImplementedException;

    boolean isShopExists(String merchantBizId);

}
