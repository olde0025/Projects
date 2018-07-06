package com.BaseApp.services.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.BaseApp.services.entities.Useraddress;

public interface UseraddressRepository extends PagingAndSortingRepository<Useraddress, Long> {

}
