# break
# break를 사용하면 강제적으로 반복문을 빠져나가는 것이 가능합니다

# a = 1
# while a == 1 :
#     print("a는 1입니다")
#     break
#     print("a는 1입니다")

# 콜라를 주는 프로그램 만들기
# 프로그램 메뉴
# 1.콜라주기
# 2.콜라주지 않기
# 3.콜라 리필
# 4.프로그램 종료


# cola = 10
# while cola > 0 :
#     print("1.콜라 주기")
#     print("2.콜라 주지 않기")
#     print("3.콜라 리필")
#     print("4.프로그램 종료")
#     ch = int(input("메뉴번호를 입력하세요 : "))
#     if ch == 1 :
#         print("콜라를 받으세요!!!")
#         cola = cola - 1
#         print("현재 콜라는 {}병 남았습니다".format(cola))
#     elif ch == 2 :
#         print("콜라를 받지 않습니다")
#         print("현재 콜라는 {}병 남았습니다".format(cola))
#     elif ch == 3 :
#         print("콜라를 리필 받으세요")
#         cola = 10
#         print("현재 콜라는 {}병 남았습니다".format(cola))
#     elif ch == 4 :
#         print("프로그램을 종료합니다")
#         break

# continue
# continue를 사용하면 아래 종속문장을 실행하지 않고 다시 조건식으로 돌아올 수 있습니다

# a = 0
# while a == 0 :
#     print("a는 0입니다")
#     continue
#     print("a는 1입니다")

# 1~x까지의 수 중에서 짝수만 출력하는 프로그램을 만들어 주세요
# x는 사용자가 직접 입력을 합니다
# 조건 - continue를 사용할 것

# num1 = int(input("정수를 입력하세요 : "))
# num2 = 0
# while num2 < num1 :
#     num2 = num2 + 1
#     if num2 % 2 == 1 : #if가 거짓이면 바로아래문장이 실행하지 않는다
#         continue
#     print(num2)

# 1~100까지의 누적합을 구하는 프로그램을 만들어주세요

# num1 = 1
# num2 = num1 + 1
# while num2 <= 100 :
#     print("{} + {} = {}".format(num1,num2,num1+num2))
#     num1 = num1 + num2
#     num2 = num2 + 1



# 구구단 전체를 출력하는 프로그램을 만들어주세요
# while 안에 while이 포함
# 구구단 출력 시 단을 구별해서 출력을 합니다
# 구별방식은 자유

# num1 = 2
# num2 = 1
# while num1 <= 9 :
#     print("===={}단====".format(num1))
#     num2 = 1
#     while num2 <= 9 :
#         print("{} x {} = {}".format(num1,num2,num1*num2))
#         num2 = num2 + 1
#     num1 = num1 + 1

# *
# **
# ***
# ****
# *****
# 위의 출력결과로 만들어 주세요
# while함수를 이용해서 만들어 주세요

