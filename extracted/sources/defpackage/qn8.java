package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.m;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qn8 extends zk8 {
    public final m q;
    public final Window.Callback r;
    public final hl5 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final ArrayList w = new ArrayList();
    public final fp7 x = new fp7(6, this);

    public qn8(MaterialToolbar materialToolbar, CharSequence charSequence, gn gnVar) {
        vo4 vo4Var = new vo4(14, this);
        m mVar = new m(materialToolbar, false);
        this.q = mVar;
        gnVar.getClass();
        this.r = gnVar;
        mVar.k = gnVar;
        materialToolbar.setOnMenuItemClickListener(vo4Var);
        if (!mVar.g) {
            mVar.h = charSequence;
            if ((mVar.b & 8) != 0) {
                materialToolbar.setTitle(charSequence);
                if (mVar.g) {
                    q69.r(materialToolbar.getRootView(), charSequence);
                }
            }
        }
        this.s = new hl5(14, this);
    }

    @Override // defpackage.zk8
    public final int F() {
        return this.q.b;
    }

    @Override // defpackage.zk8
    public final Context G() {
        return this.q.a.getContext();
    }

    @Override // defpackage.zk8
    public final void H() {
        this.q.a.setVisibility(8);
    }

    @Override // defpackage.zk8
    public final boolean K() {
        m mVar = this.q;
        Toolbar toolbar = mVar.a;
        fp7 fp7Var = this.x;
        toolbar.removeCallbacks(fp7Var);
        Toolbar toolbar2 = mVar.a;
        WeakHashMap weakHashMap = q69.a;
        toolbar2.postOnAnimation(fp7Var);
        return true;
    }

    @Override // defpackage.zk8
    public final void S() {
        this.q.a.removeCallbacks(this.x);
    }

    @Override // defpackage.zk8
    public final boolean T(int i, KeyEvent keyEvent) {
        Menu menuR0 = r0();
        if (menuR0 == null) {
            return false;
        }
        menuR0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuR0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.zk8
    public final boolean U(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            V();
        }
        return true;
    }

    @Override // defpackage.zk8
    public final boolean V() {
        return this.q.a.z();
    }

    @Override // defpackage.zk8
    public final void d0(boolean z) {
        s0(z ? 4 : 0, 4);
    }

    @Override // defpackage.zk8
    public final void e0() {
        s0(2, 2);
    }

    @Override // defpackage.zk8
    public final void f0() {
        s0(8, 8);
    }

    @Override // defpackage.zk8
    public final void g0(Drawable drawable) {
        m mVar = this.q;
        mVar.f = drawable;
        Toolbar toolbar = mVar.a;
        if ((mVar.b & 4) != 0) {
            toolbar.setNavigationIcon(drawable);
        } else {
            toolbar.setNavigationIcon((Drawable) null);
        }
    }

    @Override // defpackage.zk8
    public final void i0() {
        m mVar = this.q;
        mVar.d = null;
        mVar.e();
    }

    @Override // defpackage.zk8
    public final void l0(CharSequence charSequence) {
        m mVar = this.q;
        if (mVar.g) {
            return;
        }
        Toolbar toolbar = mVar.a;
        mVar.h = charSequence;
        if ((mVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (mVar.g) {
                q69.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.zk8
    public final void m0() {
        this.q.a.setVisibility(0);
    }

    public final Menu r0() {
        boolean z = this.u;
        m mVar = this.q;
        if (!z) {
            mVar.a.setMenuCallbacks(new xe1((Object) this, false), new ck4(20, this));
            this.u = true;
        }
        return mVar.a.getMenu();
    }

    public final void s0(int i, int i2) {
        m mVar = this.q;
        mVar.c((i & i2) | ((~i2) & mVar.b));
    }

    @Override // defpackage.zk8
    public final boolean u() {
        return this.q.b();
    }

    @Override // defpackage.zk8
    public final boolean v() {
        m mVar = this.q;
        if (!mVar.a.o()) {
            return false;
        }
        mVar.a.d();
        return true;
    }

    @Override // defpackage.zk8
    public final void y(boolean z) {
        if (z == this.v) {
            return;
        }
        this.v = z;
        ArrayList arrayList = this.w;
        if (arrayList.size() > 0) {
            throw rm7.l(0, arrayList);
        }
    }

    @Override // defpackage.zk8
    public final void R() {
    }

    @Override // defpackage.zk8
    public final void h0() {
    }

    @Override // defpackage.zk8
    public final void c0(boolean z) {
    }

    @Override // defpackage.zk8
    public final void k0(boolean z) {
    }
}
