package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class kt8 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public ah8 r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(kt8 kt8Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (kt8Var != null) {
            if (!this.c && kt8Var.c) {
                this.b = kt8Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = kt8Var.h;
            }
            if (this.i == -1) {
                this.i = kt8Var.i;
            }
            if (this.a == null && (str = kt8Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = kt8Var.f;
            }
            if (this.g == -1) {
                this.g = kt8Var.g;
            }
            if (this.n == -1) {
                this.n = kt8Var.n;
            }
            if (this.o == null && (alignment2 = kt8Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = kt8Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = kt8Var.q;
            }
            if (this.j == -1) {
                this.j = kt8Var.j;
                this.k = kt8Var.k;
            }
            if (this.r == null) {
                this.r = kt8Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = kt8Var.s;
            }
            if (this.t == null) {
                this.t = kt8Var.t;
            }
            if (this.u == null) {
                this.u = kt8Var.u;
            }
            if (!this.e && kt8Var.e) {
                this.d = kt8Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = kt8Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
