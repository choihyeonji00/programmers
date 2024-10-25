import java.math.BigInteger;

class Solution {
	public BigInteger factorial(int num) {
		if (num <= 1) {
			return BigInteger.valueOf(num);
		}else{
			return BigInteger.valueOf(num).multiply(factorial(num - 1));
		}
	}

	public BigInteger solution(int balls, int share) {

		return balls==share ? BigInteger.ONE : factorial(balls).divide((factorial(balls - share).multiply(factorial(share)))) ;
	}
}