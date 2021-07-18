package e6

object e6 {
  def fibb(num:Int):Int={
    num match {
      case 0 => return 0;
      case 1 => return 1;
      case _ => return fibb(num-1)+fibb(num-2);
    }
  }

  def main(args: Array[String]): Unit = {
    print(fibb(9));
  }
}
