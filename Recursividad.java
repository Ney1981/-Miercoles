public class Recursividad

{
	public int multiplicacion(int multiplicar, int multiplicador)

	{
	if(multiplicador==1)
		{
		return multiplicar;
		}
	else
		{
			
			if(multiplicador==0)
			{
			return multiplicar;
			}
		else
			{
			return multiplicar + multiplicacion(multiplicar,multiplicador-1);
			}


		}
	
	}
	
		

}
