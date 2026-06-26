classDiagram
    package br.ifc.edu.aura {
        class Jogador {
            - String nome
            - int nivel
            - double auraAcumulada
            - boolean modoFarmAtivo
            + verificarElegibilidade() void
            + ativarFarm() void
            + desativarFarm() void
        }

        class SistemaDeFarm {
            - double taxaBaseFarm
            - int nivelRequisito
            + calcularAura(Jogador jogador, int tempoSegundos) double
            + processarLoopDeFarm(Jogador jogador) void
        }

        class AcaoFarm {
            - String tipoAcao
            - double multiplicador
            + executarAcao(Jogador jogador) void
        }
    }

    Jogador "1" --> "1" SistemaDeFarm : utiliza
    SistemaDeFarm "1" --> "*" AcaoFarm : processa