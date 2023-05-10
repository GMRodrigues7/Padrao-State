package org.example;

public class MaquinaRefrigerantes {

    private Estado estadoSemMoeda;
    private Estado estadoComMoeda;
    private Estado estadoVenda;
    private Estado estadoSemRefrigerante;
    private Estado estadoManutencao;

    private Estado estado;
    private int quantidadeRefrigerantes;

    public MaquinaRefrigerantes( int quantidadeRefrigerantes ){

        this.setQuantidadeRefrigerantes( quantidadeRefrigerantes );

        estadoSemMoeda = new EstadoSemMoeda( this );
        estadoComMoeda = new EstadoComMoeda( this );
        estadoVenda = new EstadoVenda( this );
        estadoSemRefrigerante = new EstadoSemRefrigerante( this );
        estadoManutencao = new EstadoManutencao( this );

        if( quantidadeRefrigerantes > 0 ){

            estado = estadoSemMoeda;
        }
        else{

            estado = estadoSemRefrigerante;
        }
    }

}