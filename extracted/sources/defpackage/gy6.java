package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;

/* JADX INFO: loaded from: classes3.dex */
public final class gy6 implements iy6 {
    public static final gy6 a = new gy6();

    @Override // defpackage.iy6
    public final boolean a() {
        return false;
    }

    @Override // defpackage.iy6
    public final boolean b() {
        return true;
    }

    @Override // defpackage.iy6
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gy6);
    }

    public final int hashCode() {
        return -455190835;
    }

    public final String toString() {
        return ApplicationStateDto.STATE_NONE;
    }
}
