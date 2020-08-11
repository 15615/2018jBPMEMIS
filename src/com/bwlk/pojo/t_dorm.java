package com.bwlk.pojo;

public class t_dorm {
    private Integer dormId;

    private Integer dormBuildId;

    private String dormName;

    private String dormType;

    private Integer dormNumber;

    private String dormTel;

	public Integer getDormId() {
		return dormId;
	}

	public void setDormId(Integer dormId) {
		this.dormId = dormId;
	}

	public Integer getDormBuildId() {
		return dormBuildId;
	}

	public void setDormBuildId(Integer dormBuildId) {
		this.dormBuildId = dormBuildId;
	}

	public String getDormName() {
		return dormName;
	}

	public void setDormName(String dormName) {
		this.dormName = dormName;
	}

	public String getDormType() {
		return dormType;
	}

	public void setDormType(String dormType) {
		this.dormType = dormType;
	}

	public Integer getDormNumber() {
		return dormNumber;
	}

	public void setDormNumber(Integer dormNumber) {
		this.dormNumber = dormNumber;
	}

	public String getDormTel() {
		return dormTel;
	}

	public void setDormTel(String dormTel) {
		this.dormTel = dormTel;
	}

	@Override
	public String toString() {
		return "t_dorm [dormId=" + dormId + ", dormBuildId=" + dormBuildId + ", dormName=" + dormName + ", dormType="
				+ dormType + ", dormNumber=" + dormNumber + ", dormTel=" + dormTel + "]";
	}

  
}