package Auto_main;

import java.util.ArrayList;

import Auto_kinou.Auto_reverse;
import Auto_kinou.Auto_set;

public class Auto_main_moto {
	public int y;
	public int x;
	public int cy;
	public int cx;
	public int player;
	protected int countF = Integer.MAX_VALUE, countN = 0, ScountF = Integer.MAX_VALUE, ScountN = 0,
			F1 = Integer.MAX_VALUE, N1, F2 = Integer.MAX_VALUE, N2;
	Auto_set AS = new Auto_set();
	Auto_reverse AR = new Auto_reverse();
	int[][] o_sub = new int[8][8];
	public ArrayList<Integer> yxHairetu = new ArrayList<>();
}
