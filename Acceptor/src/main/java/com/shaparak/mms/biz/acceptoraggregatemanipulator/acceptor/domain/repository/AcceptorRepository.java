package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.repository;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model.Acceptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AcceptorRepository extends JpaRepository<Acceptor, Long> {

    Optional<Acceptor> findByBizId(String ID);

    @Modifying
    @Query(value = "delete from Acceptor u where u.acceptorId = ?1", nativeQuery = true)
    void deleteById(Long Id);


}
