package ch042.importtest;
/*
 * import : 현재 ~.java 파일에서 필요하 class  파일의 위치를 지정.
 *  - 상위 폴더에서 하위 폴더 순으로 표현(선언)
 *  - 상위 폴더에서 하위 폴더 순으로 .(dot)를 통해 폴더를 구분.
 *  - .(dot) : ~의 내부를 지칭. : 예) a.b -> a 안에 b 있다.
 *  - 하나의 ~.java 파일에 여러 개의 import 선언 가능
 *  - 자바에서 폴더는 소문자 선호
 *  - 예) import java.util.Scanner;
 *  	-> java라는 이름의 폴더 내부에, util이라는 이름의 폴더 내부에, Scanner Class를 가져와라.
 *  - 예) import java.util.*;
 *  	-> java라는 이름의 폴더 내부에, util이라는 이름의 폴더 내부에, 모든 class를 가져와라.
 *  	-> 사용 안하는, 필요 없는 class 파일도 가져온다. -> 효율이 떨어진다. -> 비권장
 */

import ch042.packagetest.PackageObject;

public class PackageImportTest {

	public static void main(String[] args) {

		PackageObject obj = new PackageObject();
		obj.packageNo = "123";
		obj.packageName = "짝퉁";
		obj.checkPackage();
	
		//Ch042Board board = new Ch042Board();
		//접근제한자가 없으면 같은 폴더에서만 접근 가능.
	}//main
	

}//class
