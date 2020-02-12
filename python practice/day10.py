# 꼭 다시 풀것!!!!!!!!!!
# a = 1
# while a <= 5 :
#     print("{}".format("*"*a))
#     a = a + 1

# 사용자가 입력한 값을 초과하지 않는 한도에서의 누적 합을 구하는 코드를 작성하세요
# 누적 합은 랜덤으로 1~10 생성
# 조건 : 출력결과는 반복횟수와 값이 같이 나와야 합니다

# num = int(input("값을 입력해 주세요 : "))
# 모범답안
# from random import *
# num1 = int(input("값을 입력해 주세요 : "))
# sum = 0
# count = 0 #반복 횟수
# while sum <= num1 :  # while True : 써도 무방
#     randnum = randint(1,10) # 랜덤으로 누적시킬 값
#     sum = sum + randnum
#     count = count + 1
#     if sum > num1 :
#         sum = sum - randnum
#         count = count - 1
#         break
# print("총 반복 횟수는 {}이고 값은 {}입니다".format(count,sum))    



# 1~x의 범위에서 3과 5의 공배수의 합을 출력하는 프로그램을 만들어주세요
# 조건 : x는 사용자가 직접 입력합니다

# 꼭 다시 풀어보세요
# x = int(input("정수를 입력하세요 : "))
# a = 1
# num1 = a*3
# num2 = a*5
# while x >= num1 :
#     if num1 == num2 :
#         print("{}".format(num1))
#         a = a + 1

# 모범답안
# sum = 0
# num1 = 1
# num2 = int(input("정수를 입력하세요 : "))
# while num1 <= num2 :
#     if num1 % 3 == 0 and num1 % 5 == 0 :
#         sum = sum + num1
#     num1 = num1 + 1
# print("1~%d중 3과 5의 배수의 합은 %d입니다"%(num2,sum))

# 문자열의 인덱싱과 슬라이싱
# 인덱싱(indexing)은 인덱스 번호를 사용해서 변수안에 특정문자 하나를 사용하고 싶을 때 사용하는 방법
# 인덱스 번호는 0번부터 시작을 하며 공백도 인덱스 번호에 포함이 됩니다
# a = "nice to meet you"
# print(a[0])
# print(a[5])
# print(a[-1])
# print(a[2*2])
# print(a[0]+a[1])

# 슬라이싱(slicing)은 인덱스 번호를 사용해서 특정문자가 하나가 아니라
# 인덱스 번호의 범위를 지정하여 한번에 자르는 방법입니다

# a = "nice to meet you"
# print(a[0:4]) #인덱스 번호 0~3까지 출력(0이상 4미만)
# print(a[0:7])
# print(a[0:]) # 인덱스 번호 0에서 끝까지 출력
# print(a[:5]) # 처음에서 인덱스번호 4까지 출력
# print(a[:]) # 처음에서 끝까지 출력

# 슬라이싱 사용 유형
# a = "안녕하세요 반갑습니다"
# b = a[0:5]
# c = a[5:]
# print(b+c)
# 인덱싱도 위처럼 사용가능

# name이라는 변수에 들어있는 문자열을 사용해서 보기와 같은 문자를 만들어 주세요

# name = "vetlradcfmnib"
# #<보기>
# #ice
# print(name[11]+name[7]+name[1])
# #bed
# print(name[-1]+name[1]+name[6])
# #red
# a=name[4]
# b=name[1]
# c=name[6]
# print(a+b+c)
# #face
# print(name[-5]+name[5]+name[-6]+name[1])
# #velvet
# a=name[0:2]
# b=name[3]
# c=name[0:3]
# print(a+b+c)