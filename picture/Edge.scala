
class Edge( v0: Vertex, v1: Vertex ) {
  def getV0 = v0
  def getV1 = v1
  def getMidpointX : Double = (v0.getX  + v1.getX) / 2
  def getMidpointY : Double = (v0.getY + v1.getY) / 2
} // Edge

object Edge {
  def apply(v0: Vertex, v1: Vertex): Edge = new Edge(v0, v1)
}