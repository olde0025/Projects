package com.baseAppMemberService.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userauth")
public class UserAuth extends AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userauthid;

	// TODO: Need to make username unique
	private String username;
	private String password;
	private int userstatus;
	private int passwordattempts;
	private boolean islocked;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private User user;

	public Long getUserAuthId() {
		return userauthid;
	}

	public void setUserAuthId(Long userAuthId) {
		this.userauthid = userAuthId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserStatus() {
		return userstatus;
	}

	public void setUserStatus(int userStatus) {
		this.userstatus = userStatus;
	}

	public int getPasswordAttempts() {
		return passwordattempts;
	}

	public void setPasswordAttempts(int passwordAttempts) {
		this.passwordattempts = passwordAttempts;
	}

	public boolean isLocked() {
		return islocked;
	}

	public void setLocked(boolean isLocked) {
		this.islocked = isLocked;
	}

	@Override
	public String toString() {
		return "UserAuth [userAuthId=" + userauthid + ", username=" + username + ", password=" + password
				+ ", userStatus=" + userstatus + ", passwordAttempts=" + passwordattempts + ", isLocked=" + islocked
				+ ", created=" + created + ", createdby=" + createdby + ", updated=" + updated + ", updatedby="
				+ updatedby + ", deleted=" + deleted + ", deletedby=" + deletedby + "]";
	}

}
