import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> solution(int n) {

		List<Integer> list = new ArrayList<>();

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				int count = 0;
				for (int j = 2; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if(count==1) {
					list.add(i);
				}
			}
		}
		return list;
	}
}