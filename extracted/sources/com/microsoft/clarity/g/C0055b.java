package com.microsoft.clarity.g;

import com.microsoft.clarity.models.viewhierarchy.ViewNode;
import defpackage.js3;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.microsoft.clarity.g.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0055b {
    public final ViewNode a;
    public final boolean b;
    public final ArrayList c;
    public final int d;

    public C0055b(ViewNode viewNode, int i, boolean z) {
        js3.p(viewNode, "node");
        this.a = viewNode;
        this.b = z;
        this.c = new ArrayList();
        this.d = viewNode.getWidth() * viewNode.getHeight();
        a(viewNode.getType(), viewNode.getId(), i);
    }

    public final void a(String str, int i, int i2) {
        js3.p(str, "type");
        if (i == -1) {
            this.c.add(0, "/" + str + '[' + i2 + ']');
            return;
        }
        this.c.add(0, "/" + str + '#' + i + '[' + i2 + ']');
    }
}
