# 指令、程序概念的引入

指令集 → 编程

**指令**：$S_i$ 到 $S_{i+1}$状态的一个基本约束规则，伴随着状态的改变和能量的变化

**程序**：从$S_b$变换到$S_e$，有序的、有限的指令的集合，需能量不断供应直到终点

**进程**：程序的运行状态，是在能量的供应下一条一条指令连续处理和执行的过程

# 程序设计和程序设计语言

**程序**: 程序是用计算机指令或语言描述的处理过程，描述的结果称为程序

**程序设计**：编写程序的过程叫做程序设计。

代码的程序设计语言的表达（以3+5为例）：

* 机器语言：0101011011001001001
* 汇编语言：add 3, 5
* 高级语言：3+5

面向过程程序设计 → 面向对象程序设计

过程：步骤的集合

对象：一个具有特定属性和行为的独立存在体

# JAVA语言基础

## 语法

标识符：a-z A-Z _ $开头

关键字：预留

注释 // /* */

## 常见数据类型

| 基本类型 | 名称                   |
| -------- | ---------------------- |
| 整型     | byte、short、int、long |
| 浮点型   | float、double          |
| 字符型   | char                   |
| 布尔型   | boolean                |

## 转义符

| 转义   | 描述            |
| ------ | --------------- |
| \ddd   | 八进制unicode   |
| \uxxxx | 十六进制unicode |
| \\'    | '               |
| \\"    | "               |
| \\\\   | \               |
| \r     | 回车            |
| \n     | 换行            |
| \f     | 换页            |
| \t     | 水平制表符      |
| \b     | 后退            |

## 变量类型转化

```
double x = 9，997;
int nx = (int) x;
```

## 运算符、表达式

二元运算符：+ - * / % >> << & ^ |

一元运算符：++ -- -a

赋值运算符：+= -= *= /= %=

关系运算符：> >= < <= == !=

逻辑运算符:

| 运算符 | 含义   | 用法   |
| ------ | ------ | ------ |
| !      | 非     | !A     |
| &&     | 与     | A&&B   |
| \|\|   | 条件或 | A\|\|B |

条件运算符：A>B ? A : B

其他运算符： . new () {}

优先级：一元>二元

## 字符串

```
"Hello world"
```

String对象

```
String str1 = "This is a string";
String str2 = str1; //指向同一个对象
String str2 = new String(str1); //指向内存中不同的对象

String s;
s = new String("Hello"); //分步创建

```

常用方法：

```
public int lenth() //返回长度
public Boolean equals( Obeject obj) //比较是否相等
public String substring( int index) //子串
public String substring( int beginIndex, int endIndex)
public char charAt(int index) //返回指定位置的字符
public int indexOf(String str) //str第一次出现的位置
public String replace(char oldChar, char newChar) //替换所有
public String trim() //去掉首尾空格

```

StringBuffer对象

```
public StringBuffer() //创建没有字符的缓冲区，16字符长
public StringBuffer(int lenth) //没有字符的缓冲区，容量由lenth决定
public StringBuffer(String string) //缓冲区，string+16字符长
```

# 数组

## 一维数组

声明：

```
int a[];
int[] a;
```

不能使用`int a[10]`

内存申请：

```
int[] a;
a = new int[10];
```

静态初始化：

```
int a[] = {1, 2, 3};
```

不能使用`int a[]; a={1,2,3};`

动态初始化:

```
int c[] = new int[12];

int c[]; //声明
c = new int[12]; //创建数

```

for-each 语句：

```
for (int row : a)
    System.out.print(row + " ");
```

## 二维数组

3x4 数组 声明：

```
int [][] = a;
a = new int[3][];
a[0] = new int[4];
a[1] = new int[4];
a[2] = new int[4];
```

或者

```
int a[][] = new int[3][4];
```

动态初始化：

```
int a[][] = new int[2][3];
a[0][0] = 33;
```

静态初始化：

```
int a[][]={{2, 3}, {1, 3}, {2, 3}};
```

数组名.lenth 行数

数组名[i].lenth 列数
