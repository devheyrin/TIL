package web.util;

public class Member {
	private String id, name, pw;
	public String[] all_subject;
	
	public Member(String id, String pw, String name) {
		super();
		setId(id);
		setPw(pw);
		setName(name);
	}
	
/*	public Member(String id, String name, String pw, String[] all_subject) {
		this(id, name, pw);
		this.all_subject = all_subject;
	}*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(id!=null) {
			this.id = id;
		}else {
			System.out.println("id는 null이 될 수 없습니다");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null) {
			this.name = name;
		}else {
			System.out.println("name은 null이 될 수 없습니다");
		}
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		if(pw!=null) {
			this.pw = pw;
		}else {
			System.out.println("pw는 null이 될 수 없습니다");
		}
	}
	
	

}
