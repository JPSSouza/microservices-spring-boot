package br.com.erudio.service.impl;

import org.springframework.stereotype.Service;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.helper.CalculatorHelper;
import br.com.erudio.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public Double sum(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
		if(!CalculatorHelper.isNumeric(numberOne) || !CalculatorHelper.isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationException("Please, set numeric value!");
		}
		
		return CalculatorHelper.convertToDouble(numberOne) + CalculatorHelper.convertToDouble(numberTwo);
	}

	@Override
	public Double sub(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
		if(!CalculatorHelper.isNumeric(numberOne) || !CalculatorHelper.isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationException("Please, set numeric value!");
		}
		return CalculatorHelper.convertToDouble(numberTwo) - CalculatorHelper.convertToDouble(numberTwo);
	}

	@Override
	public Double mult(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
		if(!CalculatorHelper.isNumeric(numberOne) || !CalculatorHelper.isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationException("Please, set numeric value!");
		}
		return CalculatorHelper.convertToDouble(numberTwo) * CalculatorHelper.convertToDouble(numberTwo);
	}

	@Override
	public Double div(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
		if(!CalculatorHelper.isNumeric(numberOne) || !CalculatorHelper.isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationException("Please, set numeric value!");
		}
		return CalculatorHelper.convertToDouble(numberTwo) / CalculatorHelper.convertToDouble(numberTwo);
	}

	@Override
	public Double med(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
		if(!CalculatorHelper.isNumeric(numberOne) || !CalculatorHelper.isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationException("Please, set numeric value!");
		}
		return (CalculatorHelper.convertToDouble(numberTwo) + CalculatorHelper.convertToDouble(numberTwo))/2;
	}

	@Override
	public Double raiz(String number) throws UnsuportedMathOperationException {
		if(!CalculatorHelper.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please, set numeric value!");
		}
		return (Double) Math.sqrt(CalculatorHelper.convertToDouble(number));
	}
	
}
