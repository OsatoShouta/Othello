package Auto_main;

public class Auto_main extends Auto_main_moto {
	public int[][] auto(int [][] o_main,int enemy) {
		o_sub = o_main;
		for(y = 0;y<8;y++){
			for(x = 0;x<8;x++){
				if(o_sub[y][x] != 3){
					continue;
				}
				countN = AS.set(o_sub,enemy,y,x);
				if(countF > countN){
					cy = y;
					cx = x;
					countF = countN;
				}
				else if(countF == countN){
					auto(o_sub,y,x,cy,cx,enemy);
				}
			}
		}
		o_main[cy][cx] = enemy;
		return o_main;
	}
	
	public int auto(int [][] o_main,int enemy,int n) {
		for(int y3 = 0;y3<8;y3++){
			for(int x3 = 0;x3<8;x3++){
				if(o_sub[y3][x3] != 3){
					continue;
				}
				ScountN = AS.set(o_sub,enemy,y3,x3);
				if(ScountF > ScountN){
					cy = y3;
					cx = x3;
					ScountF = ScountN;
				}
			}
		}
		return ScountF;
	}

	public void auto(int[][] o_main2,int y1,int x1,int y2,int x2,int enemy){
		int sy = 0;
		int sx = 0;
		int[][] o_sub1= o_main2;
		int[][] o_sub2 = o_main2;
		for(int i = 1;i<=2;i++){
			AS.set(o_sub1, enemy, i == 1?y1:y2, i == 1?x1:x2);
			o_sub2[i == 1?y1:y2][i == 1?x1:x2] = enemy;
			o_sub2 = AR.Preverse(o_sub2,i == 1?y1:y2,i == 1?x1:x2);
			for(int i2 = 0;i2<=yxHairetu.size();i2 += 2){
				o_sub2 = AS.Pset(o_sub2, yxHairetu.get(i2), yxHairetu.get(i2+1), enemy == 1?2:1);
				o_sub2 = AR.Preverse(o_sub2, yxHairetu.get(i2), yxHairetu.get(i2+1));
				N1 = auto(o_sub2,enemy,0);
				if(F1 > N1){
					sy = yxHairetu.get(i2);
					sx = yxHairetu.get(i2+1);
					F1 = N1;
				}
			}
			N2 = F1;
			if(F2 > N2){
				cy = sy;
				cx = sx;
				F2 = N2;
			}
		}
		yxHairetu.clear();
	}
}
