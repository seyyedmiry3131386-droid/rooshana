package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ci4 extends qt8 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final qt8 c;
    public final Object d;

    public ci4(vu0 vu0Var, ci4 ci4Var, ci4 ci4Var2, qq5 qq5Var) {
        this.b = ci4Var;
        this.c = ci4Var2;
        this.d = qq5Var;
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        switch (this.a) {
            case 0:
                JsonToken jsonTokenR = mw3Var.R();
                if (jsonTokenR == JsonToken.i) {
                    mw3Var.J();
                    return null;
                }
                Map map = (Map) ((qq5) this.d).a();
                if (jsonTokenR == JsonToken.a) {
                    mw3Var.c1();
                    while (mw3Var.hasNext()) {
                        mw3Var.c1();
                        Object objB = ((ci4) this.b).c.b(mw3Var);
                        if (map.put(objB, ((ci4) this.c).c.b(mw3Var)) != null) {
                            throw new JsonSyntaxException(o40.x(objB, "duplicate key: "));
                        }
                        mw3Var.W0();
                    }
                    mw3Var.W0();
                } else {
                    mw3Var.P0();
                    while (mw3Var.hasNext()) {
                        ql3.a.getClass();
                        int iD = mw3Var.h;
                        if (iD == 0) {
                            iD = mw3Var.d();
                        }
                        if (iD == 13) {
                            mw3Var.h = 9;
                        } else if (iD == 12) {
                            mw3Var.h = 8;
                        } else {
                            if (iD != 14) {
                                throw mw3Var.D0("a name");
                            }
                            mw3Var.h = 10;
                        }
                        Object objB2 = ((ci4) this.b).c.b(mw3Var);
                        if (map.put(objB2, ((ci4) this.c).c.b(mw3Var)) != null) {
                            throw new JsonSyntaxException(o40.x(objB2, "duplicate key: "));
                        }
                    }
                    mw3Var.t0();
                }
                return map;
            default:
                return this.c.b(mw3Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    @Override // defpackage.qt8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.uw3 r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L49;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L18
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L13
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L18
        L13:
            java.lang.Class r1 = r6.getClass()
            goto L19
        L18:
            r1 = r0
        L19:
            qt8 r2 = r4.c
            if (r1 == r0) goto L45
            java.lang.Object r0 = r4.b
            vv2 r0 = (defpackage.vv2) r0
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            qt8 r0 = r0.d(r1)
            boolean r1 = r0 instanceof defpackage.q27
            if (r1 != 0) goto L2e
            goto L44
        L2e:
            r1 = r2
        L2f:
            boolean r3 = r1 instanceof defpackage.uo7
            if (r3 == 0) goto L3f
            r3 = r1
            uo7 r3 = (defpackage.uo7) r3
            qt8 r3 = r3.d()
            if (r3 != r1) goto L3d
            goto L3f
        L3d:
            r1 = r3
            goto L2f
        L3f:
            boolean r1 = r1 instanceof defpackage.q27
            if (r1 != 0) goto L44
            goto L45
        L44:
            r2 = r0
        L45:
            r2.c(r5, r6)
            return
        L49:
            java.util.Map r6 = (java.util.Map) r6
            qt8 r0 = r4.c
            ci4 r0 = (defpackage.ci4) r0
            if (r6 != 0) goto L55
            r5.u()
            goto L82
        L55:
            r5.P0()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.g(r2)
            java.lang.Object r1 = r1.getValue()
            r0.c(r5, r1)
            goto L60
        L7f:
            r5.t0()
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci4.c(uw3, java.lang.Object):void");
    }

    public ci4(vv2 vv2Var, qt8 qt8Var, Type type) {
        this.b = vv2Var;
        this.c = qt8Var;
        this.d = type;
    }
}
