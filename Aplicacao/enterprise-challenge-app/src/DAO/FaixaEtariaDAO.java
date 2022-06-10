package DAO;

import bean.FaixaEtaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FaixaEtariaDAO {
    private Connection conexao;

    public void cadastrarFaixaEtaria(FaixaEtaria faixaEtaria) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO faixas_etarias(vl_idade_inicial, vl_idade_final) VALUES (?, ?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, faixaEtaria.getVlIdadeInicial());
            stmt.setInt(2, faixaEtaria.getVlIdadeFinal());

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

    public List<FaixaEtaria> listarTodasFaixasEtarias() {
        List<FaixaEtaria> listFaixasEtarias = new ArrayList<FaixaEtaria>();
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM faixas_etarias";
            stmt = conexao.prepareStatement(sql);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idFaixaEtaria = resultSet.getInt("id_faixa_etaria");
                int vlIdadeInicial = resultSet.getInt("vl_idade_inicial");
                int vlIdadeFinal = resultSet.getInt("vl_idade_final");

                FaixaEtaria faixaEtaria = new FaixaEtaria(idFaixaEtaria, vlIdadeInicial,vlIdadeFinal);

                listFaixasEtarias.add(faixaEtaria);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listFaixasEtarias;
    }

    public FaixaEtaria buscarFaixaEtaria(int idFaixaEtaria) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;
        FaixaEtaria faixaEtaria = new FaixaEtaria();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM faixas_etarias WHERE id_faixa_etaria = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idFaixaEtaria);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int vlIdadeInicial = resultSet.getInt("vl_idade_inicial");
                int vlIdadeFinal = resultSet.getInt("vl_idade_final");

                faixaEtaria.setIdFaixaEtaria(idFaixaEtaria);
                faixaEtaria.setVlIdadeInicial(vlIdadeInicial);
                faixaEtaria.setVlIdadeFinal(vlIdadeFinal);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return faixaEtaria;
    }

    public List<FaixaEtaria> buscarFaixasEtarias(int idade) {
        List<FaixaEtaria> listFaixasEtarias = new ArrayList<FaixaEtaria>();
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM faixas_etarias WHERE vl_idade_inicial = ? OR vl_idade_final = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idade);
            stmt.setInt(2, idade);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idFaixaEtaria = resultSet.getInt("id_faixa_etaria");
                int vlIdadeInicial = resultSet.getInt("vl_idade_inicial");
                int vlIdadeFinal = resultSet.getInt("vl_idade_final");

                FaixaEtaria faixaEtaria = new FaixaEtaria(idFaixaEtaria, vlIdadeInicial, vlIdadeFinal);

                listFaixasEtarias.add(faixaEtaria);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listFaixasEtarias;
    }

    public void apagarFaixaEtaria(int idFaixaEtaria) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "DELETE FROM faixas_etarias WHERE id_faixa_etaria = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idFaixaEtaria);

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
