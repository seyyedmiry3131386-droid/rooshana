package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class x57 {
    public l37 a;
    public l37 b;
    public LinkedList c;
    public boolean d;

    public static l37 b(int i, Context context, String str) {
        l37 l37Var = new l37(new nv(new File(context.getCacheDir(), str), i), new do3((at2) new cs5()));
        l37Var.j();
        return l37Var;
    }

    public final void a(Object obj) {
        Object obj2;
        l37 l37Var = this.a;
        if (l37Var != null) {
            if (obj == null) {
                throw new IllegalArgumentException("Cannot cancelAll with a null tag");
            }
            synchronized (((HashSet) l37Var.c)) {
                try {
                    for (x47 x47Var : (HashSet) l37Var.c) {
                        if (x47Var.m == obj) {
                            x47Var.b();
                        }
                    }
                } finally {
                }
            }
        }
        for (xv2 xv2Var : this.c) {
            if (obj != null && (obj2 = xv2Var.m) != null && obj.equals(obj2)) {
                xv2Var.b();
            }
        }
    }
}
