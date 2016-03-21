package Auto_main;

public class Auto_main extends Auto_main_moto {
	public int[][] auto(int[][] o_main, int enemy) {
		int countF = Integer.MAX_VALUE;
		for (int a = 0; a < 8; a++) {
			for (int b = 0; b < 8; b++) {
				o_sub[a][b] = o_main[a][b];
			}
		}
		for (y = 0; y < 8; y++) {
			for (x = 0; x < 8; x++) {
				if (o_sub[y][x] != 3) {
					continue;
				}
				countN = AS.set(o_sub, enemy, y, x);
				if (countF > countN) {
					cy = y;
					cx = x;
					countF = countN;
				} else if (countF == countN) {
					auto(o_sub, cy, cx, y, x, enemy);
				}
				for (int a = 0; a < 8; a++) {
					for (int b = 0; b < 8; b++) {
						o_sub[a][b] = o_main[a][b];
					}
				}
			}
		}
		o_main[cy][cx] = enemy;
		for (int y1 = 0; y1 < 8; y1++) {
			for (int x1 = 0; x1 < 8; x1++) {
				if (o_main[y1][x1] == 3) {
					o_main[y1][x1] = 0;
				}
			}
		}
		return o_main;
	}

	public void auto(int[][] o_main2, int y1, int x1, int y2, int x2, int enemy) {
		int sy = 0,sx = 0,F1 = Integer.MAX_VALUE, F2 = Integer.MAX_VALUE;
		for (int i = 1; i <= 2; i++) {
			o_main2[i == 1 ? y1 : y2][i == 1 ? x1 : x2] = enemy;
			o_main2 = AR.Preverse(o_main2, i == 1 ? y1 : y2, i == 1 ? x1 : x2);
			for (int i2 = 0; i2 < yxHairetu.size(); i2 += 2) {
				o_main2[yxHairetu.get(i2)][yxHairetu.get(i2 + 1)] = enemy == 1 ? 2 : 1;
				o_main2 = AR.Preverse(o_main2, yxHairetu.get(i2), yxHairetu.get(i2 + 1));
				N1 = auto2(o_main2, enemy);
				if (F1 > N1) {
					sy = a;
					sx = b;
					F1 = N1;
				}
			}
			N2 = F1;
			if (F2 > N2) {
				cy = sy;
				cx = sx;
				F2 = N2;
			}
		}
		yxHairetu.clear();
	}

	public int auto2(int[][] o_main3, int enemy) {
		int ScountF = Integer.MAX_VALUE;
		for (int y3 = 0; y3 < 8; y3++) {
			for (int x3 = 0; x3 < 8; x3++) {
				if (o_main3[y3][x3] != 3) {
					continue;
				}
				ScountN = AS.set(o_main3, enemy, y3, x3);
				if (ScountF > ScountN) {
					a = y3;
					b = x3;
					ScountF = ScountN;
				}
			}
		}
		return ScountF;
	}
}
