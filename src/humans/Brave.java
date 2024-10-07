package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	// コンストラクタ
		public Brave(String name, String weapon) {
			// Livingクラスで定義したコンストラクタを利用する
			super(name,weapon);
			//コンストラクタの中で、ヒットポイントの値は乱数を振って決定
			this.hp = Dice.get(170, 230);
			//コンストラクタの中で、攻撃力の値は乱数を振って決定
			this.offensive = Dice.get(7, 13);
		}
		
}
