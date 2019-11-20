/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiTech_Dao;

import java.sql.Connection;
import java.util.ArrayList;
import HiTech_Model.Produtos;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutosDAO {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "Hitech_Instruments";
    private static String url = " ";
    private static Connection ConexaoHitech;

 public static boolean salvar(Produtos l) {
        return SimulaBD.getInstance().SalvarProduto(l);
    }
    
    public static boolean excluir(String CodBarras) {
      return SimulaBD.getInstance().ExcluirProduto(CodBarras);
    }

    public static boolean atualizar(Produtos l) {
       return SimulaBD.getInstance().AtualizarProduto(l);
    }

    public static ArrayList<Produtos> getProdutos() {
         return SimulaBD.getInstance().getProdutos();
    }



}
