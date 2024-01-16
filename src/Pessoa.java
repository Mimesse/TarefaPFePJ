public class Pessoa {
    public static void main(String[] args) {
        PessoaFisica fisica = new PessoaFisica();
        fisica.setNome("Gustavo");
        fisica.setSobrenome("Mimesse");
        fisica.setCpf("12345678901");
        fisica.setSalario(100d);

        PessoaJuridica juridica = new PessoaJuridica();
        juridica.setNome("Anderson");
        juridica.setSobrenome("Silva");
        juridica.setNomeDaEmpresa("UFC");
        juridica.setCnpj("123456/0001");

        System.out.println(fisica.getNome() + " é uma pessoa física e tem um salário de: " + fisica.getSalario());

        System.out.println(juridica.getNome() + " é uma empresa chamada: " + juridica.getNomeDaEmpresa() + " portadora do CNPJ: " + juridica.getCnpj());

    }
}
