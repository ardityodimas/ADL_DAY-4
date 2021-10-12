package com.adl.bootcamp;

import java.util.Scanner;

public class BintangGeser {
	
	public static void main(String[] args) {
		new BintangGeser();
		
	}

	
Scanner scan = new Scanner(System.in);
	
	public BintangGeser() {
		char[][] map = new char[15][15];
		for(int i=0 ; i<15 ; i++) {
			for(int j=0 ; j<15 ; j++) {
				if(i==13 && j==14) {
					map[i][j] = ' ';
				}else if(i==0 || i==14 || j==0 || j==14) {
					map[i][j] = '*';
				}else {
					map[i][j] = ' ';
				}
			}
		}
		
		char player = '@';
		int playerI = 1;
		int playerJ = 1;
		map[playerI][playerJ] = player;
		
		char input;
		do {
			for(int i=0 ; i<15 ; i++) {
				for(int j=0 ; j<15 ; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			System.out.print("Masukan arah (a ke kiri, d ke kanan"
					+ ", w keatas, s kebawah)? ");
			input = scan.next().charAt(0);
			
			if(input == 'a') {
				if(map[playerI][playerJ-1] == '*') {
					continue;
				}else {
					map[playerI][playerJ] = ' ';
					playerJ--;
					map[playerI][playerJ] = '@';
				}
			}
			else if(input == 's') {
				if(map[playerI+1][playerJ] == '*') {
					continue;
				}else {
					map[playerI][playerJ] = ' ';
					playerI++;
					map[playerI][playerJ] = '@';
				}
			}
			else if(input == 'd') {
				if(map[playerI][playerJ+1] == '*') {
					continue;
				}else {
					map[playerI][playerJ] = ' ';
					playerJ++;
					map[playerI][playerJ] = '@';
				}
			}
			else if(input == 'w') {
				if(map[playerI-1][playerJ] == '*') {
					continue;
				}else {
					map[playerI][playerJ] = ' ';
					playerI--;
					map[playerI][playerJ] = '@';
				}
			}
		}while(map[13][14] != '@');
		
		for(int i=0 ; i<15 ; i++) {
			for(int j=0 ; j<15 ; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println("Anda menang");
	}
	}


