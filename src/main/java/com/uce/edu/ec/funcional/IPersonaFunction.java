package com.uce.edu.ec.funcional;

@FunctionalInterface
public interface IPersonaFunction<T, R> {
	public T aplicar(R arg);
}
