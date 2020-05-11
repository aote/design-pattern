package com.aote.source;

/**
 * @author: Weicf
 * @date: 2020-05-09 17:07
 * @description: 泛型测试
 */
public class Generic<K,V,A,B> {

    K k;
    V v;
    A a;
    B b;

    public Generic() {
    }

    public Generic(A a) {
        this.a = a;
    }

    public Generic(K k, V v, A a, B b) {
        this.k = k;
        this.v = v;
        this.a = a;
        this.b = b;
    }

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void setV(V v) {
        this.v = v;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void setB(B b) {
        this.b = b;
    }
}
