package defpackage;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes.dex */
public final class hb9 extends VolumeProvider {
    public final /* synthetic */ er4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb9(er4 er4Var, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = er4Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        er4 er4Var = this.a;
        j29.a0(er4Var.f, new dr4(er4Var.g, i, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        er4 er4Var = this.a;
        j29.a0(er4Var.f, new dr4(er4Var.g, i, 0));
    }
}
