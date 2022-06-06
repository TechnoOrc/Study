package ch042.packagetest;

/*
 * package : 현재의 ~.java 파일의 컴파일 된 결과(~.class 파일)의 위치를 지정한다.
 *  - 상위 폴더에서 하위 폴더 순으로 표현(선언)
 *  - 상위 폴더에서 하위 폴더 순으로 .(dot)를 통해 폴더를 구분.
 *  - .(dot) : ~의 내부를 지칭. : 예) a.b -> a 안에 b 있다.
 *  - 하나의 ~.java 파일 안에는 하나의 package만 온다
 *  - 자바에서 폴더는 소문자 선호
 *  - compile : javac -d . PackageObject.java 
 *   -> PackageObject.class 파일을 ch042 폴더 내부의 packagetest 폴더에 넣어라.
 *   -> (위 1라인 참고)
 */
public class PackageObject {

	public String packageNo;
	public String packageName;
	
	public void checkPackage() {	
		System.out.println(packageNo + " : " + packageName);
	}
}//class
