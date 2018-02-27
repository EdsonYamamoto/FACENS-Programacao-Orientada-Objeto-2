package app;
import DAO.*;
import Modelo.*;
import BLL.*;

import javax.swing.JOptionPane;

import BLL.*;


public class Application {
	
	public static void main(String args[]) throws Exception
	{
		modeloTeste mTeste = new modeloTeste();
		mTeste.setSrt(JOptionPane.showInputDialog("str"));
		mTeste.setI( Integer.parseInt(JOptionPane.showInputDialog("int")) );
		System.out.println(mTeste.getSrt()+" "+mTeste.getI());
		BLLTeste.BLLTeste(mTeste);
	}
}
