package DAO;

import bean.DadosMonitoramento;
import bean.Doenca;
import bean.FaixaEtaria;
import bean.Zona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RelatorioDAO {
    private Connection conexao;

    public List<DadosMonitoramento> buscarDadosPorFaixaEtaria(FaixaEtaria faixaEtaria) {
        List<DadosMonitoramento> listDadosMonitoramento = new ArrayList<DadosMonitoramento>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM dados_monitoramento WHERE id_faixa_etaria = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, faixaEtaria.getIdFaixaEtaria());
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idMonitoramento = resultSet.getInt("id_monitoramento");
                int idRegiao = resultSet.getInt("id_regiao");
                int idDoenca = resultSet.getInt("id_doenca");
                int idFaixaEtaria = resultSet.getInt("id_faixa_etaria");
                int idZona = resultSet.getInt("idZona");
                Date dtRegistro = resultSet.getDate("dt_registro");
                String dsSexo = resultSet.getString("ds_sexo");
                boolean isGestante = resultSet.getBoolean("is_gestante");
                int nrCasosConfirmados = resultSet.getInt("nr_casos_confirmados");
                int nrCasosSuspeitos = resultSet.getInt("nr_casos_suspeitos");
                int nrObitos = resultSet.getInt("nr_obitos");

                DadosMonitoramento dadosMonitoramento = new DadosMonitoramento(idMonitoramento, idRegiao, idDoenca, idFaixaEtaria, idZona, dtRegistro, dsSexo, isGestante, nrCasosConfirmados, nrCasosSuspeitos, nrObitos);

                listDadosMonitoramento.add(dadosMonitoramento);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listDadosMonitoramento;
    }

    public List<DadosMonitoramento> buscarDadosPorSexo(String sexo) {
        List<DadosMonitoramento> listDadosMonitoramento = new ArrayList<DadosMonitoramento>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM dados_monitoramento WHERE ds_sexo = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, sexo);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idMonitoramento = resultSet.getInt("id_monitoramento");
                int idRegiao = resultSet.getInt("id_regiao");
                int idDoenca = resultSet.getInt("id_doenca");
                int idFaixaEtaria = resultSet.getInt("id_faixa_etaria");
                int idZona = resultSet.getInt("idZona");
                Date dtRegistro = resultSet.getDate("dt_registro");
                String dsSexo = resultSet.getString("ds_sexo");
                boolean isGestante = resultSet.getBoolean("is_gestante");
                int nrCasosConfirmados = resultSet.getInt("nr_casos_confirmados");
                int nrCasosSuspeitos = resultSet.getInt("nr_casos_suspeitos");
                int nrObitos = resultSet.getInt("nr_obitos");

                DadosMonitoramento dadosMonitoramento = new DadosMonitoramento(idMonitoramento, idRegiao, idDoenca, idFaixaEtaria, idZona, dtRegistro, dsSexo, isGestante, nrCasosConfirmados, nrCasosSuspeitos, nrObitos);

                listDadosMonitoramento.add(dadosMonitoramento);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listDadosMonitoramento;
    }

    public List<DadosMonitoramento> buscarDadosPorDoenca(Doenca doenca) {
        List<DadosMonitoramento> listDadosMonitoramento = new ArrayList<DadosMonitoramento>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM dados_monitoramento WHERE id_doenca = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, doenca.getIdDoenca());
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idMonitoramento = resultSet.getInt("id_monitoramento");
                int idRegiao = resultSet.getInt("id_regiao");
                int idDoenca = resultSet.getInt("id_doenca");
                int idFaixaEtaria = resultSet.getInt("id_faixa_etaria");
                int idZona = resultSet.getInt("idZona");
                Date dtRegistro = resultSet.getDate("dt_registro");
                String dsSexo = resultSet.getString("ds_sexo");
                boolean isGestante = resultSet.getBoolean("is_gestante");
                int nrCasosConfirmados = resultSet.getInt("nr_casos_confirmados");
                int nrCasosSuspeitos = resultSet.getInt("nr_casos_suspeitos");
                int nrObitos = resultSet.getInt("nr_obitos");

                DadosMonitoramento dadosMonitoramento = new DadosMonitoramento(idMonitoramento, idRegiao, idDoenca, idFaixaEtaria, idZona, dtRegistro, dsSexo, isGestante, nrCasosConfirmados, nrCasosSuspeitos, nrObitos);

                listDadosMonitoramento.add(dadosMonitoramento);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listDadosMonitoramento;
    }

    public List<DadosMonitoramento> buscarDadosPorZona(Zona zona) {
        List<DadosMonitoramento> listDadosMonitoramento = new ArrayList<DadosMonitoramento>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM dados_monitoramento WHERE id_zona = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, zona.getIdZona());
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idMonitoramento = resultSet.getInt("id_monitoramento");
                int idRegiao = resultSet.getInt("id_regiao");
                int idDoenca = resultSet.getInt("id_doenca");
                int idFaixaEtaria = resultSet.getInt("id_faixa_etaria");
                int idZona = resultSet.getInt("idZona");
                Date dtRegistro = resultSet.getDate("dt_registro");
                String dsSexo = resultSet.getString("ds_sexo");
                boolean isGestante = resultSet.getBoolean("is_gestante");
                int nrCasosConfirmados = resultSet.getInt("nr_casos_confirmados");
                int nrCasosSuspeitos = resultSet.getInt("nr_casos_suspeitos");
                int nrObitos = resultSet.getInt("nr_obitos");

                DadosMonitoramento dadosMonitoramento = new DadosMonitoramento(idMonitoramento, idRegiao, idDoenca, idFaixaEtaria, idZona, dtRegistro, dsSexo, isGestante, nrCasosConfirmados, nrCasosSuspeitos, nrObitos);

                listDadosMonitoramento.add(dadosMonitoramento);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listDadosMonitoramento;
    }

    public List<DadosMonitoramento> buscarDadosPorData(Date dataInicial, Date dataFinal) {
        List<DadosMonitoramento> listDadosMonitoramento = new ArrayList<DadosMonitoramento>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM dados_monitoramento WHERE dt_registro BETWEEN ? AND ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setDate(1, dataInicial);
            stmt.setDate(2, dataFinal);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idMonitoramento = resultSet.getInt("id_monitoramento");
                int idRegiao = resultSet.getInt("id_regiao");
                int idDoenca = resultSet.getInt("id_doenca");
                int idFaixaEtaria = resultSet.getInt("id_faixa_etaria");
                int idZona = resultSet.getInt("idZona");
                Date dtRegistro = resultSet.getDate("dt_registro");
                String dsSexo = resultSet.getString("ds_sexo");
                boolean isGestante = resultSet.getBoolean("is_gestante");
                int nrCasosConfirmados = resultSet.getInt("nr_casos_confirmados");
                int nrCasosSuspeitos = resultSet.getInt("nr_casos_suspeitos");
                int nrObitos = resultSet.getInt("nr_obitos");

                DadosMonitoramento dadosMonitoramento = new DadosMonitoramento(idMonitoramento, idRegiao, idDoenca, idFaixaEtaria, idZona, dtRegistro, dsSexo, isGestante, nrCasosConfirmados, nrCasosSuspeitos, nrObitos);

                listDadosMonitoramento.add(dadosMonitoramento);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listDadosMonitoramento;
    }
}
