package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	// コンストラクタ
		public Fighter(String name, String weapon) {
			// Livingクラスで定義したコンストラクタを利用する
			super(name,weapon);
			//コンストラクタの中で、ヒットポイントの値は乱数を振って決定
			this.hp = Dice.get(240, 300);
			//コンストラクタの中で、攻撃力の値は乱数を振って決定
			this.offensive = Dice.get(17, 23);
		}
		
}
