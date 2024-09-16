package org.example;

 // Classe Workshop que herda de Evento
class Workshop extends Evento {
    private int limiteParticipantes;
    private int participantesInscritos;

    public Workshop(String nome, String data, int limiteParticipantes) {
        super(nome, data);
        this.limiteParticipantes = limiteParticipantes;
        this.participantesInscritos = 0;
    }



    // Inscrever participante se não exceder o limite
    public boolean inscreverParticipante() {
        if (participantesInscritos < limiteParticipantes) {
            participantesInscritos++;
            System.out.println("Participante inscrito com sucesso.");
            return true;
        } else {
            System.out.println("O limite de participantes foi atingido.");
            return false;
        }
    }

    @Override
    public void detalhesoEvento() {

    }

    @Override
    public void detalhesDoEvento() {
        System.out.println("Workshop: " + nome + " | Data: " + data + " | Limite de participantes: " + limiteParticipantes);
    }


}

