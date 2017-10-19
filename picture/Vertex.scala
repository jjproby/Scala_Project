
class Vertex( val x: Double, val y: Double ) {
  def getX = x
  def getY = y
} // Vertex

object Vertex {
  def apply( x: Double, y: Double):
    Vertex = new Vertex( x, y)
}

class Triangle( val Ex: Edge, val Ey: Edge, val Ez: Edge) {
  def getEdge1 = Ex
  def getEdge2 = Ey
  def getEdge3 = Ez

}

object Triangle {
  def apply(Ex: Edge, Ey: Edge, Ez: Edge):
    Triangle = new Triangle(Ex, Ey, Ez)
}
object make {
  def makeTriangle (triangle: Triangle) : Triangle = {
    val ver1 = new Vertex(triangle.getEdge1.getMidpointX, triangle.getEdge1.getMidpointY)
    val ver2 = new Vertex(triangle.getEdge2.getMidpointX, triangle.getEdge2.getMidpointY)
    val ver3 = new Vertex(triangle.getEdge3.getMidpointX, triangle.getEdge3.getMidpointY)
    val ed1 = new Edge(ver1, ver2)
    val ed2 = new Edge(ver2, ver3)
    val ed3 = new Edge(ver3, ver1)
    val newTri = new Triangle(ed1, ed2, ed3)
    return newTri
  }
}

