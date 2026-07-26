package defpackage;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes.dex */
public final class gb9 extends VolumeProvider {
    public final /* synthetic */ er4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb9(er4 er4Var, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
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
