#총점과 평균을 구하는 프로그램에서 국어,영어,수학점수를
#사용자가 직접 입력 할 수 있도록 만들어 주세요

# kor = 87
# mat = 66
# eng = 90
# sum = kor+mat+eng
# avg = sum/3
# print("국어 : %d"%kor)
# print("수학 : %d"%mat)
# print("영어 : {}".format(eng))
# print("총점 : %d"%sum)
# print("평균 : {:.1f}".format(avg))

# kor = int(input("국어점수를 입력하세요 : "))
# mat = int(input("수학점수를 입력하세요 : "))
# eng = int(input("영어점수를 입력하세요 : "))
# sum = kor+mat+eng
# avg = sum/3
# print("국어 : %d"%kor)
# print("수학 : %d"%mat)
# print("영어 : {}".format(eng))
# print("총점 : %d"%sum)
# print("평균 : {:.1f}".format(avg))

#split()을 사용하면 input()하나로 여러개의 변수에 문자열 값을 지정 할 수 있습니다
#split()함수는 문자열을 구분할 때 사용하기 때문에 int, float 형태일 경우 사용할 수 없습니다
#문자열에서만 사용가능
#split()안에 문자열을 입력하지 않으면 기본적으로 스페이스바로 분류합니다
# name,age = input("이름과 나이를 입력하세요 : ").split()
# print("{}님의 나이는 {}세 입니다".format(name,age))

# split()안에 문자열을 입력하면 그 문자열을 기준으로 문자열을 분류합니다
# name,age = input("이름과 나이를 입력하세요 : ").split(",")
# age = int(age)
# print("{}님의 나이는 {}세 입니다".format(name,age))

#사용자에게 2개의 정수를 입력받아서 +,-,*,/가 모두 출력이 되도록 프로그램을 만들어 주세요
#조건 : split 함수를 사용해서 프로그램을 만들어 주세요
# a,b = input("정수를 입력하세요 : ").split(",")
# a = int(a)
# b = int(b)
# print("{}+{}={}".format(a,b,a+b))
# print("{}-{}={}".format(a,b,a-b))
# print("{}x{}={}".format(a,b,a*b))
# print("{}/{}={}".format(a,b,a/b))

#random()함수
#random 함수는 반드시 아래 문구를 적어야 사용 할 수 있습니다
#from random import random
#print(random()) #0.0초과 1.0미만의 값이 무작위로 출력
#print(random()*10) #0.0초과 10.0미만의 값이 무작위로 출력
#print(int(random()*10)) #0초과 10미만의 값이 무작위로 출력
#print(int(random()*10+1)) #1이상 10이하의 값이 무작위로 출력

# randint()
#from random import randint
#print(randint(1,10)) #1이상 10이하의 값이 무작위로 출력
#print(chr(randint(65,90))) #A~Z까지 무작위로 출력

#randrange()
#from random import randrange
#print(randrange(1,10)) #1이상 10미만의 값이 무작위로 출력
#print(randrange(1,10,2)) #1부터 시작해서 2씩 증가된 값에 대해 10미만까지 무작위로 출력

#random 이라는 모듈화 되어 있는 파이썬 파일에 있는 모든 함수를 사용하고 싶을 때 
#import 뒤에 *을 사용합니다
#*은 모든 것을 의미합니다
# from random import *
# print(random())
# print(randint(1,2))
# print(randrange(1,5))

# 제어문(중요함)
# 제어문 if(조건문)
# if 조건문은 조건식의 결과에 따라서 값을 제어 할 수 있게 해주는 문법입니다
# if는 조건식의 결과가 참(ture)일 경우에 종속문장을 실행합니다
# if는 조건식의 결과가 거짓(false)일 경우 종속문장을 실행하지 않습니다
# 종속문장을 사용 할 때 반드시 들여쓰기(공백4번)을 해야 정상적으로 사용이 가능합니다
# 사용형식
# if 조건식 :
#   종속문장1
#   종속문장2
# avg = 90
# if avg > 79 : 
#     print("합격입니다")

# if ~ else
# else를 사용하면 if의 조건식이 거짓일 경우 else아래에 있는 종속문장을 실행합니다
# else는 독립적으로는 사용 할 수 없으면 반드시 if와 같이 사용해야 합니다
# else는 조건식이 필요 없습니다
# 사용형식
# if 조건식 : 
#    종속문장1
# else :
#    종속문장2
# a = 9
# if a == 10 :   # == 는 프로그래밍 언어에서 같다라는 뜻입니다
#     print("a는 10입니다")
# else :
#     print("a는 10이 아닙니다")

# 비교 연산자

# ==
# a == b : a는 b와 같다
# a가 b와 값이 같을 경우 참(true)를 반환합니다

# !=
# a != b : a는 b와 같지 않다
# a가 b와 값이 같지 않을 경우 참(true)을 반환합니다

# <,>
# a > b : a가 b보다 크다
# a가 b보다 값이 큰 경우 참(true)을 반환합니다
# a < b : a가 b보다 작다
# a가 b보다 값이 작은 경우 참(true)을 반환합니다

# <=,>=
# a >= b : a가 b보다 같거나 크다
# a가 b보다 값이 같거나 큰 경우 참(true)을 반환합니다
# a <= b : a가 b보다 같거나 작다
# a가 b보다 값이 같거나 작은 경우 참(true)을 반환합니다

# 논리 연산자

# and
# and 연산자는 왼쪽과 오른쪽에 있는 피연산자가 참(true)일경우
# 참(true)을 반환합니다
# 1 + 1 = 2 and 2 + 2 =4
# a = 0
# b = 1
# if a == 0 and b == 1 :
#     print("a는 0이고 b는 1입니다")
# print(True and True) 참
# print(True and False) 거짓
# print(False and False) 거짓

# or
# or연산자는 두개의 피연산자 중 하나라도 참이라면 참을 반환
# 1 + 1 = 2 or 1 + 1 = 1
# print(True or False) # 참
# print(True or True) # 참
# print(False or False) # 거짓

# not
# not은 오른쪽 피연산자의 값이 True 이면 False를 반환하고
# 피연산자 값이 False면 True를 반환합니다
#print(not True) #거짓
#print(not False) #참

# if True :
#     print(123)


# 구글에서 파이썬 문제 검색해서 찾아볼것
