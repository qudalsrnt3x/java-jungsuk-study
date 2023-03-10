## ch2. 변수와 타입

## 변수와 상수

### 변수
- 하나의 값을 저장할 수 있는 메모리 공간
- 변수의 타입은 저장할 값의 타입에 의해 결정된다.

### 상수

- 한 번만 값을 저장 가능한 변수
```java
final int MAX = 100; // MAX는 상수
MAX = 200 ; // 에러
```

### 리터럴
- 그 자체로 값을 의미
- 프로그램에서 직접 표한한 값, 소스 코드의 고정된 값을 대표하는 용어
- 종류로는 정수, 실수, 문자, 논리, 문자열 리터럴이 있다.
```java
class Main {
    int a = 10; // 10이 리터럴
}
```

## Primitive Type (기본형 타입)

### 프리미티브 타입

- 총 8가지의 기본형 타입
- 기본 값이 있기 때문에 Null이 존재하지 않는다.
- 만약 기본형 타입에 Null 을 넣고 싶다면 래퍼 클래스를 활용한다.
- 실제값을 저장하는 공간으로 Stack 메모리에 저장된다.

### 기본값 및 범위
```java
//정수형
boolean : 기본값 false, 값의 범위 true, false
byte : 기본값 0, 값의 범위 -128 ~ 127
short : 기본값 0, 값의 범위 -32,768 ~ 32,767
int :  기본값 0, 값의 범위 -2,147,483,648 ~ 2,147,483,647
long : 기본값 0L, 값의 범위 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

//실수형
float : 기본값 0.0F, 값의 범위 (3.4 X 10-38) ~ (3.4 X 1038) 의 근사값
double : 기본값 0.0, 값의 범위 (1.7 X 10-308) ~ (1.7 X 10308) 의 근사값

//문자형
char : 기본값 '\u0000', 값의 범위 0 ~ 65,535
```
## Reference Type (참조형 타입)

- primitive type 을 제외한 타입들이 모두 참조형 타입이다.
- 기본값은 Null
- 값이 저장되어 있는 곳의 주소값을 저장하는 공간으로 힙 (Heap) 메모리에 저장

### Primitive Type vs Reference Type
- 메모리상에 할당되는 각각의 공간에 실제 값이 들어가면 Primitive Type
- 다른 것을 참조하기 위한 주소값이 들어가면 Reference Type



## 변수 선언 및 초기화

### 변수선언
```java
int num; // 변수형식 변수이름
int num = 20; // 변수형식 변수이름 = 초기화값
int num1, num2, num3, num4; // 변수형식 변수이름1, 변수이름2, 변수이름3, 변수이름4
int num1 = 10, num2 = 20, num3 = 30, num4 = 40; // 변수형식 변수이름1 = 초기화값, 변수이름2 = 초기화값, 변수이름3 = 초기화값, 변수이름4 = 초기화값;
```

### 변수의 초기화

- 변수를 선언하고 값을 저장하는 것을 변수 초기화라고 한다.
- 멤버 변수는 초기화 하지 않아도 변수의 타입에 맞는 기본값으로 초기화가 이루어지지만, 지역변수는 사용하기 전에 반드시 초기화가 이루어져야한다.

## 변수 사용 범위 (Scope)

```java
class Main {

    int instVar; // 인스턴스 변수    
    static int classVar; // 클래스 변수
    
    void method() {
    	int localVar; // 지역 변수
    }
}
```

- 인스턴스 변수 : 인스턴스가 생성될 때 생성된다. 인스턴스 변수의 값을 읽거나 저장하려면 인스턴스를 먼저 생성해야하고 인스턴스별로 다른값을 가질수있다.
- 클래스 변수: 인스턴스 변수에 static만 붙여주면 된다. 인스턴스 변수는 각각 고유한 값을 가지지만 클래스 변수는 모든 인스턴스가 공통된 값을 공유하게 된다.
- 지역변수: 메서드 내에서 선언되고 메서드 내에서만 사용 가능하다. 메서드가 실행될때 메모리를 할당 받고 메서드가 끝나면 소멸되므로 사용이 불가능하다.