public class FormatarCep {  

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
    public static void main(String[] args) {
        try{
        String cepFormtado = formatarCep("23765064");
        System.out.println(cepFormtado);

        }
        catch (CepInvalidoException e) {
            System.out.println("O cep não está no padrão das regras de negócios.");
        }
        
        
    }
   
    
}
