# SrpingExprLange-Operators
The Spring Expression Language (SpEL) is a powerful expression language that supports querying and manipulating an object graph at runtime. We can use it with XML or annotation-based Spring configurations.


SpEL is an exression language supporting the features of querying and manipulating an object graph at runtime.
Spring expression language supports most of the mathematical, logical and relational operations. Here is the description about each operator:

Type	       Operators

Arithmetic:	+, -, *, /, %, ^, div, mod

Relational:	<, >, ==, !=, <=, >=, lt, gt, eq, ne, le, ge

Logical	:and, or, not, &&, ||, !

Conditional	: ?:

```

@Component("myMathTestBean")
public class MyMathTest {

    @Value("#{myNumberBean.no == 1016}")
    private boolean isEqual;

    @Value("#{myNumberBean.no > 300}")
    private boolean isGreaterThan;

    @Value("#{myNumberBean.no != 1015}")
    private boolean isNotEquals;

    @Value("#{myNumberBean.no > 1000 and myNumberBean.no < 2000}")
    private boolean isInBetween;

    @Value("#{myNumberBean.no == 1000 or myNumberBean.no eq 2000}")
    private boolean isEitherOr;

    @Value("#{myNumberBean.no + 2000}")
    private int sumValue;

    @Value("#{myNumberBean.no / 16}")
    private int divisionValue;
    
    ```
    
    
    And We must Enable component scan in ApplicationContext file
    
    
    ```
    <beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context-3.0.xsd">

    <context:component-scan base-package="com.javaspr.bean" />
</beans>
````
### OUTPUT:
```
isEqual: true
isGreaterThan: true
isNotEquals: true
isInBetween: true
isEitherOr: false
sumValue: 3016
divisionValue: 63
```
#### Required Tools and Softwares:
```
-Java_8V - Backend Programing Language
-IDE(IntelliJIDEA)-Backend
```

    
    



