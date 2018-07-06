package com.baseAppMemberService.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.baseAppMemberService.entities.User;

@RepositoryRestResource(collectionResourceRel = "users2", path = "users2")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
