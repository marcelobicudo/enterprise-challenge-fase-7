import DAO.*;
import bean.*;

import java.sql.Date;

public class Executar {
    public static void main(String[] args) {

        RegiaoDAO regiaoDAO = new RegiaoDAO();

        Regiao regiao1 = new Regiao();
        regiao1.setNmRegiao("Norte");
        regiaoDAO.cadastrarRegiao(regiao1);

        Regiao regiao2 = new Regiao();
        regiao2.setNmRegiao("Nordeste");
        regiaoDAO.cadastrarRegiao(regiao2);

        Regiao regiao3 = new Regiao();
        regiao3.setNmRegiao("Centro-Oeste");
        regiaoDAO.cadastrarRegiao(regiao3);

        Regiao regiao4 = new Regiao();
        regiao4.setNmRegiao("Sudeste");
        regiaoDAO.cadastrarRegiao(regiao4);

        Regiao regiao5 = new Regiao();
        regiao5.setNmRegiao("Sul");
        regiaoDAO.cadastrarRegiao(regiao5);

        System.out.println("cadastro de regiões");

        DoencaDAO doencaDAO = new DoencaDAO();

        Doenca doenca1 = new Doenca();
        doenca1.setNmDoenca("Dengue");
        doencaDAO.cadastrarDoenca(doenca1);

        Doenca doenca2 = new Doenca();
        doenca2.setNmDoenca("Zika");
        doencaDAO.cadastrarDoenca(doenca2);

        Doenca doenca3 = new Doenca();
        doenca3.setNmDoenca("Malária");
        doencaDAO.cadastrarDoenca(doenca3);

        System.out.println("cadastro de doenças");

        ZonaDAO zonaDAO = new ZonaDAO();

        Zona zona1 = new Zona();
        zona1.setNmZona("Urbana");
        zonaDAO.cadastrarZona(zona1);

        Zona zona2 = new Zona();
        zona2.setNmZona("Rural");
        zonaDAO.cadastrarZona(zona2);

        Zona zona3 = new Zona();
        zona3.setNmZona("Floresta");
        zonaDAO.cadastrarZona(zona3);

        System.out.println("cadastro de zonas");

        FaixaEtariaDAO faixaEtariaDAO = new FaixaEtariaDAO();

        FaixaEtaria faixaEtaria1 = new FaixaEtaria();
        faixaEtaria1.setVlIdadeInicial(0);
        faixaEtaria1.setVlIdadeFinal(1);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria1);

        FaixaEtaria faixaEtaria2 = new FaixaEtaria();
        faixaEtaria2.setVlIdadeInicial(1);
        faixaEtaria2.setVlIdadeFinal(4);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria2);

        FaixaEtaria faixaEtaria3 = new FaixaEtaria();
        faixaEtaria3.setVlIdadeInicial(5);
        faixaEtaria3.setVlIdadeFinal(9);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria3);

        FaixaEtaria faixaEtaria4 = new FaixaEtaria();
        faixaEtaria4.setVlIdadeInicial(10);
        faixaEtaria4.setVlIdadeFinal(14);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria4);

        FaixaEtaria faixaEtaria5 = new FaixaEtaria();
        faixaEtaria5.setVlIdadeInicial(15);
        faixaEtaria5.setVlIdadeFinal(19);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria5);

        FaixaEtaria faixaEtaria6 = new FaixaEtaria();
        faixaEtaria6.setVlIdadeInicial(20);
        faixaEtaria6.setVlIdadeFinal(29);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria6);

        FaixaEtaria faixaEtaria7 = new FaixaEtaria();
        faixaEtaria7.setVlIdadeInicial(30);
        faixaEtaria7.setVlIdadeFinal(39);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria7);

        FaixaEtaria faixaEtaria8 = new FaixaEtaria();
        faixaEtaria8.setVlIdadeInicial(40);
        faixaEtaria8.setVlIdadeFinal(49);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria8);

        FaixaEtaria faixaEtaria9 = new FaixaEtaria();
        faixaEtaria9.setVlIdadeInicial(50);
        faixaEtaria9.setVlIdadeFinal(59);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria9);

        FaixaEtaria faixaEtaria10 = new FaixaEtaria();
        faixaEtaria10.setVlIdadeInicial(60);
        faixaEtaria10.setVlIdadeFinal(69);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria10);

        FaixaEtaria faixaEtaria11 = new FaixaEtaria();
        faixaEtaria11.setVlIdadeInicial(70);
        faixaEtaria11.setVlIdadeFinal(79);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria11);

        FaixaEtaria faixaEtaria12 = new FaixaEtaria();
        faixaEtaria12.setVlIdadeInicial(80);
        faixaEtaria12.setVlIdadeFinal(150);
        faixaEtariaDAO.cadastrarFaixaEtaria(faixaEtaria12);

        System.out.println("cadastro de faixas etarias");

        DadosMonitoramentoDAO dadosMonitoramentoDAO = new DadosMonitoramentoDAO();

        DadosMonitoramento dadosMonitoramento1 = new DadosMonitoramento();
        dadosMonitoramento1.setIdRegiao(1);
        dadosMonitoramento1.setIdDoenca(1);
        dadosMonitoramento1.setIdFaixaEtaria(3);
        dadosMonitoramento1.setIdZona(1);
        dadosMonitoramento1.setDtRegistro(new Date(new java.util.Date().getTime()));
        dadosMonitoramento1.setDsSexo("F");
        dadosMonitoramento1.setGestante(false);
        dadosMonitoramento1.setNrCasosConfirmados(254);
        dadosMonitoramento1.setNrCasosSuspeitos(740);
        dadosMonitoramento1.setNrObitos(35);
        dadosMonitoramentoDAO.cadastrarDadosMonitoramento(dadosMonitoramento1);

        DadosMonitoramento dadosMonitoramento2 = new DadosMonitoramento();
        dadosMonitoramento2.setIdRegiao(1);
        dadosMonitoramento2.setIdDoenca(2);
        dadosMonitoramento2.setIdFaixaEtaria(7);
        dadosMonitoramento2.setIdZona(1);
        dadosMonitoramento2.setDtRegistro(new Date(new java.util.Date().getTime()));
        dadosMonitoramento2.setDsSexo("M");
        dadosMonitoramento2.setGestante(false);
        dadosMonitoramento2.setNrCasosConfirmados(174);
        dadosMonitoramento2.setNrCasosSuspeitos(265);
        dadosMonitoramento2.setNrObitos(18);
        dadosMonitoramentoDAO.cadastrarDadosMonitoramento(dadosMonitoramento2);

        DadosMonitoramento dadosMonitoramento3 = new DadosMonitoramento();
        dadosMonitoramento3.setIdRegiao(2);
        dadosMonitoramento3.setIdDoenca(3);
        dadosMonitoramento3.setIdFaixaEtaria(2);
        dadosMonitoramento3.setIdZona(2);
        dadosMonitoramento3.setDtRegistro(new Date(new java.util.Date().getTime()));
        dadosMonitoramento3.setDsSexo("M");
        dadosMonitoramento3.setGestante(false);
        dadosMonitoramento3.setNrCasosConfirmados(46);
        dadosMonitoramento3.setNrCasosSuspeitos(29);
        dadosMonitoramento3.setNrObitos(12);
        dadosMonitoramentoDAO.cadastrarDadosMonitoramento(dadosMonitoramento3);

        DadosMonitoramento dadosMonitoramento4 = new DadosMonitoramento();
        dadosMonitoramento4.setIdRegiao(2);
        dadosMonitoramento4.setIdDoenca(1);
        dadosMonitoramento4.setIdFaixaEtaria(6);
        dadosMonitoramento4.setIdZona(2);
        dadosMonitoramento4.setDtRegistro(new Date(new java.util.Date().getTime()));
        dadosMonitoramento4.setDsSexo("F");
        dadosMonitoramento4.setGestante(false);
        dadosMonitoramento4.setNrCasosConfirmados(149);
        dadosMonitoramento4.setNrCasosSuspeitos(254);
        dadosMonitoramento4.setNrObitos(3);
        dadosMonitoramentoDAO.cadastrarDadosMonitoramento(dadosMonitoramento4);

        DadosMonitoramento dadosMonitoramento5 = new DadosMonitoramento();
        dadosMonitoramento5.setIdRegiao(3);
        dadosMonitoramento5.setIdDoenca(3);
        dadosMonitoramento5.setIdFaixaEtaria(9);
        dadosMonitoramento5.setIdZona(1);
        dadosMonitoramento5.setDtRegistro(new Date(new java.util.Date().getTime()));
        dadosMonitoramento5.setDsSexo("F");
        dadosMonitoramento5.setGestante(false);
        dadosMonitoramento5.setNrCasosConfirmados(285);
        dadosMonitoramento5.setNrCasosSuspeitos(447);
        dadosMonitoramento5.setNrObitos(23);
        dadosMonitoramentoDAO.cadastrarDadosMonitoramento(dadosMonitoramento5);

        DadosMonitoramento dadosMonitoramento6 = new DadosMonitoramento();
        dadosMonitoramento6.setIdRegiao(3);
        dadosMonitoramento6.setIdDoenca(3);
        dadosMonitoramento6.setIdFaixaEtaria(6);
        dadosMonitoramento6.setIdZona(2);
        dadosMonitoramento6.setDtRegistro(new Date(new java.util.Date().getTime()));
        dadosMonitoramento6.setDsSexo("F");
        dadosMonitoramento6.setGestante(true);
        dadosMonitoramento6.setNrCasosConfirmados(14);
        dadosMonitoramento6.setNrCasosSuspeitos(36);
        dadosMonitoramento6.setNrObitos(0);
        dadosMonitoramentoDAO.cadastrarDadosMonitoramento(dadosMonitoramento6);

        DadosMonitoramento dadosMonitoramento7 = new DadosMonitoramento();
        dadosMonitoramento7.setIdRegiao(4);
        dadosMonitoramento7.setIdDoenca(1);
        dadosMonitoramento7.setIdFaixaEtaria(2);
        dadosMonitoramento7.setIdZona(2);
        dadosMonitoramento7.setDtRegistro(new Date(new java.util.Date().getTime()));
        dadosMonitoramento7.setDsSexo("F");
        dadosMonitoramento7.setGestante(false);
        dadosMonitoramento7.setNrCasosConfirmados(102);
        dadosMonitoramento7.setNrCasosSuspeitos(201);
        dadosMonitoramento7.setNrObitos(18);
        dadosMonitoramentoDAO.cadastrarDadosMonitoramento(dadosMonitoramento7);

        DadosMonitoramento dadosMonitoramento8 = new DadosMonitoramento();
        dadosMonitoramento8.setIdRegiao(4);
        dadosMonitoramento8.setIdDoenca(1);
        dadosMonitoramento8.setIdFaixaEtaria(8);
        dadosMonitoramento8.setIdZona(2);
        dadosMonitoramento8.setDtRegistro(new Date(new java.util.Date().getTime()));
        dadosMonitoramento8.setDsSexo("F");
        dadosMonitoramento8.setGestante(false);
        dadosMonitoramento8.setNrCasosConfirmados(109);
        dadosMonitoramento8.setNrCasosSuspeitos(348);
        dadosMonitoramento8.setNrObitos(74);
        dadosMonitoramentoDAO.cadastrarDadosMonitoramento(dadosMonitoramento8);

        DadosMonitoramento dadosMonitoramento9 = new DadosMonitoramento();
        dadosMonitoramento9.setIdRegiao(5);
        dadosMonitoramento9.setIdDoenca(2);
        dadosMonitoramento9.setIdFaixaEtaria(1);
        dadosMonitoramento9.setIdZona(1);
        dadosMonitoramento9.setDtRegistro(new Date(new java.util.Date().getTime()));
        dadosMonitoramento9.setDsSexo("M");
        dadosMonitoramento9.setGestante(false);
        dadosMonitoramento9.setNrCasosConfirmados(88);
        dadosMonitoramento9.setNrCasosSuspeitos(122);
        dadosMonitoramento9.setNrObitos(23);
        dadosMonitoramentoDAO.cadastrarDadosMonitoramento(dadosMonitoramento9);

        DadosMonitoramento dadosMonitoramento10 = new DadosMonitoramento();
        dadosMonitoramento10.setIdRegiao(5);
        dadosMonitoramento10.setIdDoenca(3);
        dadosMonitoramento10.setIdFaixaEtaria(1);
        dadosMonitoramento10.setIdZona(2);
        dadosMonitoramento10.setDtRegistro(new Date(new java.util.Date().getTime()));
        dadosMonitoramento10.setDsSexo("M");
        dadosMonitoramento10.setGestante(false);
        dadosMonitoramento10.setNrCasosConfirmados(23);
        dadosMonitoramento10.setNrCasosSuspeitos(88);
        dadosMonitoramento10.setNrObitos(18);
        dadosMonitoramentoDAO.cadastrarDadosMonitoramento(dadosMonitoramento10);

        System.out.println("cadastro dados monitoramento");

    }
}
