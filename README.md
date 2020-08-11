# Java基础

**这是加粗文字**

_这是倾斜的文字_

_**这是倾斜加粗的文字**_

~~这是加删除线的文字~~

### 三、引用

在引用的文字前加&gt;即可，引用也可以嵌套，如加两个&gt;&gt;三个&gt;&gt;&gt;n个...

示例：

```java
> 这是引用内容
>>这是引用内容
>>>这是引用内容
```

效果如下：

> 这是引用内容
>
> > 这是引用内容
> >
> > > > 这是引用内容

### 四、分割线

分割线使用三个或三个以上-或者\*都可以。

示例：

```python
---
----
***
****
```

效果如下：

可以看到，显示效果是一样的

### 五、图片

语法：

```bash
![图片alt](图片地址 '图片title')

图片alt就是显示在图片下面的文字，相当于对图片内容的解释
图片地址可以是网络地址也可以是本地地址
图片title是图片的标题，是鼠标移动到title上时显示的内容，title可以不添加。
注：部分平台或软件可能会不显示标题和title（typora就不显示）
```

示例：

```bash
![森林]/(Users/steak_yuqi/Documents/content.jpeg '原始森林')
```

效果如下：

### 六、超链接

语法：

```java
[超链接名](超链接地址 "超链接title")
title可加可不加
```

示例：

```java
[简书](https://www.jianshu.com/ "简书")
[百度](https://www.baidu.com "百度")
```

效果如下：

[简书](https://www.jianshu,com)

[百度](https://www.baidu.com)

### 七、代码

* 单行代码

  语法：

  ```java
  `代码内容`
  ```

  示例：

  ```java
  `hello world`
  ```

效果如下：

`hello world`

* 代码块

  语法：

  代码之间分别用三个反引号包起来，且两边的反印号独占一行

  ```java
  ​
  ```

  代码.. 代码.. 代码.. ​\`\`\`

  ```text
  示例：

  ```javascript
  ​
  ```

  function hello\(\){ return "hello" } 效果如下：

```java
function hello(){
        return "hello"
}
```

### 八、表格

语法：

```java
表头|表头|表头
---|:--:|--:|
内容|内容|内容|
内容|内容|内容|

第二行分割表头和内容
-有一个就行,为了对齐，多加了几个
文字默认居左
-两边加：表示文字居中
-右边加：表示文字居右
注：原声的语法两边都要用|包起来。此处省略
```

示例

```java
姓名|技能|排行
--|:--:|--:|
刘备|哭|大哥
关羽|打|二哥
张飞|骂|三弟
```

| 姓名 | 技能 | 排行 |
| :--- | :---: | ---: |
| 刘备 | 哭 | 大哥 |
| 关羽 | 打 | 二哥 |
| 张飞 | 骂 | 三弟 |

> 注：**目前主流markdown工具都有表格插入选项不建议手动录**入

### 九、列表

**无序列表**

语法：

```java
* 列表内容
- 列表内容
+ 列表内容 
注意：* - +根内容之间都要有一个空格
```

效果如下：

* 列表内容
* 列表内容
* 列表内容

**有序列表**

语法：数字加点

```java
1.列表内容
2.列表内容
3.列表内容  

注意：序号根内容之间要有空格
```

效果如下：

1. 列表内容
2. 列表内容
3. 列表内容

