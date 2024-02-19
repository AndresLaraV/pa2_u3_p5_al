package com.uce.edu.ec.funcional;

@FunctionalInterface
public interface IPersonaFunction<T, R> { //Retorna T y recibe R
	public T aplicar(R arg); 
}
