package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.web.resource;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.Acceptor;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.service.AcceptorService;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.web.resource.data.AcceptorWsDto;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/acceptor")
public class AcceptorResource {
    @Autowired
    AcceptorService acceptorService;

    @PostMapping(value = "/newAcceptor")
    public ResponseEntity<Acceptor> createNewAcceptor(@RequestBody AcceptorWsDto acceptorWsDto) throws ExecutionControl.NotImplementedException {
        ResponseEntity<Acceptor> responseEntity = new ResponseEntity<>(
                this.acceptorService.create(acceptorWsDto), HttpStatus.CREATED);
        return responseEntity;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void removeAcceptor(@PathVariable("id") Long id) throws ExecutionControl.NotImplementedException {
        this.acceptorService.delete(id);
    }
}
