package com.jinggao.creative.factorypattern;

public class ShapeFactory {
    
  //使用 getShape 方法获取形状类型的对象
  public static Shape getShape(String shapeType){
     if(shapeType == null){
        return null;
     }        
     if(shapeType.equalsIgnoreCase("CIRCLE")){
        return new Circle();
     } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
        return new Rectangle();
     } else if(shapeType.equalsIgnoreCase("SQUARE")){
        return new Square();
     }
     return null;
  }
}