public class ServicioPagos {

    public void ejecutar() {
        ConfiguracionSistema config = new ConfiguracionSistema(
                "WasiApp", 8080, false, "https://api.ejemplo.com"
        );
        System.out.println("[ServicioPagos] Config que ve el módulo: " + config);
    }
}
