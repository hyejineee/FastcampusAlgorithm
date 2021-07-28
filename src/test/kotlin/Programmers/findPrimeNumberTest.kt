package Programmers

import org.junit.Test

/**
 * 1. 이해
 *   - 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는가?
 *   - 흩어진 종이 조각 : 숫자가 적혀있음 => numbers
 *   - 소수 : 1과 자기 자신만들 약수로 가지는 수
 *   - numbers "013"은 0,1,3 수를 나타냄.
 *   - numbers의 길이 1이상 7이하-> 총 경우의 수
 *
 *  2. 계획
 *    1. numbers를 하나의 수로 분리한다.
 *    2. 조합을 찾는다.
 *      - 한 자리수는 그냥 분리한 수를 순회하면 소수체크
 *      - 두 자리수 조합
 *    3. 해당 조합이 소수인지 판단한다.
 *
 * 문제 설명
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
입출력 예
numbers	return
"17"	3
"011"	2
입출력 예 설명
예제 #1
[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

예제 #2
[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

11과 011은 같은 숫자로 취급합니다.
 * */

class findPrimeNumberTest {
    @Test
    fun `소수찾기`() {
        // Given

        // When

        // Then

    }

}