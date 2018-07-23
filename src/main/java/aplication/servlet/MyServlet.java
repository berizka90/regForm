package aplication.servlet;


import aplication.model.User;
import aplication.model.data.Address;
import aplication.model.data.Group;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@WebServlet(urlPatterns = "/", name = "MyServlet")
public class MyServlet extends HttpServlet {

    private static final String index = "/WEB-INF/view/index.jsp";
    private List<User> users;

    @Override
    public void init() throws ServletException {
        users = new CopyOnWriteArrayList<>();
        users.add(new User());
        users.get(0).setFirstName("ira");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF8");
        request.setAttribute("users", users);
        request.getRequestDispatcher(index).forward(request, response);
        // response.setContentType("text/jsp; charset=UTF-8");



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
//        if(!requestIsValid(req)){
//            doGet(req,resp);
//        }
        //get Parametters from Web
       final String lastName = req.getParameter("lastName");
       final String firstName = req.getParameter("firstName");
       final String patronimic = req.getParameter("patronimic");
       final String login = req.getParameter("login");
      final  String group = req.getParameter("group");
       final String homePhone = req.getParameter("homePhone");
       final String mobilePhone = req.getParameter("mobilePhone");
       final String addPhone = req.getParameter("addPhone");
       final String eMail=req.getParameter("eMail");
       final String skype = req.getParameter("skype");
      final  String city = req.getParameter("city");
       final String postindex =req.getParameter("postIndex");
       final String street = req.getParameter("street");
      final   String houseNumber = req.getParameter("houseNumber");
      final   String apartmentNumber = req.getParameter("apartmentNumber");
      final   String comment = req.getParameter("comment");

      //add user
      final User user=new User();
      final Address address=new Address();


      //adress add
        address.setCityIndex(postindex);
        address.setCity(city);
        address.setApartmentNumber(apartmentNumber);
        address.setHouseNumber(houseNumber);
      //user add
       user.setFirstName(firstName);
       user.setLastName(lastName);
       user.setPatronymic(patronimic);
       user.setShortName(lastName);
       user.setNickname(login);
       user.setComment(comment);
       user.setSkype(skype);
       user.setEmail(eMail);
       user.setHomePhone(homePhone);
       user.setMobilePhone(mobilePhone);
       user.setSpareMobilePhone(addPhone);
       user.setAddress(address);

       users.add(user);
       doGet(req,resp);

      //Output
        PrintWriter out = resp.getWriter();
        out.println("<h3>Профіль користувача</h3>");
        out.println("1. Ім'я :" +user.getFirstName() + "<br>");
        out.println("2. Прізвище :" + lastName + "<br>");
        out.println("3. Побатькові :" + patronimic + "<br>");
        out.println("4. Скорочено :" + lastName + " " + new StringBuilder(firstName.charAt(0)).toString() + "." + "<br>");
        out.println("5. Нікнейм :" + login + "<br>");
        out.println("6. Коментар :" + comment + "<br>");
        out.println("7. Група :" + group + "<br>");
        out.println("8. Тел. дом. :" + homePhone + "<br>");
        out.println("9. Тел. моб :" + mobilePhone + "<br>");
        out.println("10. Додатковий тел. :" + addPhone + "<br>");
        out.println("11. Е-мейл :" + eMail + "<br>");
        out.println("12. Скайп :" + skype + "<br>");
        out.println("13. Адреса :" + postindex + ". " + city + ", " + street + " " + houseNumber + " кв. " + apartmentNumber + "<br>");
    }
private boolean requestIsValid(final HttpServletRequest req){
    final String lastName = req.getParameter("lastName");
    final String firstName = req.getParameter("firstName");
    final String patronimic = req.getParameter("patronimic");
    final String login = req.getParameter("login");
    final  String group = req.getParameter("group");
    final String homePhone = req.getParameter("homePhone");
    final String mobilePhone = req.getParameter("mobilePhone");
    final String addPhone = req.getParameter("addPhone");
    final String eMail=req.getParameter("eMail");
    final String skype = req.getParameter("skype");
    final  String city = req.getParameter("city");
    final String postindex =req.getParameter("postIndex");
    final String street = req.getParameter("street");
    final   String houseNumber = req.getParameter("houseNumber");
    final   String apartmentNumber = req.getParameter("apartmentNumber");
    final   String comment = req.getParameter("comment");
        return (lastName!=null&& firstName!=null &&patronimic!=null && login!=null && group!=null &&
                homePhone!=null&& mobilePhone!=null &&eMail!=null && addPhone!=null && skype!=null&&
                city!=null&& postindex!=null &&street!=null && houseNumber!=null && apartmentNumber!=null &&
        comment!=null);
}
    @Override
    public void destroy() {
        System.out.println("servlet destroidet");
    }
}

