package org.springframework.security.acls.mongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.security.acls.mongodb.model.AclSid;


public interface AclSidRepository extends MongoRepository<AclSid, String>, QueryDslPredicateExecutor<AclSid> {

}
