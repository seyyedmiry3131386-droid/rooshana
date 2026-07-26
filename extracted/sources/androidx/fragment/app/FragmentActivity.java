package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import defpackage.bn6;
import defpackage.c7;
import defpackage.i64;
import defpackage.r79;
import defpackage.sk2;
import defpackage.tk2;
import defpackage.wl2;
import defpackage.yx0;
import defpackage.zn2;
import defpackage.zx0;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements c7 {
    public static final /* synthetic */ int A = 0;
    public boolean x;
    public boolean y;
    public final r79 v = new r79(19, new tk2(this));
    public final i64 w = new i64(this, true);
    public boolean z = true;

    public FragmentActivity() {
        M();
    }

    public static boolean N(g gVar) {
        Lifecycle$State lifecycle$State = Lifecycle$State.c;
        boolean zN = false;
        for (d dVar : gVar.c.S()) {
            if (dVar != null) {
                tk2 tk2Var = dVar.w;
                if ((tk2Var == null ? null : tk2Var.w) != null) {
                    zN |= N(dVar.G());
                }
                zn2 zn2Var = dVar.V;
                if (zn2Var != null) {
                    zn2Var.b();
                    if (zn2Var.e.d.compareTo(Lifecycle$State.d) >= 0) {
                        dVar.V.e.g(lifecycle$State);
                        zN = true;
                    }
                }
                if (dVar.U.d.compareTo(Lifecycle$State.d) >= 0) {
                    dVar.U.g(lifecycle$State);
                    zN = true;
                }
            }
        }
        return zN;
    }

    public final wl2 L() {
        return ((tk2) this.v.b).v;
    }

    public final void M() {
        ((bn6) this.d.c).u("android:support:lifecycle", new yx0(2, this));
        v(new sk2(0, this));
        this.l.add(new sk2(1, this));
        I(new zx0(this, 1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentActivity.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.v.q();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w.d(Lifecycle$Event.ON_CREATE);
        wl2 wl2Var = ((tk2) this.v.b).v;
        wl2Var.I = false;
        wl2Var.J = false;
        wl2Var.P.g = false;
        wl2Var.v(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((tk2) this.v.b).v.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((tk2) this.v.b).v.m();
        this.w.d(Lifecycle$Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((tk2) this.v.b).v.k();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.y = false;
        ((tk2) this.v.b).v.v(5);
        this.w.d(Lifecycle$Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.w.d(Lifecycle$Event.ON_RESUME);
        wl2 wl2Var = ((tk2) this.v.b).v;
        wl2Var.I = false;
        wl2Var.J = false;
        wl2Var.P.g = false;
        wl2Var.v(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.v.q();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        r79 r79Var = this.v;
        r79Var.q();
        super.onResume();
        this.y = true;
        ((tk2) r79Var.b).v.B(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        r79 r79Var = this.v;
        r79Var.q();
        tk2 tk2Var = (tk2) r79Var.b;
        super.onStart();
        this.z = false;
        if (!this.x) {
            this.x = true;
            wl2 wl2Var = tk2Var.v;
            wl2Var.I = false;
            wl2Var.J = false;
            wl2Var.P.g = false;
            wl2Var.v(4);
        }
        tk2Var.v.B(true);
        this.w.d(Lifecycle$Event.ON_START);
        wl2 wl2Var2 = tk2Var.v;
        wl2Var2.I = false;
        wl2Var2.J = false;
        wl2Var2.P.g = false;
        wl2Var2.v(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.v.q();
    }

    @Override // android.app.Activity
    public void onStop() {
        wl2 wl2VarL;
        super.onStop();
        this.z = true;
        do {
            wl2VarL = L();
            Lifecycle$State lifecycle$State = Lifecycle$State.a;
        } while (N(wl2VarL));
        wl2 wl2Var = ((tk2) this.v.b).v;
        wl2Var.J = true;
        wl2Var.P.g = true;
        wl2Var.v(4);
        this.w.d(Lifecycle$Event.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((tk2) this.v.b).v.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    public FragmentActivity(int i) {
        M();
    }
}
