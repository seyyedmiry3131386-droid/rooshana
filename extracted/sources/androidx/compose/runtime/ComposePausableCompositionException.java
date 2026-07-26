package androidx.compose.runtime;

import defpackage.br9;
import defpackage.g88;
import defpackage.io7;
import defpackage.js3;
import defpackage.mb5;
import defpackage.o27;
import defpackage.xa5;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
final class ComposePausableCompositionException extends RuntimeException {
    public final androidx.collection.c a;
    public final mb5 b;
    public final xa5 c;
    public final int d;

    public ComposePausableCompositionException(androidx.collection.c cVar, mb5 mb5Var, xa5 xa5Var, int i, Exception exc) {
        super(exc);
        this.a = cVar;
        this.b = mb5Var;
        this.c = xa5Var;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listB;
        List listP0;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.d);
        sb.append(":\n            |");
        io7 io7VarH = o27.h(new ComposePausableCompositionException$operationsSequence$1(this, null));
        if (io7VarH.hasNext()) {
            Object next = io7VarH.next();
            if (io7VarH.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (io7VarH.hasNext()) {
                    arrayList.add(io7VarH.next());
                }
                listB = arrayList;
            } else {
                listB = br9.B(next);
            }
        } else {
            listB = EmptyList.a;
        }
        js3.p(listB, "<this>");
        int size = listB.size();
        if (50 >= size) {
            listP0 = kotlin.collections.a.P0(listB);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listB instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(listB.get(i));
                }
            } else {
                ListIterator listIterator = listB.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listP0 = arrayList2;
        }
        sb.append(kotlin.collections.a.t0(listP0, "\n", null, null, null, 62));
        sb.append("\n            ");
        return g88.P(sb.toString());
    }
}
