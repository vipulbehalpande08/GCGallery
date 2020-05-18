package com.gcg.app.beans;

public class AccessPermission {

	private int accessPermissionId;
	private String permissionName;
	private String permissionDescription;
	private String permissionType;
	public int getAccessPermissionId() {
		return accessPermissionId;
	}
	public void setAccessPermissionId(int accessPermissionId) {
		this.accessPermissionId = accessPermissionId;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionDescription() {
		return permissionDescription;
	}
	public void setPermissionDescription(String permissionDescription) {
		this.permissionDescription = permissionDescription;
	}
	public String getPermissionType() {
		return permissionType;
	}
	public void setPermissionType(String permissionType) {
		this.permissionType = permissionType;
	}
	
}
