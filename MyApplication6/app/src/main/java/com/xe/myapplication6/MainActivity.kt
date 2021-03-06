package com.xe.myapplication6

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
        test2()
        test3()
        test4()
        test5()
        test6()
        test7()
        test8()
        test9()
        test10()
        test11()
        test12()
    }

    /**
     * 测试异常
     */
    fun test12() {
        var s: String? = null
        try {

            /**
             * 这里的s是null值，会产生空指针异常
             */
            var b:Boolean = s.equals("123")
        } catch (e: Exception) {
           println("执行了catch代码块，因为s为null值")
        }finally {
            println("不管s是不是null值都会执行了finally代码块")
        }


    }


    /**
     * 测试字符串和数字之间的转换
     */
    fun test11() {
        var s:String = "123"

        /**
         * 这里可以转换成为数字，因为s的内容都是数值
         */
        var num:Int = s.toInt()

        var s2:String = "12s"

        /**
         * 会报错；
         * 这里不可以转换成为数字，因为s2的内容不都是数值，含有s字符
         */
//        var num2:Int = s2.toInt()

        var num3:Int = 4
        var s3:String = num3.toString()

        println("num = " + num)
        println("s3 = " + s3)
    }

    /**
     * /**
     * 定义有2个参数返回值为1的函数 function(x:Int,y:Int)
    */
     */
    fun function(x:Int,y:Int):Int = 1
//
    /**
     * 测试函数式表达式
     */
    fun test10() {

        /**
         * 这里可以理解成 定义函数名为 i,
         * 2个 Int 类型的参数 x 和 y，
         * 返回值为 Int 类型且返回值为 x*y 的函数
         */
        var i = {x:Int,y:Int -> x*y}
        var result = i(3,5)
        println(result)

        /**
         * 这里和 定义 i 函数也是一样的理解
         */
        var j:(Int,Int)->Int = {x,y ->x*y}
        var result2 = j(3,5)
        println(result2)
    }


    /**
     * 测试Map
     */
    fun test9() {
        val map = mapOf("Android" to 56, "Kotlin" to 78, "C" to 74)
        println("mapOf() 的实际类型是：${map.javaClass}")

        val mutableMap = mutableMapOf("Android" to 56, "Kotlin" to 78, "C" to 74)
        println("mutableMapOf() 的实际类型是：${mutableMap.javaClass}")

        val hashMap = hashMapOf("Android" to 56, "Kotlin" to 78, "C" to 74)
        println("hashMapOf() 的实际类型是：${hashMap.javaClass}")

        val linkedMap = linkedMapOf("Android" to 56, "Kotlin" to 78, "C" to 74)
        println("linkedMapOf() 的实际类型是：${linkedMap.javaClass}")

        val treeMap = sortedMapOf("Android" to 56, "Kotlin" to 78, "C" to 74)
        println("sortedMapOf() 的实际类型是：${treeMap.javaClass}")

        var treeMap2 = TreeMap<String, Int>()
        treeMap2["Android"] = 56
        treeMap2["Kotlin"] = 78
        treeMap2["C"] = 74
        println("TreeMap<String,Int>() 的实际类型是：${treeMap2.javaClass}")


        /**
         * for-in 遍历，遍历的是 Entry
         */
        for (en in map.entries) {
            println("${en.key}: ${en.value}")
        }

        /**
         * 遍历 key，再通过 key 获取 value
         */
        for (key in map.keys) {
            println("$key: ${map[key]}")
        }

        /**
         * for-in 遍历，key 和 value 同时遍历
         */
        for ((key, value) in map) {
            println("$key: $value")
        }

        /**
         * forEach Lambda 表达式遍历
         */
        map.forEach {
            println("${it.key}: ${it.value}")
        }
    }

    /**
     * 测试 List
     */
    fun test8() {
        /**
         * 构造一个没有数据的List
         */
        var list: List<String> = listOf()

        /**
         * 构造一个只有一个数据的List
         */
        var list2: List<String> = listOf("A")

        /**
         * 构造多个数据的List
         */
        var list3: List<String> = listOf("A", "B", "C")

        println("list = " + list)
        println("list2 = " + list2)
        println("list3 = " + list3)
    }

    fun test7() {

        /**
         * 定义一个Int类型的数组
         */
        var ia: IntArray = intArrayOf(1, 2, 3, 4, 5)

        /**
         * 定义一个String类型的集合
         */
        var list: List<String> = arrayListOf("A", "B", "C")

        /**
         * 用for循环遍历Int类型的数组
         */
        for (i in ia) {
            println("i = " + i)
        }

        /**
         * 用for循环遍历一个集合
         */
        for (ls in list) {
            println("list item " + ls)
        }
    }

    /**
     * 测试range
     */
    fun test6() {
        /**
         * 区间[1,10)，不包含10在里面
         */
        var ia: IntRange = 1 until 10

        /**
         * 区间[1,10],包含1 和 10
         */
        var ia2: IntRange = 1..10


        /**
         * 倒叙区间[10,1]，包含10 和 1
         */
        val intRangeReverse = 10 downTo 1

        /**
         * 区间步长取数，从区间[1,10]取数，从1开始，每隔 3个数就取出一个，最终这个数不在
         * 区间内就算取完最终区间里存放的数为 1,4,7,10
         */
        var ia3 = 1..10 step 3

        /**
         * 将 [1,10] 这个区间的数进行倒序，即[10,1]
         */
        var ia4 = ia2.reversed()

        /**
         * 获取区间[1,10]中的数量
         */
        var num: Int = ia2.count();

        println("ia3的数量为" + ia3.count())
        println("ia = " + ia)
        println("intRangeReverse = " + intRangeReverse)
        println("ia2 = " + ia2)
        println("ia4 = " + ia4)

    }

    /**
     * when 表达式测试
     */
    fun test5() {
        var num: Int = 3
        when (num) {

        /**
         * 这里如果满足3，就执行3的语句，执行完之后就跳出循环，相等于
         * Java中的 case 3: break
         */
            3 -> println("当前数字为" + num)
            2 -> println("当前数字为" + num)
            1 -> println("当前数字为" + num)

        /**
         * 这里面的else等同于Java的switch/case中的default
         */
            else -> println("当前数字不为1 、2、3")
        }

        var appCompatActivity: AppCompatActivity = MainActivity()
        when (appCompatActivity) {
            is MainActivity -> println("当前对象是MainActivity类型的")
            is Test -> println("当前对象是Tets类型的")
            else -> println("当前对象是其他类型的")
        }

        var s2: String = "你好"
        var i2: Int = 3
        when {
            s2 == "哈哈" -> println("s2 的内容为 哈哈")
            i2 == 3 -> println("i2 的值为 3")
            else -> println("其他输出")
        }

        var num2: Int = 3

        /**
         * 1、when 表达式中的每一条执行语句的返回值类型必须一致，即 num2 和 0 是Int类型；
         * 2、接收返回值的变量类型必须与when 中执行语句返回值的类型一致，即num2 和 result类型一致
         */
        var result: Int = when (num2) {
            3 -> {
                println("当前的返回值为3")
                num2
            }
            else -> {
                println("当前的返回值为0")
                0
            }
        }

    }


    /**
     * 空值测试
     */
    fun test4() {

        /**
         * 在类型后面加个? ，表示允许该类型变量为null
         */
        var s: String? = null
        var s2: String = "你好"

        /**
         * 这里 s3的值为 你好null
         */
        var s3: String = s2 + s

        /**
         *判断s是否为null，如果不为null，才执行s.equals(s2)
         */
        var b: Boolean = s.equals(s2)
    }

    /**
     * 字符串模板和字符串对比测试
     */
    fun test3() {
        var i: Int = 4
        var s: String = "公园"

        /**
         * i 求值为4并把4合并到字符串中
         */
        var s2: String = "今天我赚了${i}块钱"

        /**
         * s 求出为String类型值“公园”并把“公园”合并到字符串中
         */
        var s3: String = "如果明天不下雨，我们就去${s}玩"
        println(s2)
        println(s3)

        var s4: String = "hello World"
        var s5: String = "hello world"

        /**
         * b 为 false
         */
        var b: Boolean = s4 == s5

        /**
         * b2 为false
         */
        var b2: Boolean = s4.equals(s5)

        /**
         * b3 为true，参数为true，表示不用区分字母的大小写
         */
        var b3: Boolean = s4.equals(s5, true)
    }

    /**
     * 测试函数
     */
    fun test2() {
        function1()
        function2("你好", 2)
        var result: Int = function3()
        var result2: Int = function4("你好", 3)
    }

    /**
     * 这是一个无参数无返回值的函数
     */
    fun function1() {
        println("这是一个无参数无返回值的函数")
    }

    /**
     * 这是一个有2个参数无返回值的函数；
     * 2个参数分别为String和Int类型
     */
    fun function2(s: String, i: Int) {
        println("这是一个有2个参数无返回值的函数")
    }

    /**
     * 这是一个无参数有返回值的函数;
     * 返回值类型为Int型
     */
    fun function3(): Int {
        println("这是一个无参数有返回值的函数")
        return 1
    }

    /**
     * 这是一个有2个参数有返回值的函数；
     * 2个参数分别为String和Int类型；
     * 返回值为Int型
     */
    fun function4(s: String, i: Int): Int {
        println("这是一个有2个参数有返回值的函数")
        return 1
    }

    /**
     * 测试 变量声明和打印
     */
    fun test() {
        var b: Byte = 123
        var s: Short = 32766
        var i: Int = 2
        var l: Long = 46L
        var f: Float = 47F
        var d: Double = 90.478326548359783
        var s2: String = "你好"
        var b2: Boolean = false

        /**
         * 在控制台上输出 你好，不换行
         */
        print("你好")

        /**
         * 在控制台上输出 你好，换行
         */
        println("你好")

        /**
         * 编译器推断为 Int型
         */
        var i2 = 2

        /**
         * 编译器推断为 Long 型
         */
        var l2 = 46L

        /**
         * 编译器推断为 Float 型
         */
        var f2 = 47F

        /**
         * 编译器推断为 Double 型
         */
        var d2 = 90.478326548359783

        /**
         * 编译器推断为 String 型
         */
        var s4 = "你好"

        /**
         * 编译器推断为 Boolean 型
         */
        var b3 = false
    }
}
