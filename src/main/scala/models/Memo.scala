package models

import java.util.Date

/**
  * Created on 2016/08/26.
  */
case class Memo (id:Long, body:String, created:Date)

object Memo extends DB {

  private var initial_data: Seq[Memo] = Seq(Memo(1L, "TEXT TEXT TEXT 1", new Date), Memo(2L, "TEXT TEXT 2", new Date))
  def find:Seq[Memo] = initial_data
  def add(memo:Memo):Boolean = {
    initial_data = initial_data :+ memo
    true
  }
}
