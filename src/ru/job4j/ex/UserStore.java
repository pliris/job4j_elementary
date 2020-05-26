package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl;
        if (user.isValid()) {
            if (user.getUsername().length() > 2) {
                rsl = true;
            } else {
                throw new UserInvalidException("User must be 3 or bigger character");
            }

        } else {
            throw new UserInvalidException("User invalid");
        }
        return rsl;
    }

    public static void main(String[] args) throws UserNotFoundException, UserInvalidException {

        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException unf) {
            unf.printStackTrace();
        }
    }
}