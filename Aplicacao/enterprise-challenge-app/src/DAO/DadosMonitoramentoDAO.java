package DAO;

import bean.DadosMonitoramento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DadosMonitoramentoDAO {
    private Connection conexao;

    public void cadastrarDadosMonitoramento(DadosMonitoramento dadosMonitoramento) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO dados_monitoramento(id_regiao, id_doenca, id_faixa_etaria, id_zona, dt_registro, ds_sexo, is_gestante, nr_casos_confirmados, nr_casos_suspeitos, nr_obitos) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, dadosMonitoramento.getIdRegiao());
            stmt.setInt(2, dadosMonitoramento.getIdDoenca());
            stmt.setInt(3, dadosMonitoramento.getIdFaixaEtaria());
            stmt.setInt(4, dadosMonitoramento.getIdZona());
            stmt.setDate(5, dadosMonitoramento.getDtRegistro());
            stmt.setString(6, String.valueOf(dadosMonitoramento.getDsSexo()));
            stmt.setBoolean(7, dadosMonitoramento.isGestante());
            stmt.setInt(8, dadosMonitoramento.getNrCasosConfirmados());
            stmt.setInt(9, dadosMonitoramento.getNrCasosSuspeitos());
            stmt.setInt(10, dadosMonitoramento.getNrObitos());

            dao.executeCommand(stmt);
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
    }

    public void editarDadosMonitoramento(DadosMonitoramento dadosMonitoramento) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "UPDATE dados_monitoramento SET id_regiao = ?, id_doenca = ?, id_faixa_etaria = ?, id_zona = ?, dt_registro = ?, ds_sexo = ?, is_gestante = ?, nr_casos_confirmados = ?, nr_casos_suspeitos = ?, nr_obitos = ? WHERE id_monitoramento = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, dadosMonitoramento.getIdRegiao());
            stmt.setInt(2, dadosMonitoramento.getIdDoenca());
            stmt.setInt(3, dadosMonitoramento.getIdFaixaEtaria());
            stmt.setInt(4, dadosMonitoramento.getIdZona());
            stmt.setDate(5, dadosMonitoramento.getDtRegistro());
            stmt.setString(6, String.valueOf(dadosMonitoramento.getDsSexo()));
            stmt.setBoolean(7, dadosMonitoramento.isGestante());
            stmt.setInt(8, dadosMonitoramento.getNrCasosConfirmados());
            stmt.setInt(9, dadosMonitoramento.getNrCasosSuspeitos());
            stmt.setInt(10, dadosMonitoramento.getNrObitos());
            stmt.setInt(11, dadosMonitoramento.getIdMonitoramento());

            dao.executeCommand(stmt);
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
    }
}
