package com.example.demo;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * date: 2018/5/21
 * user:xiongyongjie
 * description:
 **/
public class TestCollection {
    public  static void  main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>();
        List<String> list = new ArrayList<String>(5);
        List<String> alist = new LinkedList<String>();
        List<String>  vec = new Vector<String>();
        List<String>  cpy = new CopyOnWriteArrayList<String>();
    }
}
