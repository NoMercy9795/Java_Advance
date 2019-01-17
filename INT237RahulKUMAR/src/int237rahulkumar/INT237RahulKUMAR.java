/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int237rahulkumar;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import jdk.internal.org.xml.sax.SAXException;
import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 *
 * @author rahul
 */
public class INT237RahulKUMAR  {

        private static final String USERNAME ="sql12273536";
	private static final String PASSWORD ="accolite";
	private static final String CONN_STRING ="jdbc:mysql://sql12.freemysqlhosting.net/sql12273536?useSSL=false";
	
	public static void main(String[] args) throws Exception,ClassNotFoundException, SQLException, IOException {
            
//		Class.forName("con.mysql.cj.jdbc.Driver");
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
			System.out.println("Reading from server datavase");
			Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SHOW fields FROM emp");
                          while(rs.next()) {
                              System.out.println(rs.getString(1)+ " " + rs.getString(2) );
                          }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
			 rs = stmt.executeQuery("select * from emp");
                        String fileContent = "<accolite>";
                        FileWriter fileWriter = new FileWriter("XML_Data.xml");
                        fileWriter.write(fileContent);
                        System.out.println(fileContent);
                        fileWriter.write("\n");
                        
			while(rs.next()) {
//				
                                fileWriter.write("<employee>"+"\n");
                                fileWriter.write("<empno>"+rs.getInt(1)+"</empno>"+"\n");
                                fileWriter.write("<ename>"+rs.getString(2)+"</ename>"+"\n");
                                fileWriter.write("<job>"+rs.getString(3)+"</job>"+"\n");
                                fileWriter.write("<mgr>"+rs.getInt(4)+"</mgr>"+"\n");
                                fileWriter.write("<hiredate>"+rs.getDate(5)+"</hiredate>"+"\n");
                                fileWriter.write("<sal>"+rs.getInt(6)+"</sal>"+"\n");
                                fileWriter.write("<comm>"+rs.getInt(7)+"</comm>"+"\n");
                                fileWriter.write("<deptno>"+rs.getInt(8)+"</deptno>"+"\n");
                                
                                fileWriter.write("</employee>"+"\n");
                               
			}
                        System.out.println("</accolite>");
                        fileWriter.write("</accolite>");
                         
                        int i=stmt.executeUpdate("insert into emp values('"+292+"','"+"github"+"','"+"open"+"','"+1232+"','"+"2019-10-10"+"','"+237+"','"+1232+"','"+20+"')");
                        
                        fileWriter.close();
                        
			
			
		} catch (SQLException e) {
			
			System.err.println(e);
		}finally{
			if(conn!=null) {
				conn.close();
			}
		}
                		Connection connn = null;
                try {
			connn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
			System.out.println("Reading from server datavase");
			Statement stmt = connn.createStatement();
                        ResultSet rs = stmt.executeQuery("SHOW fields FROM emp");
                          while(rs.next()) {
                              System.out.println(rs.getString(1)+ " " + rs.getString(2) );
                          }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
			 rs = stmt.executeQuery("select * from emp");
                        String fileContent = "<accolite>";
                        FileWriter fileWriter = new FileWriter("XML_Data1.xml");
                        fileWriter.write(fileContent);
                        System.out.println(fileContent);
                        fileWriter.write("\n");
                        
			while(rs.next()) {
			
                                fileWriter.write("<employee>"+"\n");
                                fileWriter.write("<empno>"+rs.getInt(1)+"</empno>"+"\n");
                                fileWriter.write("<ename>"+rs.getString(2)+"</ename>"+"\n");
                                fileWriter.write("<job>"+rs.getString(3)+"</job>"+"\n");
                                fileWriter.write("<mgr>"+rs.getInt(4)+"</mgr>"+"\n");
                                fileWriter.write("<hiredate>"+rs.getDate(5)+"</hiredate>"+"\n");
                                fileWriter.write("<sal>"+rs.getInt(6)+"</sal>"+"\n");
                                fileWriter.write("<comm>"+rs.getInt(7)+"</comm>"+"\n");
                                fileWriter.write("<deptno>"+rs.getInt(8)+"</deptno>"+"\n");
                                
                                fileWriter.write("</employee>"+"\n");
                               
			}
                        System.out.println("</accolite>");
                        fileWriter.write("</accolite>");
                         
                        
                        
                        fileWriter.close();
                        
			
			
		} catch (SQLException e) {
			
			System.err.println(e);
		}finally{
			if(conn!=null) {
				conn.close();
			}
		}
                  BufferedReader reader1 = new BufferedReader(new FileReader("XML_Data.xml"));
        
        BufferedReader reader2 = new BufferedReader(new FileReader("XML_Data1.xml"));
        
        String line1 = reader1.readLine();
        
        String line2 = reader2.readLine();
        
        boolean areEqual = true;
        
        int lineNum = 1;
        
        while (line1 != null || line2 != null)
        {
            if(line1 == null || line2 == null)
            {
                areEqual = false;
                System.out.println("Two files have different content. They differ at line "+lineNum);
            
            System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
                
            }
            else if(! line1.equalsIgnoreCase(line2))
            {
                areEqual = false;
                System.out.println("Two files have different content. They differ at line "+lineNum);
            
             System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
                
               
            }
            
            line1 = reader1.readLine();
            
            line2 = reader2.readLine();
            
            lineNum++;
        }
        
        if(areEqual)
        {
            System.out.println("Two files have same content.");
        }
        else
        {
            System.out.println("Two files have different content. They differ at line "+lineNum);
            
            System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
        }
        
        reader1.close();
        
        reader2.close();
                
                

	}
        

 
}  
       
	