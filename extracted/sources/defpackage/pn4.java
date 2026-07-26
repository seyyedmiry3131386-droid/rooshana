package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pn4 extends on4 {
    @Override // androidx.media3.session.legacy.c
    public final void f(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        this.a.setPlaybackSpeed(f);
    }
}
