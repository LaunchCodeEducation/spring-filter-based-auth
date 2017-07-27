package org.launchcode.springfilterbasedauth.models.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by LaunchCode
 */
public class LoginForm {

    @NotNull
    @Pattern(regexp = "[a-zA-Z][a-zA-Z0-9_-]{4,11}", message = "Usernames must be between 5 and 12 characters, start with a letter, and contain only letters and numbers")
    private String username;

    @NotNull
    @Pattern(regexp = "(\\S){4,20}", message = "Password must have 4-20 non-whitespace characters")
    private String password;

    public LoginForm() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
