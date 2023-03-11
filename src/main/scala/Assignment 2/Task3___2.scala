package Task3

import chisel3._
import chisel3.util._
import chisel3.experimental._

trait ModuleIO {
  def in1: UInt
  def in2: UInt
  def out: UInt
}

class Add extends RawModule with ModuleIO {
  val in1 = IO(Input(UInt(8.W)))
  val in2 = IO(Input(UInt(8.W)))
  val out = IO(Output(UInt(8.W)))
  out := in1 + in2
}

class Sub extends RawModule with ModuleIO {
  val in1 = IO(Input(UInt(8.W)))
  val in2 = IO(Input(UInt(8.W)))
  val out = IO(Output(UInt(8.W)))
  out := in1 - in2
}

// Define the Top module that takes two modules as parameters
class Top[T1 <: RawModule with ModuleIO, T2 <: RawModule with ModuleIO](
  genT1: => T1,
  genT2: => T2
) extends Module {
  val io = IO(new Bundle {
    val in1 = Input(UInt(8.W))
    val in2 = Input(UInt(8.W))
    val out1 = Output(UInt(8.W))
    val out2 = Output(UInt(8.W))
  })

  val addModule = Module(genT1)
  val subModule = Module(genT2)

  addModule.in1 := io.in1
  addModule.in2 := io.in2
  io.out1 := addModule.out

  subModule.in1 := io.in1
  subModule.in2 := io.in2
  io.out2 := subModule.out
}
