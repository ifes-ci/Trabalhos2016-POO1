/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

import database.database;
import domain.Produto;
import java.util.ArrayList;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class ProdutoUsadosCRUD {
    public static void cadastrar(Produto p){
        database.lstProdutoAdicionado.add(p);
    }

    public static ArrayList<Produto> listar(){
        return database.lstProdutoAdicionado;
    }
    
    public static void excluir(Produto produto){
        database.lstProdutoAdicionado.remove(produto);
    }
       
   public static Produto listar(String nome){
        for(Produto p: database.lstProdutoAdicionado){
            if(p.getNome_produto().equals(nome)){
                return p;
            }
        }  
        return null;
    }
        
    public static Produto listar(int cod){
        for(Produto p: database.lstProdutoAdicionado){
            if(p.getCod_produto() == cod){
                return p;
            }
        }  
        return null;
    }


}
