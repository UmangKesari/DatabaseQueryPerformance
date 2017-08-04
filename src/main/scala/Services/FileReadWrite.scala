package Services

trait FileReadWrite {

  def read(fileLocation: String)

  def write(filename :  String,content  : String,path:String) : Boolean

}
