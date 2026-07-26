package io.sentry.android.replay;

import android.view.View;
import defpackage.m91;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class RootViewsSpy$listeners$1 extends CopyOnWriteArrayList<d> {
    public final /* synthetic */ o a;

    public RootViewsSpy$listeners$1(o oVar) {
        this.a = oVar;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) throws Exception {
        d dVar = (d) obj;
        o oVar = this.a;
        io.sentry.r rVarA = oVar.b.a();
        try {
            for (View view : oVar.d) {
                if (dVar != null) {
                    dVar.b(view, true);
                }
            }
            m91.i(rVarA, null);
            return super.add(dVar);
        } finally {
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof d) {
            return super.contains((d) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof d) {
            return super.indexOf((d) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof d) {
            return super.lastIndexOf((d) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof d) {
            return super.remove((d) obj);
        }
        return false;
    }
}
