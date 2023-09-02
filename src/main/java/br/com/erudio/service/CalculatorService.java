package br.com.erudio.service;

import org.springframework.web.bind.annotation.PathVariable;

import br.com.erudio.exception.UnsuportedMathOperationException;

public interface CalculatorService {

	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo")String numberTwo) throws UnsuportedMathOperationException;
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo")String numberTwo) throws UnsuportedMathOperationException;
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo")String numberTwo) throws UnsuportedMathOperationException;
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo")String numberTwo) throws UnsuportedMathOperationException;
	public Double med(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo")String numberTwo) throws UnsuportedMathOperationException;
	public Double raiz(@PathVariable("numberOne") String number) throws UnsuportedMathOperationException;
	
}
