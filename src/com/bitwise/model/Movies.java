package com.bitwise.model;

import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression;

public class Movies {
	ArrayList<Movie> movies= new ArrayList<Movie>();
	
	public void addMovie(Movie movie){
		movies.add(movie);
	}
	
	public void removeMovie(Movie movie){
	movies.remove(movie);	
	}
}


