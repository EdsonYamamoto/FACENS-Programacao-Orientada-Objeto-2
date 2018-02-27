package BLL;
import Modelo.*;

public class BLLTeste {
	public static modeloTeste BLLTeste(modeloTeste modelo) throws Exception
	{
		
		if( modelo.getSrt().compareTo("")==1)
			throw new Exception("novo err");
		return modelo;
	}
}
