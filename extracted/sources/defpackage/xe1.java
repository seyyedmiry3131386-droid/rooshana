package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import androidx.media3.common.b;
import com.bumptech.glide.load.DataSource;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.primitives.a;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class xe1 implements z99, lr8, fu4 {
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public static final xe1 d = new xe1(true, (String) null, (Exception) null);
    public boolean a;
    public Object b;

    public xe1(Uri uri, boolean z, boolean z2) {
        this.b = uri;
        this.a = z;
    }

    public static xe1 B(Exception exc, String str) {
        return new xe1(false, str, exc);
    }

    public static void g(int i, ArrayList arrayList) {
        if (a.e(c, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public static xe1 z(String str) {
        return new xe1(false, str, (Exception) null);
    }

    public or9 A(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Object obj = or9.g;
        return new or9(this, str, lValueOf, 0);
    }

    public or9 C(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Object obj = or9.g;
        return new or9(this, str, boolValueOf, 1);
    }

    public or9 D(String str, String str2) {
        Object obj = or9.g;
        return new or9(this, str, str2, 3);
    }

    public void a(int i) {
        vy2.s(!this.a);
        ((SparseBooleanArray) this.b).append(i, true);
    }

    public void b(vd2 vd2Var) {
        for (int i = 0; i < vd2Var.a.size(); i++) {
            a(vd2Var.b(i));
        }
    }

    public void c(int... iArr) {
        for (int i : iArr) {
            a(i);
        }
    }

    @Override // defpackage.fu4
    public void d(ot4 ot4Var, boolean z) {
        qn8 qn8Var = (qn8) this.b;
        if (this.a) {
            return;
        }
        this.a = true;
        qn8Var.q.a();
        qn8Var.r.onPanelClosed(108, ot4Var);
        this.a = false;
    }

    @Override // defpackage.lr8
    public ir8 e(DataSource dataSource) {
        if (dataSource == DataSource.e) {
            return ao5.a;
        }
        if (((pv1) this.b) == null) {
            this.b = new pv1(0, this.a);
        }
        return (pv1) this.b;
    }

    public void f(re8 re8Var) {
        HashMap map = (HashMap) this.b;
        for (String str : re8Var.b()) {
            if (!map.containsKey(str)) {
                map.put(str, re8Var);
            }
        }
    }

    public vd2 h() {
        vy2.s(!this.a);
        this.a = true;
        return new vd2((SparseBooleanArray) this.b);
    }

    public boolean i() {
        return this.a;
    }

    public b j(b bVar) {
        if (!this.a || !((av) this.b).r(bVar)) {
            return bVar;
        }
        rj2 rj2VarA = bVar.a();
        String str = bVar.k;
        rj2VarA.m = tv4.m("application/x-media3-cues");
        rj2VarA.K = ((av) this.b).h(bVar);
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.n);
        sb.append(str != null ? " ".concat(str) : "");
        rj2VarA.j = sb.toString();
        rj2VarA.r = Long.MAX_VALUE;
        return new b(rj2VarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(int r7, java.lang.CharSequence r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L48
            if (r7 < 0) goto L48
            int r0 = r8.length()
            int r0 = r0 - r7
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.b
            hy2 r0 = (defpackage.hy2) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.i()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r7) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r8.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            xe1 r5 = defpackage.vg8.a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.i()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe1.k(int, java.lang.CharSequence):boolean");
    }

    @Override // defpackage.fu4
    public boolean l(ot4 ot4Var) {
        ((qn8) this.b).r.onMenuOpened(108, ot4Var);
        return true;
    }

    public void m() {
        this.a = false;
    }

    public void n(byte b) {
        ((yr3) this.b).writeLong(b);
    }

    public void o(char c2) {
        ((yr3) this.b).a(c2);
    }

    public void p(int i) {
        ((yr3) this.b).writeLong(i);
    }

    public void q(long j) {
        ((yr3) this.b).writeLong(j);
    }

    public void r(String str) {
        js3.p(str, "v");
        ((yr3) this.b).e(str);
    }

    public void s(short s) {
        ((yr3) this.b).writeLong(s);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    @Override // defpackage.z99
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.lf9 t(android.view.View r12, defpackage.lf9 r13, defpackage.aa9 r14) {
        /*
            r11 = this;
            if9 r0 = r13.a
            r1 = 519(0x207, float:7.27E-43)
            no3 r1 = r0.g(r1)
            r2 = 32
            no3 r0 = r0.g(r2)
            java.lang.Object r2 = r11.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r3 = r1.b
            int r4 = r1.c
            int r5 = r1.a
            r2.w = r3
            boolean r3 = defpackage.o37.o(r12)
            int r6 = r12.getPaddingBottom()
            int r7 = r12.getPaddingLeft()
            int r8 = r12.getPaddingRight()
            boolean r9 = r2.o
            if (r9 == 0) goto L37
            int r6 = r13.a()
            r2.v = r6
            int r10 = r14.d
            int r6 = r6 + r10
        L37:
            boolean r10 = r2.p
            if (r10 == 0) goto L43
            if (r3 == 0) goto L40
            int r7 = r14.c
            goto L42
        L40:
            int r7 = r14.a
        L42:
            int r7 = r7 + r5
        L43:
            boolean r10 = r2.q
            if (r10 == 0) goto L50
            if (r3 == 0) goto L4c
            int r14 = r14.a
            goto L4e
        L4c:
            int r14 = r14.c
        L4e:
            int r8 = r14 + r4
        L50:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            boolean r3 = r2.s
            r10 = 1
            if (r3 == 0) goto L63
            int r3 = r14.leftMargin
            if (r3 == r5) goto L63
            r14.leftMargin = r5
            r3 = r10
            goto L64
        L63:
            r3 = 0
        L64:
            boolean r5 = r2.t
            if (r5 == 0) goto L6f
            int r5 = r14.rightMargin
            if (r5 == r4) goto L6f
            r14.rightMargin = r4
            r3 = r10
        L6f:
            boolean r4 = r2.u
            if (r4 == 0) goto L7c
            int r4 = r14.topMargin
            int r1 = r1.b
            if (r4 == r1) goto L7c
            r14.topMargin = r1
            goto L7d
        L7c:
            r10 = r3
        L7d:
            if (r10 == 0) goto L82
            r12.setLayoutParams(r14)
        L82:
            int r14 = r12.getPaddingTop()
            r12.setPadding(r7, r14, r8, r6)
            boolean r12 = r11.a
            if (r12 == 0) goto L91
            int r14 = r0.d
            r2.m = r14
        L91:
            if (r9 != 0) goto L97
            if (r12 == 0) goto L96
            goto L97
        L96:
            return r13
        L97:
            r2.W()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe1.t(android.view.View, lf9, aa9):lf9");
    }

    public void u(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ((yr3) this.b).d(str);
    }

    public synchronized void v(g67 g67Var, boolean z) {
        try {
            if (this.a || z) {
                ((Handler) this.b).obtainMessage(1, g67Var).sendToTarget();
            } else {
                this.a = true;
                g67Var.a();
                this.a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public /* synthetic */ xe1(Object obj) {
        this.b = obj;
        this.a = true;
    }

    public /* synthetic */ xe1(Object obj, boolean z) {
        this.b = obj;
    }

    public xe1(boolean z, String str, Exception exc) {
        this.a = z;
        this.b = exc;
    }

    public xe1(boolean z) {
        this.a = z;
    }

    public xe1(int i) {
        switch (i) {
            case 6:
                this.b = new HashMap(2);
                break;
            case 7:
                this.b = new Handler(Looper.getMainLooper(), new l90(1));
                break;
            default:
                this.b = new SparseBooleanArray();
                break;
        }
    }

    public xe1(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public xe1(hy2 hy2Var, boolean z) {
        this((Object) hy2Var, false);
        this.a = z;
    }

    public void w() {
    }

    public void x() {
    }

    public void y() {
    }
}
