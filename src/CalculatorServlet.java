

import java.io.IOException;
import java.math.RoundingMode;
import java.text.NumberFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		NumberFormat nf= NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		nf.setRoundingMode(RoundingMode.HALF_UP);

		int principal = Integer.parseInt(request.getParameter("Principal")); 
		double rate = Double.parseDouble(request.getParameter("AnnualIR")); 
		int term = Integer.parseInt(request.getParameter("years"));
		double result;
		cal.setPrincipal(principal);
		cal.setRate(rate);
		cal.setTerm(term);
		
		result = (cal.MortgageCalculator(cal.getPrincipal(), cal.getRate(), cal.getTerm()));
		String res = nf.format(result);
		request.setAttribute("res", res);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
