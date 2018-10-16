package ua.com.juja.LAB34;

import java.math.BigInteger;



/* Реализовать метод, который преобразует BigInteger в битовую строку (String из '0' и '1')
toBitStr(new BigInteger("2")) = "10"
toBitStr(new BigInteger("8")) = "1000"
toBitStr(new BigInteger("10")) = "1010"
toBitStr(new BigInteger("140")) = "10001100"

Implement a method that converts a BigInteger into a bit string (String from '0' and '1')
toBitStr (new BigInteger ("2")) = "10"
toBitStr (new BigInteger ("8")) = "1000"
toBitStr ( new BigInteger ("10")) = "1010"
toBitStr (new BigInteger ("140")) = "10001100"

https://www.datacamp.com/community/tutorials/python-data-type-conversion#implicit
*/

public class BigIntegerUtils {
    public static String toBitStr(BigInteger arg) {
        String convert = arg.toString(2);
        return convert;
    }
} 