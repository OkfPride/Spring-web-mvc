/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring.mvc.my_annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author JavaDev
 */
public class CheckEmailValidation implements ConstraintValidator<myAnno2, String> {

    private String endOfEmail;

    @Override
    public void initialize(myAnno2 myAnnotation) {
        endOfEmail = myAnnotation.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext cvc) {
        return enteredValue.endsWith(endOfEmail);
    }

}
