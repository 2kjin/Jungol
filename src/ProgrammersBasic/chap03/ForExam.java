package chap01;

public class ForExam {
    public static void main(String[] args) {
        //for문을 이용해서 1부터 100까지 숫자 중 짝수만 출력해 보세요
        for(int i = 1; i < 101 ; i++){
            if( i % 2 == 0)
                System.out.println(i);
        }
    }
}