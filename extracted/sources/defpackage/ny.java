package defpackage;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public final class ny extends qm5 {
    @Override // defpackage.qm5
    public final my b() {
        return new oy(((AudioAttributes.Builder) this.b).build(), 0);
    }

    @Override // defpackage.qm5
    public final qm5 t(int i) {
        ((AudioAttributes.Builder) this.b).setUsage(i);
        return this;
    }

    @Override // defpackage.qm5
    public final void u(int i) {
        ((AudioAttributes.Builder) this.b).setUsage(i);
    }
}
