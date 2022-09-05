package com.vtlions;

import java.util.List;

public class MinerCreator extends Thread {

	List<Miner> minersList;
	Mine mine = null;

	public MinerCreator(final Mine mine, List<Miner> minersList) {
		this.minersList = minersList;
		this.mine = mine;
		start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			if (i > 2) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			minersList.add(new Miner(("miner" + i), mine));
		
			if (mine.getIsEmpty()) {
				break;
			}
		}
	}
}
