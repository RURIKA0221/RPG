package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	// コンストラクタ
		public Wizard(String name, String weapon) {
			// Livingクラスで定義したコンストラクタを利用する
			super(name,weapon);
			//コンストラクタの中で、ヒットポイントの値は乱数を振って決定
			this.hp = Dice.get(120, 180);
			//コンストラクタの中で、攻撃力の値は乱数を振って決定
			this.offensive = Dice.get(12, 18);
		}
		
}
