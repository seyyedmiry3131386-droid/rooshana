package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class jg7 extends uz6 {
    public zz0 a;
    public final ViewPager2 b;
    public final q89 c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final ig7 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public jg7(ViewPager2 viewPager2) {
        this.b = viewPager2;
        q89 q89Var = viewPager2.j;
        this.c = q89Var;
        this.d = (LinearLayoutManager) q89Var.getLayoutManager();
        this.g = new ig7();
        e();
    }

    @Override // defpackage.uz6
    public final void a(RecyclerView recyclerView, int i) {
        zz0 zz0Var;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            f(false);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                d(2);
                this.j = true;
                return;
            }
            return;
        }
        ig7 ig7Var = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            g();
            if (!this.k) {
                int i3 = ig7Var.b;
                if (i3 != -1 && (zz0Var = this.a) != null) {
                    zz0Var.b(i3, 0.0f, 0);
                }
            } else if (ig7Var.c == 0) {
                int i4 = this.h;
                int i5 = ig7Var.b;
                if (i4 != i5) {
                    c(i5);
                }
            }
            d(0);
            e();
        }
        if (this.e == 2 && i == 0 && this.l) {
            g();
            if (ig7Var.c == 0) {
                int i6 = this.i;
                int i7 = ig7Var.b;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    c(i7);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // defpackage.uz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.k = r6
            r5.g()
            boolean r0 = r5.j
            r1 = -1
            ig7 r2 = r5.g
            r3 = 0
            if (r0 == 0) goto L3e
            r5.j = r3
            if (r8 > 0) goto L2a
            if (r8 != 0) goto L32
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.b
            n89 r8 = r8.g
            androidx.recyclerview.widget.RecyclerView r8 = r8.b
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L27
            r8 = r6
            goto L28
        L27:
            r8 = r3
        L28:
            if (r7 != r8) goto L32
        L2a:
            int r7 = r2.c
            if (r7 == 0) goto L32
            int r7 = r2.b
            int r7 = r7 + r6
            goto L34
        L32:
            int r7 = r2.b
        L34:
            r5.i = r7
            int r8 = r5.h
            if (r8 == r7) goto L4a
            r5.c(r7)
            goto L4a
        L3e:
            int r7 = r5.e
            if (r7 != 0) goto L4a
            int r7 = r2.b
            if (r7 != r1) goto L47
            r7 = r3
        L47:
            r5.c(r7)
        L4a:
            int r7 = r2.b
            if (r7 != r1) goto L4f
            r7 = r3
        L4f:
            float r8 = r2.a
            int r0 = r2.c
            zz0 r4 = r5.a
            if (r4 == 0) goto L5a
            r4.b(r7, r8, r0)
        L5a:
            int r7 = r2.b
            int r8 = r5.i
            if (r7 == r8) goto L62
            if (r8 != r1) goto L70
        L62:
            int r7 = r2.c
            if (r7 != 0) goto L70
            int r7 = r5.f
            if (r7 == r6) goto L70
            r5.d(r3)
            r5.e()
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg7.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i) {
        zz0 zz0Var = this.a;
        if (zz0Var != null) {
            zz0Var.c(i);
        }
    }

    public final void d(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        zz0 zz0Var = this.a;
        if (zz0Var != null) {
            zz0Var.a(i);
        }
    }

    public final void e() {
        this.e = 0;
        this.f = 0;
        ig7 ig7Var = this.g;
        ig7Var.b = -1;
        ig7Var.a = 0.0f;
        ig7Var.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    public final void f(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int i = this.i;
        if (i != -1) {
            this.h = i;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = this.d.R0();
        }
        d(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg7.g():void");
    }
}
