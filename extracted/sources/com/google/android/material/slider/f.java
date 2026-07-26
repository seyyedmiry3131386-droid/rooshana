package com.google.android.material.slider;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {
    public int a = -1;
    public final /* synthetic */ BaseSlider b;

    public f(BaseSlider baseSlider) {
        this.b = baseSlider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.h.x(this.a, 4);
    }
}
