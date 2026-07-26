package com.google.android.gms.common.api.internal;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import defpackage.c64;
import defpackage.rh9;
import defpackage.vo4;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends Fragment implements c64 {
    public final vo4 a = new vo4(20);

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((rh9) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.a.t(i, i2, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.s(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        vo4 vo4Var = this.a;
        vo4Var.getClass();
        Iterator it = ((Map) vo4Var.b).values().iterator();
        while (it.hasNext()) {
            ((rh9) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        vo4 vo4Var = this.a;
        vo4Var.getClass();
        Iterator it = ((Map) vo4Var.b).values().iterator();
        while (it.hasNext()) {
            ((rh9) it.next()).d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.u(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        vo4 vo4Var = this.a;
        vo4Var.getClass();
        for (rh9 rh9Var : ((Map) vo4Var.b).values()) {
            rh9Var.a = true;
            rh9Var.d();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        vo4 vo4Var = this.a;
        vo4Var.getClass();
        Iterator it = ((Map) vo4Var.b).values().iterator();
        while (it.hasNext()) {
            ((rh9) it.next()).c();
        }
    }
}
