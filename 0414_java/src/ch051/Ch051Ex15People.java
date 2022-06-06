package ch051;

public class Ch051Ex15People {
	String familyName;
	String name;
	String address;
	String tel;
	void setMember(String s1, String s2, String s3
			, String s4, String s5, String s6) {}
	void print() {}
}//class Ch051Ex15People

class Ch051Ex15Teacher extends Ch051Ex15People {
	String subject;//과목
	String payAccount;//급여 계좌
	void print() {
		System.out.println(familyName + " : " + name
				 + " : " + address + " : " + tel
				 + " : " + subject + " : " + payAccount);
	}
}//class Ch051Ex15Teacher

class Ch051Ex15Student extends Ch051Ex15People {
	String grade;//학년
	String ban;//반
	void print() {
		System.out.println(familyName + " : " + name
				 + " : " + address + " : " + tel
				 + " : " + grade + " : " + ban);
	}
	void setMember(String s1, String s2, String s3
			, String s4, String s5, String s6) {
		familyName = s1;
		name = s2;
		address = s3;
		tel = s4;
		grade = s5;
		ban = s6;
	}//setMember
}//class Ch051Ex15Student 
