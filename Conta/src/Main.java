public class Main {
    public static void main(String[] args) {
        var conta = new Conta(1234, 1000);
        System.out.println(conta.calcularSaldo());

        var contaCorrente = new ContaCorrente(123, 200, 20);
        System.out.println(contaCorrente.calcularSaldo());

        var contaVip = new ContaVip(321, 200, 1000);
        System.out.println(contaVip.calcularSaldo());
    }
}