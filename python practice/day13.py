# # ID 관리 프로그램 만들기
# # ID는 일반 ID 그리고 VIP ID 로 구분합니다
# # ID는 절대 중복이 될 수 없습니다
# # ID는 반드시 6글자 이상 사용을 해야합니다
# # VIP ID는 반드시 일반 ID에서 승격을 시켜서 사용해야 합니다
# # 아래와 같은 기능을 가지고 있어야 합니다
# # 1. ID 목록 확인
# # 2. ID 등록
# # 3. ID 삭제
# # 4. VIP 승격
# # 5. 프로그램 종료
# from os import system
# ID = []
# VIP = []
# while True :
#     system('cls') # 배치를 잘 해야함
#     print("1. ID 목록 확인")
#     print("2. ID 등록")
#     print("3. ID 삭제")
#     print("4. VIP 승격")
#     print("5. 프로그램 종료")
#     ch = int(input("원하시는 항목 번호를 입력하세요 : "))
#     if ch == 1 :
#         print(ID) #print("ID : ",ID)
#         print(VIP) #print("VIP : ",VIP)
#         trush = input("계속하려면 엔터키를 입력하세요...") # 변수 안써도 무방(쓰더라도 아무변수 사용가능)
#     elif ch == 2 :
#         id = input("원하시는 ID를 입력하세요 : ")
#         if len(id) >= 6 :
#             if ID.count(id) == 0 and VIP.count(id) == 0 :
#                 print("ID가 등록되었습니다")
#                 ID.append(id)
#                 print(ID)
#                 print(VIP)
#             else :
#                 print("이미 등록된 ID입니다")
#         elif len(id) < 6 :
#             print("ID는 반드시 6글자 이상이어야 합니다")
#     elif ch == 3 :
#         id = input("삭제하고 싶은 ID를 입력하세요 : ")
#         if ID.count(id) >= 1 :
#             print("ID가 삭제되었습니다")
#             ID.remove(id)
#             print(ID)
#             print(VIP)
#         elif VIP.count(id) >= 1 :
#             print("ID가 삭제되었습니다")
#             VIP.remove(id)
#             print(ID)
#             print(VIP)
#     elif ch == 4 :
#         id = input("승격하고 싶은 ID를 입력하세요 : ")
#         ID.remove(id)
#         print(ID)
#         VIP.append(id)
#         print(VIP)
#         # or
#         # idx = ID.index(id)
#         # VIP.append(ID.pop(idx))
#         print("정상적으로 승격하였습니다")
#     elif ch == 5 :
#         print("프로그램을 종료합니다")
#         break
# system('ipconfig')

# 튜플
# 역할은 리스트와 동일하나 리스트와 차이점이 존재합니다
# 튜플은 ()를 사용합니다
# 튜플은 요소값을 변경 할 수 없습니다

# 튜플 생성 형식
#a = () # 빈 튜플
#b = (1,2,3)
#print(b)
# c = 1,2,3 # ()를 쓰지 않아도 변수에 초기화 값이 다우인 경우 자동으로 튜플로 초기화가 됩니다
# print(c)

# 튜플에 요소값이 한개 있을 경우 표현 방식
# d = (1)
# print(d)
# d = (1,)
# print(d)

# 튜플 사용법
# a = (1,2,3)
# print(a[0])
# print(a[0:2])
# print(a[0]+a[1])
# print(a[-1])

# 튜플의 요소값 수정
# 튜플의 요소값은 수정이 불가능합니다
# a = (1,2,3)
# a[0] = 10
# print(a)
# 삭제도 불가능합니다
# del a[0]
# print(a)

# 튜플에서 사용 가능한 함수

# len 함수
# 튜플의 길이를 반환해주는 함수
# a = (1,2,3)
# print(len(a))

# index 함수
# index 함수도 튜플에서 사용 할 수 있습니다 효과는 리스트랑 동일
# a = (1,2,3)
# print(a.index(3))

# tuple 함수
# 리스트나 문자열 등을 튜플형태로 변환 시키는 기능을 가지고 있는 함수
# a = [1,2,3]
# print(tuple(a))

# list 함수
# 튜플이나 문자열 등을 리스트 형태로 변환시키는 기능을 가지고 있는 함수
# a = (1,2,3)
# print(list(a))

# max, min 함수
# max는 요소값 중에서 가장 큰 값을 반환해주며 min은 가장 작은 값을 반환합니다
# a = (1,2,3)
# print(max(a))
# print(min(a))

# for 반복문
# while문과 마찬가지로 종속문장을 반복하는 기능을 가지고 있습니다
# while문과는 다르게 조건식을 사용하지 않습니다
# for문을 사용하면 while코드보다 비교적 간단하게 표현된다는 장점이 있습니다

# 사용 형식
# for 변수 in 튜플(리스트,문자열,range(x)):
#     종속문장1
#     종속문장2

# for a in "hello" :
#     print(a)

# 가장 먼저 리스트에 첫번째 요소값(인덱스0)을 a변수에 초기화를 시킵니다
# 그리고 for문의 종속문장을 실행하고 종속문장을 모두 실행하면
# 이번에는 2번째 요소값(인덱스1)을 변수 a에 다시 초기화를 시킵니다
# 위 과정을 리스트의 요소값을 다 사용할 때 까지 반복합니다
# 더 이상 반복할 요소값이 없다면 반복문을 종료합니다
# for a in [1,2,3] :
#     print(a)

# range() 함수
# range 함수는 정수의 범위를 지정해서 반환하는 기능을 가지고 있는 함수입니다
# range(x,y) 형태로 많이 사용을 합니다
# x가 범위의 시작 y가 끝을 의미하지만 y는 자기자신을 포함하지 않습니다
# 즉 x이상 y미만의 범위를 반환합니다

# print(range(0,10))
# print(tuple(range(0,10)))
# print(list(range(0,10)))

# for a in range(0,10) :
#     print(a)

# for문 안에 if, while문 가능