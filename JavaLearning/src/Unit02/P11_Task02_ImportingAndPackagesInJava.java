package Unit02;//Inside this package we can create any number of classes


/*
 -A java package is a group of similar types of classes, interfaces and sub-Packages.
 -Package in java can be categorized in two forms
 	-built-in package {lang, awt, javax, swing, net, io, util, sql}
 	-User definded package 
 	
 -Package also helps to avoid name collision
 -Package also helps us to maintain access protection in java
 -packages are named in reverse order of domain names
 	-Unit01.javaproject.com -> "com.javaproject.unit01"
 	
import java.util.vector; //import the vector class from util package
import java.util.*; //import all the classes from util package

Static Import:
	-Static import is a feature introduced in java programming language (versions 5 and above 
	-that allows members (fields and methods ) defined in a class public static 
	to be used in java code without specifying the class in which the field is defined
 * 
 */
import static java.lang.System.*;
import static java.lang.Math.*;

import Unit01.SampleClass1;
public class P11_Task02_ImportingAndPackagesInJava {

	public static void main(String[] args) {
		
		out.println("Welcome To Package:)");
		
		out.println(sqrt(4));
		System.out.println(pow(2,2));
		System.out.println(abs(6.3));
		
		SampleClass1 obj = new SampleClass1();
		System.out.println(obj.a);
	}

}
