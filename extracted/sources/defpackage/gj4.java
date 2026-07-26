package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class gj4 extends z0 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public gj4(ij4 ij4Var) {
        this.b = ij4Var;
    }

    @Override // defpackage.o
    public final int a() {
        switch (this.a) {
            case 0:
                return ((ij4) this.b).a.groupCount() + 1;
            default:
                return ((List) this.b).size();
        }
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                String strGroup = ((ij4) this.b).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) this.b).get(a.Z(i, this));
        }
    }

    @Override // defpackage.z0, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.z0, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.a) {
            case 1:
                return new s87(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.z0, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.z0, java.util.List
    public ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new s87(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // defpackage.z0, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new s87(this, i);
            default:
                return super.listIterator(i);
        }
    }

    public gj4(List list) {
        js3.p(list, "delegate");
        this.b = list;
    }
}
