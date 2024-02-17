package com.uce.edu.ec.funcional;

@FunctionalInterface
public interface IPersonaPredicate<T> {
	public boolean evaluar (T arg);
}
