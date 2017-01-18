package com.ailian.designpattern.adapterpattern;

import com.ailian.designpattern.util.BaseXml;
import com.ailian.designpattern.util.ObjectXml;

/**
 * Created by Ailian on 17/1/17.
 */

public class AdapterTests {

    public static void main(String[] args) {
        BaseXml<SorceOperation> baseXml = new ObjectXml();
        SorceOperation sorceOperation = baseXml.getXmlNodeResult("adapterNode");
        int scores[] = {84, 76, 50, 69, 90, 91, 88, 96}; //定义成绩数组
        int result[];
        int score;
        System.out.println("成绩排序结果：");
        result = sorceOperation.sort(scores);
        //遍历输出成绩
        for (int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = sorceOperation.search(scores, 90);
        if (score != -1) {
            System.out.println("找到成绩90。");
        } else {
            System.out.println("没有找到成绩90。");
        }

        System.out.println("查找成绩92：");
        score = sorceOperation.search(result, 92);
        if (score != -1) {
            System.out.println("找到成绩92。");
        } else {
            System.out.println("没有找到成绩92。");
        }
    }

}
