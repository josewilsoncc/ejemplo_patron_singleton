public class ServicioUsuarios {

    public void ejecutar() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();

        System.out.println("[ServicioUsuarios] Config inicial: " + config);

        // Cambia la configuración "global"
        config.setPuerto(9000);
        config.setModoDebug(true);

        System.out.println("[ServicioUsuarios] Config modificada: " + config);
    }
}
