package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import defpackage.ta1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ta1 {
    public final ParcelFileDescriptorRewinder$InternalRewinder a;

    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }

    @Override // defpackage.ta1
    public final void c() {
    }

    @Override // defpackage.ta1
    public final Object i() {
        return this.a.rewind();
    }
}
