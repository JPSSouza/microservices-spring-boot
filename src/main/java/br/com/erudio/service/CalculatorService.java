package br.com.erudio.service;

import br.com.erudio.exception.UnsuportedMathOperationException;

public interface CalculatorService {

	public Double sum(String numberOne,String numberTwo) throws UnsuportedMathOperationException;
	public Double sub(String numberOne, String numberTwo) throws UnsuportedMathOperationException;
	public Double mult(String numberOne, String numberTwo) throws UnsuportedMathOperationException;
	public Double div(String numberOne, String numberTwo) throws UnsuportedMathOperationException;
	public Double med(String numberOne, String numberTwo) throws UnsuportedMathOperationException;
	public Double raiz(String number) throws UnsuportedMathOperationException;
	
}
