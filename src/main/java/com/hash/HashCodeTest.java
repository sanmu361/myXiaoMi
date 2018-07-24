package com.hash;


import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-05-31 16:13
 **/
public class HashCodeTest {
    public static void main(String[] args) {
        HashFunction hf = Hashing.md5();

        HashCode hc = hf.newHasher().putLong(2)
                .putString("123", Charsets.UTF_8)
                .hash();

        HashCode hc1 = hf.newHasher().putLong(2)
                .putString("123", Charsets.UTF_8)
                .hash();


        System.out.println(hc.hashCode());
        System.out.println(hc1.hashCode());
    }
}
