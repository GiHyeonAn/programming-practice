# # 컴퓨터와 가위바위보 게임
# # 조건
# # 5판 3선으로 진행합니다
# # 한판 진행을 할 때 마다 결과가 출력이 되어야 합니다
# # 가위바위보가 끝나면 승,패 ,무 결과가 출력이 되면서 계속 할 건지 물어봐야 합니다(5판 끝났을 때)
# # 플레이어가 3승을 먼저하거나 3패를 하면 바로 결과가 출력이 되어야 합니다
# # 출력양식 :  승 : 1 , 패 : 1 , 무 : 1
# # 뼈대 먼저 만들고 함수는 나중에 만들것

# w = 0
# l = 0
# d = 0
# while True :
#     if w == 3 or l == 3 :
#         if w == 3 :
#             print("3번 이겼습니다")
#             break
#         elif l == 3 :
#             print("3번 졌습니다")
#             break
#     else :
#         from random import *
#         for i in range(0,3) :
#             a = input("가위, 바위, 보 셋 중 입력하세요 : ")
#             if i == 0 :
#                 if a == "가위" :
#                     d = d + 1
#                     print("무승부 입니다.")
#                 elif a == "바위" :
#                     w = w + 1
#                     print("이겼습니다")
#                 elif a == "보" :
#                     l = l + 1
#                     print("졌습니다")
#             elif i == 1 :
#                 if a == "가위" :
#                     l = l + 1
#                     print("졌습니다.")
#                 elif a == "바위" :
#                     d = d + 1
#                     print("무승부입니다")
#                 elif a == "보" :
#                     w = w + 1
#                     print("이겼습니다")
#             elif i == 2 :
#                 if a == "가위" :
#                     w = w + 1
#                     print("이겼습니다")
#                 elif a == "바위" :
#                     l = l + 1
#                     print("졌습니다")
#                 elif a == "보" :
#                     d = d + 1
#                     print("무승부입니다")
#             print("승:{},패:{},무:{}".format(w,l,d))


# # 다른 답안
# 승, 패, 무 = 0, 0, 0 # while 밖에 초기화문은 안써도 무방(while문 안에 이미 있기 때문)
# def win() :
#     global 승
#     print('플레이어 승')
#     승 = 승 + 1
#     if 승 == 3 :
#         system('cls') # 안 써도 무방
#         print("플레이어 승리!")
#         print("총 전적 : 승:{} 패:{} 무:{}".format(승, 패, 무))
# def lose() :
#     global 패
#     print('플레이어 패')
#     패 = 패 + 1
#     if 패 == 3 :
#         system('cls')
#         print("플레이어 패배......")
#         print("총 전적 : 승:{} 패:{} 무:{}".format(승, 패, 무))
# def draw():
#     global 무
#     무 = 무 + 1
#     print("무승부!")
# def result():
#     if 승 == 패 :
#         system("cls")
#         print("무승부 입니다!")
#         print("총 전적 : 승:{} 패:{} 무:{}".format(승, 패, 무))
#     elif 승 == 1 and 승 > 패 :
#         system("cls")
#         print("플레이어의 승리 입니다!")
#         print("총 전적 : 승:{} 패:{} 무:{}".format(승, 패, 무))
#     elif 승 == 1 and 승 < 패 :
#         system("cls")
#         print("플레이어의 패배 입니다....")
#         print("총 전적 : 승:{} 패:{} 무:{}".format(승, 패, 무))
#     elif 승 == 0 and 승 < 패:
#         system("cls")
#         print("플레이어의 패배 입니다....")
#         print("총 전적 : 승:{} 패:{} 무:{}".format(승, 패, 무))
#     elif 승 == 2 :
#         system("cls")
#         print("플레이어의 승리 입니다!")
#         print("총 전적 : 승:{} 패:{} 무:{}".format(승, 패, 무))
# from os import system
# from random import *
# while True:
#     승,패,무 = 0,0,0
#     for x in range(5): # 범위 0~4
#         player = input('가위, 바위, 보 : ')
#         computer = randint(0,2) # 0 = 가위 ,  1 = 주먹 ,2= 보
#         if player == '가위':
#             if computer == 0:
#                 draw()
#             elif computer == 1:
#                 lose()
#                 if 패 == 3 :
#                     break
#             elif computer == 2:
#                 win()
#                 if 승 == 3 :
#                     break
#         elif player == '바위':
#             if computer == 0:
#                 win()
#                 if 승 == 3 :
#                     break
#             elif computer == 1:
#                 draw()
#             elif computer == 2:
#                 lose()
#                 if 패 == 3 :
#                     break
#         elif player == '보':
#             if computer == 0:
#                 lose()
#                 if 패 == 3 :
#                     break
#             elif computer == 1:
#                 win()
#                 if 승 == 3 :
#                     break
#             elif computer == 2:
#                 draw()
#     result()     
#     retry = input('계속 진행 하시겠습니까?(Yes/No) : ')
#     if retry  == 'No':
#         print("수고하셨습니다")
#         break

# 클래스(class)
# 클래스란 함수와 변수들의 집합체를 의미합니다
# 클래스 안에는 인스턴스르르 만들어서 사용 할 수 있습니다
# 클래스의 선언은 일반 함수 선언과 유사합니다
# 클래서를 선언시 def가 아닌 class를 적어야 합니다
# 그리고 클래스의 이름은 첫글자는 대문자로 표시합니다

# class Ham : # 햄버거 클래스를 생성
#     def recipe(self,a,b) : # 클래스 안에 있는 함수를 매소드라고 합니다
#         print("{}버거는 {}와 {}로 만들어집니다".format(a,a,b))

# Ham1 = Ham() # Ham1이라는 객체를 생성
# Ham1.recipe("치즈","양상추") # 인스턴스 생성

# 계산기의 기능 중 +기능만 가능한 프로그램을 만들어 주세요
# 함수만 사용하면 기본적으로 2개의 계산기를 정상적으로 사용 할 수 있습니다
# 사용하려면 계산기에 숫자만큼 함수를 만들어서 사용을 해야 합니다
# sum = 0
# sum2 = 0
# def add(num) :
#     global sum
#     sum = sum + num
#     return sum
# def add2(num) :
#     global sum2
#     sum2 = sum2 + num
#     return sum2
# while 1 : # 첫번째 계산기
#     a = int(input("첫번째 계산기 = 더하고 싶은 수를 입력하세요 : "))
#     print(add(a))
#     if a == 0 :
#         break
# while 2 : # 두번째 계산기
#     b = int(input("두번째 계산기 = 더하고 싶은 수를 입력하세요 : "))
#     print(add2(b))
#     if b == 0 :
#         break

class calc :
    def __init__(self) :
        self.sum = 0
    def add(self,a) :
        self.sum = self.sum + a
        return self.sum

calc1 = calc()
calc2 = calc() # 두번째 계산기에 대한 객체만 추가
print(calc1.add(1))
print(calc1.add(10))
print(calc2.add(100))
print(calc2.add(200))