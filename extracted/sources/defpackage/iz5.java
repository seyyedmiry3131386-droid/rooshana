package defpackage;

import androidx.paging.LoadType;
import androidx.paging.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class iz5 implements g96 {
    public static final iz5 e;
    public final ArrayList a;
    public int b;
    public int c;
    public int d;

    static {
        i iVar = i.g;
        js3.p(iVar, "insertEvent");
        e = new iz5(iVar.c, iVar.d, iVar.b);
    }

    public iz5(int i, int i2, List list) {
        js3.p(list, "pages");
        this.a = a.Q0(list);
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((mq8) it.next()).b.size();
        }
        this.b = size;
        this.c = i;
        this.d = i2;
    }

    public final ha9 a(int i) {
        ArrayList arrayList;
        int iIntValue = i - this.c;
        int i2 = 0;
        while (true) {
            arrayList = this.a;
            if (iIntValue < ((mq8) arrayList.get(i2)).b.size() || i2 >= br9.y(arrayList)) {
                break;
            }
            iIntValue -= ((mq8) arrayList.get(i2)).b.size();
            i2++;
        }
        mq8 mq8Var = (mq8) arrayList.get(i2);
        int i3 = i - this.c;
        int iD = ((d() - i) - this.d) - 1;
        Integer numQ0 = ew.Q0(((mq8) a.o0(arrayList)).a);
        js3.m(numQ0);
        int iIntValue2 = numQ0.intValue();
        int iC = c();
        int i4 = mq8Var.c;
        List list = mq8Var.d;
        if (list != null && br9.x(list).a(iIntValue)) {
            iIntValue = ((Number) list.get(iIntValue)).intValue();
        }
        return new ha9(i4, iIntValue, i3, iD, iIntValue2, iC);
    }

    public final Object b(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((mq8) arrayList.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((mq8) arrayList.get(i2)).b.get(i);
    }

    public final int c() {
        Integer numValueOf;
        int[] iArr = ((mq8) a.u0(this.a)).a;
        js3.p(iArr, "<this>");
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        js3.m(numValueOf);
        return numValueOf.intValue();
    }

    public final int d() {
        return this.c + this.b + this.d;
    }

    public final hs9 e(az5 az5Var) {
        js3.p(az5Var, "pageEvent");
        boolean z = az5Var instanceof i;
        ArrayList arrayList = this.a;
        if (!z) {
            if (!(az5Var instanceof yy5)) {
                throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            uq3 uq3Var = new uq3(0, 0, 1);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                mq8 mq8Var = (mq8) it.next();
                int[] iArr = mq8Var.a;
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (uq3Var.a(iArr[i])) {
                        size += mq8Var.b.size();
                        it.remove();
                        break;
                    }
                    i++;
                }
            }
            int i2 = this.b - size;
            this.b = i2;
            LoadType loadType = LoadType.b;
            int i3 = this.d;
            this.d = 0;
            return new d06(this.c + i2, size, 0, i3);
        }
        i iVar = (i) az5Var;
        List list = iVar.b;
        Iterator it2 = list.iterator();
        int size2 = 0;
        while (it2.hasNext()) {
            size2 += ((mq8) it2.next()).b.size();
        }
        int iOrdinal = iVar.a.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (iOrdinal == 1) {
            int i4 = this.c;
            arrayList.addAll(0, list);
            this.b += size2;
            this.c = iVar.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                a.b0(((mq8) it3.next()).b, arrayList2);
            }
            return new f06(arrayList2, this.c, i4);
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = this.d;
        int i6 = this.b;
        arrayList.addAll(arrayList.size(), list);
        this.b += size2;
        this.d = iVar.d;
        int i7 = this.c + i6;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            a.b0(((mq8) it4.next()).b, arrayList3);
        }
        return new c06(i7, this.d, i5, arrayList3);
    }

    public final String toString() {
        int i = this.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(b(i2));
        }
        String strT0 = a.t0(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        sb.append(this.c);
        sb.append(" placeholders), ");
        sb.append(strT0);
        sb.append(", (");
        return dw1.k(this.d, " placeholders)]", sb);
    }
}
