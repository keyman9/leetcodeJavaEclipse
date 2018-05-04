package judgeRouteCircle;

import static org.junit.Assert.assertEquals;

public class JudgeRouteCircle {

	public static void main(String[] args) {
		/*
		 * Description:
		 * Initially, there is a Robot at position (0,0).
		 * Given a sequence of its moves, judge if this robot makes a circle, 
		 *   which means it moves back to the original place.
		 * 
		 * The move sequence is represented by a string. 
		 * Each move is represented by a character.
		 * 
		 * The valid robot moves are R,L,U,D-Right,Left,Up,Down
		 * THe output should be true or false representing whether the robot makes a circle
		 */
		String t1_in = "UD";
		boolean t1_out = true;
		boolean t1_result = judgeCircle(t1_in);
		assertEquals(t1_result,t1_out);
		
		String t2_in = "LL";
		boolean t2_out = false;
		boolean t2_result = judgeCircle(t2_in);
		assertEquals(t2_result,t2_out);
		
	}
	
	public static boolean judgeCircle(String moves) {
		
		int robot_x = 0;
		int robot_y = 0;
		
		for(int i = 0; i < moves.length(); i++) {
			switch(moves.charAt(i)) {
			case 'U': robot_y++; break;
			case 'D': robot_y--; break;
			case 'L': robot_x--; break;
			case 'R': robot_x++; break;
			}
		}
		
		return (robot_x == 0 && robot_y == 0);
	}

}
