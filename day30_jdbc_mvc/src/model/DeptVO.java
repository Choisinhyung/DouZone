package model;

public class DeptVO {
	
	public final String ClassName = "Dept";
	
	private int deptNo;
	private String dName;
	private String Loc;
	
	public String getClassName() {
		return ClassName;
	}
	
	public int getDeptNo() {
		return deptNo;
	}
	
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	public String getdName() {
		return dName;
	}
	
	public void setdName(String dName) {
		this.dName = dName;
	}
	
	public String getLoc() {
		return Loc;
	}
	
	public void setLoc(String loc) {
		Loc = loc;
	}
}
