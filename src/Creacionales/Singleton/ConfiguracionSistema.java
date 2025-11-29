package Creacionales.Singleton;

public class ConfiguracionSistema {
    private static ConfiguracionSistema instancia;

    private String version = "1.0.0";
    private String logPath = "/var/log/app.log";

    private ConfiguracionSistema(){
        System.out.println("Singleton: Instancia de Configuración creada");
    }

    public static ConfiguracionSistema getInstance(){
        if (instancia == null){
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public String mostrarConfiguracion() {
        return "Versión: " + this.version + " | Ruta Log: " + this.logPath + " | Objeto ID: " + this.hashCode();
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
