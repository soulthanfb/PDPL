public class Foo {
    public static final int MAX_PASSWORD_SIZE = 7;
    public void setPassword(String password) {
        if (password.length() > MAX_PASSWORD_SIZE) {
            throw new InvalidArgumentException("password");
        }
      }
    }