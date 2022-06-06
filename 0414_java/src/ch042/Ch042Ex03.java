package ch042;

import java.util.Scanner;

/*
 * 게시판 개념 모델링 : 게시글, 공지사항, 날짜, 시험D데이,  Qna, 댓글, 작성자, 글쓴이, 제목, 수정, 내용...
 * 게시판 논리 모델링 : 게시글(제목, 작성자, 내용, 댓글, 날짜, 구분(공지, QnA)
 * 게시판 물리 모델링 : board(title, writer, contents, reply, date, gubun)
 */
class Ch042Board {//접근제한자가 없으면 같은 폴더에서만 접근 가능.
	String title;
	String writer;
	String contents;
	String date;
	String gubun;
	
	void print() {
		System.out.println("구분 : " + gubun);
		System.out.println("제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("날짜 : " + date);
		System.out.println("내용 : " + contents);
	}//print
}//class

public class Ch042Ex03 {

	public static void main(String[] args) {

		Ch042Board [] bArr = new Ch042Board[100];
		Scanner scan = new Scanner(System.in);
		int menuNo = 0, bangBunHo = 0;
		
		while(true) {
			System.out.print("0:종료 / 1:작성 / 2:출력, 선택 : ");
			menuNo = scan.nextInt();//nextInt();는 엔터를 가져가지 않음 아래쪽 스캔으로 엔터가 넘어감
			scan.nextLine();//그래서 scan.nextLine()로 위의 nextInt();에서 입력된 엔터 값을 가지고 감
			
			if(menuNo == 0) {
				scan.close();
				break;
			} else if( menuNo == 1) {
				if(bangBunHo ==100) {
					System.out.println("게시글이 꽉 찼습니다. 관라자에게 문의하세요. ");
					continue;
				}//if
				bArr[bangBunHo] =  new Ch042Board();
				System.out.print("제목 : ");
				bArr[bangBunHo].title = scan.nextLine();
				System.out.print("작성자 : ");
				bArr[bangBunHo].writer = scan.nextLine();
				System.out.print("내용 : ");
				bArr[bangBunHo].contents = scan.nextLine();
				System.out.print("날짜 : ");
				bArr[bangBunHo].date = scan.nextLine();
				System.out.print("공지 / QnA / 자유,구분 : ");
				bArr[bangBunHo].gubun = scan.nextLine();
				bangBunHo++;
				
			} else if( menuNo == 2) {
				for (int i = 0; i < bangBunHo; i++) {
					bArr[i].print();
				}
			} else {
				System.out.println("wrong iput. try again.");
			}
		}//while
		
		
		
	}// main

}// class
