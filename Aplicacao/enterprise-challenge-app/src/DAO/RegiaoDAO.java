package DAO;

import bean.Regiao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegiaoDAO {
    private Connection conexao;

    public void cadastrarRegiao(Regiao regiao) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO REGIOES(nm_regiao) VALUES (?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, regiao.getNmRegiao());

            dao.executeCommand(stmt);
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
    }

    public List<Regiao> listarTodasRegioes() {
        List<Regiao> listRegioes = new ArrayList<Regiao>();
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM regioes";
            stmt = conexao.prepareStatement(sql);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idRegiao = resultSet.getInt("id_regiao");
                String nmRegiao = resultSet.getString("nm_regiao");

                Regiao regiao = new Regiao(idRegiao, nmRegiao);

                listRegioes.add(regiao);
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

        return listRegioes;
    }

    public Regiao buscarRegiao(int idRegiao) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;
        Regiao regiao = new Regiao();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM regioes WHERE id_regiao = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idRegiao);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                String nmRegiao = resultSet.getString("nm_regiao");

                regiao.setIdRegiao(idRegiao);
                regiao.setNmRegiao(nmRegiao);
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

        return regiao;
    }

    public Regiao buscarRegiao(String nmRegiao) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;
        Regiao regiao = new Regiao();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM regioes WHERE nm_regiao = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nmRegiao);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idRegiao = resultSet.getInt("id_regiao");

                regiao.setIdRegiao(idRegiao);
                regiao.setNmRegiao(nmRegiao);
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

        return regiao;
    }

    public void apagarRegiao(int idRegiao) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "DELETE FROM regioes WHERE id_regiao = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idRegiao);

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
