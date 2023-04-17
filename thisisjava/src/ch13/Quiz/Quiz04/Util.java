
//작성한 코드
package ch13.Quiz.Quiz04;

public class Util {

	static <K, V> V getValue(Pair<K,V> p, K k) {
		if(p.getKey().equals(k)) {
			return p.getValue();
		}else {
			return null;
		}
	}
}
