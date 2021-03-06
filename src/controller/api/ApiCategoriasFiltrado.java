package controller.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONStringer;

import model.Producto;
import model.ProductoModeloImp;
/**
 * Servlet implementation class ApiCategorias
 */
@WebServlet("/api/categoriasFiltrado")
public class ApiCategoriasFiltrado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApiCategoriasFiltrado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id_categoria=Integer.parseInt(request.getParameter("id_categoria"));
		
		ProductoModeloImp productoModelo =new ProductoModeloImp();
		
		System.out.println("CATEGORIA : "+id_categoria);
		
		ArrayList<Producto> productos = productoModelo.selectFiltrado(id_categoria);
		
		String jsonString = JSONStringer.valueToString(productos);
		System.out.println("LISTA : "+jsonString);
		
		PrintWriter out = response.getWriter();
		
		response.setHeader("Access-Control-Allow-Origin","*"); //jsonp deia denean ez da behar
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		out.print(jsonString);
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
