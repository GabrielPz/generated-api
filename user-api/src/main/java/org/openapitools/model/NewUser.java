package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;

/**
 * NewUser
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T11:32:23.055198800-03:00[America/Fortaleza]", comments = "Generator version: 7.4.0")
public class NewUser {

  private String username;

  private String email;

  public NewUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NewUser(String username, String email) {
    this.username = username;
    this.email = email;
  }

  public NewUser username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @NotNull 
  @Schema(name = "username", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public NewUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUser newUser = (NewUser) o;
    return Objects.equals(this.username, newUser.username) &&
        Objects.equals(this.email, newUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUser {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

