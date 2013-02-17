package info.diegoramos.healthanywhere.database;

public class Tabelas {

	//Tabela cad_serie
	private static final String TBL_cad_serie = "cad_serie";
		//CAMPOS cad_serie
		private static final String FIELD_id_serie = "_id_serie INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT";
		private static final String FIELD_nome_serie = "nome VARCHAR(100) NOT NULL CONSTRAINT [nome_serie] UNIQUE";
	
		//DDL tabela cad_serie
		private String ddl_cad_serie = "CREATE TABLE " +
				TBL_cad_serie + " (" +
				FIELD_id_serie + " , " + 
				FIELD_nome_serie + " , " +
				")";				
		
		
	//Tabela cad_programa
	private static final String TBL_cad_programa = "cad_programa";
		//CAMPOS cad_programa	
		private static final String FIELD_id_programa = "_id_programa INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT";
		private static final String FIELD_nome_programa = "nome VARCHAR(100) NOT NULL CONSTRAINT [nome_programa] UNIQUE";
		private static final String FIELD_objetivo_programa = "objetivo VARCHAR(100)";
		
		//DDL tabela cad_programa
		private String ddl_cad_programa = "CREATE TABLE " +
			TBL_cad_programa + " (" +
			FIELD_id_programa + " , " + 
			FIELD_nome_programa + " , " +
			FIELD_objetivo_programa + " , " +
			")";	
		
	//Tabela cad_exercicio
	private static final String TBL_cad_exercicio = "cad_exercicio";
		//CAMPOS cad_serie_programa
		private static final String FIELD_id_exercicio = "_id_serie_exercicio INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT";
		private static final String FIELD_nome_exercicio = "nome VARCHAR(100) NOT NULL CONSTRAINT [nome_exercicio] UNIQUE";

		//DDL tabela cad_exercicio
		private String ddl_cad_exercicio = "CREATE TABLE " +
				TBL_cad_exercicio + " (" +
				FIELD_id_exercicio + " , " + 
				FIELD_nome_exercicio + " , " +
				")";	
		
		
	
}
