package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	public static String Quebra_Linha = System.lineSeparator();

	public static String dadosLoja() {

		if (NOME_LOJA.isEmpty()){
			throw new RuntimeException ("O campo nome da loja é obrigatório");
		}

		if (LOGRADOURO.isEmpty()){
			throw new RuntimeException ("O campo logradouro do endereço é obrigatório");
		}

		String _LOGRADOURO = LOGRADOURO + ", ";
		String _NUMERO = NUMERO <=0 ? "s/n" : String.format("%d", NUMERO);
		String _COMPLEMENTO = " " + COMPLEMENTO;
		String _BAIRRO = BAIRRO.isEmpty()? "" : BAIRRO + " - ";

		if (MUNICIPIO.isEmpty()){
			throw new RuntimeException ("O campo município do endereço é obrigatório");			
		}

		String _MUNICIPIO = MUNICIPIO + " - ";

		if (ESTADO.isEmpty()){
			throw new RuntimeException ("O campo estado do endereço é obrigatório");
		}

		String _CEP = CEP.isEmpty()? "" : "CEP:" + CEP;
		String _TELEFONE = TELEFONE.isEmpty()? "" : " Tel " + TELEFONE;

		if (CNPJ.isEmpty()){
			throw new RuntimeException ("O campo CNPJ da loja é obrigatório");
		}

		String _CNPJ = "CNPJ: " + CNPJ;

		if (INSCRICAO_ESTADUAL.isEmpty()){
			throw new RuntimeException ("O campo inscrição estadual da loja é obrigatório");
		}

		String _INSCRICAO_ESTADUAL = "IE: " + INSCRICAO_ESTADUAL;

		return (NOME_LOJA + Quebra_Linha +
		_LOGRADOURO + _NUMERO + _COMPLEMENTO + Quebra_Linha +
		_BAIRRO + _MUNICIPIO + ESTADO + Quebra_Linha +
		_CEP + _TELEFONE + Quebra_Linha +
		OBSERVACAO + Quebra_Linha +
		_CNPJ + Quebra_Linha +
		_INSCRICAO_ESTADUAL + Quebra_Linha);
	}
	
	public static void main( String[] args) {
		dadosLoja();		
	}

}
