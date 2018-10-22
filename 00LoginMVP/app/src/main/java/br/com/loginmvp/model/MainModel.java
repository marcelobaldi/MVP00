package br.com.loginmvp.model;

public class MainModel {
    String nome  = "aula";
    String senha = "1234";

    public boolean login (String mNome, String mSenha){
        return mNome.equals( nome ) && mSenha.equals( senha );
    }
}

//No exemplo é ==, mas não funciona. só com o Equals ;


