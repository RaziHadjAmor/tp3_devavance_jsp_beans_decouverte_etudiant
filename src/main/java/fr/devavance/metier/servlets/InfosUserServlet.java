package fr.devavance.metier.servlets;

import fr.devavance.metier.beans.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author bouchaib.lemaire
 */
// Mappage de la Servlet pour être le point d'entrée (racine) et l'URL /infos
@WebServlet(urlPatterns = {"/infos", "/"}) 
public class InfosUserServlet extends HttpServlet {

     
    public final static String KEY_USER = "user";
    public final static String KEY_USERS = "users";
    public final static String KEY_USER_NAME = "user_name";
    public final static String KEY_PROFIL = "profil";
    public final static String KEY_PASSWORD = "password";
    public final static String KEY_AUTH = "auth";
    
    // Définition de la vue
    private final static String VUE_INFOS_USER = "infos_user.jsp";
    
    
    /**
     * Crée et initialise un objet User avec les données spécifiées.
     * @return un objet User initialisé
     */
    private User createNewUser() {
        // Crée un nouveau bean (newUser())
        User user = new User();
        
        // Initialise les propriétés (userName="alan", profil="admin", password="mp2023t")
        user.setUserName("alan");
        user.setPassword("mp2023t"); 
        user.setProfil("admin");
        user.setAuth(false); // Auth par défaut est false
        
        return user;
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        // 1.1.1 : Créer le bean User et le remplir
        User currentUser = createNewUser();
        
        // 1.1.2 : Stocker le bean dans la portée request (Scope : request)
        // KEY_USER doit être "user" pour correspondre à <jsp:useBean id="user"...>
        request.setAttribute(KEY_USER, currentUser); 
        
        // 1.1.3 : Faire suivre la requête à la vue (infos_user.jsp)
        RequestDispatcher rd = request.getRequestDispatcher(VUE_INFOS_USER);
        rd.forward(request, response);
    }
}