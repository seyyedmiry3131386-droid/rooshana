package com.android.volley;

import defpackage.fn5;

/* JADX INFO: loaded from: classes.dex */
public class VolleyError extends Exception {
    public final fn5 a;

    public VolleyError() {
        this.a = null;
    }

    public VolleyError(fn5 fn5Var) {
        this.a = fn5Var;
    }

    public VolleyError(String str) {
        super(str);
        this.a = null;
    }

    public VolleyError(Exception exc) {
        super(exc);
        this.a = null;
    }
}
