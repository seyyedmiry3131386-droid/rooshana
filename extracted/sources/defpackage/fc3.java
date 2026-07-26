package defpackage;

import ir.mservices.market.app.home.ui.recycler.HomeVideoData;

/* JADX INFO: loaded from: classes3.dex */
public final class fc3 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze2 b;
    public final /* synthetic */ HomeVideoData c;

    public /* synthetic */ fc3(ze2 ze2Var, HomeVideoData homeVideoData, int i) {
        this.a = i;
        this.b = ze2Var;
        this.c = homeVideoData;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // defpackage.ze2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, defpackage.g51 r6) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L60;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof ir.mservices.market.app.home.ui.recycler.HomeVideoViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1
            if (r0 == 0) goto L18
            r0 = r6
            ir.mservices.market.app.home.ui.recycler.HomeVideoViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (ir.mservices.market.app.home.ui.recycler.HomeVideoViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.b = r1
            goto L1d
        L18:
            ir.mservices.market.app.home.ui.recycler.HomeVideoViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new ir.mservices.market.app.home.ui.recycler.HomeVideoViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.b.b(r6)
            goto L5d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.b.b(r6)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            ir.mservices.market.app.home.ui.recycler.HomeVideoData r2 = r4.c
            ir.mservices.market.version2.webapi.responsedto.VideoRowDto r2 = r2.a
            if (r2 == 0) goto L4b
            ir.mservices.market.version2.webapi.responsedto.ApplicationDTO r2 = r2.getApplication()
            if (r2 == 0) goto L4b
            java.lang.String r2 = r2.getPackageName()
            goto L4c
        L4b:
            r2 = 0
        L4c:
            boolean r6 = defpackage.js3.i(r6, r2)
            if (r6 == 0) goto L5d
            r0.b = r3
            ze2 r6 = r4.b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L5d
            goto L5f
        L5d:
            tx8 r1 = defpackage.tx8.a
        L5f:
            return r1
        L60:
            boolean r0 = r6 instanceof ir.mservices.market.app.home.ui.recycler.HomeVideoDigestedViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1
            if (r0 == 0) goto L73
            r0 = r6
            ir.mservices.market.app.home.ui.recycler.HomeVideoDigestedViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (ir.mservices.market.app.home.ui.recycler.HomeVideoDigestedViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L73
            int r1 = r1 - r2
            r0.b = r1
            goto L78
        L73:
            ir.mservices.market.app.home.ui.recycler.HomeVideoDigestedViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new ir.mservices.market.app.home.ui.recycler.HomeVideoDigestedViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1
            r0.<init>(r4, r6)
        L78:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L8f
            if (r2 != r3) goto L87
            kotlin.b.b(r6)
            goto Lb8
        L87:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L8f:
            kotlin.b.b(r6)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            ir.mservices.market.app.home.ui.recycler.HomeVideoData r2 = r4.c
            ir.mservices.market.version2.webapi.responsedto.VideoRowDto r2 = r2.a
            if (r2 == 0) goto La6
            ir.mservices.market.version2.webapi.responsedto.ApplicationDTO r2 = r2.getApplication()
            if (r2 == 0) goto La6
            java.lang.String r2 = r2.getPackageName()
            goto La7
        La6:
            r2 = 0
        La7:
            boolean r6 = defpackage.js3.i(r6, r2)
            if (r6 == 0) goto Lb8
            r0.b = r3
            ze2 r6 = r4.b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto Lb8
            goto Lba
        Lb8:
            tx8 r1 = defpackage.tx8.a
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc3.emit(java.lang.Object, g51):java.lang.Object");
    }
}
