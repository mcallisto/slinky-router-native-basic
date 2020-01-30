package hello.world

import slinky.core._
import slinky.core.annotations.react
import slinky.native._

import typings.reactRouterNative.components.{Route, Link, NativeRouter}
import typings.reactRouter.mod.{RouteProps, `match`}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.literal

object Styles {
  val headerStyle = literal(
    fontSize = 20,
    color = "black"
  )

  val topicStyle = literal(
    textAlign = "center",
    fontSize = 15
  )
}

@react object App {

  type Props = Unit

  val component = FunctionalComponent[Props] { _ =>

    def home = Text(style = Styles.headerStyle)("Home")

    def about = Text(style = Styles.headerStyle)("About")

    val navItemStyle = literal(
      flex = 1,
      alignItems = "center",
      padding = 10
    )

    NativeRouter(
      View(style = literal(
        marginTop = 25,
        padding = 10
      ))(
        View(
          style = literal(
            flexDirection = "row",
            justifyContent = "space-around",
          )
        )(
          Link(to = "/", style = navItemStyle)(Text("Home")),
          Link(to = "/about", style = navItemStyle)(Text("About")),
          Link(to = "/topics", style = navItemStyle)(Text("Topics"))
        ),
        Route(RouteProps(exact = true, path = "/", render = _ => home)),
        Route(RouteProps(path = "/about", render = _ => about)),
        Route(RouteProps(path = "/topics", render = props => Topics(props.`match`.asInstanceOf[`match`[Unit]])))
      )
    )

  }
}

@react object Topics {

  case class Props(`match`: `match`[Unit])

  val component = FunctionalComponent[Props] { props =>
    val subNavItemStyle = literal(
      padding = 5
    )

    View(
      Text(style = Styles.headerStyle)("Topics"),
      View(
        Link(to = props.`match`.url + "/rendering", style = subNavItemStyle)(Text(style = Styles.topicStyle)("Rendering with React")),
        Link(to = props.`match`.url + "/components", style = subNavItemStyle)(Text(style = Styles.topicStyle)("Components")),
        Link(to = props.`match`.url + "/props-v-state", style = subNavItemStyle)(Text(style = Styles.topicStyle)("Props v. State"))
      ),
      Route(
        RouteProps(
          path = props.`match`.path + "/:topicId",
          render = props => Topic(props.`match`.asInstanceOf[`match`[Topic.Param]])
        )
      ),
      Route(RouteProps(exact = true, path = props.`match`.path, render = _ => Text("Please select a topic")))
    )
  }
}

@react object Topic {

  @js.native
  trait Param extends js.Object {
    val topicId: String = js.native
  }

  case class Props(`match`: `match`[Topic.Param])

  val component = FunctionalComponent[Props] { props =>
    Text(style = Styles.topicStyle)("Topic: " + props.`match`.params.topicId)
  }
}
