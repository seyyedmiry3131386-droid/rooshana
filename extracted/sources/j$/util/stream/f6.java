package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f6 extends x5 {
    public ArrayList d;

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void end() {
        List list = this.d;
        Comparator comparator = this.b;
        if (list instanceof j$.util.List) {
            ((j$.util.List) list).sort(comparator);
        } else {
            List.CC.$default$sort(list, comparator);
        }
        long size = this.d.size();
        j5 j5Var = this.a;
        j5Var.c(size);
        if (this.c) {
            ArrayList arrayList = this.d;
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                if (j5Var.e()) {
                    break;
                } else {
                    j5Var.n(obj);
                }
            }
        } else {
            ArrayList arrayList2 = this.d;
            Objects.requireNonNull(j5Var);
            Collection.EL.a(arrayList2, new j$.util.p(7, j5Var));
        }
        j5Var.end();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.d.add(obj);
    }
}
