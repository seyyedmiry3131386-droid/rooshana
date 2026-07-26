package kotlinx.serialization.json.internal;

import defpackage.br9;
import defpackage.bv3;
import defpackage.cw3;
import defpackage.dt2;
import defpackage.g51;
import defpackage.hw3;
import defpackage.js3;
import defpackage.kv3;
import defpackage.oc1;
import defpackage.pc1;
import defpackage.rp2;
import defpackage.t0;
import defpackage.tx8;
import defpackage.uu3;
import defpackage.uv3;
import defpackage.wu8;
import defpackage.yv3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final t0 a;
    public final boolean b;
    public int c;

    public b(bv3 bv3Var, t0 t0Var) {
        this.a = t0Var;
        this.b = bv3Var.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlinx.serialization.json.internal.b r11, defpackage.pc1 r12, kotlin.coroutines.jvm.internal.BaseContinuationImpl r13) {
        /*
            t0 r0 = r11.a
            boolean r1 = r13 instanceof kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            if (r1 == 0) goto L15
            r1 = r13
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r1 = (kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) r1
            int r2 = r1.h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.h = r2
            goto L1a
        L15:
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r1 = new kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            r1.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r1.f
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r1.h
            r4 = 0
            r5 = 6
            r6 = 0
            r7 = 7
            r8 = 4
            r9 = 1
            if (r3 == 0) goto L5a
            if (r3 != r9) goto L52
            int r11 = r1.e
            java.lang.String r12 = r1.d
            java.util.LinkedHashMap r0 = r1.c
            kotlinx.serialization.json.internal.b r3 = r1.b
            pc1 r10 = r1.a
            kotlin.b.b(r13)
            kv3 r13 = (defpackage.kv3) r13
            r0.put(r12, r13)
            t0 r12 = r3.a
            byte r12 = r12.f()
            if (r12 == r8) goto L4f
            if (r12 != r7) goto L47
            goto L9a
        L47:
            t0 r11 = r3.a
            java.lang.String r12 = "Expected end of the object or comma"
            defpackage.t0.t(r11, r12, r6, r4, r5)
            throw r4
        L4f:
            r6 = r11
            r11 = r3
            goto L6e
        L52:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L5a:
            kotlin.b.b(r13)
            byte r13 = r0.g(r5)
            byte r3 = r0.z()
            if (r3 == r8) goto Lb0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r10 = r12
            r12 = r13
        L6e:
            t0 r13 = r11.a
            boolean r3 = r13.c()
            if (r3 == 0) goto L99
            boolean r12 = r11.b
            if (r12 == 0) goto L7f
            java.lang.String r12 = r13.l()
            goto L83
        L7f:
            java.lang.String r12 = r13.j()
        L83:
            r3 = 5
            r13.g(r3)
            r1.a = r10
            r1.b = r11
            r1.c = r0
            r1.d = r12
            r1.e = r6
            r1.h = r9
            r10.getClass()
            r10.b = r1
            return r2
        L99:
            r3 = r11
        L9a:
            t0 r11 = r3.a
            if (r12 != r5) goto La2
            r11.g(r7)
            goto La4
        La2:
            if (r12 == r8) goto Laa
        La4:
            cw3 r11 = new cw3
            r11.<init>(r0)
            return r11
        Laa:
            java.lang.String r12 = "object"
            defpackage.br9.A(r11, r12)
            throw r4
        Lb0:
            java.lang.String r11 = "Unexpected leading comma"
            defpackage.t0.t(r0, r11, r6, r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.b.a(kotlinx.serialization.json.internal.b, pc1, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public final kv3 b() {
        kv3 cw3Var;
        Object obj;
        t0 t0Var = this.a;
        byte bZ = t0Var.z();
        if (bZ == 1) {
            return d(true);
        }
        if (bZ == 0) {
            return d(false);
        }
        if (bZ != 6) {
            if (bZ == 8) {
                return c();
            }
            t0.t(t0Var, "Cannot read Json element because of unexpected ".concat(dt2.G(bZ)), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this, null);
            CoroutineSingletons coroutineSingletons = oc1.a;
            pc1 pc1Var = new pc1();
            pc1Var.a = jsonTreeReader$readDeepRecursive$1;
            pc1Var.b = pc1Var;
            CoroutineSingletons coroutineSingletons2 = oc1.a;
            pc1Var.c = coroutineSingletons2;
            while (true) {
                obj = pc1Var.c;
                g51 g51Var = pc1Var.b;
                if (g51Var == null) {
                    break;
                }
                if (js3.i(coroutineSingletons2, obj)) {
                    try {
                        rp2 rp2Var = pc1Var.a;
                        wu8.i(3, rp2Var);
                        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$12 = new JsonTreeReader$readDeepRecursive$1(((JsonTreeReader$readDeepRecursive$1) rp2Var).d, g51Var);
                        jsonTreeReader$readDeepRecursive$12.c = pc1Var;
                        Object objInvokeSuspend = jsonTreeReader$readDeepRecursive$12.invokeSuspend(tx8.a);
                        if (objInvokeSuspend != CoroutineSingletons.a) {
                            g51Var.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        g51Var.resumeWith(kotlin.b.a(th));
                    }
                } else {
                    pc1Var.c = coroutineSingletons2;
                    g51Var.resumeWith(obj);
                }
            }
            kotlin.b.b(obj);
            cw3Var = (kv3) obj;
        } else {
            byte bG = t0Var.g((byte) 6);
            if (t0Var.z() == 4) {
                t0.t(t0Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!t0Var.c()) {
                    break;
                }
                String strL = this.b ? t0Var.l() : t0Var.j();
                t0Var.g((byte) 5);
                linkedHashMap.put(strL, b());
                bG = t0Var.f();
                if (bG != 4) {
                    if (bG != 7) {
                        t0.t(t0Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bG == 6) {
                t0Var.g((byte) 7);
            } else if (bG == 4) {
                br9.A(t0Var, "object");
                throw null;
            }
            cw3Var = new cw3(linkedHashMap);
        }
        this.c--;
        return cw3Var;
    }

    public final uu3 c() {
        t0 t0Var = this.a;
        byte bF = t0Var.f();
        if (t0Var.z() == 4) {
            t0.t(t0Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (t0Var.c()) {
            arrayList.add(b());
            bF = t0Var.f();
            if (bF != 4) {
                boolean z = bF == 9;
                int i = t0Var.b;
                if (!z) {
                    t0.t(t0Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            t0Var.g((byte) 9);
        } else if (bF == 4) {
            br9.A(t0Var, "array");
            throw null;
        }
        return new uu3(arrayList);
    }

    public final hw3 d(boolean z) {
        boolean z2 = this.b;
        t0 t0Var = this.a;
        String strL = (z2 || !z) ? t0Var.l() : t0Var.j();
        return (z || !js3.i(strL, Ssh2PublicKeyAlgorithmName.NULL)) ? new uv3(strL, z, null) : yv3.INSTANCE;
    }
}
