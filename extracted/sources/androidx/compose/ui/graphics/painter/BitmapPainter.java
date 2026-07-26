package androidx.compose.ui.graphics.painter;

import defpackage.g16;
import defpackage.hv1;
import defpackage.js3;
import defpackage.o40;
import defpackage.og;
import defpackage.rq3;
import defpackage.tc0;
import defpackage.tt3;
import defpackage.zq3;
import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapPainter extends g16 {
    public final og f;
    public final long g;
    public int h = 1;
    public final long i;
    public float j;
    public tc0 k;

    public BitmapPainter(og ogVar, long j) {
        int i;
        int i2;
        this.f = ogVar;
        this.g = j;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > ogVar.a.getWidth() || i2 > ogVar.a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.i = j;
        this.j = 1.0f;
    }

    @Override // defpackage.g16
    public final boolean b(float f) {
        this.j = f;
        return true;
    }

    @Override // defpackage.g16
    public final boolean d(tc0 tc0Var) {
        this.k = tc0Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return js3.i(this.f, bitmapPainter.f) && rq3.a(0L, 0L) && zq3.b(this.g, bitmapPainter.g) && this.h == bitmapPainter.h;
    }

    @Override // defpackage.g16
    public final long h() {
        return tt3.M(this.i);
    }

    public final int hashCode() {
        int iHashCode = (((int) 0) + (this.f.hashCode() * 31)) * 31;
        long j = this.g;
        return ((((int) (j ^ (j >>> 32))) + iHashCode) * 31) + this.h;
    }

    @Override // defpackage.g16
    public final void i(hv1 hv1Var) {
        int iRound = Math.round(Float.intBitsToFloat((int) (hv1Var.d() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L)));
        float f = this.j;
        tc0 tc0Var = this.k;
        int i = this.h;
        o40.h(hv1Var, this.f, this.g, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, tc0Var, i, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f);
        sb.append(", srcOffset=");
        sb.append((Object) rq3.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) zq3.c(this.g));
        sb.append(", filterQuality=");
        int i = this.h;
        sb.append((Object) (i == 0 ? ApplicationStateDto.STATE_NONE : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN));
        sb.append(')');
        return sb.toString();
    }
}
