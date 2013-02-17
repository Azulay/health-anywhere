package info.diegoramos.healthanywhere.database;

public class Tabelas {

	//Tabela cad_serie
	private static final String TBL_cad_serie = "cad_serie";
		//CAMPOS cad_serie
		private static final String FIELD_id_serie = "_id_serie INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT";
		private static final String FIELD_nome_serie = "nome CHAR(100) NOT NULL CONSTRAINT [nome_serie] UNIQUE";
	
	//Tabela cad_programa
	private static final String TBL_cad_programa = "cad_programa";
		//CAMPOS cad_programa	
		private static final String FIELD_id_programa = "_id_programa INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT";
		private static final String FIELD_nome_programa = "nome CHAR(100) NOT NULL CONSTRAINT [nome_programa] UNIQUE";
		private static final String FIELD_objetivo_programa = "objetivo CHAR(100)";
		
		//DDL tabela cad_programa
		private String ddl_cad_programa = "CREATE TABLE " +
			TBL_cad_programa + " (" +
			FIELD_id_programa + " , " + 
			FIELD_nome_programa + " , " +
			FIELD_objetivo_programa + " , " +
			")";
	
	
	//Tabela cad_serie_exercicio
	
	
}
