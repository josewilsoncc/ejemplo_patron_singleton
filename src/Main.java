//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ServicioUsuarios usuarios = new ServicioUsuarios();
    ServicioPagos pagos = new ServicioPagos();

    usuarios.ejecutar();
    System.out.println("--------------------------------------------------");
    pagos.ejecutar();
}
