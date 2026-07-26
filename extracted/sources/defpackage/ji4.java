package defpackage;

import com.google.common.collect.l1;
import com.google.common.collect.s1;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ji4 extends ii4 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractMap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji4(AbstractMap abstractMap, int i) {
        super(0);
        this.b = i;
        this.c = abstractMap;
    }

    @Override // defpackage.ii4
    public final Map d() {
        switch (this.b) {
            case 0:
                return (s1) this.c;
            default:
                return (ha5) this.c;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.b) {
            case 0:
                return ((s1) this.c).b();
            default:
                Set setKeySet = ((ha5) this.c).d.keySet();
                return new l1(setKeySet.iterator(), new qs3(18, this));
        }
    }

    @Override // defpackage.ii4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.b) {
            case 1:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                ha5 ha5Var = (ha5) this.c;
                ha5Var.d.keySet().remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }
}
