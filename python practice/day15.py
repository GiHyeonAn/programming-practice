# 사용자에게 문자열을 입력을 받아서 그 문자열에 공백을 제외한
# 문자의 갯수를 출력하는 프로그램을 만들어주세요

# st = input("문장을 입력하세요 : ")
# c = 0
# for a in st :
#     if a != " " :
#         c = c + 1  # c = 문자의 개수
# print(c)

# a~z 까지 임의의 문자열을 8자리씩 총 10줄을 생성하는 프로그램을 만들어주세요

# from random import *
# for b in range(0,10) :
#     for a in range(0,8) :
#         alp = randint(97,122)
#         print(chr(alp),end="")
#     print()


# a~z , A~Z , 0~9까지의 임의의 문자열을 16자리씩 총 10개를 생성하는
# 프로그램을 만들어주세요

# from random import *
# for a in range(0,10) :
#     for b in range(0,16) :
#         c = randint(0,2)
#         if c == 0 :
#             d = randint(97,122)
#             print(chr(d),end="")
#         elif c == 1 :
#             d = randint(65,90)
#             print(chr(d),end="")
#         elif c == 2 :
#             d = randint(0,10)
#             print(d,end="")
#     print()

# 딕셔너리 자료형
# 딕셔너리는 사전이라는 의미를 가지고 있습니다
# 딕셔너리는 반드시 key와 value가 한쌍으로 존재합니다
# 딕셔너리는 순차적으로 해당 요소값을 구하지 않고 오로지 key를 통해 value를 찾습니다
# key와 value는 서로 대응관계에 있습니다
# 딕셔너리는 {}를 사용합니다

# 사용 형식
# a = {key1 : value1 , key2 : value2 , ...}
# a = {"이름":"안기현","나이":29}
# a = {"리스트":[1,2,3]}
# a = {"튜플":(1,2,3)}
# print(a)

# 딕셔너리 사용 방법
# 기본적으로 딕셔너리의 key를 통해서 value를 찾는 방법
# 사용 형태
# 딕셔너리 변수명[key]

# a = {"이름":"안기현"}
# print(a["이름"])
# b = {1:10,2:20}
# print(b[1])

# 딕셔너리 값 추가
# 사용형식
# 딕셔너리 변수명[추가하고 싶은 key] = key에 대응하는 value
# a = {"이름":"안기현"}
# a["나이"] = 29 # key와 value를 추가하는 코드
# print(a)

# 딕셔너리는 중복된 키를 사용 할 수 없습니다
# 사용하면 기존에 있던 키는 삭제가 되고 새로 추가된 키가 생성이 됩니다
# a = {"이름":"안기현"}
# a["이름"] = "홍길동"
# print(a)

# value의 값은 중복이 가능하다
# a = {"이름":"홍길동"}
# a["namae"] = "홍길동"
# print(a)

# 딕셔너리 값 삭제
# 사용형식
# del 딕셔너리변수명[key]
# a = {1:10,2:20}
# del a[1]
# print(a)

# 딕셔너리에서 사용 할 수 있는 함수

# get 함수
# get 함수는 key로 value를 가져오는 기능을 가지고 있습니다
# get 함수는 없는 key를 찾을 때 None이라는 값을 반환합니다(error 아님)
# a[key]형태와 차이점은 없는 key를 찾을 때 에라의 유무입니다
# a = {1:10,2:20}
# print(a[1]) 
# print(a.get(1)) 
# print(a[3]) #error
# print(a.get(3)) # None

# keys 함수
# keys 함수는 딕셔너리 안에 key값만 모아서 객체 형태로 반환을 해주는 함수입니다
# 리스트 형태로만 보고 싶으면 keys() 함수 앞에 list함수를 사용합니다
# a = {1:10,2:20}
# print(list(a.keys()))

# for 문에서도 사용 가능
# for b in a.keys() :
#     print(b)

# values 함수
# values 함수는 딕셔너리 안에서 value에 해당하는 값만 모아서 반환해주는 함수입니다
# a = {"이름":"홍길동","나이":30,"취미":"여행"}
# print(list(a.values()))

# for b in a.values() :
#     print(b)

# items 함수
# items 함수는 딕셔너리 안에서 key와 value값을 한번에 튜플형태로 저장 후 반환하는 함수입니다
# a = {"이름":"홍길동","나이":30,"취미":"여행"}
# print(list(a.items()))

# in
# in은 입력한 key값이 딕셔너리 안에 있는지 찾아주는 함수 입니다
# a = {"이름":"홍길동","나이":30,"취미":"여행"}
# print("이름"in a)
# print("특기"in a)

# clear 함수
# 딕셔너리를 초기화 시키는 기능을 가지고 있습니다
# a = {"이름":"홍길동","나이":30,"취미":"여행"}
# a.clear()
# print(a)

# 영화순위를 만들어서 사용자가 보고 순위를 입력하면 영화의 이름이 나오는 프로그램을 만들어주세요
# 딕셔너리를 사용합니다

# 영화순위
# 1위 조커
# 2위 보통의 연애
# 3위 퍼펙트맨

rank = int(input("순위를 입력하세요 : "))
a = {1:"조커",2:"보통의 연애",3:"퍼펙트맨"}
print(a[rank])

#다른 답안
rank = int(input("순위를 입력하세요 : "))
a = {1:"조커",2:"보통의 연애",3:"퍼펙트맨"}
if rank == 1 :
    print(a[1])
elif rank == 2 :
    print(a[2])
elif rank == 3 :
    print(a[3])

