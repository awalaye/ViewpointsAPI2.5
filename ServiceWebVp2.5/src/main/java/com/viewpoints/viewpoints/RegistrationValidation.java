package com.viewpoints.viewpoints;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;


@Component("registrationValidator")
public class RegistrationValidation {
  public boolean supports(Class<?> klass) {
    return Inscription.class.isAssignableFrom(klass);
  }

  public void validate(Object target, Errors errors) {
    Inscription registration = (Inscription) target;
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",
        "NotEmpty.registration.email",
        "User Name must not be Empty.");
    String userName = registration.getUserName();
    if ((userName.length()) > 50) {
      errors.rejectValue("email",
          "lengthOfUser.registration.email",
          "User Name must not more than 50 characters.");
    }
    if (!(registration.getPassword()).equals(registration
        .getConfirmPassword())) {
      errors.rejectValue("password",
          "matchingPassword.registration.password",
          "Password and Confirm Password Not match.");
    }
  }
}