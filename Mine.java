package com.vtlions;

public class Mine {
	private int gold = 1000;
	private Boolean isEmpty = false;
	private int temp;

	public synchronized int digGold() {

		if (gold > 3) {
			gold -= 3;
			temp = 3;
		} else {
			isEmpty = true;
			temp = gold;
			gold = 0;
		}

		return temp;
	}

	public int getGold() {
		return gold;
	}

	public Boolean getIsEmpty() {
		return isEmpty;
	}
}
