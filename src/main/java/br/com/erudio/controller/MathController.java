package br.com.erudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.service.CalculatorService;

@RestController
public class MathController {
	
	private final CalculatorService service;
	
	@Autowired
	MathController(CalculatorService service){
		this.service = service;
	}

	@RequestMapping("sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo")String numberTwo) throws UnsuportedMathOperationException {
		return service.sum(numberOne, numberTwo);
	}
	
	@RequestMapping("sub/{numberOne}/{numberTwo}")
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo")String numberTwo) throws UnsuportedMathOperationException  {
		return service.sub(numberOne, numberTwo);
	};
	
	@RequestMapping("mult/{numberOne}/{numberTwo}")
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo")String numberTwo) throws UnsuportedMathOperationException  {
		return service.mult(numberOne, numberTwo);
	};
	
	@RequestMapping("div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo")String numberTwo) throws UnsuportedMathOperationException  {
		return service.div(numberOne, numberTwo);
	};
	
	@RequestMapping("ave/{numberOne}/{numberTwo}")
	public Double ave(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo")String numberTwo) throws UnsuportedMathOperationException  {
		return service.med(numberOne, numberTwo);
	};
	
	@RequestMapping("squa/{number}")
	public Double squa(@PathVariable("number") String number) throws UnsuportedMathOperationException  {
		return service.raiz(number);
	};
		
}
