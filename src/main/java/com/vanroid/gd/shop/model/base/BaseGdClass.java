package com.vanroid.gd.shop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGdClass<M extends BaseGdClass<M>> extends Model<M> implements IBean {

	public void setClassId(java.lang.Integer classId) {
		set("classId", classId);
	}

	public java.lang.Integer getClassId() {
		return get("classId");
	}

	public void setClassroom(java.lang.String classroom) {
		set("classroom", classroom);
	}

	public java.lang.String getClassroom() {
		return get("classroom");
	}

	public void setCwhen(java.lang.Integer cwhen) {
		set("cwhen", cwhen);
	}

	public java.lang.Integer getCwhen() {
		return get("cwhen");
	}

	public void setHowlong(java.lang.Integer howlong) {
		set("howlong", howlong);
	}

	public java.lang.Integer getHowlong() {
		return get("howlong");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setWhichday(java.lang.Integer whichday) {
		set("whichday", whichday);
	}

	public java.lang.Integer getWhichday() {
		return get("whichday");
	}

	public void setWhichweek(java.lang.Integer whichweek) {
		set("whichweek", whichweek);
	}

	public java.lang.Integer getWhichweek() {
		return get("whichweek");
	}

	public void setCid(java.lang.Integer cid) {
		set("cid", cid);
	}

	public java.lang.Integer getCid() {
		return get("cid");
	}

}
