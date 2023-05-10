package org.example;

public class EstadoManutencao extends Estado {

    public EstadoManutencao( maquinaRefrigerantes maquinaRefrigerantes ){

        super( maquinaRefrigerantes );
    }

    public void acionarManutencao(){

        System.out.println( "FALHOU: Já está em manutenção." );
    }

    public void desacionarManutencao(){

        System.out.println( "OK: Máquina ativa novamente." );

        if( maquinaRefrigerantes.getQuantidadeRefrigerantes() > 0 ){

            maquinaRefrigerantes.setEstado( maquinaRefrigerantes.getEstadoSemMoeda() );
        }
        else{

            maquinaRefrigerantes.setEstado( maquinaRefrigerantes.getEstadoSemRefrigerante() );
        }
    }
}