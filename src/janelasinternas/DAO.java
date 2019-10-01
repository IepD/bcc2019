
package janelasinternas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Lucas Dias
 */
public abstract class DAO<E> {
    
    protected Connection conn;
    
    public DAO()
    {
        String url = "jdbc:mysql://127.0.0.1:3306/aula?serverTimezone=UTC";
        String user = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO ";
            stmt.execute(sql);
            
        }catch(ClassNotFoundException e){
            System.out.println("Erro do driver");
        }
        catch(SQLException e){
            System.out.println("Erro de conexão: "+ e.getMessage());
        }
    }
    
    public abstract boolean inserir(E e);
    public abstract boolean editar(E e);
    public abstract boolean excluir(E e);
    public abstract boolean listar(E e);
    
}
