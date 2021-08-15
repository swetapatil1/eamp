package com.intuit.eamp.dao;

import com.intuit.eamp.model.AccessRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRequestRepository extends CrudRepository<AccessRequest, Long> {


}
