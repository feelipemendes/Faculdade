/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Interfaces.Funcionario;

/**
 *
 * @author felip
 */
public class Diretor extends Funcionario implements Autenticavel {

    @Override
    public boolean autentica(int senha) {

        if (getSenha() == senha) {
            return true;
        } else {
            return false;
        }

    }

}
