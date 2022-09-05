package com.vtlions;

import java.util.List;

public class Miner extends Thread {
	private String name = "";
	private Mine mine = null;
	private int dugGold = 0;

	public Miner(final String name, final Mine mine) {
		this.name = name;
		this.mine = mine;
		start();
	}

	@Override
	public void run() {

		while (true != false) {
			dugGold += mine.digGold();

			if (mine.getIsEmpty()) {
				break;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String getNameOfMiner() {
		return name;
	}

	public int getDugGold() {
		return dugGold;
	}
}
