package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import io.sentry.config.a;
import ir.mservices.market.myAccount.dialog.Gender;
import ir.mservices.market.receivers.DeveloperApiReceiver;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class cv implements dv, p70, z99, wi0, uj0, aq8, v61, q41, q03, jo2, v57, f82, mb2 {
    public final /* synthetic */ int a;

    public /* synthetic */ cv(int i) {
        this.a = i;
    }

    public static final Intent o(String str, String str2, Bundle bundle) {
        int i = DeveloperApiReceiver.b;
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction(str2);
        intent.putExtras(bundle);
        return intent;
    }

    public static final void p(ox oxVar) {
        dc0 dc0Var = ox.h;
        if (ox.i == null) {
            ox.i = new ox();
            nx nxVar = new nx("Okio Watchdog");
            nxVar.setDaemon(true);
            nxVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j = oxVar.c;
        boolean z = oxVar.a;
        if (j != 0 && z) {
            oxVar.g = Math.min(j, oxVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            oxVar.g = jNanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            oxVar.g = oxVar.c();
        }
        dc0 dc0Var2 = ox.h;
        int i = dc0Var2.b + 1;
        dc0Var2.b = i;
        ox[] oxVarArr = (ox[]) dc0Var2.c;
        if (i == oxVarArr.length) {
            ox[] oxVarArr2 = new ox[i * 2];
            ew.C0(0, 0, 14, oxVarArr, oxVarArr2);
            dc0Var2.c = oxVarArr2;
        }
        dc0Var2.m(i, oxVar);
        if (oxVar.f == 1) {
            ox.k.signal();
        }
    }

    public static ox s() throws InterruptedException {
        dc0 dc0Var = ox.h;
        ox oxVar = ((ox[]) dc0Var.c)[1];
        if (oxVar == null) {
            long jNanoTime = System.nanoTime();
            ox.k.await(ox.l, TimeUnit.MILLISECONDS);
            if (((ox[]) dc0Var.c)[1] != null || System.nanoTime() - jNanoTime < ox.m) {
                return null;
            }
            return ox.i;
        }
        long jNanoTime2 = oxVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            ox.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        dc0Var.t(oxVar);
        oxVar.e = 2;
        return oxVar;
    }

    public static Gender v(String str) {
        Object next;
        z0 z0Var = (z0) Gender.h;
        z0Var.getClass();
        w0 w0Var = new w0(0, z0Var);
        while (true) {
            if (!w0Var.hasNext()) {
                next = null;
                break;
            }
            next = w0Var.next();
            if (((Gender) next).a.equalsIgnoreCase(str)) {
                break;
            }
        }
        return (Gender) next;
    }

    public static String y(u2 u2Var) {
        String str = (String) u2Var.c;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) u2Var.f().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    public SparseIntArray[] A() {
        return null;
    }

    @Override // defpackage.p70
    public boolean a(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.uj0
    public byte[] b(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.p70
    public uy3 c() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.q41
    public long d(long j, long j2) {
        float f = ml9.f(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)));
        int i = ae7.a;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.dv, defpackage.hv
    public float e() {
        return 0;
    }

    @Override // defpackage.q03
    public l26 f(n03 n03Var, j03 j03Var) {
        return new p03(n03Var, j03Var);
    }

    @Override // defpackage.f82
    public Object g() {
        return new ArrayList();
    }

    @Override // defpackage.wi0, defpackage.mb2
    public Class getDataClass() {
        switch (this.a) {
        }
        return InputStream.class;
    }

    @Override // defpackage.p70
    public boolean h(float f) {
        return false;
    }

    @Override // defpackage.p70
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.mb2
    public Object j(File file) {
        return a.g(file, new FileInputStream(file));
    }

    @Override // defpackage.dv
    public void k(qj1 qj1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.a) {
            jv.c(i, iArr, iArr2, false);
        } else {
            jv.b(iArr, iArr2, true);
        }
    }

    @Override // defpackage.p70
    public float l() {
        return 1.0f;
    }

    @Override // defpackage.p70
    public float m() {
        return 0.0f;
    }

    @Override // defpackage.wi0
    public Object n(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // defpackage.q03
    public l26 r() {
        return new p03(n03.l, null);
    }

    @Override // defpackage.z99
    public lf9 t(View view, lf9 lf9Var, aa9 aa9Var) {
        aa9Var.d = lf9Var.a() + aa9Var.d;
        boolean z = view.getLayoutDirection() == 1;
        int iB = lf9Var.b();
        int iC = lf9Var.c();
        int i = aa9Var.a + (z ? iC : iB);
        aa9Var.a = i;
        int i2 = aa9Var.c;
        if (!z) {
            iB = iC;
        }
        int i3 = i2 + iB;
        aa9Var.c = i3;
        view.setPaddingRelative(i, aa9Var.b, i3, aa9Var.d);
        return lf9Var;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#End";
            case 8:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mb2
    public void u(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    public SparseIntArray[] w() {
        return null;
    }

    public SparseIntArray[] x(Activity activity2) {
        return null;
    }

    public SparseIntArray[] z() {
        return null;
    }

    @Override // defpackage.jo2
    public void i(FragmentActivity fragmentActivity) {
    }

    public void q(Activity activity2) {
    }
}
