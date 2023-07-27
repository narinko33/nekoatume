package nekoatume;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		ArrayList<Cat> list = new ArrayList<>();
		System.out.println("***猫集め***");
		while (true) {
			System.out.print("1.集める 2.遊ぶ 3.終了 >>");
			int select = s.nextInt();
			switch (select) {
			case 1:
				//				final String[] KIND = { "白", "黒", "茶トラ" };
				String[] kind = { "白", "黒", "茶トラ" };
				int k = r.nextInt(kind.length);
				//				String kind = KIND[r.nextInt(KIND.length)];
				System.out.println(kind[k] + "猫を見つけた。");
				System.out.print("この猫に名前を付けてください。>>");
				String name = new Scanner(System.in).nextLine();
				Cat cat = new Cat(name, kind[k]);
				list.add(cat);
				System.out.println(cat.name + "が仲間に加わった。");
				break;
			case 2:
				if(list.size() > 0) {
					for(int i = 0; i < list.size(); i++) {
						System.out.printf("%d・・・%s[%s](%d)", i, list.get(i).name, list.get(i).kind, list.get(i).love);
						
					}
					System.out.println("どの猫と遊ぶ？>>");
					select = s.nextInt();
					System.out.println(list.get(select) + "と遊んだ。");
					System.out.println("・・・");
					System.out.println(list.get(select) + "の親密度がアップした!");
					list.get(select).love ++;
				}else {
					System.out.println("まだ遊ぶ猫がいません…。");
				}
				break;
			case 3:
				System.out.println("また遊んでね。おしまい。");
				return;
			}
		}
	}

}
