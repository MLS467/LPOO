package control;

import model.Desenvolvedor;
import model.Funcionario;
public class DesenvolvedorController {
    public static void main(String[] args) {

        Desenvolvedor dev1 = new Desenvolvedor();
        Desenvolvedor dev2 = new Desenvolvedor("Gohan", 5000);

        System.out.println(dev2);

        dev2.setSalario(5008);
        System.out.println(dev2);
        System.out.println(dev2.getBonus(2));

    }
}