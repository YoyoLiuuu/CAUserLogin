package use_case.login;

import entity.User;

/**
 * DAO for the Login Use Case.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Set the user to user that is accessing.
     * @param name the user that is logged in.
     */
    void setCurrentUser(String name);

    /**
     * Placeholder getter, not used in example.
     * @return Null because this is just inherited and needs to be implemented.
     */
    String getCurrentUser();
}
