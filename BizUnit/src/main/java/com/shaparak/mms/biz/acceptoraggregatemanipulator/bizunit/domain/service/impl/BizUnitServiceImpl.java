package com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.domain.service.impl;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.web.resource.data.ShopWsDto;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.BizUnit;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.service.BizUnitService;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.repository.BizUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BizUnitServiceImpl implements BizUnitService {
    @Autowired
    BizUnitRepository bizUnitRepository;

    @Override
    public BizUnit create(ShopWsDto request) {
        return bizUnitRepository.saveAndFlush(BizUnit.fromMerchantWsDto(request));
    }

    @Override
    public void delete(Long id) {
        bizUnitRepository.deleteById(id);
    }

    @Override
    public boolean isShopExists(String merchantBizId) {
        Optional<BizUnit> findByBizId = bizUnitRepository.findByBizId(merchantBizId);
        if (findByBizId.isPresent()) {
            return true;
        } else {
            return false;
        }
    }
}
