package ir.mservices.market.version2.ui.crop;

import defpackage.sw7;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements sw7 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ CropImageView g;

    public a(CropImageView cropImageView, float f, float f2, float f3, float f4, float f5, float f6) {
        this.g = cropImageView;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    @Override // defpackage.sw7
    public final void a() {
        float f = this.e % 360.0f;
        CropImageView cropImageView = this.g;
        cropImageView.g = f;
        cropImageView.f = this.f;
        cropImageView.x(cropImageView.d, cropImageView.e);
        cropImageView.u = false;
    }

    @Override // defpackage.sw7
    public final void c() {
        this.g.u = true;
    }

    @Override // defpackage.sw7
    public final void e(float f) {
        float f2 = (this.b * f) + this.a;
        CropImageView cropImageView = this.g;
        cropImageView.g = f2;
        cropImageView.f = (this.d * f) + this.c;
        cropImageView.v();
        cropImageView.invalidate();
    }
}
