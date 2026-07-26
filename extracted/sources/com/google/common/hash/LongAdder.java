package com.google.common.hash;

import defpackage.be4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class LongAdder extends Striped64 implements Serializable, be4 {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 0;
        this.a = null;
        this.b = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b3, code lost:
    
        if (r13.a != r6) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b5, code lost:
    
        r5 = new com.google.common.hash.d[r7 << 1];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        if (r8 >= r7) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bc, code lost:
    
        r5[r8] = r6[r8];
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c5, code lost:
    
        r13.a = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    @Override // defpackage.be4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void add(long r14) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.LongAdder.add(long):void");
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return e();
    }

    public final long e() {
        long j = this.b;
        d[] dVarArr = this.a;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    j += dVar.a;
                }
            }
        }
        return j;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return e();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) e();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return e();
    }

    public final String toString() {
        return Long.toString(e());
    }
}
