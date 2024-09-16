package org.example;

 // Classe Reuniao que herda de Evento
class Reuniao extends Evento {
    private boolean isPrivada;
    private String senhaAcesso;

    public Reuniao(String nome, String data, boolean isPrivada, String senhaAcesso) {
        super(nome, data);
        this.isPrivada = isPrivada;
        this.senhaAcesso = isPrivada ? senhaAcesso : null;
    }

    @Override
    public void detalhesoEvento() {

    }

    @Override
    public void detalhesDoEvento() {
        if (isPrivada) {
            System.out.println("Reunião privada: " + nome + " | Data: " + data + " | Senha: " + senhaAcesso);
        } else {
            System.out.println("Reunião pública: " + nome + " | Data: " + data);
        }
    }


    // Verificar a senha para reuniões privadas
    public boolean verificarSenha(String senha) {
        if (isPrivada && senha.equals(senhaAcesso)) {
            System.out.println("Acesso permitido à reunião privada.");
            return true;
        } else if (!isPrivada) {
            System.out.println("Acesso permitido à reunião pública.");
            return true;
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }
}

