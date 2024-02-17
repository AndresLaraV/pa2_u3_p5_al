package com.uce.edu.ec.funcional;

@FunctionalInterface
public interface IPersonaUnaryOperator<T> {
	public T aplicar(T arg);
}
