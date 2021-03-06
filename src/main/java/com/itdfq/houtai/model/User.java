package com.itdfq.houtai.model;

public class User {
	private int id;
	private String username;
	private String password;
	private String unit;
	private String realName;
	private String phone;
	private String address;
	private String role;
	private String remark;
	private String delFlag;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setDelFlag(String delFlag){this.delFlag=delFlag;}
	public String getRealName() {
		return realName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDelFlag(){
		return delFlag;
	}
}
