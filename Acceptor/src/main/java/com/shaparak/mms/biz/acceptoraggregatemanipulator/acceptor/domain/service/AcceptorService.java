package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.service;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.Acceptor;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.web.resource.data.AcceptorWsDto;
import jdk.jshell.spi.ExecutionControl;

public interface AcceptorService {
     Acceptor create(AcceptorWsDto request) throws ExecutionControl.NotImplementedException;

     void delete(Long id ) throws ExecutionControl.NotImplementedException;

    boolean isAcceptorExists(String terminalBizId);

}
