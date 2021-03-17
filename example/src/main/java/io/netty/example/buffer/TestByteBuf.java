package io.netty.example.buffer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.buffer.UnpooledDirectByteBuf;

public class TestByteBuf {

    public static void main(String[] args) {

        int val = 2;
        System.out.println(Integer.toBinaryString(-val));
        System.out.println(val & -val);

        ByteBuf buf = new UnpooledDirectByteBuf(UnpooledByteBufAllocator.DEFAULT, 100, 1024);
    }
}
