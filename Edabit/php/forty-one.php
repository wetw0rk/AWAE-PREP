<?php

class Circle
{
  public function __construct($radius)
  {
    $this->r = $radius;
  }
  public function getArea()
  {
    return pi() * $this->r * $this->r;
  }
  public function getPerimeter()
  {
    return 2 * pi() * $this->r;
  }
}

$circ = new Circle(11);
echo $circ->getArea()."\n";

$circ = new Circle(4.44);
echo $circ->getPerimeter()."\n";

?>
