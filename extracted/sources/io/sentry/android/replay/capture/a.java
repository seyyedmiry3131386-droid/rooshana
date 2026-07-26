package io.sentry.android.replay.capture;

import defpackage.js3;
import defpackage.ox3;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final /* synthetic */ int a;
    public final AtomicReference b;
    public final /* synthetic */ b c;
    public final /* synthetic */ b d;

    public a(b bVar, b bVar2, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.c = bVar;
                this.d = bVar2;
                this.b = new AtomicReference(null);
                break;
            case 3:
                this.c = bVar;
                this.d = bVar2;
                this.b = new AtomicReference(null);
                break;
            case 4:
                this.c = bVar;
                this.d = bVar2;
                this.b = new AtomicReference(null);
                break;
            case 5:
                this.c = bVar;
                this.d = bVar2;
                this.b = new AtomicReference(null);
                break;
            default:
                this.c = bVar;
                this.d = bVar2;
                this.b = new AtomicReference(-1);
                break;
        }
    }

    public final Object a(Object obj, ox3 ox3Var) {
        switch (this.a) {
            case 0:
                js3.p(ox3Var, "property");
                break;
            case 1:
                js3.p(ox3Var, "property");
                break;
            case 2:
                js3.p(ox3Var, "property");
                break;
            case 3:
                js3.p(ox3Var, "property");
                break;
            case 4:
                js3.p(ox3Var, "property");
                break;
            default:
                js3.p(ox3Var, "property");
                break;
        }
        return this.b.get();
    }

    public a(Object obj, b bVar, b bVar2) {
        this.a = 0;
        this.c = bVar;
        this.d = bVar2;
        this.b = new AtomicReference(obj);
    }
}
