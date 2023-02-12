package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.repository;


import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.Limitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LimitedMerchantRepository extends JpaRepository<Limitation,Long> {
}
