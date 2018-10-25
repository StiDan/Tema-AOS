package tema1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Email extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String email = request.getParameter("email");

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Lab1DB", "postgres", "1q2w3e");
			PreparedStatement ps = con.prepareStatement("INSERT INTO person (name, email) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, name);
			ps.setString(2, email);
			int i = ps.executeUpdate();
			if (i > 0) {
				out.print("Registered successfully..");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
