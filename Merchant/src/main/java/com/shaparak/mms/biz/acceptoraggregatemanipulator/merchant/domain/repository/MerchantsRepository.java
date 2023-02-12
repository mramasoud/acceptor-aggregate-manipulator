package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.repository;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MerchantsRepository extends JpaRepository<Merchant, Long> {

    Optional<Merchant> findByBizId(String ID);

    @Modifying
    @Query(value = "delete from Merchant u where u.merchantId = ?1", nativeQuery = true)
    void deleteById(Long Id);


}
