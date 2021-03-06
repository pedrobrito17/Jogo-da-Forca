package arquivo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import entidades.Jogo;

public class GeradorDeHTML {
	
	private InputStream leitura;
	private File escrita;
	private String stringLeitura;

	public GeradorDeHTML(File destino, String titulo){
		String index = destino.getName();
		leitura = GeradorDeHTML.class.getResourceAsStream(("/recursos/index.html"));
		escrita = new File(destino.getAbsolutePath()+"/"+index+".html");		
		stringLeitura = Arquivo.lerArquivo(leitura);
		stringLeitura = stringLeitura.replace("?titulo",titulo);		
		Arquivo.salvarArquivo(stringLeitura, escrita);
		
	}
	
}
