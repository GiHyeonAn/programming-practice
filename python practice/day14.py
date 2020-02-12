# range 함수는 range(x,y,z) 형태로도 사용이 가능합니다
# x는 시작 y는 끝을 나타내지만 z는 증감을 나타냅니다
# print(range(0,10,2))
# print(list(range(0,10,2)))
# print(list(range(10,0,-2)))

# range 함수를 이용한 for문
# for a in range(0,10) :
#     print(a)

# for a in range(1,10,2) :
#     print(a)

# grade = [70,60,55,75,95,80]을 합해서 평균을 구해주세요

# grade = [70,60,55,75,95,80]
# sum = 0
# for a in grade :
#     sum = sum + a
# avg = sum/6
# print(avg)
# or
# print(sum/len(grade))

# 1~50 까지의 값을 for을 사용해서 출력하지만 7의 배수는 출력하지 않습니다

# for a in range(1,51) :
#     if a%7 != 0 :
#         print(a)


# 1~30 까지의 값을 반복문을 사용해서 출력할 때
# 다음과 같은 형식으로 출력 되도록 만들어 주세요

# 1   2   3   4   5
# 6   7   8   9   10
# .......    29   30     

# for a in range(1,31) :
#     if a%5 == 0 :
#         print(a)
#     else :
#         print(a,end="\t")

# 구구단 전체 출력

# a = 2
# while a < 10: 
#     for b in range(1,10) :
#         print(a*b)
#     a = a + 1

# for a in range(2,10) :
#     for b in range(1,10) :
#         print(a*b)

# for 문 break
# while 의 break와 동일합니다
# for i in [1,2,3] :
#     print(i)
#     break

# for 문 continue
# while 의 continue와 동일합니다
# for i in [1,2,3] :
#     if i == 2 :
#         continue
#         print(i)
#     print(i)

# 사용자에게 문자열을 입력을 받아서 그 문자열에 공백을 제외한
# 문자의 갯수를 출력하는 프로그램을 만들어주세요



