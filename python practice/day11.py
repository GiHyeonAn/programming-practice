# 인덱스 번호를 사용해서 변수 안에 있는 문자열 변경
# a ="hello"
# a = a[0:2] + " is"
# print(a)

# 문자열은 인덱스 번호를 사용해서 요소값을 수정 할 수 없습니다
# a = "hello"
# a[2] = "A"
# print(a)  # error

# 문자열에서 사용할 수 있는 함수

# len 함수
# 문자열의 길이를 반환해주는 함수입니다
# 쉽게 말하면 문자열의 글자 수를 의미합니다
# 숫자는 사용 X
# a = "hello"
# print(len(a))
# a = 123
# print(len(a)) # error

# count 함수
# count 함수는 문자의 수를 반환해주는 함수입니다
# a = "hello"
# print(a.count("l"))

# join 함수
# join 함수는 문자열 중에서 문자 사이사이에 입력한 문자열이 삽입이 됩니다
# a = "hello"
# print("|".join(a))

# find 함수
# find 함수는 입력한 문자열이 인덱스 번호 어디에 있는지 반환해주는 함수입니다
# find 함수는 인덱스 번호 0번부터 문자열을 찾습니다
# a = "Hello"
# print(a.find("l"))

# rfind 함수
# rfind 함수는 find 함수와 효과는 동일하지만 차이점은 인덱스 번호 -1번부터 찾습니다
# a = "Hello"
# print(a.rfind("l"))

# index 함수
# 효과는 find함수와 동일하지만 차이점은 찾는 문자열이 없는 경우 error가 발생합니다
# a = "Hello"
# print(a.index("H"))
# print(a.index("f")) # error
# print(a.find("f")) #error 발생하지 않음

# replace 함수
# replace 함수는 문자열을 변경하고 싶을 때 사용하는 함수입니다
# a = "hello"
# a = a.replace("he","HE")
# print(a)

# upper 함수
# upper 함수는 소문자를 대문자로 바꾸고 싶을 때 사용하는 함수입니다
# a = "hello"
# print(a.upper())

# lower 함수
# lower 함수는 대문자를 소문자로 바꾸고 싶을 때 사용하는 함수입니다
# a = "HELLO"
# print(a.lower())

# rstrip 함수
# rstrip 함수는 문자열에서 가장 오른쪽에 있는 공백을 삭제하는 함수입니다
# len 함수를 통해서 삭제를 확인 할 수 있습니다
# a = "hello "
# print(len(a))
# a = a.rstrip()
# print(len(a))

# lstrip 함수
# lstrip 함수는 맨 왼쪽에 있는 공백을 삭제하는 함수입니다
# a = " hello"
# print(a)
# a = a.lstrip()
# print(a)

# strip 함수
# strip 함수는 양쪽 공백을 지워주는 함수입니다
# a = " hello "
# print(len(a))
# a = a.strip()
# print(len(a))

# split 함수
# split 함수는 문자열을 나눌 때 사용하는 함수입니다
# split()안에 아무것도 적지 않으면 공백을 기준으로 문자열을 분류합니다
# split은 문자열을 나누고 리스트([]) 형식으로 저장합니다
# a = "hello my name is aaa"
# print(a.split())

# 리스트(list)
# 리스트는 여러 종류의 값을 하나로 묶어서 변수에 초기화 해서 사용하는 형태
# 리스트는 []를 사용합니다
# 요소값은 , 로 구분을 해줘야 합니다
# a = [1,2,3,4,5,6] # 리스트 하나로 취급

# 리스트 생성방법
# a = [1,2,3]
# b = ["hey","you"]
# c = [1,"2",3]
# d = []
# print(a)

# 리스트의 인덱싱
# 리스트도 문자열과 마찬가지로 인덱스 번호를 사용해서 요소값을 사용할 수 있습니다
# a = [1,2,3]
# print(a[1])
# print(a[-1])
# print(a[0]+a[1])

# 리스트의 슬라이싱
# 문자열의 슬라이싱과 동일하게 사용 할 수 있습니다
# a = [1,2,3,4,5,6]
# print(a[0:2])
# print(a[0:])
# print(a[:3])
# print(a[:])

# 리스트의 요소값 변경
# 인덱스 번호를 이용해서 요소값을 변경할 수 있습니다
# a = [1,2,3]
# a[0] = 10
# print(a)
# 문자열 변경도 가능합니다
# a = ["hello"]
# a[0] = "hi"
# print(a)

# 슬라이싱을 이용한 리스트 요소값 변경
# a = [1,2,3]
# a[0:2] = [4,5]
# print(a)

# 분식집에서 라면,만두,떡볶이 3가지를 팔고 있습니다
# 가격은 라면 =2000, 만두 = 500, 떡볶이 = 1000 
# 음식에 가격을 사용자가 입력한 가격으로 바꿀수 있는 프로그램을 만들어 주세요
# 조건 - 반드시 리스트 사용, 가격은 사용자가 직접 입력할 수 있어야함
# 메뉴의 이름도 변경 할 수 있어야 합니다
# 프로그램은 다음과 같은 기능을 가지고 있어야 합니다
# 1.메뉴 확인
# 2.가격 확인
# 3.가격 변경
# 4.메뉴 변경
# 5.프로그램 종료

menu = ["라면","만두","떡볶이"]
price = [2000,500,1000]
while True :
    print("1.메뉴 확인")
    print("2.가격 확인")
    print("3.가격 변경")
    print("4.메뉴 변경")
    print("5.프로그램 종료")
    ch = int(input("번호를 입력하세요 : "))
    if ch == 1 :
        print(menu)
    elif ch == 2 :
        print("%s = %d,%s = %d,%s = %d"%(menu[0],price[0],menu[1],price[1],menu[2],price[2]))
    elif ch == 3 :
        menu = input("메뉴를 입력하세요 : ")
        if menu == "라면" :
            pri2 = int(input("바꾸실 가격을 입력하세요 : "))
            price[0] = pri2
            print("라면의 가격은 2000원에서 {}으로 바뀌었습니다".format(pri2))
        elif menu == "만두" :
            pri2 = int(input("바꾸실 가격을 입력하세요 : "))
            price[1] = pri2
            print("만두의 가격은 500원에서 {}으로 바뀌었습니다".format(pri2))
        elif menu == "떡볶이" :
            pri2 = int(input("바꾸실 가격을 입력하세요 : "))
            price[1] = pri2
            print("떡볶이의 가격은 1000원에서 {}으로 바뀌었습니다".format(pri2))
    elif ch == 4 :
        print(menu)
        menu = input("바꾸고 싶은 메뉴를 선택하세요 : ")
    elif ch == 5 :
        print("프로그램을 종료합니다")
        break

# 모범 답안
# elif ch == 2 :
#     print("%s = %d,%s = %d,%s = %d"%(menu[0],pri1[0],menu[1],pri1[1],menu[2],pri1[2]))
# elif ch == 3 :
#     print(menu)
#     num = int(input("몇번째 메뉴의 가격을 변경하시겠습니까? : "))
#     num2 = int(input("바꾸고 싶은 가격을 입력하세요 : "))
#     price[num-1] = num2
# elif ch == 4 :
#     print(menu)
#     num = input("몇번째 메뉴의 가격을 변경하시겠습니까? : ")
#     name = int(input("바꾸고 싶은 이름을 입력하세요 : "))
#     menu[num-1] = name