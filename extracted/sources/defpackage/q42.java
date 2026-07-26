package defpackage;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class q42 extends qt8 {
    public volatile qt8 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ vv2 d;
    public final /* synthetic */ TypeToken e;
    public final /* synthetic */ r42 f;

    public q42(r42 r42Var, boolean z, boolean z2, vv2 vv2Var, TypeToken typeToken) {
        this.f = r42Var;
        this.b = z;
        this.c = z2;
        this.d = vv2Var;
        this.e = typeToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    @Override // defpackage.qt8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.mw3 r10) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.b
            if (r0 == 0) goto L9
            r10.z()
            r10 = 0
            return r10
        L9:
            qt8 r0 = r9.a
            if (r0 != 0) goto La1
            vv2 r0 = r9.d
            r42 r1 = r9.f
            com.google.gson.reflect.TypeToken r2 = r9.e
            su3 r3 = r0.d
            r3.getClass()
            j$.util.concurrent.ConcurrentHashMap r4 = r3.b
            ru3 r5 = defpackage.su3.c
            r6 = 1
            if (r1 != r5) goto L20
            goto L62
        L20:
            java.lang.Class r5 = r2.getRawType()
            java.lang.Object r7 = r4.get(r5)
            rt8 r7 = (defpackage.rt8) r7
            if (r7 == 0) goto L2f
            if (r7 != r1) goto L63
            goto L62
        L2f:
            java.lang.Class<qu3> r7 = defpackage.qu3.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            qu3 r7 = (defpackage.qu3) r7
            if (r7 != 0) goto L3a
            goto L63
        L3a:
            java.lang.Class r7 = r7.value()
            java.lang.Class<rt8> r8 = defpackage.rt8.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L47
            goto L63
        L47:
            gv r8 = r3.a
            com.google.gson.reflect.TypeToken r7 = com.google.gson.reflect.TypeToken.get(r7)
            qq5 r7 = r8.t(r7, r6)
            java.lang.Object r7 = r7.a()
            rt8 r7 = (defpackage.rt8) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            rt8 r4 = (defpackage.rt8) r4
            if (r4 == 0) goto L60
            r7 = r4
        L60:
            if (r7 != r1) goto L63
        L62:
            r1 = r3
        L63:
            java.util.List r3 = r0.e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L6a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r3.next()
            rt8 r5 = (defpackage.rt8) r5
            if (r4 != 0) goto L7c
            if (r5 != r1) goto L6a
            r4 = r6
            goto L6a
        L7c:
            qt8 r5 = r5.a(r0, r2)
            if (r5 == 0) goto L6a
            r0 = r5
            goto L8a
        L84:
            if (r4 != 0) goto L8d
            qt8 r0 = r0.d(r2)
        L8a:
            r9.a = r0
            goto La1
        L8d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        La1:
            java.lang.Object r10 = r0.b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q42.b(mw3):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[SYNTHETIC] */
    @Override // defpackage.qt8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.uw3 r10, java.lang.Object r11) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.c
            if (r0 == 0) goto L8
            r10.u()
            return
        L8:
            qt8 r0 = r9.a
            if (r0 != 0) goto La0
            vv2 r0 = r9.d
            r42 r1 = r9.f
            com.google.gson.reflect.TypeToken r2 = r9.e
            su3 r3 = r0.d
            r3.getClass()
            j$.util.concurrent.ConcurrentHashMap r4 = r3.b
            ru3 r5 = defpackage.su3.c
            r6 = 1
            if (r1 != r5) goto L1f
            goto L61
        L1f:
            java.lang.Class r5 = r2.getRawType()
            java.lang.Object r7 = r4.get(r5)
            rt8 r7 = (defpackage.rt8) r7
            if (r7 == 0) goto L2e
            if (r7 != r1) goto L62
            goto L61
        L2e:
            java.lang.Class<qu3> r7 = defpackage.qu3.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            qu3 r7 = (defpackage.qu3) r7
            if (r7 != 0) goto L39
            goto L62
        L39:
            java.lang.Class r7 = r7.value()
            java.lang.Class<rt8> r8 = defpackage.rt8.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L46
            goto L62
        L46:
            gv r8 = r3.a
            com.google.gson.reflect.TypeToken r7 = com.google.gson.reflect.TypeToken.get(r7)
            qq5 r7 = r8.t(r7, r6)
            java.lang.Object r7 = r7.a()
            rt8 r7 = (defpackage.rt8) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            rt8 r4 = (defpackage.rt8) r4
            if (r4 == 0) goto L5f
            r7 = r4
        L5f:
            if (r7 != r1) goto L62
        L61:
            r1 = r3
        L62:
            java.util.List r3 = r0.e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L69:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r3.next()
            rt8 r5 = (defpackage.rt8) r5
            if (r4 != 0) goto L7b
            if (r5 != r1) goto L69
            r4 = r6
            goto L69
        L7b:
            qt8 r5 = r5.a(r0, r2)
            if (r5 == 0) goto L69
            r0 = r5
            goto L89
        L83:
            if (r4 != 0) goto L8c
            qt8 r0 = r0.d(r2)
        L89:
            r9.a = r0
            goto La0
        L8c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            r11.<init>(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        La0:
            r0.c(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q42.c(uw3, java.lang.Object):void");
    }
}
