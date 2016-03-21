package Auto_kinou;

public class Auto_set {
	public static int gx = 0, gy = 0;// To_reverse用変数
	Auto_reverse AR = new Auto_reverse();

	public int set(int[][] s, int collar, int y, int x) {
				s[y][x] = collar;
				gx = x;
				gy = y;
		for (int y1 = 0; y1 < 8; y1++) {
			for (int x1 = 0; x1 < 8; x1++) {
				if (s[y1][x1] == 3) {
					s[y1][x1] = 0;
				}
			}
		}
		return AR.reverse(s,y,x);
	}
}
