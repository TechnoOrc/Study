package ch051;

public class Ch051Ex15Test1 {

	public static void main(String[] args) {

		Ch051Ex15People p1 = new Ch051Ex15Teacher();
		p1.familyName = "홍";
		p1.name = "길동";
		p1.address = "신수동";
		p1.tel = "010";
		//p1.subject = "";//error
		//p1.payAccount = "";//error
		
		Ch051Ex15Teacher t = (Ch051Ex15Teacher) p1;
		t.subject = "java";
		t.payAccount = "kb";

		Ch051Ex15People p2 = new Ch051Ex15Student();
		p2.setMember("강", "감찬", "신수동", "010", "3", "10");

		//peoplePrint(t);//Ch051Ex15Teacher
		//peoplePrint(p2);//Ch051Ex15Student
		peoplePrint2(t);//Ch051Ex15Teacher
		peoplePrint2(p2);//Ch051Ex15Student

	}//main

	private static void peoplePrint2(Ch051Ex15People p) {
		p.print();
	}

	private static void peoplePrint(Ch051Ex15People p) {

		if(p instanceof Ch051Ex15Teacher) {

			Ch051Ex15Teacher t = (Ch051Ex15Teacher) p;
			System.out.println(t.familyName + " : " + t.name
					 + " : " + t.address + " : " + t.tel
					 + " : " + t.subject + " : " + t.payAccount);

		} else if(p instanceof Ch051Ex15Student) {

			Ch051Ex15Student s = (Ch051Ex15Student) p;
			System.out.println(s.familyName + " : " + s.name
					 + " : " + s.address + " : " + s.tel
					 + " : " + s.grade + " : " + s.ban);

		}

	}//peoplePrint


}//class 
