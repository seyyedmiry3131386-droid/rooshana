package ir.mservices.market.version2.ui.crop;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import defpackage.dy3;
import defpackage.g6;
import defpackage.q6;
import ir.mservices.market.version2.ui.crop.CropImageView;
import j$.util.Objects;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {
    public final /* synthetic */ CropImageView a;

    public b(CropImageView cropImageView) {
        this.a = cropImageView;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bitmap bitmapC;
        CropImageView cropImageView = this.a;
        Uri uri = cropImageView.D;
        Handler handler = cropImageView.C;
        if (uri == null) {
            bitmapC = cropImageView.getCroppedBitmap();
        } else {
            bitmapC = CropImageView.c(cropImageView);
            if (cropImageView.U == CropImageView.CropMode.CIRCLE) {
                Bitmap bitmapK = CropImageView.k(bitmapC);
                if (bitmapC != cropImageView.getBitmap()) {
                    bitmapC.recycle();
                }
                bitmapC = bitmapK;
            }
        }
        if (bitmapC != null) {
            bitmapC = CropImageView.f(cropImageView, bitmapC);
            cropImageView.Q = bitmapC.getWidth();
            cropImageView.R = bitmapC.getHeight();
            handler.post(new q6(this, bitmapC));
        } else {
            cropImageView.s(cropImageView.z);
        }
        Uri uri2 = cropImageView.E;
        if (uri2 == null) {
            cropImageView.s(cropImageView.A);
            return;
        }
        OutputStream outputStreamOpenOutputStream = null;
        try {
            try {
                outputStreamOpenOutputStream = cropImageView.getContext().getContentResolver().openOutputStream(uri2);
                if (outputStreamOpenOutputStream != null) {
                    bitmapC.compress(cropImageView.M, cropImageView.N, outputStreamOpenOutputStream);
                }
            } catch (IOException unused) {
                Objects.toString(uri2);
                cropImageView.s(cropImageView.A);
            }
            handler.post(new g6(cropImageView, uri2, 10));
            cropImageView.L = false;
        } finally {
            dy3.m(outputStreamOpenOutputStream);
        }
    }
}
