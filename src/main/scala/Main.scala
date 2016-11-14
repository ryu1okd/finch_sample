import io.finch._
import com.twitter.finagle.Http
import com.twitter.util.Await

/**
  * Created on 2016/06/24.
  */
object Main extends App{

  val api: Endpoint[String] = get("hello") { Ok("Hello, World!") }
  val api2: Endpoint[String] = get("hello2") { Ok("Hello, World! Hello, World!") }

  val routes = api :+: api2
  Await.ready(Http.server.serve(":8080", routes.toServiceAs[Text.Plain]))
}
