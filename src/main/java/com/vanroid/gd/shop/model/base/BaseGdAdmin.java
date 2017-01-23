package com.vanroid.gd.shop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGdAdmin<M extends BaseGdAdmin<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setAdminName(java.lang.String adminName) {
		set("admin_name", adminName);
	}

	public java.lang.String getAdminName() {
		return get("admin_name");
	}

	public void setAdminPassword(java.lang.String adminPassword) {
		set("admin_password", adminPassword);
	}

	public java.lang.String getAdminPassword() {
		return get("admin_password");
	}

	public void setAdminRank(java.lang.Integer adminRank) {
		set("admin_rank", adminRank);
	}

	public java.lang.Integer getAdminRank() {
		return get("admin_rank");
	}

	public void setAdminValidate(java.lang.String adminValidate) {
		set("admin_validate", adminValidate);
	}

	public java.lang.String getAdminValidate() {
		return get("admin_validate");
	}

	public void setAid(java.lang.Integer aid) {
		set("aid", aid);
	}

	public java.lang.Integer getAid() {
		return get("aid");
	}

	public void setAAccount(java.lang.String aAccount) {
		set("aAccount", aAccount);
	}

	public java.lang.String getAAccount() {
		return get("aAccount");
	}

	public void setAAnswer(java.lang.String aAnswer) {
		set("aAnswer", aAnswer);
	}

	public java.lang.String getAAnswer() {
		return get("aAnswer");
	}

	public void setAName(java.lang.String aName) {
		set("aName", aName);
	}

	public java.lang.String getAName() {
		return get("aName");
	}

	public void setAPassword(java.lang.String aPassword) {
		set("aPassword", aPassword);
	}

	public java.lang.String getAPassword() {
		return get("aPassword");
	}

	public void setAQuestion(java.lang.String aQuestion) {
		set("aQuestion", aQuestion);
	}

	public java.lang.String getAQuestion() {
		return get("aQuestion");
	}

	public void setARank(java.lang.Integer aRank) {
		set("aRank", aRank);
	}

	public java.lang.Integer getARank() {
		return get("aRank");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

}