package com.BaseApp.services.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.BaseApp.services.entities.UserAuth;

public interface UserAuthRepository extends PagingAndSortingRepository<UserAuth, Long> {

}
