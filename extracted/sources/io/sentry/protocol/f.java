package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.b6;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g2 {
    public s a;
    public List b;
    public HashMap c;

    public static f a(f fVar, b6 b6Var) {
        ArrayList arrayList = new ArrayList();
        if (b6Var.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(b6Var.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : b6Var.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (fVar == null) {
            fVar = new f();
        }
        List list = fVar.b;
        if (list == null) {
            fVar.b = new ArrayList(arrayList);
            return fVar;
        }
        list.addAll(arrayList);
        return fVar;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("sdk_info");
            cVar.w(u0Var, this.a);
        }
        if (this.b != null) {
            cVar.q("images");
            cVar.w(u0Var, this.b);
        }
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.c, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
