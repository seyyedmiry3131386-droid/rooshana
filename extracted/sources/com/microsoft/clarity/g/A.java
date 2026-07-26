package com.microsoft.clarity.g;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class A {
    public final Context a;
    public final b0 b;
    public final SharedPreferences c;

    public A(Context context, b0 b0Var) {
        js3.p(context, "context");
        js3.p(b0Var, "taskExecutor");
        this.a = context;
        this.b = b0Var;
        this.c = context.getSharedPreferences("CLARITY_SHARED_PREFERENCES", 0);
    }

    public final void a(String str) {
        SharedPreferences.Editor editorEdit = this.c.edit();
        editorEdit.putString("GAID", str);
        editorEdit.apply();
    }
}
