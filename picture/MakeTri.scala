object MakeTri {
  def main(args: Array[String]): Unit = {
    val ver1 = Vertex(1.0, 0.0)
    val ver2 = Vertex(1.0, 1.0)
    val ver3 = Vertex(0.0, 1.0)
    val edge1 = Edge(ver1, ver2)
    val edge2 = Edge(ver2, ver3)
    val edge3 = Edge(ver3, ver1)
    val triTest = Triangle(edge1, edge2, edge3)
    println("Hello World")
    println(ver1)
    println(edge1)
    println(edge1.getV0)
    println(triTest)
    println(make.makeTriangle(triTest))
  }
}
