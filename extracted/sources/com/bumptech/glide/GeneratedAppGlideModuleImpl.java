package com.bumptech.glide;

import android.content.Context;
import defpackage.et2;
import defpackage.fv;
import defpackage.t57;
import defpackage.y27;
import defpackage.za9;
import ir.mservices.market.version2.imageLoader.MyketGlideModule;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    public final MyketGlideModule q = new MyketGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
    }

    @Override // defpackage.xq2
    public final void E(Context context, a aVar, y27 y27Var) {
        this.q.E(context, aVar, y27Var);
    }

    @Override // defpackage.za9
    public final void O(Context context, et2 et2Var) {
        this.q.O(context, et2Var);
    }

    @Override // defpackage.za9
    public final boolean P() {
        this.q.getClass();
        return false;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final HashSet Q() {
        HashSet hashSet = new HashSet();
        hashSet.add(za9.class);
        return hashSet;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final t57 R() {
        return new fv(24);
    }
}
