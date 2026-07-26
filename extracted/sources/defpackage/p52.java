package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.e;
import io.sentry.instrumentation.file.a;
import ir.mservices.market.views.TryAgainView;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p52 implements q94, co4, ro4, n31, d4, ms5, a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p52(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.ro4
    public void a(go4 go4Var) {
        switch (this.a) {
            case 3:
                gn4 gn4Var = go4Var.a;
                ImmutableList immutableList = (ImmutableList) this.c;
                if (go4Var.E()) {
                    ImmutableList immutableList2 = go4Var.t;
                    ImmutableList immutableList3 = go4Var.u;
                    go4Var.s = ImmutableList.n(immutableList);
                    ImmutableList immutableListF0 = go4.F0(go4Var.y, go4Var.v, go4Var.I, immutableList, go4Var.r);
                    go4Var.t = immutableListF0;
                    ImmutableList immutableList4 = go4Var.r;
                    go4Var.u = go4.E0(go4Var.y, go4Var.v, go4Var.I, immutableListF0, immutableList4);
                    boolean zEquals = go4Var.t.equals(immutableList2);
                    go4Var.u.equals(immutableList3);
                    gn4Var.getClass();
                    vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
                    en4 en4Var = gn4Var.d;
                    ij3 ij3VarS = en4Var.s(gn4Var, go4Var.u);
                    if (!zEquals) {
                        en4Var.u();
                    }
                    go4Var.I0(this.b, ij3VarS);
                    break;
                }
                break;
            case 4:
                gn4 gn4Var2 = go4Var.a;
                List list = (List) this.c;
                if (go4Var.E()) {
                    ImmutableList immutableList5 = go4Var.t;
                    ImmutableList immutableList6 = go4Var.u;
                    go4Var.r = ImmutableList.n(list);
                    ImmutableList immutableListF02 = go4.F0(go4Var.y, go4Var.v, go4Var.I, go4Var.s, list);
                    go4Var.t = immutableListF02;
                    go4Var.u = go4.E0(go4Var.y, go4Var.v, go4Var.I, immutableListF02, list);
                    boolean zEquals2 = go4Var.t.equals(immutableList5);
                    go4Var.u.equals(immutableList6);
                    gn4Var2.getClass();
                    vy2.s(Looper.myLooper() == gn4Var2.e.getLooper());
                    en4 en4Var2 = gn4Var2.d;
                    ij3 ij3VarS2 = en4Var2.s(gn4Var2, go4Var.u);
                    if (!zEquals2) {
                        en4Var2.u();
                    }
                    go4Var.I0(this.b, ij3VarS2);
                    break;
                }
                break;
            default:
                wp7 wp7Var = (wp7) this.c;
                gn4 gn4Var3 = go4Var.a;
                if (go4Var.E()) {
                    gn4Var3.getClass();
                    vy2.s(Looper.myLooper() == gn4Var3.e.getLooper());
                    ij3 ij3VarW = gn4Var3.d.w(wp7Var);
                    ij3VarW.e(new cy0(go4Var, ij3VarW, this.b, 5), e.a());
                    break;
                }
                break;
        }
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        q54 q54Var;
        q54 q54Var2;
        hq4 hq4Var = (hq4) this.c;
        int i = this.b;
        try {
            q54Var2 = (q54) ((n94) obj).get();
            vy2.o(q54Var2, "LibraryResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            wn5.l0("MediaSessionStub", "Library operation failed", e);
            String str = q54.g;
            yp7 yp7Var = new yp7("no error message provided", -1, Bundle.EMPTY);
            q54Var = new q54(yp7Var.a, SystemClock.elapsedRealtime(), null, yp7Var, null, 4);
            q54Var2 = q54Var;
        } catch (CancellationException e2) {
            wn5.l0("MediaSessionStub", "Library operation cancelled", e2);
            String str2 = q54.g;
            yp7 yp7Var2 = new yp7("no error message provided", 1, Bundle.EMPTY);
            q54Var = new q54(yp7Var2.a, SystemClock.elapsedRealtime(), null, yp7Var2, null, 4);
            q54Var2 = q54Var;
        } catch (ExecutionException e3) {
            e = e3;
            wn5.l0("MediaSessionStub", "Library operation failed", e);
            String str3 = q54.g;
            yp7 yp7Var3 = new yp7("no error message provided", -1, Bundle.EMPTY);
            q54Var = new q54(yp7Var3.a, SystemClock.elapsedRealtime(), null, yp7Var3, null, 4);
            q54Var2 = q54Var;
        }
        try {
            gq4 gq4Var = hq4Var.d;
            vy2.t(gq4Var);
            gq4Var.c(i, q54Var2);
        } catch (RemoteException e4) {
            wn5.l0("MediaSessionStub", "Failed to send result to browser " + hq4Var, e4);
        }
    }

    @Override // defpackage.d4
    public boolean b(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
        int i = SideSheetBehavior.x;
        sideSheetBehavior.y(this.b);
        return true;
    }

    @Override // defpackage.co4
    public void c(xf3 xf3Var, int i) {
        go4 go4Var = (go4) this.c;
        xf3Var.h0(go4Var.c, i, this.b);
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() throws IOException {
        io.sentry.instrumentation.file.e eVar = (io.sentry.instrumentation.file.e) this.c;
        eVar.a.write(this.b);
        return 1;
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((eb6) obj).F(((ta6) this.c).a, this.b);
                break;
            default:
                eb6 eb6Var = (eb6) obj;
                eb6Var.o(this.b, (jp4) this.c);
                break;
        }
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        TryAgainView tryAgainView = (TryAgainView) this.c;
        int i = TryAgainView.t;
        js3.p(view, "<unused var>");
        no3 no3VarG = lf9Var.a.g(2);
        js3.o(no3VarG, "getInsets(...)");
        View view2 = tryAgainView.q.l;
        view2.setPadding(0, 0, 0, no3VarG.d + this.b);
        view2.requestLayout();
        tryAgainView.requestLayout();
        return lf9Var;
    }

    public /* synthetic */ p52(int i, int i2, List list) {
        this.a = i2;
        this.b = i;
        this.c = list;
    }

    public /* synthetic */ p52(int i, wp7 wp7Var, Bundle bundle) {
        this.a = 5;
        this.b = i;
        this.c = wp7Var;
    }
}
