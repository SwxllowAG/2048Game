import javax.swing.JOptionPane;

public class refreshIcons extends Game2048{

	static boolean lose = false;
	
static void addNum(){
	while(bool == false)
	{
		bool = true;
		for (int xx = 0; xx < 4 ; xx++)
		{
			for (int yy = 0; yy < 4; yy++)
			{
				if(numbers[xx][yy]==0)
				{
					bool = false;
				}
				
			}
		}
			newN2 = (int) (Math.random() * 4);
			newN1 = (int) (Math.random() * 4);
		if (numbers[newN1][newN2]==0)
		{
			numbers[newN1][newN2] = (int) (Math.random() * 2)*2;
			bool = true;
		}
		else
		{
		}
		
	}
	bool = false;
}

static void checkWin(){
	for (int xx = 0; xx < 4 ; xx++)
	{
		for (int yy = 0; yy < 4; yy++)
		{
			if (numbers[xx][yy]==2048)
			{
				JOptionPane.showMessageDialog(null, "GGWP, you win!");
				Game2048.getFrame().setVisible(false);
			}
		}
	}
}

static void checkLose(){
	lose = true;
	for (int xx = 0; xx < 4 ; xx++)
	{
		for (int yy = 0; yy < 4; yy++)
		{
			if (numbers[xx][yy] == 0)
			{
				lose = false;
			}
		}
	}
	for (int xx = 1; xx < 3 ; xx++)
	{
		for (int yy = 1; yy < 3; yy++)
		{
			if (numbers[xx][yy] == numbers[xx-1][yy] || numbers[xx][yy] == numbers[xx+1][yy] || numbers[xx][yy] == numbers[xx][yy-1] ||numbers[xx][yy] == numbers[xx][yy+1])
			{
				lose = false;
			}
		}
	}
	for (int xx = 1; xx < 3 ; xx++)
	{
		for (int yy = 1; yy < 3; yy++)
		{
			if (numbers[xx][yy]== 0)
			{
				lose = false;
			}
		}
	}
	for (int xx = 0; xx < 4 ; xx=xx+3)
	{
		for (int yy = 1; yy < 3; yy++)
		{
			if (numbers[xx][yy] == numbers[xx][yy-1] ||numbers[xx][yy] == numbers[xx][yy+1])
			{
				lose = false;
			}
		}
	}
	for (int xx = 1; xx < 3; xx++)
	{
		for (int yy = 0; yy < 4; yy=yy+3)
		{
			if (numbers[xx][yy] == numbers[xx-1][yy] || numbers[xx][yy] == numbers[xx+1][yy])
			{
				lose = false;
			}
		}
	}
	if (lose)
	{
		JOptionPane.showMessageDialog(null, "HaHa, you lose!");
		Game2048.getFrame().setVisible(false);
	}
}
}

