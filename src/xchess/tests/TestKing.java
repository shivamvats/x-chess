/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xchess.tests;

import java.util.ArrayList;
import xchess.Game;
import xchess.Point;
import xchess.King;

/**
 *
 * @author oop25
 */
public class TestKing {
	public static void main(String[] args) {
		Game g = new Game();
		g.main();
		g.cb.set(new Point(3, 4), 4);
		g.cb.getState();
		
		ArrayList<Point> m=new ArrayList<Point>();
		King r = new King();
		m = r.getPossibleMoves(new Point(3,4));
		for(int i=0;i<m.size();i++)
		{
			System.out.println((m.get(i)));
		}
		
	}
}
