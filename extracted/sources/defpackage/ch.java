package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ch implements n16 {
    public final String a;
    public final gj8 b;
    public final List c;
    public final List d;
    public final oh2 e;
    public final qj1 f;
    public final li g;
    public final CharSequence h;
    public final c14 i;
    public sk6 j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07d5  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ch(java.lang.String r41, defpackage.gj8 r42, java.util.List r43, java.util.List r44, defpackage.oh2 r45, defpackage.qj1 r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch.<init>(java.lang.String, gj8, java.util.List, java.util.List, oh2, qj1):void");
    }

    @Override // defpackage.n16
    public final boolean b() {
        sk6 sk6Var = this.j;
        if (sk6Var != null ? sk6Var.z() : false) {
            return true;
        }
        if (!this.k && is3.b(this.b)) {
            qm5 qm5Var = c02.a;
            qm5 qm5Var2 = c02.a;
            u48 u48VarO = (u48) qm5Var2.b;
            if (u48VarO == null) {
                if (zz1.d()) {
                    u48VarO = qm5Var2.o();
                    qm5Var2.b = u48VarO;
                } else {
                    u48VarO = wu8.b;
                }
            }
            if (((Boolean) u48VarO.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n16
    public final float c() {
        float f;
        c14 c14Var = this.i;
        float f2 = c14Var.e;
        TextPaint textPaint = c14Var.b;
        if (!Float.isNaN(f2)) {
            return c14Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c14Var.a;
        lineInstance.setText(new vp0(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new mh(13));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.b).intValue() - ((Number) pair.a).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Pair pair2 = (Pair) it.next();
            float desiredWidth = Layout.getDesiredWidth(c14Var.b(), ((Number) pair2.a).intValue(), ((Number) pair2.b).intValue(), textPaint);
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c14Var.b(), ((Number) pair3.a).intValue(), ((Number) pair3.b).intValue(), textPaint));
            }
            f = desiredWidth;
        }
        c14Var.e = f;
        return f;
    }

    @Override // defpackage.n16
    public final float d() {
        return this.i.c();
    }
}
