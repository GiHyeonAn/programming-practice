# 꼭 여러번 풀어볼 것!!!!!!!!
# 1개 이상의 정수를 인수로 받아서 가장 큰 값 그리고 가장 작은값을 반환하는 함수를 만들어 주세요
# max,min 사용 금지
# 인덱스 0번 기준으로 뒷번호와 비교하게 할것











# 답안
# def pymax(*agrs) :
#     mx = agrs[0]
#     for i in agrs[1:] :
#         if mx < i :
#             mx = i
#     return mx
# print(pymax(1,10,13,-5))

# def pymin(*agrs) :
#     mn = agrs[0]
#     for i in agrs[1:] :
#         if mn > i :
#             mn = i
#     return mn
# print(pymin(1,10,13,-5))

# 꼭 여러번 풀어볼 것!!!!!!!!
# 인수값의 총합을 구해서 평균을 반환해주는 함수를 만들어 주세요
# 인수값은 사용자가 직접 입력을 합니다(split()사용)








# 답안
# def avg(a) :  # 여러개의 num이 리스트 형태이기 때문에 인수 1개로 입력합니다
#     sum = 0
#     for i in a :
#         sum = sum + int(i)
#     return sum/len(a)
# num = input("정수를 입력하세요 : ").split()  # a = num
# print(avg(num))


# 재귀 호출(재귀함수)
# 함수안에서 똑같은 함수를 호출하는 방식을 의미 합니다
# 알고리즘이나 공식을 확인 할 때 가독성을 위해 많이 사용을 합니다

# 아래와 같이 자기 자신안에서 자신을 호출하는 문구가 있는 경우를 재귀호출이라고 합니다
# 재귀호출을 하면 무한루프 처럼 보이지만 일정시간이 지나면
# 스택오버플로우가 발생하면서 프로그램이 종료됩니다
# def test() :
#     print("hello")
#     test()

# test()

# 피보나치 수
# 피보나치는 n이 0일 때 0을 리턴하고 n이 1이면 1을 리턴합니다
# 2 이상이면 이전의 두 값을 더합니다

# def fib(n) :
#     if n == 0 :
#         return 0
#     elif n == 1 :
#         return 1
#     return fib(n-2) + fib(n-1)

# for i in range(0,10) :   # 범위를 지정하지 않으면 스택오버플로우가 발생합니다
#     print(fib(i))

# 모듈(module)
# 함수나 클래스를 하나의 파일에 모아 놓은 파일을 의미합니다
# 모듈을 생성하면 다른 파이썬파일에서도 모듈을 불러와서 모듈에 정의되어 있는 함수나 클래스를 사용할 수 있습니다
# 모듈의 장점은 파이썬 파일마다 동일한 함수를 만들지 않아도 되며 다른 사람이 만든 모듈을
# 사용할 수 있기 때문에 호환성이 뛰어납니다

# 사용형식
# from random import random

# import만 사용하는 경우
# 사용형식
# import 모듈이름
# import만 쓴다면 함수를 사용 할 때 반드시 모듈이름.함수명() 형태로 사용을 해야 합니다

# import mod
### import os # os는 모듈의 이름
# print(mod.add(10,20))
### print(os.system("cls")) #system은 함수의 이름

# from 과 import를 사용하는 경우
# 사용형식
# from 모듈이름 import 모듈함수
# from 을 사용하면 모듈을 사용 할 때 모듈의 이름을 적지 않고 함수만 적으면 바로 사용 할 수 있습니다

# from mod import add
# print(add(10,20))

# from os import system 
# print(system("ipconfig"))

# 모듈에 있는 함수와 현재 사용하고 있는 파일에 함수가 이름이 같은 경우
# 함수를 둘다 사용하고 싶다면 import만 쓰는 형태로 모듈을 사용해야 합니다
# def add(a,b) : 
#     return print("안녕하세요")
# import mod
# print(mod.add(10,20))
# add(10,20)


# def add(a,b) : 
#     return print("안녕하세요")

# from mod import add # mod에 있는 것을 기본적으로 가져온다
# print(add(10,20))

# # 현재 본인 파이썬파일안에 있는 것을 사용하고 싶을 때
# def add(a,b) : 
#     return print("안녕하세요")

# import mod 
# print(add(10,20))

# 모듈의 사용 위치
# 모듈은 만든다고 바로 마음대로 사용할 수 없습니다
# 모듈을 사용하려면 자신이 지금 사용하고 있는 파이썬 파일이 들어있는 
# 폴더에 모듈의 존재하거나 아니면 파이썬설치폴더(환경변수)안에 
# 들어있는 경우 사용 할 수 있습니다

# from mod import add 
# print(add(10,20))

