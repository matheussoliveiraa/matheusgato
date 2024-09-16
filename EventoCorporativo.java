package org.example;

// Classe EventoCorporativo que herda de Evento
class EventoCorporativo extends Evento {
    private String ambienteReservado;

    public EventoCorporativo(String nome, String data, String ambienteReservado) {
        super(nome, data);
        this.ambienteReservado = ambienteReservado;
    }

    @Override
    public void detalhesoEvento() {


    }

    @Override
    public void detalhesDoEvento() {
        System.out.println("Evento Corporativo: " + nome + " | Data: " + data + " | Ambiente reservado: " + ambienteReservado);
    }
}

