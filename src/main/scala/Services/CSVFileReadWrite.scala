package Services

import java.io.{File,PrintWriter}
import scala.io.Source.fromFile

object CSVFileReadWrite extends FileReadWrite{
  def read(fileLocation: String): String = {

    val file = new File(fileLocation)

    lazy val bufferedSource = fromFile(file)
    try {
      val fileContent = bufferedSource.getLines.mkString("\n")
      bufferedSource.close()
      fileContent
    }
    catch
      {
        case Exception=> throw new Exception("Incorrect location or filename")
      }
  }
  def write(fileName: String, content: String, dirPath: String): Boolean = {

    new File(dirPath).mkdir()

    val writeToFile = new PrintWriter(dirPath + "/" + fileName)

    try {
      writeToFile.write(content)
      writeToFile.close()
      true
    }

    catch {
      case Exception => throw new Exception
                        false
    }

  }



}
