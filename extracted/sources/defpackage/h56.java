package defpackage;

import androidx.compose.runtime.i;
import j$.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h56 extends o56 {
    public i56 g;

    @Override // defpackage.o56, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof i) {
            return super.containsKey((i) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof a39) {
            return super.containsValue((a39) obj);
        }
        return false;
    }

    @Override // defpackage.o56
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final i56 build() {
        ps8 ps8Var = this.c;
        i56 i56Var = this.g;
        if (ps8Var != i56Var.a) {
            this.b = new rl3();
            i56Var = new i56(this.c, c());
        }
        this.g = i56Var;
        return i56Var;
    }

    @Override // defpackage.o56, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof i) {
            return (a39) super.get((i) obj);
        }
        return null;
    }

    @Override // defpackage.o56, java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof i) ? obj2 : (a39) Map.CC.$default$getOrDefault(this, (i) obj, (a39) obj2);
    }

    @Override // defpackage.o56, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof i) {
            return (a39) super.remove((i) obj);
        }
        return null;
    }
}
