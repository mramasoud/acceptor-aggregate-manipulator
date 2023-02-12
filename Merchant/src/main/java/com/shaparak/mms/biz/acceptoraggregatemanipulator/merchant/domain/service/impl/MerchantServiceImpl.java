package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.service.impl;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.Limitation;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.Merchant;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.repository.LimitedMerchantRepository;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.repository.MerchantsRepository;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.service.MerchantService;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.web.resource.data.MerchantWsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.Optional;

@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    MerchantsRepository merchantsRepository;
    @Autowired
    LimitedMerchantRepository limitedMerchantRepository;

    @Override
    public Merchant create(MerchantWsDto request) {
        return merchantsRepository.saveAndFlush(Merchant.fromMerchantWsDto(request));
    }

    @Override
    public void delete(Long id) {
        merchantsRepository.deleteById(id);
    }

    @Override
    public boolean isMerchantLimited(Long id) {
        Optional<Limitation> byId = limitedMerchantRepository.findById(id);
        if (byId.isPresent() && byId.get().getStatus().ordinal() == 0)
            return true;
        else
            return false;
    }


    @Override
    @Transactional(rollbackOn = {SQLException.class})
    public Merchant merchantExistOrNotExist(String merchantBizId, MerchantWsDto merchantWsDto) {
        Optional<Merchant> findByBizId = merchantsRepository.findByBizId(merchantBizId);
        return findByBizId.orElse(null);
    }
}
