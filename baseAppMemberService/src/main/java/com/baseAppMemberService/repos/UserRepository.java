package com.baseAppMemberService.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.baseAppMemberService.entities.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
