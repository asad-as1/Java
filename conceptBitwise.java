// Concept of bitwise operator.

/* There are four types of operators:

1:Get Bit
2:Set Bit
3:Clear Bit
4:Update Bit

NOTE: 3rd bit means 2nd position of a number.Most of the times we use Left shift operator.

1: Get Bit: It perform the "AND" operator between number and shift operation on 1.By using this
we know the digit(bit) at the given position.

2: Set Bit: It perform the "OR" operator between number and shift operation on 1.By using this
operator we set the digit(bit) at the given position.

3:Clera Bit: It perform the "AND" with "NOT" operator between number and shift operation .
Firstly it perform the shift operation on 1 then on this number it perform "NOT" operator
.And after that it perform the and operation between given number and with upper number.
It claer the bit at the given position.

4:Update Bit: It is use to update the bit at given position. It is of two types:
(a): For 0: Bit Mask:1<<i
            Operation AND with NOT
(b): For 1: Bit Mask:1<<i
            Operation: OR
            
            
Question:Update the 2nd bit (position=1) of a number n to 1.(n=0101).
*/ 
