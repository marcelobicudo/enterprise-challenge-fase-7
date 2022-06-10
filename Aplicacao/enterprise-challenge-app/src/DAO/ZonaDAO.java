package DAO;

import bean.Zona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ZonaDAO {
    private Connection conexao;

    public void cadastrarZona(Zona zona) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO zonas(nm_zona) VALUES (?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, zona.getNmZona());

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

    public List<Zona> listarTodasZonas() {
        List<Zona> listZonas = new ArrayList<Zona>();
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM zonas";
            stmt = conexao.prepareStatement(sql);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idZona = resultSet.getInt("id_zona");
                String nmZona = resultSet.getString("nm_zona");

                Zona zona = new Zona(idZona, nmZona);

                listZonas.add(zona);
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

        return listZonas;
    }

    public Zona buscarZona(int idZona) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;
        Zona zona = new Zona();

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM zonas WHERE id_zona = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idZona);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                String nmZona = resultSet.getString("nm_zona");

                zona.setIdZona(idZona);
                zona.setNmZona(nmZona);
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

        return zona;
    }

    public List<Zona> buscarZonas(String nmZona) {
        List<Zona> listZonas = new ArrayList<Zona>();
        PreparedStatement stmt = null;
        DAO dao = new DAO();
        ResultSet resultSet = null;

        try {
            conexao = dao.getConnection();
            String sql = "SELECT * FROM doencas WHERE nm_doenca = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nmZona);
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int idZona = resultSet.getInt("id_zona");

                Zona zona = new Zona(idZona, nmZona);

                listZonas.add(zona);
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

        return listZonas;
    }

    public void apagarZona(int idZona) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "DELETE FROM zonas WHERE id_zona = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idZona);

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
