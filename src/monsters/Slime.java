package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	// コンストラクタ
		public Slime(String name, String weapon) {
			// Livingクラスで定義したコンストラクタを利用する
			super(name,weapon);
			//コンストラクタの中で、ヒットポイントの値は乱数を振って決定
			this.hp = Dice.get(70, 130);
			//コンストラクタの中で、攻撃力の値は乱数を振って決定
			this.offensive = Dice.get(5, 11);
		}
		
}
