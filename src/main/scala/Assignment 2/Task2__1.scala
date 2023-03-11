object Task2__1 {
  sealed trait State                 // Define an enum using a sealed trait and case objects
  case object StateA extends State
  case object StateB extends State
  case object StateC extends State

  sealed trait Input                 // Define another enum for the input symbols
  case object InputX extends Input

  def transition(state: State, input: Input): State = (state, input) match {
    case (StateA, InputX) => StateB  // If in state A and receive input X, transition to state B
    case (StateB, InputX) => StateC
    case (StateC, InputX) => StateA
    case _ => state
  }

  class FSM (initialState: Task2__1.State) {
    import Task2__1._
    private var currentState = initialState

    def state: Task2__1.State = currentState

    def process(input: Task2__1.Input): Unit = {
      currentState = Task2__1.transition(currentState, input)
    }
  }

  def main(args: Array[String]) = {
    val trafficLight = new Task2__1.FSM(Task2__1.StateA)
    trafficLight.process(Task2__1.InputX)
    println(trafficLight.state)
    trafficLight.process(Task2__1.InputX)
    println(trafficLight.state)
    trafficLight.process(Task2__1.InputX)
    println(trafficLight.state)
  }
}
