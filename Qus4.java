
// 4. 2~100사이의 소수 출력 (교수자가 설명한 규칙으로 코드를 작성할것)
package sugang0312;


public class Qus4 {

	public static void main(String[] args) {

		int[] Arr = new int[100];
		int cnt = 0;

		for (int i = 0; i < 99; i++) {   // 99 -> Arr.length-1 이렇게,, 상수값으로 쓰지말고, 배열의 길이로 지정하기
			Arr[i] = i + 2;
			System.out.println(Arr[i]);
			for (int j = 0; j < Arr.length; j++) {
				for (int k=2; k<10; k++) {
					if(Arr[j] != k && Arr[j] % k ==0) {
						Arr[j] = 0;
					}
				}
			}
		}
		for (int l = 0; l < Arr.length; l++) {
			if (Arr[l] != 0) {
				cnt++;
			}
		}System.out.println("2~100사이의 수 중 소수의 개수: "+ cnt);
	}
}
