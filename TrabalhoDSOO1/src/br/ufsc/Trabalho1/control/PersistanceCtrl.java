package br.ufsc.Trabalho1.control;
import java.util.ArrayList;

import br.ufsc.Trabalho1.model.Member;
import br.ufsc.Trabalho1.model.Staff;
import components.persistence.*;

public class PersistanceCtrl {
	
	private MemoryPersistance memberList;
	private MemoryPersistance staffList;
	
	public MemoryPersistance getMemberList() {
		return memberList;
	}
	
	public PersistanceCtrl() {
		this.memberList = new MemoryPersistance(new ArrayList<Member>());
		this.staffList = new MemoryPersistance(new ArrayList<>());
		
	}
	
	public void setMemberList(MemoryPersistance memberList) {
		this.memberList = memberList;
	}
	public MemoryPersistance getStaffList() {
		return staffList;
	}
	public void setStaffList(MemoryPersistance staffList) {
		this.staffList = staffList;
	}
	
	public void add(Member member) {
		memberList.add(member);
	}
	
	public void add(Staff staff) {
		staffList.add(staff);
	}
	
	public void remove(Member member) {
		memberList.remove(member);
	}
	
	public void remove(Staff staff) {
		staffList.remove(staff);
	}
}
