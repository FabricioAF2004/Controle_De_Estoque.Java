/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controledeestoque;

/**
 *
 * @author ACER
 */
public class Controledeestoque {

    /**
     */
    public class Main {
    public static void main(String[] args) {
        Conexao.conectar();  // Teste de conexão
        
        tela form = new tela();    
        form.setVisible(true);
       }
    } 
}
