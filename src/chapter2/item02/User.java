package chapter2.item02;

public class User {
     private String id;
     private String password;
     private String name;
     private String email;

     public static class Builder {
         private String id;
         private String password;
         private String name = "";
         private String email = "";

         private Builder() {}

         public Builder id(String id) {
             this.id = id;
             return this;
         }

         public Builder password(String password) {
             this.password = password;
             return this;
         }

         public Builder name(String name) {
             this.name = name;
             return this;
         }

         public Builder email(String email) {
             this.email = email;
             return this;
         }

         public User build() {
             if(this.id == null || this.password == null) {
                 String msg = " id and password are required" + "[ id:" + this.id + ", password:" + this.password + "]";
                 throw new IllegalStateException(msg);
             }
             return new User(this);
         }
     }

     public static Builder Builder() {
        return new Builder();
    }

     private User(Builder builder) {
         id = builder.id;
         password = builder.password;
         name = builder.name;
         email = builder.email;
     }

     public String toString() {
         return new StringBuilder()
                         .append("id : ").append(this.id).append("\n")
                         .append("password : ").append(this.password).append("\n")
                         .append("name : ").append(this.name).append("\n")
                         .append("email : ").append(this.email).append("\n")
                         .toString();
     }

}
