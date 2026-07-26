package com.microsoft.clarity.g;

import android.graphics.Point;
import com.microsoft.clarity.models.viewhierarchy.EditTextInfo;
import defpackage.js3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.microsoft.clarity.g.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0062i {
    public final C0054a a;
    public final boolean b;
    public final Point c;
    public final LinkedHashMap d;
    public final J e;
    public final ArrayList f;
    public final LinkedHashSet g;
    public EditTextInfo h;

    public C0062i(C0076x c0076x, C0054a c0054a, boolean z) {
        js3.p(c0054a, "canvas");
        this.a = c0054a;
        this.b = z;
        this.c = new Point();
        this.d = new LinkedHashMap();
        this.e = new J();
        this.f = new ArrayList();
        this.g = new LinkedHashSet();
        new C0061h(c0076x);
    }
}
