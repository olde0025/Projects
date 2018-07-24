package com.baseAppMemberService.repos;

import org.springframework.stereotype.Repository;

import com.baseAppMemberService.entities.User;

@Repository
public class UserRepository extends GenericRepository<User> {

	@Override
	protected void updateIfExists(User original, User updated) {
		original.setPrefix(updated.getPrefix());
		original.setFirstname(updated.getFirstname());
		original.setMiddlename(updated.getMiddlename());
		original.setLastname(updated.getLastname());
		original.setSuffix(updated.getSuffix());

	}

}
