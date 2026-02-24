public class ServicioUsuarios {

    public void ejecutar() {
        ConfiguracionSistema config = new ConfiguracionSistema(
                "WasiApp", 8080, false, "https://api.ejemplo.com"
        );

        System.out.println("[ServicioUsuarios] Config inicial: " + config);

        // Cambia la configuración "global"
        config.setPuerto(9000);
        config.setModoDebug(true);

        System.out.println("[ServicioUsuarios] Config modificada: " + config);
    }
}
