package com.baseAppMemberService.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
public class AbstractEntity {

	@JsonIgnore
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	protected Date created;

	@JsonIgnore
	@CreatedBy
	protected String createdby;

	@JsonIgnore
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	protected Date updated;

	@JsonIgnore
	@LastModifiedBy
	protected String updatedby;

	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	protected Date deleted;

	@JsonIgnore
	protected String deletedby;

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public Date getDeleted() {
		return deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

	public String getDeletedby() {
		return deletedby;
	}

	public void setDeletedby(String deletedby) {
		this.deletedby = deletedby;
	}

	@Override
	public String toString() {
		return "AbstractEntity [created=" + created + ", createdby=" + createdby + ", updated=" + updated
				+ ", updatedby=" + updatedby + ", deleted=" + deleted + ", deletedby=" + deletedby + "]";
	}

}
