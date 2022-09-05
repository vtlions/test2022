package com.vtlions;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Miner> minersList = new ArrayList<>();
		Mine mine = new Mine();
		MinerCreator minerCreator = new MinerCreator(mine, minersList);
		Printer printer = new Printer(mine, minersList);
		
		try {
			printer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.exit(0);
	}
}
