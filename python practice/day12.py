# 이중 리스트(2차원리스트)
# 이중 리스트는 리스트 안에 요소값으로 리스트가 하나 더 존재하는 것을 의미합니다
# 사용형식
#a = [1,2,3,[4,5,6]]
#print(a[3])
#print(a[3][1])
#print(a[3][0:2])

# 삼중 리스트
# a = [1,2,[3,4,[5,6]]]
# print(a[2][2][0])

# 리스트 더하기
# 리스트의 더하기 연산은 2개의 리스트를 서로 합치는 기능을 가지고 있습니다
# a = [1,2,3]
# b = [4,5,6]
# #print(a+b)
# c = a+b
# print(c)

# 리스트 곱하기
#a = [1,2,3]
#print(a*3)

# 리스트의 요소값 삭제
# del을 사용해서 리스트 안에 요소값을 삭제 할 수 있습니다
# a = [1,2,3]
# del a[1]
# print(a)

# 리스트의 길이 구하기
# len 함수를 사용해서 리스트의 요소값의 갯수를 알 수 있습니다
# a = [1,2,3,4]
# print(len(a))

# append 함수
# 리스트에 요소값을 추가해주는 함수입니다
# append() 안에 추가하고 싶은 요소값을 입력합니다
# append는 리스트에 맨 뒤에 추가가 됩니다
# a = [1,2,3]
# a.append(10)
# print(a)
#a.append([4,5,6])
#print(a)

# insert 함수
# 리스트의 요소값을 삽입 할 때 사용하는 함수입니다
# insert는 append와 비슷한 효과를 가지고 있지만
# insert는 인덱스 번호를 사용하여 요소값을 추가 하는 것이 가능합니다
# a = [1,2,3]
# a.insert(0,10)
# print(a)
#a.insert(-1,20)
#print(a)

# remove 함수
# remove 함수는 del과 동일한 효과를 가지고 있습니다
# 하지만 remove는 리스트에서 가장 먼저 나오는 요소값만 삭제를 합니다
# a = [1,2,3]
# a.remove(2)
# print(a)
# a = [1,2,3,2]
# a.remove(2)
# print(a)

# pop 함수
# 리스트의 요소를 다른 변수나 리스트로 이동을 시켜 줄 수 있습니다
# a = [1,2,3]
# b = a.pop(1)
# print(a)
# print(b)

# sort 함수
# sort 함수는 리스트의 요소를 순차적으로 정렬하는 기능을 합니다
# 오름차순
# a = [1,10,9,88,100,2,41]
# a.sort()
# print(a)

# 내림차순
# a = [1,10,9,88,100,2,41]
# a.sort(reverse=True)
# print(a)

# reverse 함수
# reverse 함수는 리스트 안에 요소값을 거꾸로 뒤집는 기능을 가지고 있는 함수입니다
# a = [1,5,3]
# a.reverse()
# print(a)

# count 함수
# count 함수는 리스트 안에 내가 입력한 요소값이 몇개가 포함되어 있는지
# 반환해주는 함수입니다
# 문자열에서 사용했던 형식과 동일합니다
# a = [1,2,3,1]
# print(a.count(1))

# index 함수
# index 함수는 입력한 요소값이 리스트에 어디에 저장되어 있는지
# 반환해주는 함수입니다
# a = [1,2,3]
# print(a.index(3))

# extend 함수
# extend 함수는 리스트를 확장 시켜주는 기능을 가지고 있습니다
# extend 안에는 리스트만 사용이 가능합니다
# 리스트 + 리스트와 동일한 효과를 가지고 있습니다
# a = [1,2,3]
# a.extend([4,5])
# print(a)

# remove를 사용해서 입력한 요소값을 한번에 지우는 프로그램
# a = [1,2,3,1,2,3,1,2,3]
# num = int(input("삭제하고 싶은 요소값을 입력하세요 : "))
# while a.count(num) != 0 : # while a.count(num) : 을 써도 됩니다(while 0 : 은 거짓이기 때문)
#     a.remove(num)
# print(a)

# ID 관리 프로그램 만들기
# ID는 일반 ID 그리고 VIP ID 로 구분합니다
# ID는 절대 중복이 될 수 없습니다
# ID는 반드시 6글자 이상 사용을 해야합니다
# VIP ID는 반드시 일반 ID에서 승격을 시켜서 사용해야 합니다
# 아래와 같은 기능을 가지고 있어야 합니다
# 1. ID 목록 확인
# 2. ID 등록
# 3. ID 삭제
# 4. VIP 승격
# 5. 프로그램 종료

ID = []
VIP = []

while True :
    print("1. ID 목록 확인")
    print("2. ID 등록")
    print("3. ID 삭제")
    print("4. VIP 승격")
    print("5. 프로그램 종료")
    ID = []
    VIP = []
    ch = int(input("원하시는 항목 번호를 입력하세요 : "))
    if ch == 1 :
        print(ID)
        print(VIP)
    elif ch == 2 :
        id = input("원하시는 ID를 입력하세요 : ")
        if len(id) >= 6 :
            print("ID가 등록되었습니다")
            ID.append(id)
            print(ID)
            print(VIP)
        elif len(id) < 6 :
            print("ID는 반드시 6글자 이상이어야 합니다")
    elif ch == 3 :
        id = input("삭제하고 싶은 ID를 입력하세요 : ")
        print("ID가 삭제되었습니다")
        ID.remove(id)
        print(ID)
    elif ch == 4 :
        id = input("승격하고 싶은 ID를 입력하세요 : ")
        VIP = ID.pop(id)
        print(ID)
        print(VIP)
    elif ch == 5 :
        print("프로그램을 종료합니다")
        break
