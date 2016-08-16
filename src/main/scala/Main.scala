import io.finch._
import com.twitter.finagle.Http

/**
  * Created on 2016/06/24.
  */
object Main extends App{

  val api: Endpoint[String] = get("hello") { Ok("Hello, World!") }

  Http.serve(":8080", api.toService)
}
