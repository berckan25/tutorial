package test;

import daoImp.clienteImp;
import tutorialesMaven.Tblcliente;

public class Testcliente {

	public static void main(String[] args) {
		
		Tblcliente tblcli = new Tblcliente();
		clienteImp climp = new clienteImp();
		
		tblcli.setNombrecliente("berckan");
		tblcli.setApellidocliente("Alarcon");
		tblcli.setDni("12345678");
		tblcli.setTelefono("987654321");
		
		climp.RegistrarCleinte(tblcli);
		System.out.println("base de datos registrado");
	}

}
