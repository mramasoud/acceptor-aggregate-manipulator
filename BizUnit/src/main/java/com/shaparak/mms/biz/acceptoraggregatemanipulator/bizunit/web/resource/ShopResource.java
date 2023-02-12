package com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.web.resource;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.web.resource.data.ShopWsDto;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.BizUnit;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.service.BizUnitService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Shop")
public class ShopResource {
    @Autowired
    BizUnitService bizUnitService;

    @PostMapping(value = "/newShop")
    public ResponseEntity<BizUnit> createNewShop(@RequestBody ShopWsDto shopWsDto) throws ExecutionControl.NotImplementedException {
        ResponseEntity<BizUnit> responseEntity = new ResponseEntity<>(
                this.bizUnitService.create(shopWsDto), HttpStatus.CREATED);
        return responseEntity;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void removeShop(@PathVariable("id") Long id) throws ExecutionControl.NotImplementedException {
        this.bizUnitService.delete(id);
    }

}
