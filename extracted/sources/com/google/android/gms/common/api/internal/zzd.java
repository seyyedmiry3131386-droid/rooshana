package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.d;
import defpackage.c64;
import defpackage.rh9;
import defpackage.vo4;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzd extends d implements c64 {
    public final vo4 A0 = new vo4(20);

    static {
        new WeakHashMap();
    }

    @Override // androidx.fragment.app.d
    public final void U(int i, int i2, Intent intent) {
        super.U(i, i2, intent);
        this.A0.t(i, i2, intent);
    }

    @Override // androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.A0.s(bundle);
    }

    @Override // androidx.fragment.app.d
    public final void a0() {
        this.H = true;
        vo4 vo4Var = this.A0;
        vo4Var.getClass();
        Iterator it = ((Map) vo4Var.b).values().iterator();
        while (it.hasNext()) {
            ((rh9) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.d
    public final void g0() {
        this.H = true;
        vo4 vo4Var = this.A0;
        vo4Var.getClass();
        Iterator it = ((Map) vo4Var.b).values().iterator();
        while (it.hasNext()) {
            ((rh9) it.next()).d();
        }
    }

    @Override // androidx.fragment.app.d
    public final void h0(Bundle bundle) {
        this.A0.u(bundle);
    }

    @Override // androidx.fragment.app.d
    public final void i0() {
        this.H = true;
        vo4 vo4Var = this.A0;
        vo4Var.getClass();
        for (rh9 rh9Var : ((Map) vo4Var.b).values()) {
            rh9Var.a = true;
            rh9Var.d();
        }
    }

    @Override // androidx.fragment.app.d
    public final void j0() {
        this.H = true;
        vo4 vo4Var = this.A0;
        vo4Var.getClass();
        Iterator it = ((Map) vo4Var.b).values().iterator();
        while (it.hasNext()) {
            ((rh9) it.next()).c();
        }
    }

    @Override // androidx.fragment.app.d
    public final void z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.z(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.A0.b).values().iterator();
        while (it.hasNext()) {
            ((rh9) it.next()).getClass();
        }
    }
}
