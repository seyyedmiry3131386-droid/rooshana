package defpackage;

import com.google.common.collect.HashBiMap;

/* JADX INFO: loaded from: classes.dex */
public final class kx2 extends h1 {
    public final HashBiMap a;
    public final Object b;
    public int c;

    public kx2(HashBiMap hashBiMap, int i) {
        this.a = hashBiMap;
        this.b = hashBiMap.b[i];
        this.c = i;
    }

    public final void b() {
        int i = this.c;
        Object obj = this.b;
        HashBiMap hashBiMap = this.a;
        if (i == -1 || i > hashBiMap.c || !s7.l(obj, hashBiMap.b[i])) {
            hashBiMap.getClass();
            this.c = hashBiMap.h(y97.b0(obj), obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        b();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.a[i];
    }

    @Override // defpackage.h1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        b();
        int i = this.c;
        HashBiMap hashBiMap = this.a;
        if (i != -1) {
            Object obj2 = hashBiMap.a[i];
            if (s7.l(obj2, obj)) {
                return obj;
            }
            hashBiMap.m(this.c, obj);
            return obj2;
        }
        hashBiMap.getClass();
        Object obj3 = this.b;
        int iB0 = y97.b0(obj3);
        int iH = hashBiMap.h(iB0, obj3);
        if (iH != -1) {
            if (s7.l(hashBiMap.a[iH], obj)) {
                return null;
            }
            hashBiMap.m(iH, obj);
            return null;
        }
        int i2 = hashBiMap.j;
        int iB02 = y97.b0(obj);
        wn5.g(obj, "Key already present: %s", hashBiMap.g(iB02, obj) == -1);
        hashBiMap.f(hashBiMap.c + 1);
        Object[] objArr = hashBiMap.a;
        int i3 = hashBiMap.c;
        objArr[i3] = obj;
        hashBiMap.b[i3] = obj3;
        hashBiMap.i(i3, iB02);
        hashBiMap.j(hashBiMap.c, iB0);
        int i4 = i2 == -2 ? hashBiMap.i : hashBiMap.l[i2];
        hashBiMap.n(i2, hashBiMap.c);
        hashBiMap.n(hashBiMap.c, i4);
        hashBiMap.c++;
        hashBiMap.d++;
        return null;
    }
}
