
public class move extends Game2048{
	public static void up()
	{
		moved = false;
		for (int xx = 0; xx < 3; xx++)
		{
			for (int yy = 0; yy < 4; yy++)
			{
				if (numbers[xx][yy] == 0)
				{
					bool = true;
					for (int zz = 1; zz < 4-xx ;zz++)
					{
							if (numbers[xx+zz][yy] != 0 && bool == true)
							{
								numbers[xx][yy]=numbers[xx+zz][yy];
								numbers[xx+zz][yy]=0;
								bool = false;
								moved = true;
							}
					}
					bool = false;
				}
				
				if (numbers[xx][yy] != 0)
				{
					bool = true;
					for (int zz = 1; zz<4-xx ;zz++)
					{
							if (numbers[xx+zz][yy] != 0 && bool == true)
							{
								if (numbers[xx][yy]==numbers[xx+zz][yy])
								{
									numbers[xx][yy]=numbers[xx][yy]+numbers[xx+zz][yy];
									numbers[xx+zz][yy]=0;
									moved = true;
								}
								bool = false;
							}
					}
					bool = false;
				}
			}
		}
	}
	public static void right()
	{
		moved = false;
		for (int yy = 3; yy > 0; yy=yy-1)
		{
			for (int xx = 0; xx < 4; xx++)
			{
				if (numbers[xx][yy] == 0)
				{
					bool = true;
					for (int zz = 1; zz < yy+1 ;zz++)
					{
							if (numbers[xx][yy-zz] != 0 && bool == true)
							{
								numbers[xx][yy]=numbers[xx][yy-zz];
								numbers[xx][yy-zz]=0;
								bool = false;
								moved = true;
							}
					}
					bool = false;
				}
				if (numbers[xx][yy] != 0)
				{
					bool = true;
					for (int zz = 1; zz<yy+1 ;zz++)
					{
							if (numbers[xx][yy-zz] != 0 && bool == true)
							{
								if (numbers[xx][yy]==numbers[xx][yy-zz])
								{
									numbers[xx][yy]=numbers[xx][yy]+numbers[xx][yy-zz];
									numbers[xx][yy-zz]=0;
									moved = true;
								}
								bool = false;
							}
					}
					bool = false;
				}
			}
		}
	}
	public static void left()
	{
		moved = false;
		for (int yy = 0; yy < 3; yy++)
		{
			for (int xx = 0; xx < 4; xx++)
			{
				if (numbers[xx][yy] == 0)
				{
					bool = true;
					for (int zz = 1; zz < 4-yy ;zz++)
					{
							if (numbers[xx][yy+zz] != 0 && bool == true)
							{
								numbers[xx][yy]=numbers[xx][yy+zz];
								numbers[xx][yy+zz]=0;
								bool = false;
								moved = true;
							}
					}
					bool = false;
				}
				if (numbers[xx][yy] != 0)
				{
					bool = true;
					for (int zz = 1; zz<4-yy ;zz++)
					{
							if (numbers[xx][yy+zz] != 0 && bool == true)
							{
								if (numbers[xx][yy]==numbers[xx][yy+zz])
								{
									numbers[xx][yy]=numbers[xx][yy]+numbers[xx][yy+zz];
									numbers[xx][yy+zz]=0;
									moved = true;
								}
								bool = false;
							}
					}
					bool = false;
				}
			}
		}
	}
	public static void down()
	{
		moved = false;
		for (int xx = 3; xx > 0; xx=xx-1)
		{
			for (int yy = 0; yy < 4; yy++)
			{
				if (numbers[xx][yy] == 0)
				{
					bool = true;
					for (int zz = 1; zz < xx+1 ;zz++)
					{
							if (numbers[xx-zz][yy] != 0 && bool == true)
							{
								numbers[xx][yy]=numbers[xx-zz][yy];
								numbers[xx-zz][yy]=0;
								bool = false;
								moved = true;
							}
					}
					bool = false;
				}
				if (numbers[xx][yy] != 0)
				{
					bool = true;
					for (int zz = 1; zz<xx+1 ;zz++)
					{
							if (numbers[xx-zz][yy] != 0 && bool == true)
							{
								if (numbers[xx][yy]==numbers[xx-zz][yy])
								{
									numbers[xx][yy]=numbers[xx][yy]+numbers[xx-zz][yy];
									numbers[xx-zz][yy]=0;
									moved = true;
								}
								bool = false;
							}
					}
					bool = false;
				}
			}
		}
	}
}
