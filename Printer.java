package com.vtlions;

import java.util.List;

public class Printer extends Thread {

	Mine mine = null;
	List<Miner> minersList = null;

	public Printer(final Mine mine, final List<Miner> minersList) {
		this.mine = mine;
		this.minersList = minersList;
		start();
	}

	@Override
	public void run() {
		Boolean flag = false;
		while (false != true) {
			System.out.println("===============");
			for (int i = 0; i < minersList.size(); i++) {
				System.out.println(minersList.get(i).getNameOfMiner() + " has " + minersList.get(i).getDugGold()
						+ "       mine has gold - " + mine.getGold());
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (flag) {
				break;
			}
			if (mine.getIsEmpty()) {
				flag = true;
				System.out.println("\nThe mine is empty. Final information about dug gold:");
			}
		}
	}
}
