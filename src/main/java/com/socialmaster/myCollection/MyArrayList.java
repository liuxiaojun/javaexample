package com.socialmaster.myCollection;

/**
 * Created by liuxiaojun on 16/3/5.
 * 模拟实现JDK中提供的StringBuilder功能
 */
public class MyArrayList {

    private Object[] value;
    private int size;

    public int getSize(){
        return size;
    }

    public MyArrayList(){
        value = new Object[16];
    }

    public MyArrayList(int size){
        value = new Object[size];
    }

    public void add(Object obj){
        value[size] = obj;
        size++;
        if (size >= value.length){ // 扩容
            int newCapacity = value.length*2;
            Object[] newList = new Object[newCapacity];

            //新容器吧老容器的拷贝进来
            //System.arraycopy(value, );

            for (int i=0; i<value.length; i++){
                newList[i] = value[i];
            }

            value = newList;
        }
    }

    public Object get(int index){
        if (index<0 || index > size-1){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return value[index];
    }

    public static void main(String[] args){
        MyArrayList list = new MyArrayList();
        list.add("string");
        list.add(123);

        System.out.println(list.get(1));
        System.out.println(list.size);
    }

}
