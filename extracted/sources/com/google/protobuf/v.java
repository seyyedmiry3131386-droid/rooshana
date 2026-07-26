package com.google.protobuf;

import defpackage.mv6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    public abstract w a(Object obj);

    public final boolean b(Object obj, mv6 mv6Var) throws InvalidProtocolBufferException {
        g gVar = (g) mv6Var;
        int i = gVar.b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            gVar.x(0);
            ((w) obj).f(i2 << 3, Long.valueOf(gVar.a.v()));
            return true;
        }
        if (i3 == 1) {
            gVar.x(1);
            ((w) obj).f((i2 << 3) | 1, Long.valueOf(gVar.a.r()));
            return true;
        }
        if (i3 == 2) {
            ((w) obj).f((i2 << 3) | 2, gVar.e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            gVar.x(5);
            ((w) obj).f((i2 << 3) | 5, Integer.valueOf(gVar.a.q()));
            return true;
        }
        w wVar = new w();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        while (gVar.a() != Integer.MAX_VALUE && b(wVar, gVar)) {
        }
        if (i5 != gVar.b) {
            throw InvalidProtocolBufferException.a();
        }
        if (wVar.e) {
            wVar.e = false;
        }
        ((w) obj).f(i4 | 3, wVar);
        return true;
    }

    public abstract void c(Object obj, Object obj2);
}
