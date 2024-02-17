package com.uce.edu.ec.funcional;

@FunctionalInterface
public interface IPersonaConsumer <T> {
	public void accept(T arg);
}
