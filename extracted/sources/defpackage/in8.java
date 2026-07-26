package defpackage;

import com.j256.ormlite.stmt.query.SimpleComparison;

/* JADX INFO: loaded from: classes3.dex */
public final class in8 extends jn8 {
    @Override // defpackage.jn8
    /* JADX INFO: renamed from: J */
    public final jn8 p() {
        super.p();
        this.k = new dy();
        return this;
    }

    @Override // defpackage.jn8, defpackage.tt9
    public final /* bridge */ /* synthetic */ tt9 p() {
        p();
        return this;
    }

    @Override // defpackage.tt9
    public final String toString() {
        dy dyVar = this.k;
        if (dyVar == null || dyVar.a <= 0) {
            return SimpleComparison.LESS_THAN_OPERATION + H() + SimpleComparison.GREATER_THAN_OPERATION;
        }
        return SimpleComparison.LESS_THAN_OPERATION + H() + " " + this.k.toString() + SimpleComparison.GREATER_THAN_OPERATION;
    }
}
