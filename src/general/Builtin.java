package general;

public class Builtin {
	/**
	 * Check if any value in set is true.
	 * @param set The set.
	 * @return True if there is any value in set that is true.
	 */
	public static boolean any(Iterable<Boolean> set) {
		for (boolean b: set) {
			if (b) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Check if every value in set is true.
	 * @param set The set.
	 * @return True if there is no false value in set.
	 */
	public static boolean all(Iterable<Boolean> set) {
		for (boolean b: set) {
			if (!b) {
				return false;
			}
		}
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Comparable<T> min(Iterable<Comparable<T>> set) {
		Comparable<T> min = null;
		for (Comparable<T> it: set) {
			if (min == null || it.compareTo((T)min) < 0) {
				min = it;
			}
		}
		return min;
	}
}