package com.nineplus.bestwork.utils;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class ConvertResponseUtils {

	public String convertResponseCompany(String item) {
		HashMap<String, String> itemCompany = new HashMap<>();
		String columnMapped = "";
		itemCompany.put("id", "id");
		itemCompany.put("companyName", "company_name");
		itemCompany.put("city", "province_city");
		itemCompany.put("district", "district");
		itemCompany.put("ward", "ward");
		itemCompany.put("street", "street");
		itemCompany.put("telNo", "tel_no");
		itemCompany.put("startDate", "start_date");
		itemCompany.put("expiredDate", "expired_date");
		itemCompany.put("status", "is_expired");
		itemCompany.put("cpEmail", "email");
		if (itemCompany.containsKey(item)) {
			columnMapped = itemCompany.get(item);
		}
		return columnMapped;
	}

	public String convertResponseUser(String item) {
		HashMap<String, String> itemUser = new HashMap<>();
		String columnMapped = "";
		itemUser.put("id", "id");
		itemUser.put("password", "password");
		itemUser.put("createBy", "create_by");
		itemUser.put("updateBy", "update_by");
		itemUser.put("firstName", "first_name");
		itemUser.put("lastName", "last_name");
		itemUser.put("userName", "user_name");
		itemUser.put("countLoginFailed", "count_login_failed");
		itemUser.put("uTelNo", "tel_no");
		itemUser.put("createDate", "create_date");
		itemUser.put("updateDate", "update_date");
		itemUser.put("role", "app_role_id");
		itemUser.put("uEmail", "email");
		if (itemUser.containsKey(item)) {
			columnMapped = itemUser.get(item);
		}
		return columnMapped;
	}
	
	public String convertResponseProject(String item) {
		HashMap<String, String> itemProject = new HashMap<>();
		String columnMapped = "";
		itemProject.put("id", "id");
		itemProject.put("projectName", "project_name");
		itemProject.put("notificationFlag", "notification_flag");
		itemProject.put("description", "description");
		itemProject.put("status", "status");
		itemProject.put("isPaid", "is_paid");
		itemProject.put("createDate", "create_date");
		itemProject.put("updateDate", "update_date");
		itemProject.put("projectType", "project_type");
		if (itemProject.containsKey(item)) {
			columnMapped = itemProject.get(item);
		}
		return columnMapped;
	}
}
