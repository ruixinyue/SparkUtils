package conf

import java.io.{FileInputStream, InputStream}
import java.util.Properties

/**
 * 读取配置文件
 * 使用Properties
 */
object ConfigManagerProperties {
  val props = new Properties
/*  方法一：FileInputStream方式，传入配置文件所在位置
  val path = "src\\main\\resources\\commerce.properties"
  private val inputStream = new FileInputStream(path)*/
  //方法二：用getResourceAsStream获取输入流
  //getResourceAsStreampath以'/'开头时,
  //从项目的ClassPath根下获取资源，就是要写相对于classpath根下的绝对路径。
  private val stream: InputStream = this.getClass().getResourceAsStream("/commerce.properties")
  props.load(stream)
}
