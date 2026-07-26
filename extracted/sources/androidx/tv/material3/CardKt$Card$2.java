package androidx.tv.material3;

import defpackage.ab5;
import defpackage.bp2;
import defpackage.gu9;
import defpackage.hs9;
import defpackage.hx4;
import defpackage.ja1;
import defpackage.my6;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.tx8;
import defpackage.ub1;
import defpackage.y40;
import defpackage.yh0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class CardKt$Card$2 extends Lambda implements qp2 {
    public final /* synthetic */ bp2 g;
    public final /* synthetic */ hx4 h;
    public final /* synthetic */ bp2 i;
    public final /* synthetic */ ab5 j;
    public final /* synthetic */ androidx.compose.runtime.internal.a k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardKt$Card$2(bp2 bp2Var, hx4 hx4Var, bp2 bp2Var2, ub1 ub1Var, y40 y40Var, ja1 ja1Var, gu9 gu9Var, yh0 yh0Var, ab5 ab5Var, androidx.compose.runtime.internal.a aVar, int i) {
        super(2);
        this.g = bp2Var;
        this.h = hx4Var;
        this.i = bp2Var2;
        this.j = ab5Var;
        this.k = aVar;
        this.l = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        qz0 qz0Var = (qz0) obj;
        ((Number) obj2).intValue();
        int iW = hs9.W(this.l | 1);
        qz0Var.c0(-991145394);
        int i2 = iW & 6;
        bp2 bp2Var = this.g;
        if (i2 == 0) {
            i = (qz0Var.h(bp2Var) ? 4 : 2) | iW;
        } else {
            i = iW;
        }
        int i3 = iW & 48;
        hx4 hx4Var = this.h;
        if (i3 == 0) {
            i |= qz0Var.f(hx4Var) ? 32 : 16;
        }
        int i4 = iW & 384;
        bp2 bp2Var2 = this.i;
        if (i4 == 0) {
            i |= qz0Var.h(bp2Var2) ? 256 : 128;
        }
        if ((iW & 3072) == 0) {
            i |= qz0Var.f(null) ? 2048 : 1024;
        }
        if ((iW & 24576) == 0) {
            i |= qz0Var.f(null) ? 16384 : 8192;
        }
        if ((196608 & iW) == 0) {
            i |= qz0Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & iW) == 0) {
            i |= qz0Var.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & iW) == 0) {
            i |= qz0Var.f(null) ? 8388608 : 4194304;
        }
        int i5 = 100663296 & iW;
        ab5 ab5Var = this.j;
        if (i5 == 0) {
            i |= qz0Var.f(ab5Var) ? 67108864 : 33554432;
        }
        int i6 = 805306368 & iW;
        androidx.compose.runtime.internal.a aVar = this.k;
        if (i6 == 0) {
            i |= qz0Var.h(aVar) ? 536870912 : 268435456;
        }
        if ((i & 306783379) == 306783378 && qz0Var.B()) {
            qz0Var.U();
            my6 my6VarS = qz0Var.s();
            if (my6VarS != null) {
                my6VarS.d = new CardKt$Card$2(bp2Var, hx4Var, bp2Var2, null, null, null, null, null, ab5Var, aVar, iW);
            }
            return tx8.a;
        }
        qz0Var.W();
        if ((iW & 1) != 0 && !qz0Var.z()) {
            qz0Var.U();
        }
        qz0Var.r();
        throw null;
    }
}
