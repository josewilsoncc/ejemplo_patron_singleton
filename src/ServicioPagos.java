public class ServicioPagos {

    public void ejecutar() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        System.out.println("[ServicioPagos] Config que ve el módulo: " + config);
    }
}
