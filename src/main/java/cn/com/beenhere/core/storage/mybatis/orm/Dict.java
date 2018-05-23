package cn.com.beenhere.core.storage.mybatis.orm;

import java.io.Serializable;
import java.util.Date;

public class Dict implements Serializable {
	private static final long serialVersionUID = -602934776952939772L;
	public static String DEFAULT_ALL_FIELDS = "id, did, serial_id, "
			+ "dict_group_id, dict_group_dgid, "
			+ "name, code, const_code, const_type, "
			+ "const_value, const_text, sort_no, level, "
			+ "description, createTime, status";
	
	private Long			id;
	private String			did;
	private String			serial_id;
	private	Long			dict_group_id;
	private String			dict_group_dgid;
	private String			name;
	private String			code;
	private String			const_code;
	private String			const_type;
	private String			const_value;
	private String			const_text;
	private String			sort_no;
	private Integer			level;
	private String			description;
	private Date			createTime;
	private Integer			status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getSerial_id() {
		return serial_id;
	}
	public void setSerial_id(String serial_id) {
		this.serial_id = serial_id;
	}
	public Long getDict_group_id() {
		return dict_group_id;
	}
	public void setDict_group_id(Long dict_group_id) {
		this.dict_group_id = dict_group_id;
	}
	public String getDict_group_dgid() {
		return dict_group_dgid;
	}
	public void setDict_group_dgid(String dict_group_dgid) {
		this.dict_group_dgid = dict_group_dgid;
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
	public String getConst_code() {
		return const_code;
	}
	public void setConst_code(String const_code) {
		this.const_code = const_code;
	}
	public String getConst_type() {
		return const_type;
	}
	public void setConst_type(String const_type) {
		this.const_type = const_type;
	}
	public String getConst_value() {
		return const_value;
	}
	public void setConst_value(String const_value) {
		this.const_value = const_value;
	}
	public String getConst_text() {
		return const_text;
	}
	public void setConst_text(String const_text) {
		this.const_text = const_text;
	}
	public String getSort_no() {
		return sort_no;
	}
	public void setSort_no(String sort_no) {
		this.sort_no = sort_no;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
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
