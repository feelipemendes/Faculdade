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
public class SistemaInterno {
    //Agora eu posso passar qualquer classe que implementa Autenticavel para fazer o login
    Autenticavel a = new Diretor();
    
    void login(Autenticavel a) {
        int senha = 000;
        boolean ok = a.autentica(senha);

    }

}
