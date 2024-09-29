package org.exceptions;

public class ExceptionTest {

    public static void main(String[] args) throws CustomException {
        throw new CustomException("OMG");
    }
}
