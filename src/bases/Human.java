package bases;

public abstract class Human extends Living {
	// コンストラクタ
		public Human(String name, String weapon) {
			// Livingクラスで定義したコンストラクタを利用する
			super(name,weapon);
		}

		// attackメソッドのオーバーライド
		@Override
		public void attack(Living target) {
			// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
			int damage = utils.Dice.get(1,10) * offensive;
			// 相手のHPをダメージ値だけ減らす
			target.hp = target.hp - damage;
			// 自分の攻撃力を1だけ減らす
			this.offensive = this.offensive - 1;
			// コンソールにステータスを表示
			System.out.print("\n「" + name + "」が「" + weapon + "」で攻撃！「" + target.getName() + "」に" + damage + "のダメージを与えた。\n");
			System.out.println("しかし自分の攻撃力も1減少した。");
		}
}
