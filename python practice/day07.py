#멤버 연산자

#in
#1 in (1,2,3)
#왼쪽 피연산자의 값이 오른쪽 피연산자 멤버(튜플) 중 일치하는 값이 있다면 Ture.
#print(1 in (1,2,3))
#print(1 in (4,5,6)) #False

#not in
#1 not in (3,2,0)
#왼쪽 피연산자의 값이 오른쪽 피연산자 멤버 중 일치하는 값이 없으면 True
#print(1 not in (3,2,0))
#print(1 not in (1,2,3))

#type()함수를 사용한 식별 연산자
#is
#두 피연산자의 식별 값을 비교하였을 때 동일한 자료형이면 True를 반환합니다
# a = 1
# print(type(a) is int)
# print(type(a) is float)
# print(type(a) == int)

#is not
#두 피연산자의 식별 값을 비교하였을 때 동일하지 않은 자료형이면 True
#a = 1
#print(type(a) is not float)
#print(type(a) is not int)
#print(type(a) != float)

#사용자에게 정수를 입력받아서 양수 인지 음수 인지 판별하는 프로그램을 만들어주세요
# num = int(input("정수를 입력하세요 : "))
# if num > 0 :
#     print("정수는 양수입니다")
# if num == 0 :
#     print("정수는 0입니다")
# if num < 0 :
#     print("정수는 음수입니다")

#사용자에게 정수를 입력받아서 짝수, 홀수를 구별하는 프로그램을 만들어 주세요
# num = int(input("정수를 입력하세요 : "))
# if num%2 == 0 :
#     print("짝수입니다")
# else :
#     print("홀수입니다")

# 사용자가 먹고 싶은 메뉴를 입력해서 포함되어 있으면
# 그가격을 출력하는 프로그램을 만들어주세요
# 가격은 마음대로
# 메뉴에 없는 메뉴를 입력하였을 경우 "잘못입력 하였습니다" 출력
# menu = ("라면","김밥","만두")
# menu = input("메뉴를 입력하세요 : ")
# if menu == "라면" :
#     print("3000원")
#     if menu == "김밥" :
#         print("2000원")
#         if menu == "만두" :
#             print("3500원")
# else :
#     print("잘못입력 하였습니다")

#모범답안
# menu = ("라면","김밥","만두")
# ch = input("메뉴를 입력하세요 : ")
# if ch in menu :
#     if ch == "라면" :
#         print("3000원")
#     if ch == "김밥" :
#         print("2000원")
#     if ch == "만두" :
#         print("3500원")
# else :
#     print("잘못입력 하였습니다")



#랜덤함수를 통해 생성된 2개의 값 (10~99)으로
# 더하기 문제를 만들고 만들어진 문제를
# 사용자가 풀어보는 형식의 프로그램을 만들어주세요   
# 정답과 오답을 구별할 것
# from random import randint
# num1 = randint(10,99)
# num2 = randint(10,99)
# ans = int(input("{}+{}= ".format(num1,num2)))
# if ans == num1+num2 :
#     print("정답입니다")
# else :
#     print("오답입니다")

# from random import randint
# num1 = randint(10,99)
# num2 = randint(10,99)
# print("{}+{}= ".format(num1,num2))
# ans = int(input())
# if ans == num1+num2 :
#     print("정답입니다")
# else :
#     print("오답입니다")