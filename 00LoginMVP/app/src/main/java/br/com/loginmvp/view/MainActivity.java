package br.com.loginmvp.view;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import br.com.loginmvp.R;
import br.com.loginmvp.contract.MainContrato;
import br.com.loginmvp.presenter.main.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContrato.View {

    //Classes e Objetos Usados;
    MainPresenter presenter;
    EditText            nome,senha;
    Button              login;

    //Método OncCreate (Obrigatório da Activity)
    @Override protected void onCreate(Bundle savedInstanceState) { super.onCreate( savedInstanceState );
        //Activity Carregada
        setContentView( R.layout.activity_main );

        //Inst. Classe e Ident. Objetos
        presenter           = new MainPresenter( this );
        nome                = (EditText) findViewById( R.id.edt_username );
        senha               = (EditText) findViewById( R.id.edt_password );
        login               = (Button)   findViewById( R.id.btn_login );

        //Botão de comando Login
        login.setOnClickListener( new View.OnClickListener() {@Override public void onClick(View v) {
            String nomeX  = nome.getText().toString();
            String senhaX = senha.getText().toString();

            presenter.loginClicado( nomeX, senhaX );
        }});
    }

    //Método Mostrar Menssagem (Obrigatório da Classe Pai MainContrato (método view));
    @Override public void mostrarMensagem(String texto) {     //o texto vem da classe presenter
        Toast.makeText( this, texto, Toast.LENGTH_LONG).show();
    }

}


//00-ActivityMain:          Caixa de Texto Nome, Caixa de Texto Senha, Botão Comando Entrar;
//01-Pacotes:               Criar Pacotes Model, Presenter, Main, View;
//02-Criar Classes;
//03-Classe MainContrato:   02 Métodos Interface (View e Presenter);
//04-Classe MainPresente:   Herdar o Método Presenter da Classe MainContrato
//05-Classe MainActivity:   Herdar o Método View da Classe MainContrato;

//06-MainPresenter:         Herança do Método Presenter da Classe MainContrato;
//06-MainPresenter:         Chama o Método View da Classe MainContrato (declarar);
//06-MainPresenter:         Construtor com a Variável do Método View da Classe MainContrato;

//07-MainActivity:          Chamar a Classe MainPresenter (declarar);
//07-MainActivity:          Instanciar a Classe MainPresenter, Passando o MainContrato.View (podendo ser o this);
//07-MainActivity:          Instanciar Classes e Identificar Objetos;

//08-MainContrato:          No Método Presenter, Criar Método de Login Clicado;
//08-MainActivity:          Botão de Comando para Chamar Método Login Clicado da Classe Presenter;
//08-MainPresenter:         Implementar Método de Login Clicado;
//08-MainContrato:          Interface View = Criar Método Para Exibir Mensagem. Não é Recomendável usar o Contexto no presenter ....;
//08-MainPresenter:         Método de LoginClicado (senha ou nome vazio);
//09-MainActivity:          Implement method (mostrar mensagem);

//10-RepositórioSessão:     Banco de Dados;
//10-MainPresenter:         Chamar a Classe RepositórioSessessão
//10-MainActivity:          Chama o método frutas ...


//Return num Método         = Sadi do Método;



//isEmpety, " ", null, equals ...










//Aula 9 da Seção 3 (me perdi). colocar o MainContato.view na classe .... ?!!?????????????????????????????
//Antes Dava Para Apavar os Pacotes Testes, Agora Não Mais ?!

//Cada Activity (presenter), deve ter a classe presenter;
//Cada acitivy, deve ter a view;
//Classe contrato = conecta a view cm a preseneter. é interface (obriga o método ?!?);


