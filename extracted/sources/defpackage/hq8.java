package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class hq8 {
    public final LinkedList a = new LinkedList();
    public int b = 0;
    public long c = 0;
    public long d = 0;

    static {
        eh5.a("TransferRateCalculator");
    }

    public final void a(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.d;
        int i = j2 == 0 ? 0 : (int) (jCurrentTimeMillis - j2);
        this.d = jCurrentTimeMillis;
        fr0 fr0Var = new fr0();
        fr0Var.a = i;
        fr0Var.b = j;
        LinkedList linkedList = this.a;
        linkedList.add(fr0Var);
        int i2 = fr0Var.a;
        long j3 = fr0Var.b;
        int i3 = this.b + i2;
        this.b = i3;
        this.c += j3;
        if (i3 > 3000) {
            int i4 = i3 - 3000;
            ListIterator listIterator = linkedList.listIterator(0);
            fr0 fr0Var2 = (fr0) listIterator.next();
            while (i4 > 0 && fr0Var2.a <= i4) {
                listIterator.remove();
                int i5 = fr0Var2.a;
                long j4 = fr0Var2.b;
                int i6 = this.b - i5;
                this.b = i6;
                this.c -= j4;
                i4 = i6 - 3000;
                listIterator.hasPrevious();
                fr0Var2 = (fr0) listIterator.next();
            }
            if (i4 > 0) {
                long j5 = i4;
                long jRound = Math.round((j5 * fr0Var2.b) / fr0Var2.a);
                if (jRound >= 0) {
                    int i7 = (jRound > fr0Var2.b ? 1 : (jRound == fr0Var2.b ? 0 : -1));
                }
                fr0Var2.b -= jRound;
                fr0Var2.a = (int) (((long) fr0Var2.a) - j5);
                this.b -= i4;
                this.c -= jRound;
            }
            linkedList.size();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                int i8 = ((fr0) it.next()).a;
            }
        }
    }
}
