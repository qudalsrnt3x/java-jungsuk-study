## ch5. 배열 (Array)

> 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것

### 배열의 선언과 생성

- 배열의 선언 : 생성된 배열을 다루기 위한 참조변수를 위한 공간을 만든다.
- 배열의 생성 : 값을 저장할 수 있는 공간을 만든다.

```java
타입[] 변수이름;          // 배열을 선언(배열을 다루기 위한 참조변수 생성)  
변수이름 = new 타입[길이]; // 배열을 생성(실제 저장공간을 생성)
```

> #### 변수 타입에 따른 기본값
> boolean : false <br>
> char : '\u0000' <br>
> byte, short, int : 0 <br>
> long : 0L <br>
> float : 0.0f <br>
> double : 0.0d 또는 0.0d <br>
> 참조형 변수 : null

### 배열의 길이와 인덱스

> 인덱스의 범위는 0부터 '배열길이 -1까지.'

- 배열을 다룰 때 index의 범위를 벗어난 값을 index로 사용하게 되면 
실행 시 ArrayIndexOutOfBoundsException이 발생한다.
- 배열의 길이는 int범위의 양의 정수 (0도 포함)이어야 한다.

### 배열의 출력
```java
class Main {
    public static void main(String[] args) {
        int[] iArr = {100, 95, 80, 70, 60};

        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i]);
        }
        
        // Arrays.toString(배열이름) 으로 출력 가능
    }
}
```

### 배열의 복사

> 배열은 한번 생성하면 그 길이를 변경할 수 없다.
> 1. 더 큰 배열을 새로 생성
> 2. 기존 배열의 내용을 새로운 배열에 복사한다.

> 배열의 복사는 for문보다 System.arraycopy()를 사용하는 것이 효율적이다.

- Arrays.copyOf();
```java
class Main {
    public static int[] copyOf(int[] original, int newLength) {
        int[] copy = new int[newLength];
        System.arraycopy(original, 0, copy, 0,
                Math.min(original.length, newLength));
        return copy;
    }
}
```
> Arrays.copyOf()는 내부적으로 System.arraycopy()를 래핑한 메서드다. <br>
> 전체 길이를 전부 복사하거나, 복사 대상의 객체를 유지하지 않아도 된다면 copyOf()를 사용 <br>
> 사용성 면에서 조금 더 직관적이다. 


### String 배열

- char배열과 String 클래스 변환

```java
char[] chArr = { 'A', 'B', 'C' };
String str = new String(chArr); // char배열 -> String
char[] tmp = str.toCharArray(); // String -> char배열
```

### Arrays 클래스
- 배열의 비교와 출력 : equals(), toString()
- 2차원 배열 이상의 출력 : deepToString()
- 배열의 복사 : copyOf(), copyOfRange()
- 정렬 : sort()

---

### 배열의 특징

1. 여러개의 데이터를 한 번에 다룰 수 있다.
2. 배열은 Object(객체)는 아니지만 Reference Value로 취급된다.
3. 메모리상에 연속적으로 데이터가 저장된다.
4. 미리 공간을 확보해 놓고 사용해야 한다.
5. 한 번 만들어진 공간은 크기가 고정된다.
6. 첫 번째 위치만 알면 index로 상대적 위치를 빠르게 알 수 있다.

> 유연하지 못하며, 미리 공간이 몇 개가 필요한지 알아야 한다. <br>
> 필요에 따라 크기가 늘어나거나 줄어들면 좋을텐데..


#### 읽기 (Read)
- 배열은 Random Access(비순차적 접근)를 지원한다. 
- 배열의 길이와 길이와 상관없이 요소들을 인덱스를 통해 직접 접근할 수 있다.
- 어느 위치에서든 똑같은 속도로 접근하여 읽고 쓸 수 있다