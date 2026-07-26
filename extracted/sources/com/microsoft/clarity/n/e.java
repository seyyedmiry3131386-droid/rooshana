package com.microsoft.clarity.n;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public final SharedPreferences a;

    public e(Context context) {
        js3.p(context, "context");
        this.a = context.getSharedPreferences("CLARITY_SHARED_PREFERENCES", 0);
    }

    public final void a(String str) {
        js3.p(str, "userId");
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString("CLARITY_USER_ID", str);
        editorEdit.apply();
    }
}
