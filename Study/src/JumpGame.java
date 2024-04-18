public class JumpGame {
  public static void main(String[] args) {
    JumpGame jumpgame = new JumpGame();
    int [] A = {3,5,2,1,4,1,6,2,1,3};
    System.out.println(jumpgame.jump(A));
  }
  public int jump (int[] arrayOfJumps) {
    int step = 0;//количество прыжков
    int end = 0; //значение индекса для наибольшего прыжка на шаге jump
    int far = 0; //значение индекса после прыжка
    int endOfArray = arrayOfJumps.length - 1;
    for (int i = 0; i < endOfArray; i++) { //потому что i должна доходить до последнего элемента
      final int currentJump = i + arrayOfJumps[i];
      far = Math.max(far, currentJump); //здесь обновляем нашу следующую конечную точку
      if(i == end) { //если i это предел досигаемости текущего прыжка, то мы обновляем наш прыжок и текущий конец для следующего цикла
        step++; // увеличиваем количество прыжков
        end = far; // обновляем текущий конец на следующий конец
      }
    }
    return step;
  }
}
