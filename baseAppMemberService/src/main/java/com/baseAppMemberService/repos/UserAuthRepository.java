package com.baseAppMemberService.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.baseAppMemberService.entities.UserAuth;

public interface UserAuthRepository extends PagingAndSortingRepository<UserAuth, Long> {

}
