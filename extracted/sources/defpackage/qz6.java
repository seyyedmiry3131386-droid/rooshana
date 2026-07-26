package defpackage;

import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class qz6 {
    public c35 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void a(o oVar) {
        int i = oVar.j;
        if (!oVar.g() && (i & 4) == 0) {
            oVar.b();
        }
    }

    public boolean b(o oVar, List list) {
        return !((nw7) this).g || oVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.recyclerview.widget.o r11) {
        /*
            r10 = this;
            c35 r0 = r10.a
            if (r0 == 0) goto La4
            java.lang.Object r0 = r0.b
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1 = 1
            r11.o(r1)
            android.view.View r2 = r11.a
            androidx.recyclerview.widget.o r3 = r11.h
            r4 = 0
            if (r3 == 0) goto L19
            androidx.recyclerview.widget.o r3 = r11.i
            if (r3 != 0) goto L19
            r11.h = r4
        L19:
            r11.i = r4
            int r3 = r11.j
            r3 = r3 & 16
            if (r3 == 0) goto L23
            goto La4
        L23:
            androidx.recyclerview.widget.l r3 = r0.c
            r0.o0()
            jp8 r4 = r0.f
            java.lang.Object r5 = r4.d
            nq0 r5 = (defpackage.nq0) r5
            java.lang.Object r6 = r4.c
            hl5 r6 = (defpackage.hl5) r6
            int r7 = r4.b
            r8 = 0
            if (r7 != r1) goto L47
            java.lang.Object r1 = r4.f
            android.view.View r1 = (android.view.View) r1
            if (r1 != r2) goto L3f
        L3d:
            r1 = r8
            goto L72
        L3f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r11.<init>(r0)
            throw r11
        L47:
            r9 = 2
            if (r7 == r9) goto L9c
            r4.b = r9     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r6.b     // Catch: java.lang.Throwable -> L5d
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7     // Catch: java.lang.Throwable -> L5d
            int r7 = r7.indexOfChild(r2)     // Catch: java.lang.Throwable -> L5d
            r9 = -1
            if (r7 != r9) goto L5f
            r4.t(r2)     // Catch: java.lang.Throwable -> L5d
        L5a:
            r4.b = r8
            goto L72
        L5d:
            r11 = move-exception
            goto L99
        L5f:
            boolean r9 = r5.w(r7)     // Catch: java.lang.Throwable -> L5d
            if (r9 == 0) goto L6f
            r5.z(r7)     // Catch: java.lang.Throwable -> L5d
            r4.t(r2)     // Catch: java.lang.Throwable -> L5d
            r6.p(r7)     // Catch: java.lang.Throwable -> L5d
            goto L5a
        L6f:
            r4.b = r8
            goto L3d
        L72:
            if (r1 == 0) goto L88
            androidx.recyclerview.widget.o r4 = androidx.recyclerview.widget.RecyclerView.O(r2)
            r3.m(r4)
            r3.j(r4)
            boolean r3 = androidx.recyclerview.widget.RecyclerView.a1
            if (r3 == 0) goto L88
            j$.util.Objects.toString(r2)
            r0.toString()
        L88:
            r3 = r1 ^ 1
            r0.q0(r3)
            if (r1 != 0) goto La4
            boolean r11 = r11.k()
            if (r11 == 0) goto La4
            r0.removeDetachedView(r2, r8)
            return
        L99:
            r4.b = r8
            throw r11
        L9c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r11.<init>(r0)
            throw r11
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz6.c(androidx.recyclerview.widget.o):void");
    }

    public final void d() {
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            throw rm7.l(0, arrayList);
        }
        arrayList.clear();
    }

    public abstract void e(o oVar);

    public abstract void f();

    public abstract boolean g();

    public abstract void h();
}
