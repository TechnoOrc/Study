package ch03;
//대입 연산자와 복합 대입 연산자
public class Ch03Ex10 {
	
	public static void main(String[] args) {
		
		int iVar = 100;// = 대입 연산자, 우항의 값을 좌항에 담아라.
		iVar += 7;//iVar = iVar + 7;
		iVar -= 7;//iVar = iVar - 7;
		iVar *= 7;//iVar = iVar * 7;
		iVar /= 7;//iVar = iVar / 7;
		iVar %= 7;//iVar = iVar % 7;
		iVar &= 7;//iVar = iVar & 7;
		iVar |= 7;//iVar = iVar | 7;
		iVar ^= 7;//iVar = iVar ^ 7;
		iVar >>= 7;//iVar = iVar >> 7;
		iVar <<= 7;//iVar = iVar << 7;
		iVar >>>= 7;//iVar = iVar >>> 7;

	}//main

}//class
