package vivi.project.propertymanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vivi.project.propertymanagement.model.Calculator;

@RestController
@RequestMapping("/api/vi/calculator")//class level mapping of url to a controller class
public class CalculatorController {

    //http://localhost:8080/api/vi/calculator/add
    //http://localhost:8080/api/vi/calculator/add?num111=6.7&num222=1.3
    //http://localhost:8080/api/vi/calculator/add?num1=6.7&num2=1.7
    //it's best to keep the same name
    @GetMapping("/add/{num3}")//method level mapping of an url to a controller function
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2, @PathVariable("num3") Double num3){
        return num1 + num2;
    }

    @GetMapping("/sub/{num111}/{num2}")//map the values of url to java variables by path variable method
    public Double substract(@PathVariable("num111") Double num1, @PathVariable("num2") Double num2){
        Double result = null;
        if(num1 > num2){
            result = num1 - num2;
        }else {
            result = num2 - num1;
        }
        return result;
    }

    @PostMapping("/mul")
    public ResponseEntity<Double> multiply(@RequestBody Calculator calculator){
        Double result = null;
        result = calculator.getNum1() * calculator.getNum2() * calculator.getNum3() * calculator.getNum4();
        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.CREATED);
        return responseEntity;
    }

}
