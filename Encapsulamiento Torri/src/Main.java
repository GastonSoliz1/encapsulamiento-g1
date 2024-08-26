//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new User("torri", "1234", 11345);
        System.out.println("El usuario fue creado con exito " + user1.getUsername() + " la contraseña es " + user1.getPass() + " su balance es " + user1.getBalance());

        user1.setBalance(300.000);

        System.out.println("El saldo fue actualizado con exito de la cuenta " + user1.getNumberAccount() + " su nuevo balance es " + user1.getBalance());

        user1.setBalance(800.000);

        System.out.println("El saldo fue actualizado con exito de la cuenta " + user1.getNumberAccount() + " su nuevo balance es " + user1.getBalance());





    }
}