package Auto_kinou;

import java.util.ArrayList;

public class Auto_reverse {
	ArrayList<Integer> ay = new ArrayList<Integer>();
	ArrayList<Integer> ax = new ArrayList<Integer>();
	Auto_hantei AH = new Auto_hantei();

	public int reverse(int[][] z,int y,int x) {
		int flag = 0, p1 = 0, p2 = 0;
		switch (z[y][x]) {// 置いた駒は何色？
		case (1):// 置いた駒が１（白）の場合
			for (int c1 = -1; c1 <= 1; c1++) {
				for (int c2 = -1; c2 <= 1; c2++) {// セットされた駒の周りを見る
					if (y == 0 && c1 == -1 || y == 7 && c1 == 1 || x == 0 && c2 == -1
							|| x == 7 && c2 == 1) {
						continue;
					}
					p1 = y + c1;
					p2 = x + c2;
					check: for (int t = 0;; t++) {
						try {
							switch (z[p1][p2]) {
							case (0):
								break;
							case (3):
								break;
							case (1):
								if (flag == 1) {
									// ひっくり返す処理
									for (int i = 0; i < ay.size(); i++) {
										z[ay.get(i)][ax.get(i)] = 1;
									}
								}
								break;
							case (2):
								ay.add(t, p1);
								ax.add(t, p2);
								flag = 1;
								// さらに横確認
								p1 += c1;
								p2 += c2;
								continue check;
							}
						} catch (java.lang.ArrayIndexOutOfBoundsException e) {
							break;
						}
						break;
					}
					flag = 0;
					ay.clear();
					ax.clear();
				}
			}
			break;

		case (2):// 置いた駒が2（黒）の場合
			for (int c1 = -1; c1 <= 1; c1++) {
				for (int c2 = -1; c2 <= 1; c2++) {// セットされた駒の周りを見る
					if (y == 0 && c1 == -1 || y == 7 && c1 == 1 || x == 0 && c2 == -1
							|| x == 7 && c2 == 1) {
						continue;
					}
					p1 = y + c1;
					p2 = x + c2;
					check: for (int t = 0;; t++) {
						try {
							switch (z[p1][p2]) {
							case (0):
								break;
							case (3):
								break;
							case (2):
								if (flag == 1) {
									// ひっくり返す処理
									for (int i = 0; i < ay.size(); i++) {
										z[ay.get(i)][ax.get(i)] = 2;
									}
								}
								break;
							case (1):
								ay.add(t, p1);
								ax.add(t, p2);
								flag = 1;
								// さらに横確認
								p1 += c1;
								p2 += c2;
								continue check;
							}
						} catch (java.lang.ArrayIndexOutOfBoundsException e) {
							break;
						}
						break;
					}
					flag = 0;
					ay.clear();
					ax.clear();
				}
			}
			break;
		}
		return AH.hantei(z,z[y][x] == 1?2:1);
	}

	public int[][] Preverse(int[][] z,int y,int x) {
		int flag = 0, p1 = 0, p2 = 0;
		switch (z[y][x]) {// 置いた駒は何色？
		case (1):// 置いた駒が１（白）の場合
			for (int c1 = -1; c1 <= 1; c1++) {
				for (int c2 = -1; c2 <= 1; c2++) {// セットされた駒の周りを見る
					if (y == 0 && c1 == -1 || y == 7 && c1 == 1 || x == 0 && c2 == -1
							|| x == 7 && c2 == 1) {
						continue;
					}
					p1 = y + c1;
					p2 = x + c2;
					check: for (int t = 0;; t++) {
						try {
							switch (z[p1][p2]) {
							case (0):
								break;
							case (3):
								break;
							case (1):
								if (flag == 1) {
									// ひっくり返す処理
									for (int i = 0; i < ay.size(); i++) {
										z[ay.get(i)][ax.get(i)] = 1;
									}
								}
								break;
							case (2):
								ay.add(t, p1);
								ax.add(t, p2);
								flag = 1;
								// さらに横確認
								p1 += c1;
								p2 += c2;
								continue check;
							}
						} catch (java.lang.ArrayIndexOutOfBoundsException e) {
							break;
						}
						break;
					}
					flag = 0;
					ay.clear();
					ax.clear();
				}
			}
			break;

		case (2):// 置いた駒が2（黒）の場合
			for (int c1 = -1; c1 <= 1; c1++) {
				for (int c2 = -1; c2 <= 1; c2++) {// セットされた駒の周りを見る
					if (y == 0 && c1 == -1 || y == 7 && c1 == 1 || x == 0 && c2 == -1
							|| x == 7 && c2 == 1) {
						continue;
					}
					p1 = y + c1;
					p2 = x + c2;
					check: for (int t = 0;; t++) {
						try {
							switch (z[p1][p2]) {
							case (0):
								break;
							case (3):
								break;
							case (2):
								if (flag == 1) {
									// ひっくり返す処理
									for (int i = 0; i < ay.size(); i++) {
										z[ay.get(i)][ax.get(i)] = 2;
									}
								}
								break;
							case (1):
								ay.add(t, p1);
								ax.add(t, p2);
								flag = 1;
								// さらに横確認
								p1 += c1;
								p2 += c2;
								continue check;
							}
						} catch (java.lang.ArrayIndexOutOfBoundsException e) {
							break;
						}
						break;
					}
					flag = 0;
					ay.clear();
					ax.clear();
				}
			}
			break;
		}
		int enemy = z[y][x] == 1?2:1;
		return AH.Phantei(z,enemy);
	}
}
