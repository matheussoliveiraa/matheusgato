package org.example;

// Classe principal para testar o sistema
public class SistemaAgendamento {
    public static void main(String[] args) {
        // Criar instâncias de diferentes eventos
        Workshop workshop = new Workshop("Workshop de Java", "2024-10-01", 30);
        Reuniao reuniaoPublica = new Reuniao("Reunião de Equipe", "2024-10-02", false, null);
        Reuniao reuniaoPrivada = new Reuniao("Reunião Estratégica", "2024-10-03", true, "senha123");
        EventoCorporativo eventoCorporativo = new EventoCorporativo("Evento Corporativo Anual", "2024-10-05", "Sala de Conferências A");

        // Detalhes dos eventos
        workshop.detalhesDoEvento();
        reuniaoPublica.detalhesDoEvento();
        reuniaoPrivada.detalhesDoEvento();
        eventoCorporativo.detalhesDoEvento();

        // Inscrever participantes no workshop
        for (int i = 0; i < 35; i++) {
            workshop.inscreverParticipante();
        }

        // Testar acesso a reuniões privadas
        reuniaoPrivada.verificarSenha("senha123"); // Acesso correto
        reuniaoPrivada.verificarSenha("senhaIncorreta"); // Acesso incorreto
    }
}
