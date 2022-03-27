package Codificadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codificador implements Codifica{
	
	@Override
	public String getNomeAutor() {
		return "Henrique Barcellos Lima";
	}

	@Override
	public String getMatriculaAutor() {
		return "20204006";
	}

	@Override
	public String codifica(String str) {
		String encryptedString = "";
		for(int i=0; i<str.length(); i++) {
			char ch = (char)(str.codePointAt(i) + 1);
			encryptedString += ch;
		}
		return encryptedString;
	}

	@Override
	public String decodifica(String str) {
		String decryptedString = "";
		for(int i=0; i< str.length(); i++) {
			char ch = (char)(str.codePointAt(i) - 1);
			decryptedString += ch;
		}
		return decryptedString;
	}

}
