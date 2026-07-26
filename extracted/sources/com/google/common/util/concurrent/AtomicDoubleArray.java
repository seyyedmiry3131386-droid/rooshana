package com.google.common.util.concurrent;

import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;
    public transient AtomicLongArray a;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        long[] jArrCopyOf = new long[10];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(objectInputStream.readDouble());
            int i4 = i3 + 1;
            if (i4 > jArrCopyOf.length) {
                int length = jArrCopyOf.length;
                if (i4 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int iHighestOneBit = length + (length >> 1) + 1;
                if (iHighestOneBit < i4) {
                    iHighestOneBit = Integer.highestOneBit(i3) << 1;
                }
                if (iHighestOneBit < 0) {
                    iHighestOneBit = Integer.MAX_VALUE;
                }
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, iHighestOneBit);
            }
            jArrCopyOf[i3] = jDoubleToRawLongBits;
            i2++;
            i3 = i4;
        }
        ImmutableLongArray immutableLongArray = i3 == 0 ? ImmutableLongArray.d : new ImmutableLongArray(jArrCopyOf, 0, i3);
        this.a = new AtomicLongArray(Arrays.copyOfRange(immutableLongArray.a, immutableLongArray.b, immutableLongArray.c));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = this.a.length();
        objectOutputStream.writeInt(length);
        for (int i = 0; i < length; i++) {
            objectOutputStream.writeDouble(Double.longBitsToDouble(this.a.get(i)));
        }
    }

    public final String toString() {
        int length = this.a.length();
        int i = length - 1;
        if (i == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length * 19);
        sb.append('[');
        int i2 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.a.get(i2)));
            if (i2 == i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            i2++;
        }
    }
}
