package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	// コンストラクタ
		public Dragon(String name, String weapon) {
			// Livingクラスで定義したコンストラクタを利用する
			super(name,weapon);
			//コンストラクタの中で、ヒットポイントの値は乱数を振って決定
			this.hp = Dice.get(270, 330);
			//コンストラクタの中で、攻撃力の値は乱数を振って決定
			this.offensive = Dice.get(12, 18);
		}
		
}
