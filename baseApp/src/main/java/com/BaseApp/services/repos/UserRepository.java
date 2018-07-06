package com.BaseApp.services.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.BaseApp.services.entities.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
