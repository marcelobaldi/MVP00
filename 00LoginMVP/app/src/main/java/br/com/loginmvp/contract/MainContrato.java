package br.com.loginmvp.contract;

public interface MainContrato {

    //Comunica com a Camada de Visualização (Activity)
    interface View {
        void mostrarMensagem (String texto);
    }

    //Comunica com a Camada Presenter
    interface Presenter {
        //Chamado Quando o Botão de Login For Clicado
        void loginClicado (String nome, String senha);      //Chama o Método LoginClicado

    }


}


//Um Contrato Para Cada Atividade ou Fragmento!;

//Poderia Ser Classe, mas Interface é o Mais Aconselhável;
//Contem a Camada Activity (Apresentação) e a Camada Presenter;
