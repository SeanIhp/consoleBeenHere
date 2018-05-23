package cn.com.beenhere.core.storage.mybatis.orm;

import java.io.Serializable;
import java.util.Date;

public class DictGroup implements Serializable {
	private static final long serialVersionUID = -638152134086808122L;
	public static String DEFAULT_ALL_FIELDS = "id, dgid, serial_id, "
			+ "code, name, scode, sname, theType, "
			+ "hasChild, level, parent_id, description, "
			+ "createTime, status";
	
	private Long			id;
	private String			dgid;
	private String			serial_id;
	private String			code;
	private String			name;
	private String 			scode;
	private String			sname;
	private Integer			theType;
	private Boolean			hasChild;
	private Integer			level;
	private Long			parent_id;
	private String			description;
	private Date			createTime;
	private Integer			status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDgid() {
		return dgid;
	}
	public void setDgid(String dgid) {
		this.dgid = dgid;
	}
	public String getSerial_id() {
		return serial_id;
	}
	public void setSerial_id(String serial_id) {
		this.serial_id = serial_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getTheType() {
		return theType;
	}
	public void setTheType(Integer theType) {
		this.theType = theType;
	}
	public Boolean getHasChild() {
		return hasChild;
	}
	public void setHasChild(Boolean hasChild) {
		this.hasChild = hasChild;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Long getParent_id() {
		return parent_id;
	}
	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
