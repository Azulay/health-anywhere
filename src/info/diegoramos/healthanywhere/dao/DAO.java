package info.diegoramos.healthanywhere.dao;

import info.diegoramos.healthanywhere.database.Tabelas;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DAO extends SQLiteOpenHelper{

	public DAO(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	// Características do banco de dados
	private static final String DB_NAME = "healthanywhere_db";
	private static final Integer VERSION = 1;// a Aplicação se baseia neste atributo parao onUpgrade
	
	
	// TABELAS
	static final String TBL_SERIE = "cad_serie";
	static final String TBL_EXERCICIO = "cad_exercicio";
	static final String TBL_PROGRAMA = "cad_programa";
	private Tabelas t = new Tabelas();
	
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		//Esse método é executado quando o banco de dados é criado
		
		//Criação das tabelas cad_serie, cad_exercicio, cad_programa
		db.execSQL(t.getTblCadSerie());
		db.execSQL(t.getTblCadExercicio());
		db.execSQL(t.getTblCadPrograma());
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Esse método é executado quando existe alteração na versão do banco
		//Como é a primeira versão então ficará em branco
	}

	
}
