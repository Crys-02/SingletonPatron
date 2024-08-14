public class MainAppConfig {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        config.setServerUrl("http://miapi.com");
        config.setPuerto(8080);
        config.setDataBaseName("Base_de_datos_Fernando");
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("El puerto del servidor es: " + config.getPuerto());
        System.out.println("la Base de datos es: " + config.getDataBaseName());
        System.out.println("config1 y config2 son la misma instancia: " + (config == config2));

    }
}
