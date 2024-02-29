package br.com.vini;

public class User {
   private String nome;
   private String username;
   private String password;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUsername(String username){
         this.username = username;
    }
    public void setPassword(String password){
         this.password = password;
    }

    public String getName(){
        return this.nome;
    }
    public String getUsername(){
        return this.username;
    }
}
