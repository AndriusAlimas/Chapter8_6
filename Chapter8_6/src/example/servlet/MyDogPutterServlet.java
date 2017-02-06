package example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import example.EmployeeBean;
import example.Dog;

public class MyDogPutterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException, IOException{
		// creating simple Java object:
		EmployeeBean employeeBean = new EmployeeBean();
		// using that object call and set first name, using help of request object that can get 
		// form parameter:
        employeeBean.setFirstName(request.getParameter("firstName"));
        // create another java object:
        Dog dog = new Dog();
        // set again like previously but this time you set for dog:
        dog.setName(request.getParameter("dName"));
        // and put this dog object into person, because person has a dog:
        employeeBean.setDog(dog);
        // using request object set attribute to request scope:
        request.setAttribute("person_object", employeeBean);
        // creating a request dispatcher object using request object:
        RequestDispatcher rd = request.getRequestDispatcher("TestBean.jsp");
        // even you can do like this, this is no ERROR:
        rd.forward((ServletRequest)request, (ServletResponse)response);
	}
}
