package com.google.android.gms.internal.measurement;

import defpackage.bl4;
import defpackage.et9;
import defpackage.gt9;
import defpackage.it9;
import defpackage.js9;
import defpackage.qs9;
import defpackage.rs9;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = qs9.a;
        iterable.getClass();
        if (iterable instanceof rs9) {
            List listZza = ((rs9) iterable).zza();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof zzlh) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                zzlh.j(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof et9) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof gt9) {
                gt9 gt9Var = (gt9) list;
                int i = gt9Var.c + size;
                int length = gt9Var.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        gt9Var.b = Arrays.copyOf(gt9Var.b, length);
                    } else {
                        gt9Var.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    js9.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                js9.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            q0 q0Var = (q0) this;
            int iK = q0Var.k();
            byte[] bArr = new byte[iK];
            p0 p0Var = new p0(bArr, iK);
            q0Var.d(p0Var);
            if (iK - p0Var.i == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(bl4.z(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public abstract int b(it9 it9Var);
}
