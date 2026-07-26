package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p51 implements Iterable {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public Set c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int a(sw1 sw1Var) {
        int iIntValue;
        synchronized (this.a) {
            try {
                iIntValue = this.b.containsKey(sw1Var) ? ((Integer) this.b.get(sw1Var)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public final void c(sw1 sw1Var) {
        synchronized (this.a) {
            try {
                Integer num = (Integer) this.b.get(sw1Var);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(sw1Var);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.b.remove(sw1Var);
                    HashSet hashSet = new HashSet(this.c);
                    hashSet.remove(sw1Var);
                    this.c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.b.put(sw1Var, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
