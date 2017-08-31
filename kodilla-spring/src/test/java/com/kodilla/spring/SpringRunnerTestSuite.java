package com.kodilla.spring;

import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {
	@Test	// 1
	public void testCircleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("circle");
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This is a circle.", name);
	}

	@Test	// 2
	public void testRectangleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("triangle");
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This is a triangle.", name);
	}

	@Test	// 3
	public void testSquareLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("createSquare");
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This is a square.", name);
	}

	@Test	// 4
	public void testShapeLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("choosenShape");
		//When
		String name = shape.getShapeName();
		//Then
		System.out.println("Choosen shape says: " + name);
	}
}







/*
package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {
	@Test  // Moduł 10.1
	public void testCircleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = context.getBean(Circle.class);
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This is a circle.", name);
	}

	@Test	// Moduł 10.1
	public void testRectangleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = context.getBean(Triangle.class);
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This is a triangle.", name);
	}
	@Test	// Moduł 10.2
	public void testSquareLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = context.getBean(Square.class);
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This is a square.", name);
	}

}
*/