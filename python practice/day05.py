#변수의 자료형 확인
# type함수는 값의 자료형을 반환하는 함수입니다
# type(x)형식으로 사용합니다
#a = 80 ; b = "80" ; c = 80.0
#Integer는 10진수 정수형태의 자료형을 의미 합니다
#print(type(a))
# String은 문자열 형태의 자료형을 의미합니다
#print(type(b))
#float는 10진수 실수형태의 자료형을 의미합니다
#print(type(c))

#변수 형태 변환(강제형 변환)
#x,y,z = 10,"10",10.0
#print(x+z)
# print(x+int(y)) # 일시적으로 자료형을 변경
# print(type(y)) # type 함수로 y의 자료형 확인
#print(str(x)+y)

#강제형 변환 후 변수에 영구적으로 초기화 방법
# x = 1
# print(type(x))
# x = str(x)
# print(type(x))

# 국어 : 87
# 수학 : 66
# 영어 : 90
# 총점 : ?
# 평균 : ?

# 조건
# 변수를 5개 사용해서 프로그램을 만들어 주세요
# 서식문자 혹은 format형식을 사용해서 결과를 출력합니다

# kor = 87
# mat = 66
# eng = 90
# tot = kor+mat+eng
# evg = tot//3

# print("국어 : {}".format(kor))
# print("수학 : {}".format(mat))
# print("영어 : %d"%(eng))
# print("총점 : %d"%(tot))
# print("평균 : {}".format(evg))

#문제풀이
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

#변수 형식변환 문제
# x,y,z = '100',10.5,20
# #110.5 출력
# print(int(x)+y)
# #10020
# print(x+str(z))
# #10.520.0
# print(str(y)+str(float(z)))
# #110.520
# print(str(int(x)+y)+str(z))

# 사용자 입력 함수(input)
# 표준 입력 함수
#input함수를 사용하면 사용자가 직접 변수에 들어갈 값을 입력 할 수 있습니다
#키보드를 사용하여 변수에 들어갈 값을 사용자가 직접 입력 합니다
#사용형식
#변수명 = input()
#a = input()
#print("a의 값은 {}입니다".format(a))

#input()안에 문자열을 입력하면 사용자가 값을 입력 할 때 
#input()안에 적은 문자열도 같이 출력이 됩니다
#입력은 문자열이 끝난 후 받습니다
#a = input("정수를 입력하세요 : ")
#print("a의 값은 {}입니다".format(a))

#input()함수는 기본적으로 입력값을 문자열로 인식합니다
# a = input("정수를 입력하세요 : ")
# b = input("정수를 입력하세요 : ")
# print(a+b)

# a = int(input("정수를 입력하세요 : "))
# b = int(input("정수를 입력하세요 : "))
# print(a+b)

#아래와 같은 바식으로도 사용은 가능
#하지만 a와 b가 일시적으로 자료형을 바꾼것이므로 비효율 적입니다
# a = int(input("정수를 입력하세요 : "))
# b = int(input("정수를 입력하세요 : "))
# print(int(a)+int(b))

#사용자에게 이름과 나이를 입력을 받아서 출력하는 프로그램을 만들어주세요

a = input("이름를 입력하세요 : ")
b = int(input("나이를 입력하세요 : "))
print("{}님의 나이는 {}살 입니다".format(a,b))






#이름을 입력하세요 : ㅇㅇㅇ
#나이를 입력하세요 : 000
#ㅇㅇㅇ 님의 나이는 000살 입니다