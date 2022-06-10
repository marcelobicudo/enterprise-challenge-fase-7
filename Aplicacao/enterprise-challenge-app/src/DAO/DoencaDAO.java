package DAO;

import bean.Doenca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoencaDAO {
    private Connection conexao;

    public void cadastrarDoenca(Doenca doenca) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO doencas(nm_doenca) VALUES (?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, doenca.getNmDoenca());

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

    public List<Doenca> listarTodasDoencas() {
        List<Doenca> listDoencas = new ArrayList<Doenca>();
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM doencas";
            stmt = conexao.prepareStatement(sql);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idDoenca = resultSet.getInt("id_doenca");
                String nmDoenca = resultSet.getString("nm_doenca");

                Doenca doenca = new Doenca(idDoenca, nmDoenca);

                listDoencas.add(doenca);
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

        return listDoencas;
    }

    public Doenca buscarDoenca(int idDoenca) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;
        Doenca doenca = new Doenca();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM doencas WHERE id_doenca = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idDoenca);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                String nmDoenca = resultSet.getString("nm_doenca");

                doenca.setIdDoenca(idDoenca);
                doenca.setNmDoenca(nmDoenca);
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

        return doenca;
    }

    public Doenca buscarDoenca(String nmDoenca) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;
        Doenca doenca = new Doenca();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM doencas WHERE nm_doenca = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nmDoenca);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idDoenca = resultSet.getInt("id_doenca");

                doenca.setIdDoenca(idDoenca);
                doenca.setNmDoenca(nmDoenca);
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

        return doenca;
    }

    public void apagarDoenca(int idDoenca) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "DELETE FROM doencas WHERE id_doenca = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idDoenca);

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
