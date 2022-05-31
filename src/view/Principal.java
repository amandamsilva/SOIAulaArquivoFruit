package view;

import java.io.IOException;

import controller.ArquivoController;
import controller.IArquivoController;

public class Principal {

	public static void main(String[] args) {

		IArquivoController arqCont = new ArquivoController();
		String dirWin = "C:\\Windows";
		String path = "C:\\TEMP";
		String nome = "generic_food";
		
		try {
			arqCont.createFile(path, nome);
			arqCont.readFile(path, nome);
			arqCont.openFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
