package Task3

import chisel3._
import chisel3.tester._
import org.scalatest._

class Task3__2Test extends FreeSpec with ChiselScalatestTester {
  "calculate the sum and difference of two inputs" in {
    test(new Top(new Add, new Sub)) { c =>
      c.io.in1.poke(5.U)
      c.io.in2.poke(3.U)
      c.clock.step(1)
    //   println(s"Adder output: ${top.io.out1.peek().litValue()}, Subtractor output: ${top.io.out2.peek().litValue()}")
      c.io.out1.expect(8.U)
      c.io.out2.expect(2.U)
    }
  }
}
