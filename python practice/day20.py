# 매소드에서 self라고 하는 매개변수는 객체가 들어갈 공간입니다
# 그래서 매소드에서 첫번째로 정의되어 있는 매개변수에는 객체가 들어가는 매개변수입니다
# 클래스를 사용하면 객체 단위로 프로그래밍을 할 수 있습니다
# 그냥 함수로 사용 하는 것도 가능하지만 클래스를 사용하면 좀 더 효율적인 코딩이 가능합니다

# 클래스를 사용해서 사용자에게 2개의 정수를 입력받아서 더하는 계산기를 만들어 주세요

# class Calc :
#     def __init__(self,a,b) :
#         print(a+b)

# num1 = int(input("정수를 입력하세요 : "))
# num2 = int(input("정수를 입력하세요 : "))
# calc1 = Calc(num1,num2)

# class Calc :
#     def __init__(self,a,b) : # 꼭 self일 필요는 없으나 가능하면 self를 사용
#         self.sum = a + b   
#         print(self.sum)

# num1 = int(input("정수를 입력하세요 : "))
# num2 = int(input("정수를 입력하세요 : "))
# calc1 = Calc(num1,num2)
# calc2 = Calc(num1,num2)

# class Calc :
#     def __init__(self) :
#         num1 = int(input("정수를 입력하세요 : "))
#         num2 = int(input("정수를 입력하세요 : "))
#         self.sum = num1 + num2
#         print(self.sum)

# calc1 = Calc()

# 게임 캐릭터 만들기
# 캐릭터를 만드는 클래스를 생성합니다
# 캐릭터의 직업은 전사 그리고 마법사가 있습니다
# 그리고 캐릭터마다 공격력과 방어력 그리고 마력이 있어야 합니다
# 공격력, 방어력, 마력은 사용자가 직접 입력합니다

# class Chr :
#     def __init__(self,a,b,c) :
#         print("{}의 공격력은 {}, 방어력은 {}, 마력은 {}입니다".format(a,b,c))

# fw = int(input("공격력을 입력하세요 : "))
# df = int(input("방어력을 입력하세요 : "))
# mg = int(input("마력을 입력하세요 : "))
# js = Chr(fw,df,mg)
# fw = int(input("공격력을 입력하세요 : "))
# df = int(input("방어력을 입력하세요 : "))
# mg = int(input("마력을 입력하세요 : "))
# mgt = Chr(fw,df,mg)

# # 답안
# class Chr :
#     def __init__(self,a,b,c) :
#         self.attack =
#         self.defense =
#         self.magic =
#     def Warrior(self) :
#         print
#     def Wizard(self) :
#         print

# slot1 = Chr()
# slot2 = Chr()
# slot1.Warrior()
# slot2.Wizard()

# 게임 보스전 만들기
# 직업은 전사, 궁수, 마법사가 있습니다
# 전사는 체력 100, 궁수는 70, 마법사는 60으로 지정합니다
# 1. 사용자에게 직업을 입력받습니다
# Charactor 클래스를 만들어서 각 직업의 체력은 __init__에서 정의를 합니다
# 사용자가 선택한 직업에 체력이 출력이 되도록 만들어주세요

# class Chr :
#     def __init__(self,health) :
#         self.life = health
#         print(self.life)
# char = input("캐릭터를 입력하세요 : ")
# if char == "전사" :
#     warrior = Chr(100)
# elif char == "궁수" :
#     archer = Chr(70)
# elif char == "마법사" :
#     wizard = Chr(60)

# 2. boss 캐릭터에 대한 객체도 만들어 줍니다 boss캐릭터는 체력이 150입니다
# 그리고 Charactor() 클래스 안에 attack 매소드를 만들어 줍니다
# 사용자가 공격을 했을 때 boss의 체력이 20이 달도록 만들어주세요

# class Charactor :
#     def __init__(self,health) :
#         self.life = health
#     def attack(self) :
#         self.life = self.life - 20
#         return self.life
# char = input("캐릭터를 입력하세요 : ")
# boss = Charactor(150)
# if char == "전사" :
#     warrior = Charactor(100)
#     print("1.공격한다")
#     att = int(input("원하는 행동을 입력하세요 : "))
#     if att == 1 :
#         print("보스 체력 = {}".format(boss.attack()))
# elif char == "궁수" :
#     archer = Chr(70)
# elif char == "마법사" :
#     wizard = Chr(60)

# 3. bossattack 매소드를 만들에서 내가 공격 했을 때 보스가 반격을 해서
# 자신의 캐릭터 체력이 10 감소하도록 만들어 주세요
# 보스의 체력이나 내 캐릭터의 체력이 0 이하로 내려갈때 까지 반복합니다

# class Charactor :
#     def __init__(self,health) :
#         self.life = health
#     def attack(self) :
#         self.life = self.life - 20
#         return self.life
#     def bossattack(self) :
#         self.life = self.life - 10
#         return self.life
# char = input("캐릭터를 입력하세요 : ")
# boss = Charactor(150)
# if char == "전사" :
#     warrior = Charactor(100)
#     while boss.life >= 0 and warrior.life >= 0 :
#         print("1.공격한다")
#         att = int(input("원하는 행동을 입력하세요 : "))
#         if att == 1 :
#             print("보스 체력 = {}".format(boss.attack()))
#             print("내 체력 = {}".format(warrior.bossattack()))
#     print("보스를 잡았습니다")
# elif char == "궁수" :
#     archer = Chr(70)
# elif char == "마법사" :
#     wizard = Chr(60)

# 4. 나머지 직업도 동일한 기능을 만들어 주세요
# 그리고 내 체력이 먼저 떨어지는 경우는 패배라는 문구가 나와야 합니다

class Charactor :
    def __init__(self,health) :
        self.life = health
    def attack(self) :
        self.life = self.life - 20
        return self.life
    def bossattack(self) :
        self.life = self.life - 10
        return self.life
    def battle(self) :
        while 1 :
            print("1.공격한다")
            att = int(input("원하는 행동을 입력하세요 : "))
            if att == 1 :
                print("보스 체력 = {}".format(boss.attack()))
                print("내 체력 = {}".format(self.bossattack()))
            if boss.life <= 0 :
                print("보스를 잡았습니다")
                break
            elif self.life <= 0 :
                print("패배")
                break
char = input("캐릭터를 입력하세요 : ")
boss = Charactor(150)
if char == "전사" :
    warrior = Charactor(100)
    warrior.battle()
elif char == "궁수" :
    archer = Charactor(70)
    archer.battle()
elif char == "마법사" :
    wizard = Charactor(60)
    wizard.battle()

# java는 class를 많이 이용(형태가 조금 다름, 개념은 같음)