package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.web.resource;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.Merchant;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.service.MerchantService;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.web.resource.data.MerchantWsDto;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Merchant")
public class MerchantResource {
    @Autowired
    MerchantService merchantService;

    @PostMapping(value = "/newMerchant")
    public ResponseEntity<Merchant> createNewMerchant(@RequestBody MerchantWsDto merchantWsDto) throws ExecutionControl.NotImplementedException {
        ResponseEntity<Merchant> responseEntity = new ResponseEntity<>(
                this.merchantService.create(merchantWsDto), HttpStatus.CREATED);
        return responseEntity;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void removeMerchant(@PathVariable("id") Long id) throws ExecutionControl.NotImplementedException {
        this.merchantService.delete(id);
    }

}
