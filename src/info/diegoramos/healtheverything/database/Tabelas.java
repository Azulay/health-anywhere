package info.diegoramos.healtheverything.database;

public class Tabelas {

	//Tabela cad_serie
	
	
	//Tabela cad_programa
	private static final String TBL_cad_programa = "cad_programa";
		//CAMPOS cad_programa	
		private static final String FIELD_id_programa = "_id_programa INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT";
		private static final String FIELD_nome_programa = "nome CHAR(100) NOT NULL CONSTRAINT [nome_programa] UNIQUE";
		
		//DDL tabela cad_programa
		private String ddl_cad_programa = "CREATE TABLE " +
			TBL_cad_programa + " (" +
			FIELD_id_programa + " , " + 
			FIELD_nome_programa + " , " +
			")";
	
	
	//Tabela cad_serie_exercicio
	
	
}
