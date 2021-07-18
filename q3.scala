package e3
object e3{
  def addition(num:Int):Int={
    num match{
      case 1 => return 1;
      case _ => return addition(num-1)+num;
    }
  }
  def main(args:Array[String]):Unit ={
    print(addition(8));

  }
}

