package entidade;

public class Usuario {

    public String email;
    public String senha;

    public Usuario(String email, String senha){

        System.out.println("AUTENTIAÇÃO POR EMAIL E SENHA");


    }

    public Usuario(String telefone){

        System.out.println("AUTENTIAÇÃO POR TELEFONE");
    }

}

//teste commit
