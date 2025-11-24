package fr.devavance.metier.pattern.fabrique.interfaces;

import fr.devavance.metier.beans.Users;
import fr.devavance.metier.exceptions.InvalidUserException;
import java.io.IOException;

/**
 * Interface pour la Fabrique des objets Users.
 */
public interface IUsersFactory {
    
    /**
     * Crée et retourne la liste des utilisateurs.
     * @return Users
     * @throws InvalidUserException si un utilisateur n'est pas valide (par ex. mot de passe trop court).
     * @throws IOException si une erreur survient lors de la lecture de la ressource.
     */
    public Users createUsers() throws InvalidUserException, IOException;
}