package defpackage;

import com.google.gson.internal.LinkedTreeMap;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f84 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedTreeMap b;

    public /* synthetic */ f84(LinkedTreeMap linkedTreeMap, int i) {
        this.a = i;
        this.b = linkedTreeMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        g84 g84VarA;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                LinkedTreeMap linkedTreeMap = this.b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                g84 g84Var = null;
                if (key != null) {
                    try {
                        g84VarA = linkedTreeMap.a(key, false);
                    } catch (ClassCastException unused) {
                        g84VarA = null;
                    }
                    break;
                } else {
                    g84VarA = null;
                }
                if (g84VarA != null && Objects.equals(g84VarA.h, entry.getValue())) {
                    g84Var = g84VarA;
                }
                return g84Var != null;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new e84(this.b, 0);
            default:
                return new e84(this.b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g84 g84VarA;
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    LinkedTreeMap linkedTreeMap = this.b;
                    g84 g84Var = null;
                    if (key != null) {
                        try {
                            g84VarA = linkedTreeMap.a(key, false);
                        } catch (ClassCastException unused) {
                            g84VarA = null;
                        }
                    } else {
                        g84VarA = null;
                    }
                    if (g84VarA != null && Objects.equals(g84VarA.h, entry.getValue())) {
                        g84Var = g84VarA;
                    }
                    if (g84Var != null) {
                        linkedTreeMap.c(g84Var, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                LinkedTreeMap linkedTreeMap2 = this.b;
                g84 g84VarA2 = null;
                if (obj != null) {
                    try {
                        g84VarA2 = linkedTreeMap2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (g84VarA2 != null) {
                    linkedTreeMap2.c(g84VarA2, true);
                }
                if (g84VarA2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.d;
    }
}
