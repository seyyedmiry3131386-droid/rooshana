package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class q32 implements pw1 {
    public final DrmSession$DrmSessionException a;

    public q32(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.a = drmSession$DrmSessionException;
    }

    @Override // defpackage.pw1
    public final UUID a() {
        return xj0.a;
    }

    @Override // defpackage.pw1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pw1
    public final boolean e(String str) {
        return false;
    }

    @Override // defpackage.pw1
    public final DrmSession$DrmSessionException f() {
        return this.a;
    }

    @Override // defpackage.pw1
    public final b81 g() {
        return null;
    }

    @Override // defpackage.pw1
    public final int getState() {
        return 1;
    }

    @Override // defpackage.pw1
    public final void c(sw1 sw1Var) {
    }

    @Override // defpackage.pw1
    public final void d(sw1 sw1Var) {
    }
}
