package com.schedule.demo.repository;

import com.schedule.demo.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Long> {
    @Query("SELECT c from Contract c "+
            "where c.associatedDepartment = :departmentName " +
            "order by LOWER(c.contractName) ")
    List<Contract> findAllByAssociatedDepartment(@Param("departmentName") String departmentName);

    @Query("select c from Contract c where c.contractID = :contractId")
    Contract findContractOfAnEmployee(@Param("contractId") Long contractId);
}
