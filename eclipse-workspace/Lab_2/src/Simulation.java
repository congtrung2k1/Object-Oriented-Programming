import java.util.Random;
import java.io.IOException;

public class Simulation {	
	public static void RandomParticle(Box boxGame) {
		Random randx = new Random();
		Random randy = new Random();
		int x, y;
		
		while (true) {
			// get random from 0 -> w - 1
			x = randx.nextInt(boxGame.w);
			y = randy.nextInt(boxGame.h);

			if (!boxGame.check(x,y))
				continue;
			break;
		}
		
		int dirx;
		int diry;
		Random randir = new Random();
		while (true) {
			// get random from 0 -> 2
			dirx = randir.nextInt(3);
			diry = randir.nextInt(3);
			if (dirx-1 != 0 || diry-1 != 0)
				break;
		}
		
		// dir is -1, 0, 1
		Particle newMember = new Particle(x, y, dirx-1, diry-1);
		boxGame.newParticle(newMember);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		int w = 50;
		int h = 3;
		Box boxGame = Box.getInstance(w, h);
		for (int i = 0; i < 3; ++i) 
			RandomParticle(boxGame);
		
		while (true) {
			int count = boxGame.cnt;
			
			//save the old position
			Particle[] oldParticleArr = new Particle[count];
			for (int i = 0; i < count; ++i) {
				Particle mem = boxGame.exist[i];
				Particle newMem = new Particle(mem.x, mem.y, mem.dirx, mem.diry);
				oldParticleArr[i] = newMem;
				
				newMem = null;
			}
			
			// New position for particle
			for (int i = 0; i < count; ++i) 
				boxGame.exist[i].nextPosition(boxGame.w, boxGame.h);
			
			for (int i = 0; i < count - 1; ++i)
				for (int j = i + 1; j < count; ++j) {
					// If 2 particle swap together, that mean it go through each other
					if (boxGame.exist[i].x == oldParticleArr[j].x && boxGame.exist[i].y == oldParticleArr[j].y && boxGame.exist[j].x == oldParticleArr[i].x && boxGame.exist[j].y == oldParticleArr[i].y)
							RandomParticle(boxGame);
					// Same position
					if (boxGame.exist[i].x == boxGame.exist[j].x && boxGame.exist[i].diry == boxGame.exist[j].y)
							RandomParticle(boxGame);
				}
			
			oldParticleArr = null;
			
			// Get current window of box
			boolean[][] gameWin= new boolean[w][h];
			for (int i = 0; i < w; ++i)
				for (int j = 0; j < h; ++j)
					gameWin[i][j] = false;
			
			for (int i = 0; i < boxGame.cnt; ++i)
				gameWin[boxGame.exist[i].x][boxGame.exist[i].y] = true;

			
			// Simulation		
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("Number of particle: " + boxGame.cnt);
			
			for (int i = 0; i < w + 2; ++i)
				System.out.print('-');
			
			System.out.println();
			for (int i = 0; i < h; ++i) {
				System.out.print("|");
				
				for (int j = 0; j < w; ++j) 
					if (gameWin[j][i])
						System.out.print('*');
					else
						System.out.print(' ');
				
				System.out.print("|\n");
			}
			
			for (int i = 0; i < w + 2; ++i)
				System.out.print('-');
				
			Thread.sleep(150);
		}
	}
}
