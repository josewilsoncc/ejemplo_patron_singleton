public class ConfiguracionSistema {

    private String nombreAplicacion;
    private int puerto;
    private boolean modoDebug;
    private String urlBaseApi;

    // Constructor privado: nadie puede hacer new desde afuera
    public ConfiguracionSistema(String nombreAplicacion, int puerto, boolean modoDebug, String urlBaseApi) {
        this.nombreAplicacion = nombreAplicacion;
        this.puerto = puerto;
        this.modoDebug = modoDebug;
        this.urlBaseApi = urlBaseApi;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public boolean isModoDebug() {
        return modoDebug;
    }

    public void setModoDebug(boolean modoDebug) {
        this.modoDebug = modoDebug;
    }

    @Override
    public String toString() {
        return "ConfiguracionSistema{" +
                "nombreAplicacion='" + nombreAplicacion + '\'' +
                ", puerto=" + puerto +
                ", modoDebug=" + modoDebug +
                ", urlBaseApi='" + urlBaseApi + '\'' +
                '}';
    }
}
