package com.example.UserMicroservice.dao;

import java.util.List;

public class OutputUser {
	
	private int pageNo;
	private int pageSize;
	private int totalPages;
	private List<User> data;
	
	public OutputUser(int pageNo, int pageSize, int totalPages, List<User> data) {
		super();
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalPages = totalPages;
		this.data = data;
	}

	public OutputUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}
	

}
