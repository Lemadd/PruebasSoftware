package util;

public class Constants {
	
	public static final String DB_URL = "jdbc:mysql://localhost:3306/";
	public static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_NAME = "testco";
	public static final String DB_USER = "root";
	public static final String DB_PWD = "mysql";
	public static final String USERPAGE= "pruebacibertec";
	public static final String PASSWORDPAGE= "pruebacibertec";
	public static final String URLMAIN = "https://www.hostedredmine.com/";
	
	
	/**
	 * Error Constants
	 */
	public static final String LOGIN_ERROR_ENG="Invalid user or password";
	public static final String LOGIN_ERROR_ES="Usuario o contraseña inválido.";
	
	/**
	 * Register Page
	 */
	public static final String REGISTER_ERROR_ENG_ID="";
	public static final String REGISTER_ERROR_ES_ID="Identificador no puede estar en blanco";
	
	public static final String REGISTER_ERROR_ENG_PASS_DIFF="";
	public static final String REGISTER_ERROR_ES_PASS_DIFF="Contraseña no coincide con la confirmación";
	public static final String REGISTER_ERROR_ENG_PASS_LENGHT="";
	public static final String REGISTER_ERROR_ES_PASS_LENGHT="Contraseña es demasiado corto (8 caracteres mínimo)";

	public static final String REGISTER_ERROR_ENG_NAME_BLANK="";
	public static final String REGISTER_ERROR_ES_NAME_BLANK="Nombre no puede estar en blanco";

	public static final String REGISTER_ERROR_ENG_LASTNAME_BLANK="";
	public static final String REGISTER_ERROR_ES_LASTNAME_BLANK="Apellido no puede estar en blanco";

	public static final String REGISTER_ERROR_ENG_COUNTRY_BLANK="";
	public static final String REGISTER_ERROR_ES_COUNTRY_BLANK="Country no puede estar en blanco";

	public static final String REGISTER_ERROR_ENG_EMAIL_BLANK="";
	public static final String REGISTER_ERROR_ES_EMAIL_BLANK="Correo electrónico no puede estar en blanco";

	public static final String REGISTER_ERROR_ENG_EMAIL_INVALID="";
	public static final String REGISTER_ERROR_ES_EMAIL_INVALID="Correo electrónico no es válido";

	
	

	
}
