# 함수 (Function)
# 동일한 기능을 가지고 있는 코드들을 하나의 함수로 만들어서 사용할 수 있습니다
# 즉 똑같은 기능을 가지고 있는 코드들을 하나의 함수로 정의해서 사용하면 
# 코드가 쉽고 간결하게 표현하는 것이 가능합니다

# 사용 형식
# def 함수명(매개변수) :    # def는 함수를 선언할 때 사용하는 예약어입니다
#     종속문장1            # 종속문장은 마찬가지로 들여쓰기를 해야합니다
#     종속문장2
#     return 반환값

# def num_add(a,b) : 2
#     c = a + b 3
#     return c 4
# print(num_add(10,20)) 1
# print(a) # error

# 기본적으로 함수 안에서 사용하는 변수는 함수 밖에서는 사용할 수 없습니다
# 지역변수 : 특정 지역에서만 사용하는 변수

# def num_add(a,b) :
#     c = a + b
#     return c
# print(num_add(10,20))
# print(c) # error

# 함수의 사용 형태

# 인수와 매개변수가 없는 형태
# def st() :
#     a = "hello"
#     return a
# print(st())

# def st() :
#     a = 10
#     b = 20
#     return a + b
# print(st())

# return이 없는 형태
# return을 쓰지 않으면 출력 결과는 None이라고 나옵니다
# return이 없어서 실제 반환된 값이 없기 때문에 아무것도 출력 할 수 없습니다
# 출력 문구를 함수안에 적어야 출력 할 수 있습니다

# def add(a,b) :
#     c = a + b
# print(add(10,20)) # None

# def add(a,b) :
#     c = a + b
#     print(c)
# add(10,20)

# return, 매개변수 그리고 인수도 없는 형태
# def add() :
#     a = 10
#     b = 20
#     print(a+b)
# add()

# 인수가 몇 개 들어오는지 알 수 없는 경우
# def sum_add(*args) :
#     print(args)

# sum_add(10,20,30)

# def sum_add(*abc) :  # 매개변수 아무거나 써도 무방
#     print(abc)

# sum_add(10,20,30)

# def sum_add(*args) :
#     sum = 0
#     for a in args :
#         sum = sum + a 
#     print(sum)

# sum_add(10,20,30)

# def sum_add(*args) :
#     sum = 0
#     for a in args :
#         sum = sum + a 
#     return sum
# print(sum_add(10,20,30))

# 문자열로도 구성 가능
# def st(*agrs) :
#     print(agrs)
# st("안","녕","하","세","요")
# st("안녕하세요","반갑습니다")

# 일반 매개변수와 같이 사용 가능
# return은 반복문에서 break와 비슷한 역할을 합니다
# def test(st,*agrs) :
#     if st == "+" :
#         sum = 0
#         for i in agrs :
#             sum = sum + i
#         return sum
# print(test("+",10,20,30))

# 전역변수(광역변수)
# 전역변수 global을 사용하면 더 이상 함수 안에서만 사용하는 것이 아닌
# 함수 밖에 있는 변수를 사용한다는 뜻입니다
# a = 0
# def test() :
#     global a # 전역변수 선언
#     a = a + 1
# test()
# print(a)

# 전역 변수를 사용하지 않는 경우
# a = 1
# def test(a) : # 2. a는 매개변수 a
#     a = a + 1
#     return a
# a = test(a) # 1. ()안에 a를 1로 초기화
# print(a) # 함수안의 a와 프린트변수 a는 다름

# 사용자가 +,-,/,* 중 하나를 입력한 후 2개의 정수를 입력해서
# 연산을 진행하는 함수를 만들어 주세요
# 조건 빼기 같은 경우에는 무조건 큰 수에서 작은 수를 뺄 수 있도록 만들어 주세요

# d = input("연산자를 입력하세요 : ")
# n1 = int(input("첫번째 숫자를 입력하세요 : "))
# n2 = int(input("두번째 숫자를 입력하세요 : "))
# def test(st,*agrs) :
#     if d == "+" :
#         a = n1 + n2 
#         return a
#         # return n1 + n2
#     elif d == "-" :
#         if n1 > n2 :
#             a = n1 - n2
#             return a
#         else :
#             return "첫번째 숫자가 두번째 숫자보다 커야합니다"
#     elif d == "/" :
#         a = n1 / n2
#         return a
#     elif d == "*" :
#         a = n1 * n2
#         return a
# print(test("+","-","/","*",n1,n2))


# # 다른 답안
# def calc() :
#     d = input("연산자를 입력하세요 : ")
#     n1 = int(input("첫번째 숫자를 입력하세요 : "))
#     n2 = int(input("두번째 숫자를 입력하세요 : "))
#     if d == "+" : 
#         return "{} + {} = {}".format(n1,n2,n1+n2)
#     elif d == "-" :
#         if n1 > n2 :
#             return "{} - {} = {}".format(n1,n2,n1-n2)
#         else :
#             #return "첫번째 숫자가 두번째 숫자보다 커야합니다"
#             return "{} - {} = {}".format(n2,n1,n2-n1)
#     elif d == "/" :
#         return "{} / {} = {}".format(n1,n2,n1/n2)
#     elif d == "*" :
#         return "{} x {} = {}".format(n1,n2,n1*n2)
# print(calc())