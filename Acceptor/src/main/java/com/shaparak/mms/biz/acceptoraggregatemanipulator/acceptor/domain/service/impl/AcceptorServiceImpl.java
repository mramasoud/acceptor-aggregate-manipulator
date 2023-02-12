package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.service.impl;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.Acceptor;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.service.AcceptorService;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.repository.AcceptorRepository;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.web.resource.data.AcceptorWsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AcceptorServiceImpl implements AcceptorService {
    @Autowired
    AcceptorRepository acceptorRepository;

    @Override
    public Acceptor create(AcceptorWsDto request) {
        return acceptorRepository.saveAndFlush(Acceptor.fromAcceptorWsDto(request));
    }

    @Override
    public void delete(Long id) {
        acceptorRepository.deleteById(id);
    }

    @Override
    public boolean isAcceptorExists(String terminalBizId) {
        Optional<Acceptor> findByBizId = acceptorRepository.findByBizId(terminalBizId);
        if (findByBizId.isPresent()) {
            return true;
        } else {
            return false;
        }
    }
}