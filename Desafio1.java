private static class TrainComposition {

  private final Train<Integer> vagao = new LinkedList<>();

  public void Esquerda(int num) 
  {
    vagao.addFirst(num);
  }

  public void Direita(int num) 
  {
    vagao.addLast(num);
  }

  public void sairEsquerda() 
  {
    if (!vagao.isEmpty()) 
    {
      vagao.removeFirst(); 
    } else {
      throw new IndexOutOfBoundsException("O trem já está vazio!");
    }
  }

  public void sairDireita() 
  {
    if (!vagao.isEmpty()) 
    {
      vagao.removeLast(); 
    } else {
      throw new IndexOutOfBoundsException("O trem já está vazio!");
    }
  }
}