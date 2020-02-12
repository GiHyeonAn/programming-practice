# 문제 1. 1990년생, 1999년생, 2000년생에 대한 회원목록 정리 프로그램을 만들어 주세요

# 1980년생 - 철수, 영희 ,맹구
# 1990년생 - 길동, 진수
# 2000년생 - 서연, 서린, 병찬

# 프로그램은 각 사람들의 이름을 입력하면 자신이 졸업한 초등학교가 나올 수 있도록 합니다
# 초등학교 이름은 같은 연생들끼리 같은 학교로 작성
# a = {1980:["철수","영희","맹구"],1990:["길동","진수"],2000:["서연","서린","병찬"]}
# while 1 :
#     print("""
# 1. 회원 확인
# 2. 초등학교 확인
# 3. 회원 추가
# 4. 프로그램 종료""")
#     ch = int(input("원하시는 번호를 입력하세요 : "))
#     if ch == 1 :
#         print(list(a.keys()))
#         b = int(input("원하시는 연도를 입력하세요 : "))
#         if b == 1980 :
#             print(a[1980])
#         elif b == 1990 :
#             print(a[1990])
#         elif b == 2000 :
#             print(a[2000])
#     elif ch == 2 :
#         name = input("졸업생의 이름을 입력하세요 : ")
#         if name == "철수" or name == "영희" or name == "맹구" :
#             print("{}는 1980초등학교를 나왔습니다".format(name))
#         elif name == "길동" or name == "진수" :
#             print("{}는 1990초등학교를 나왔습니다".format(name))
#         elif name == "서연" or name == "서린" or name == "병찬" :
#             print("{}는 2000초등학교를 나왔습니다".format(name))
#     elif ch == 3 :
#         add = input("추가하고 싶은 이름을 입력하세요 : ")
#         c = int(input("추가하신 이름의 출생연도를 입력하세요 : "))
#         if c == 1980 :
#             a[1980].append(add)
#             print(a[1980])
#         elif c == 1990 :
#             a[1990].append(add)
#             print(a[1990])
#         elif c == 2000 :
#             a[2000].append(add)
#             print(a[2000])
#     elif ch == 4 :
#         print("프로그램을 종료합니다")
#         break
# 딕셔너리 안의 리스트 중 목록 하나 출력
# print(a[1980][0])
# 딕셔너리 안의 리스트 중 목록 하나 변경
# a[1980][0] = "짱구"
# print(a[1980][0])

# isdecimal() 함수
# isdecimal() 함수를 사용하면 입력한 문자열이 정수형으로 변환이 가능한지
# 불가능한지 True와 False로 반환하는 함수입니다
# 변환이 가능하면 True 불가능하면 False 입니다
# a = "123"
# print(a.isdecimal())
# a = "안녕하세요"
# print(a.isdecimal())

# 사용자가 직접 ID를 입력해서 딕셔너리 안에 값이 들어가는 프로그램을 만들어주세요
# 1. ID 추가
# -사용자가 ID를 지정하면 자동으로 key는 1로 지정
# -사용자가 추가 될 때마다 key는 자동으로 2,3,4순으로 지정이 됩니다
# -ID는 최대 5개 까지 만들수 있습니다
# 2. ID 수정
# - key값을 입력받으면 그에 해당하는 value를 변경할 ID를 입력합니다(수정 할 ID)
# - 추가적으로 key값 뿐만 아니라 ID를 입력해도 똑같이 ID를 별결 할 수 있도록 합니다
# 3. ID 확인
# - 딕셔너리 출력
# 4. 프로그램 종료

ID = {}
a = 1
while 1 :
    print("""1. ID 추가
2. ID 수정
3. ID 확인
4. 프로그램 종료""")
    ch = int(input("실행할 번호를 입력하세요 : "))
    if ch == 1 :
        if a < 6 :
            id = input("추가하실 ID를 입력하세요 : ")
            ID[a] = id
            a = a + 1
            print(ID)
        else :
            print("더 이상 ID를 추가 할 수 없습니다")
    elif ch == 2 :
        i = input("ID의 번호나 ID를 입력하세요 : ")
        print(ID[i])
    elif ch == 3 :
        print(ID)
    elif ch == 4 :
        print("프로그램을 종료합니다")
        break

# 2. ID 수정
# - key값을 입력받으면 그에 해당하는 value를 변경할 ID를 입력합니다(수정 할 ID)
# - 추가적으로 key값 뿐만 아니라 ID를 입력해도 똑같이 ID를 별결 할 수 있도록 합니다


# 모범답안
name = {}
chkey = 1
while 1 :
    print("""1.ID추가
2.ID수정
3.ID확인
4.ID종료""")
    num = int(input("원하시는 번호를 입력해주세요 : "))
    if num == 1 :
        if len(list(name.values())) < 5 :
            a = input("추가하고 싶은 ID를 입력하세요 : ")
            name[chkey] = a
            chkey = chkey + 1
            print(name)
        else :
            print("더 이상 ID를 추가 할 수 없습니다")
    elif num == 2 :
        print(name)
        a = input("ID의 번호나 ID를 입력하세요 : ")
        if a.isdecimal() :
            if int(a) in list(name.keys()) :
                chID = input("바꾸고 싶은 ID를 입력하세요 : ")
                name[int(a)] = chID
                print(name)
            else :
                print("없는 번호입니다 다시 입력하세요")
        elif a in list(name.values()) :
            chid = input("바꾸고 싶은 ID를 입력하세요 :")
            b = list(name.values())
            key = 0 # 아이디를 바꿀 떄 사용 할 key 값
            for c in b :
                key = key+1
                if c == a :
                    name[key] = chid
                    print(name)
        else :
            print("없는 ID입니다 다시 입력하세요")
    elif num == 3 :
        print(name)
    elif num == 4 :
        print("프로그램을 종료 합니다")
        break

