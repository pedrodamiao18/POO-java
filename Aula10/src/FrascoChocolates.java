public class  FrascoChocolates {
    int capacidade, conteudo;

    public FrascoChocolates(int cap, int cont) {
        capacidade = cap;
        conteudo = cont;
    }

    public void retira(int qtd) throws FrascoVazio {
        if (qtd <= conteudo){
            conteudo -= qtd;
        }
        throw new FrascoVazio("OH! OH! guloso, queres demais "+qtd+" "+conteudo);
    }

    public void enche(int qtd) throws FrascoCheio {
        if (capacidade >= conteudo + qtd){
            conteudo += qtd;
        }
        throw new FrascoCheio("OH! OH! já chega, estou de dieta "+qtd+" "+conteudo);
    }
}