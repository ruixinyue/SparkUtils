package conf

object TestConfiguration {
  def main(args: Array[String]): Unit = {
    val user = ConfigManagerFileBased.config.getString("jdbc.user")
    println(user) //root
    val password = ConfigManagerProperties.props.getProperty("jdbc.password")
    println(password) //123456
  }
}
